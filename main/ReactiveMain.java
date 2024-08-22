//ReactiveMain.java
package com.anystep.webflux.mono;

import java.util.concurrent.TimeUnit;

public class ReactiveMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main方法开始");
        
        System.out.println("main方法结束");
        TimeUnit.SECONDS.sleep(10);
    }
}
