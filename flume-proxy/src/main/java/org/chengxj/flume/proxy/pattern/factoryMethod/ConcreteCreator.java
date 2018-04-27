package org.chengxj.flume.proxy.pattern.factoryMethod;

public class ConcreteCreator extends ConCreteProduct {
	
	protected Product factoryMethod() {
		return new ConCreteProduct();
	}

}
