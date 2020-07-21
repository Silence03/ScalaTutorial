package com.atguigu.chapter4

import scala.util.Random

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 10:30
  */
object Test02_For {
  def main(args: Array[String]): Unit = {
    // 1. 对范围数据进行遍历（闭区间，to）
    for( i <- 1 to 10 ){
      println(i)
    }
    // 相当于对象的方法调用1.to(10)

    // 2. 对范围数据进行遍历（半开半闭区间，until）
    for( i <- 1 until 10 ){
      println(i)
    }

    // 3. 更多的范围测试
    for( i <- 3 to 12 ){
      println(i)
    }
    // 如果反过来，没有输出
    for( i <- 10 to 1 ){
      println(i)
    }
    // 如果是小数，报错
//    for( i <- 2.5 to 10.5 ){
//      println(i)
//    }

    // 4. 跳出循环
    // 在scala里，没有continue和break关键字
    // 通过if判断，可以方便的跳出当前循环，实现continue的功能
    for( i <- 1 to 10 ){
//      if( i == 5 ){
////        continue;
//      } else
//        println(i)
      if( i != 5 ){
        println(i)
      }
    }

    // 5. 循环守卫（某些条件下直接跳过循环）
    for( i <- 1 to 10; if i != 5 ){
      println(i)
    }

    // 6. 循环步长
//    for( i <- 1 to 10; if i % 2 == 1 ){
//      println(i)
//    }
    for( i <- 1 to 10 by 2 ){
      println(i)
    }
    for( i <- 2.to(10).by(2) ){
      println(i)
    }

    // 步长和守卫同时使用
    for( i <- -10 to 10 by 2; if i%3 == 0){
      println(i)
    }

    // 倒序遍历
    for( i <- 10 to 1 by -1 ){
      println(i)
    }

    // 非整数步长
    for( i <- 2.5 to 10.5 by 1.5 ){
      println("非整数步长：" + i)
    }

    for( i <- 10 to 10 ){
      println(i)
    }

    // 步长不能为0
//    for( i <- 1 to 10 by 0 ){
//      print(i)
//    }
  }
}
