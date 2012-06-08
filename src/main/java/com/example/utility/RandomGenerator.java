package com.example.utility;

import java.util.Random;

public class RandomGenerator {
  public static int generate(int max, int min) {
	  Random rand = new Random();
	  
	  int randomNum = rand.nextInt(max - min + 1) + min;
	  
	  return randomNum;
  }
}
