package com.project.order.main;

/**
 * 创建请求类
 *
 *@author: Weiyf
 *@Date: 2019-02-25 10:06
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
