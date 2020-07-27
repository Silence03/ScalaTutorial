package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/27 10:51
  */

// 不可变数组
object Test01_Array {
  def main(args: Array[String]): Unit = {
    // 1. 数组定义
    val arr1: Array[Int] = new Array[Int](3)   // 默认初始值是0
    println(arr1.mkString(" "))
    // 通过伴生对象定义数组
    val arr2 = Array(1,2,3,4,5)
//    val arr3: Array[Any] = Array(1,1.5,"hello",true)
//    val arr3: Array[String] = Array("hello", "world", "scala")
    println(arr2.mkString(","))

    println("========================")

    // 2. 访问和修改数组中的元素
    println(arr2.apply(3))
    println(arr2(3))
    arr1(1) = 12
    arr1.update(2, 23)
    println(arr1(1))
    println(arr1.mkString(","))

    println("===========================")

    // 3. 遍历数组中的元素
    // 3.1 遍历下标的for循环
    for( i <- 0 until arr2.length ){
      println(arr2(i))
    }
    for( i <- arr2.indices) print(arr2(i) + "\t")

    println("===========================")

    // 3.2 遍历元素的for循环
    for( elem <- arr2 ) println(elem)

    println("===========================")

    // 3.3 迭代器
    val iter: Iterator[Int] = arr2.iterator
    while(iter.hasNext) {
      println(iter.next())
    }
//    for( elem <- iter ) println(elem)
    println("===========================")

    // 3.4 foreach，它的参数是一个函数，就是对当前集合中所有元素要执行的操作
    arr2.foreach( (elem: Int) => {println(elem)} )
//    arr2.foreach( println(_) )
    arr2.foreach( println )
    arr2 foreach println

    println(arr2.mkString(","))

  }
}
