package com.fan;

public class TestCeilingFan {

	public static void main(String args[]) {
		CeilingFan fan = new CeilingFan();
		//First Speed Cord Pull will set the speed of Fan to 1. 
		fan.pullSpeedCord();
		
		//Pulling Direction Cord will change direction of Fan to Anti Clockwise. 
		fan.pullDirectionCord();
		
		//Second Speed Cord Pull will set the speed of Fan to 2.
		fan.pullSpeedCord();
		
		//Third Speed Cord Pull will set the speed of Fan to 3.
		fan.pullSpeedCord();
		
		//Pulling direction cord again will set the direction to Clockwise. 
		fan.pullDirectionCord();
		
		//Fourth Speed Cord Pull will turn the fan OFF. 
		fan.pullSpeedCord();
		
	}
}
