package com.atguigu.maven;
import org.junit.Test;


/**
 * @Description
 * @auther yaya
 * @create 2022-03-01-11:10
 */
public class HelloTest {
    @Test
    public void testHello(){
        Hello hello = new Hello();
        String maven = hello.sayHello("maven");
        System.out.println(maven);
    }
}
