package cn.run.user.controller;


import cn.run.user.pojo.RunUser;
import cn.run.user.service.UserService;
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
//@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;


    //查看所有
    @GetMapping("findUser")
    @ResponseBody
    public ResponseEntity<List<RunUser>> findReceiver(){
        List<RunUser>  list= userService.findUser();
        System.err.println(list.get(0).toString());
        return ResponseEntity.ok(list);
    }

    //添加用户
    @PostMapping("user/insertUser")
    @ResponseBody
    public ResponseEntity<Void> insertUser(@RequestBody RunUser runUser ){
        userService.insertUser(runUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    //修改用户
    @PutMapping("user/updateUser")
    @ResponseBody
    public ResponseEntity<Void> updateReceiver(@RequestBody RunUser runUser){
        userService.updateUser(runUser);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    
    @GetMapping("user/uid/{uid}")
    @ResponseBody
    public ResponseEntity<List<RunUser>> queryByReceiver(@PathVariable("uid") Long uid){
        System.err.println("用户的id是-------------------------------------------"+uid);
        List<RunUser> list = userService.queryByUser(uid);
        return ResponseEntity.ok(list);
    }
    //注册
    @RequestMapping("toregist.html")
    public String toregist(RunUser runUser) {
        userService.insertUser(runUser);
        return "redirect:http://manage.gorunrun.com/login.html";
    }

    //验证码
    @PostMapping("gotocode")
    public void gotocode(String uphone, HttpServletResponse response) throws IOException {
        Boolean flag = userService.gotocode(uphone);
        if (flag) {
            response.getWriter().write("200");
        } else {
            response.getWriter().write("500");
        }
    }

    //登录
    @RequestMapping("tologin.html")
    public String tologin(RunUser runUser, HttpServletRequest request) {
        RunUser user = userService.tologin(runUser);
        if (user == null) {
            return "redirect:http://manage.gorunrun.com/404.html";
        } else {
            //正确就登陆
            request.getSession().setAttribute("user", user);
            return "redirect:http://manage.gorunrun.com/video2.html";
        }
    }


}
