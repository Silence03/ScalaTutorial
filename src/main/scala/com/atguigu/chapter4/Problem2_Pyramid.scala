package com.atguigu.chapter4

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 16:59
  */
object Problem2_Pyramid {
  def main(args: Array[String]): Unit = {
    for (agent <-1 to 9){
      var num = agent*2-1
      var mie =10 -agent
      println(" "*mie+"*"*num)
    }
  }
}
