package aaa.bbb.ccc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {


    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/hello")
    public List<String> getMemberAll() {
       List<String> listUser=new ArrayList<>();
       listUser.add("zhangsan");
       listUser.add("lisi");
       listUser.add("wangwu");
        listUser.add(serverPort);
       return listUser;


    }
    @RequestMapping("/member")
    public String member(){
        return "this is member 服务工程";
    }
}
