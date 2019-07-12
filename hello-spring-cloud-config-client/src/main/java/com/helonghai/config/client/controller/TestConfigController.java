package com.helonghai.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HeLongHai
 * @className TestConfigController
 * @description TODO
 * @date 2019/5/30 15:10
 * @email 18566749129@163.com
 */
@RestController
public class TestConfigController {

    @Value("${hello}")
    private String hello;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() {
        return hello;
    }

}
