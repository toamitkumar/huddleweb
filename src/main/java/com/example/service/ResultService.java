package com.example.service;

import com.example.model.Response;
import java.util.Map;  
  

public interface ResultService {
  
  public Map<String, Object> calculateScore();
  public void updateScore(String imageId);
}