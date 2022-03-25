package com.nowcoder.community.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service
public class AlphaService {


    public AlphaService() {
        System.out.println("构造器实例化");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化AlphaService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }
}
