package com.ahacool.designpattern.observer;

/**
 * @ClassName Client
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public interface Client {
	public void register(Observer pObserver);

	public void remove(Observer pObserver);

	public void notifyObserver();
}
