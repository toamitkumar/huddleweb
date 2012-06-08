package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.Map;
import com.example.service.ResultService;

@Controller
public class ResultController {
    
//  @Autowired
  private ResultService resultService;
  
  @RequestMapping("/results")
  public String show(Map<String, Object> map) {
    return "something";
  }
}