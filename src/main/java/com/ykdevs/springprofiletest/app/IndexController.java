package com.ykdevs.springprofiletest.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @Value("${data.data1}")
    private String data1;
    @Value("${data.data2}")
    private String data2;
    @Value("${data.data3}")
    private String data3;
    @Value("${data.data4}")
    private String data4;
    @Value("${data.data5}")
    private String data5;

    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("data1", data1);
        modelAndView.addObject("data2", data2);
        modelAndView.addObject("data3", data3);
        modelAndView.addObject("data4", data4);
        modelAndView.addObject("data5", data5);
        return modelAndView;
    }
}
