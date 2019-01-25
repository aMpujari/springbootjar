/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author pc1
 */
@Controller
@RequestMapping("jspViews")
public class HelloController {
    
    @RequestMapping("index")
    public String index(Model model) {
        String name = "Aniket";
        model.addAttribute("name", name);
        return "hello";
    } 
    
    
    @RequestMapping(value="/home",method=RequestMethod.GET)
    public String hello(Model model) {
        String name = "Aniket";
        model.addAttribute("name", name);
        return "hello";
    }
    
    @RequestMapping(value="/dashboard",method=RequestMethod.GET)
    public String aniket(Model model, @RequestParam(value="name", required=false, defaultValue="How are you ? ") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}
