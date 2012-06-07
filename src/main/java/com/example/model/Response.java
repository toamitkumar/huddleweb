package com.example.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Response
{
  @Id
  @GeneratedValue
  private Integer id;
  
  private String imageId;
  private Integer score;
    
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  
  public String getImageId() {
    return imageId;
  }

  public void setImageId(Integer id) {
    this.imageId = imageId;
  }
    
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }
}