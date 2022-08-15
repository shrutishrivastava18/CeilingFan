package com.fan;

public class CeilingFan {

	//Fan Speed 0 = OFF.
		private int fanSpeedSetting = 0;
		
		//Direction true = Clockwise, false = Anti Clockwise. 
		private boolean direction = true;

		/**
		 * This method changes the speed of the fan when speed cord is pulled.
		 */
		public void pullSpeedCord() {
			if (this.fanSpeedSetting == 3) {
				System.out.println("Fan is turned OFF");
				this.fanSpeedSetting = 0;
			} else {
				this.fanSpeedSetting++;
				System.out.println("Fan speed is on Level:" + fanSpeedSetting);
			}
		}

		public void pullDirectionCord() {
			this.direction = !this.direction;
			if (this.direction) {
				System.out.println("Fan is moving Clockwise");
			} else {
				System.out.println("Fan is moving Anti-Clockwise");
			}
		}
}
