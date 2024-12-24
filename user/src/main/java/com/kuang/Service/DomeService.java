package com.kuang.Service;

import org.springframework.stereotype.Service;

/**
 * 注册bean 到spring容器里面
 */
@Service
public class DomeService {
    public String test(){

        return "simplified version springboot";
    }
}
