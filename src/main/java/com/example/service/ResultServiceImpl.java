package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.example.model.Response;  
import java.util.List;
import java.util.Map;
import java.util.HashMap;  

@Service
public class ResultServiceImpl implements ResultService {
  
  @PersistenceContext
  EntityManager em;
  
  @Transactional
  public Map<String, Object> calculateScore() {
    Map<String, Object> map = new HashMap<String, Object>();
  
    CriteriaQuery<Response> c = em.getCriteriaBuilder().createQuery(Response.class);
    c.from(Response.class);
    List<Response> responses = em.createQuery(c).getResultList();
  
    for(int i=0; i < responses.size(); i++) {
       
    }
  
    return map;
  }
    
  @Transactional
  public void updateScore(String imageId) {
    
  }
}