package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.components.MailComponents;
import com.zerobase.fastlms.util.RequestUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;
    
    @RequestMapping("/")
    public String index() {

        return "index";
    }
    

    @RequestMapping("/error/denied")
    public String errorDenied() {
        
        return "error/denied";
    }

}
