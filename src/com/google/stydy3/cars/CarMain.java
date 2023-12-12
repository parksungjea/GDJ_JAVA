package com.google.stydy3.cars;

import java.util.Scanner;

import com.google.stydy3.star.Marine;

public class CarMain {
public static void main(String[] args) {
	 
	
	//marine.hp =200;
	
//Car car = new Car();
//
//System.out.println(car.engine.fuel);
//car = null;

Engine engine = new Engine();
Car car = new Car(engine);
car = null;
}
}
