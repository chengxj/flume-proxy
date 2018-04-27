package org.chengxj.flume.proxy.pattern.factoryMethod;

public abstract class Creator {
	
	protected abstract Product factoryMethod();
	
	public void someOPeration(String msg) {
		Product product = factoryMethod();
		product.export(msg);
	}

}
