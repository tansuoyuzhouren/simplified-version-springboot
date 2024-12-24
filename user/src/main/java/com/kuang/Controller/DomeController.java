package com.kuang.Controller;

import com.kuang.Service.DomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注册bean到 spring容器里面
 */
@Controller
/**
 * 返回 不经过视图解析器
 */
@ResponseBody
public class DomeController {

    @Autowired
    DomeService domeService;

    @RequestMapping("/test")
    public String test(){

        return domeService.test();
    }
}
