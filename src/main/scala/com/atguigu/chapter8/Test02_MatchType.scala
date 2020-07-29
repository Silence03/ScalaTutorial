package com.atguigu.chapter8

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter8
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 11:41
  */

// 不同的模式匹配类型
object Test02_MatchType {
  def main(args: Array[String]): Unit = {
    // 1. 匹配常量值
    def describeConst(x: Any) = x match {
      case 10 => "Int ten"
      case 5 => "Int five"
      case 3.5 => "Double 3.5"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ =>
    }
    println(describeConst(true))
    println(describeConst(5))
    println(describeConst("hello"))
    println(describeConst(15))

    println("============================")

    // 2. 匹配类型，需要一个指定类型的变量来接收当前的x
    def describeType(x: Any) = x match {
      case i: Int => "Int " + i
      case s: String => "String " + s
      case l: List[String] => "List " + l
      case arr: Array[Int] => "Array " + arr.mkString(",")

      // 默认情况：一般是用_，也可以用一个变量（没有类型）来接收当前的值
      case abc => "something else " + abc
    }
    println(describeType(23))
    println(describeType("hello"))
    println(describeType(List("a","b","c")))
    println(describeType(List(1,2,3,4)))    // 正常匹配List，泛型擦除
    println(describeType(Array("a","b","c")))
    println(describeType(Array(1,2,3,4)))    // Array[Int] --> int[]

    println("================================")

    // 3. 匹配数组
    for( arr <- List(
      Array(0),
      Array(0, 1),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 1),
      Array(2, 15, 37),
      Array("hello", 56, 7.9)
    ) ){
      val res = arr match {
        case Array(0) => "0"
        case Array(0, _) => "以0开头的二元组"
        case Array(0, _*) => "以0开头的元组"
        case Array(_, 1, _*) => "第二个元素为1的元组"
        case Array(x, y) => x + ", " + y
        case _ => "其它情况"
      }
      println(res)
    }
  }
}
