package ch06.verify;

public class Car {
	
    // 1. 필드 선언 (상수 2개와 speed 필드)
    static final  int MIN_SPEED = 0;
    static final int MAX_SPEED = 300;
	private int speed;

    // 2. Getter (속도를 읽어오는 메서드)
    public int getSpeed() {
    	return speed;
    }

    // 3. Setter (속도를 저장하는 메서드)
    public void setSpeed(int speed) {
    	if (speed < MIN_SPEED || speed > MAX_SPEED) {
    		return;
    	} else {
    		this.speed = speed;
    	}
    }
}