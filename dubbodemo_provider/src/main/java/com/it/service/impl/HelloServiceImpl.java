package com.it.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.it.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class, protocol = "dubbo")
@Transactional
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "8083 hello " + name;
    }
}
