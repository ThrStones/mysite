package com.thrstones.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/11/24.
 */
@Controller
public class IndexController {
    /**
     * 返回index
     */
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
