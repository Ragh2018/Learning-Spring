/**
 * 
 */
package com.ragh.springdemo.fortune;

/**
 * @author ragsingh
 *
 */
public class HappyFortuneService implements FortuneService {

	String fortuneArray[]=new String[] {"Today is Lucky Day","Worst Day Ever", "Fantastic Mood"};
	
	@Override
	public String getFortune() {
		return fortuneArray[((int)(Math.random()*10))%3];
	}

}
