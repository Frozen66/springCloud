package com.jingjing.controller;

import com.jingjing.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrderController {
    @Autowired
    private OrderMemberService orderMemberService;

    @GetMapping("/helloOrder")
    public List<String> getOder(){
        System.out.println("订单服务开始调用会员服务");
        return orderMemberService.getOrder();
    }
    @GetMapping("/order")
    public String order(){
        return "this is order 服务工程";
    }
}
