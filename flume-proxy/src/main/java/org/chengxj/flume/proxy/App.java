package org.chengxj.flume.proxy;

import org.chengxj.flume.proxy.pattern.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
    	Singleton test = Singleton.uniqueInstance;
        System.out.println( "Hello World!" );
    }
}
