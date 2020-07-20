package com.atguigu.chapter2

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/20 11:50
  */
object Test08_CastProblem {
  def main(args: Array[String]): Unit = {
    /*
    128 计算机中的二进制表示
    原码：0000 0000 0000 0000 0000 0000 1000 0000
    截取低位1个字节之后：1000 0000
    最高位为符号位，1表示负数

    计算机中用补码表示有符号数
    正数的补码就是自身
    负数的补码是：原码按位取反（符号位不变），然后加1

    补码求原码：方法1.先减1，再按位取反（符号位不变）
    方法2：按位取反（符号位不变），然后加1

    现在已知补码是1000 0000，求原始数
    补码：1000 0000
    反码：1111 1111
    源码：1000 0000，指定它为-128
    * */
    val a: Byte = 128.toByte
    println(a)

    val b: Byte = 130.toByte
    println(b)
    val c: Byte = (-130).toByte
    println(c)
  }
}
