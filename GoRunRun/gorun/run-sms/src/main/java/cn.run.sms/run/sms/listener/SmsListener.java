package cn.run.sms.run.sms.listener;


import cn.run.sms.run.sms.config.SmsProperties;
import cn.run.sms.run.sms.util.SmsUtils;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.apache.commons.lang.StringUtils;
import java.util.Map;

@Component
@EnableConfigurationProperties(SmsProperties.class)
public class SmsListener {

    @Autowired
    private SmsUtils smsUtils;

    @Autowired
    private SmsProperties prop;

    @RabbitListener(bindings = @QueueBinding(
     value = @Queue(value = "run.sms.queue", durable = "true"),
     exchange = @Exchange(value = "run.sms.exchange",
      ignoreDeclarationExceptions = "true",type = "topic"),
     key = {"#.#"}))
    public void listenSms(Map<String, String> msg) throws Exception {
        if (msg == null || msg.size() <= 0) {
            // 放弃处理
            return;
        }
        System.out.println("进来了");
        String phone = msg.get("phone");
        String code = msg.get("code");

        if (StringUtils.isBlank(phone) || StringUtils.isBlank(code)) {
            // 放弃处理
            return;
        }
        // 发送消息
        smsUtils.sendSms(phone,code);

    }
}