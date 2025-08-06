package com.ydn.UI.controller;

import org.springframework.web.bind.annotation.*;

/**
 * ClassName :Test
 * Package :com.ydn.UI.controller
 * Desciption :
 *
 * @Author :
 * @Create : 10:28
 * @Version :1.0
 */

@RestController
@RequestMapping("/test")
public class Test {


    @GetMapping("/nihao")
    public String  nihao(){
        return "二等兵合成光！";
    }

}
