package com.jingjing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class OrderMemberService {
    @Autowired
    private RestTemplate restTemplate;
    public List<String> getOrder(){
        /*return restTemplate.getForObject("http://127.0.0.1:8762/hello",List.class);
   */
        return restTemplate.getForObject("http://service-member/hello",List.class);
    }


}
