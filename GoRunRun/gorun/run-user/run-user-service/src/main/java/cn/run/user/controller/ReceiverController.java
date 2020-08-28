package cn.run.user.controller;

import cn.run.user.pojo.RunReceiver;
import cn.run.user.service.ReceiverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
//@RequestMapping("receiver")
public class ReceiverController {

    @Autowired
    private ReceiverService receiverService;
    //查询所有接单员
    @GetMapping("receiver/findReceiver")
    @ResponseBody
    public ResponseEntity<List<RunReceiver>> findReceiver(

    ){
        List<RunReceiver>  list= receiverService.findReceiver();
        System.err.println(list.get(0).toString());
        return ResponseEntity.ok(list);
    }
    //添加接单员
    @PostMapping("receiver/insertReceiver")
    @ResponseBody
    public ResponseEntity<Void> insertReceiver(@RequestBody RunReceiver runReceiver ){
        receiverService.insertReceiver(runReceiver);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    //修改接单员信息
    @PutMapping("receiver/updateReceiver")
    @ResponseBody
    public ResponseEntity<Void> updateReceiver(@RequestBody RunReceiver runReceiver){
        receiverService.updateReceiver(runReceiver);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    //根据rid查询接单员信息
    @GetMapping("receiver/rid/{rid}")
    @ResponseBody
    public ResponseEntity<List<RunReceiver>> queryByReceiver(@PathVariable("rid") Long rid){
        System.err.println(rid);
        List<RunReceiver> list = receiverService.queryByReceiver(rid);
        return ResponseEntity.ok(list);
    }
    //添加接单员
    @PostMapping("toreceiverRegist.html")
    public String toreceiverRegist(RunReceiver runReceiver) {
        receiverService.toreceiverRegist(runReceiver);
        return "redirect:http://manage.gorunrun.com/login2.html";
    }
    //验证码
    @PostMapping("gotocode1")
    public void gotocode1(String phone, HttpServletResponse response) throws IOException {
        Boolean flag = receiverService.gotocode1(phone);
        if (flag) {
            response.getWriter().write("200");
        } else {
            response.getWriter().write("500");
        }
    }

    //登录
    @RequestMapping("toreceiverLogin.html")
    public String tologin(RunReceiver runReceiver, HttpServletRequest request) {
        RunReceiver receiver = receiverService.tologin(runReceiver);
        if (receiver == null) {
            return "redirect:http://manage.gorunrun.com/404.html";
        } else {
            //正确就登陆
            request.getSession().setAttribute("receiver", receiver);
            return "redirect:http://manage.gorunrun.com/video.html";
        }
    }




}
