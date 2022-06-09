/**
 * @author wsl
 * @version 2022-04-16-12:24
 *  package关键字可以嵌套声明使用
 */

package day03 {
  package com{
    package wsl{
      package test{
        object demo2 {
          def main(args: Array[String]): Unit = {
            println("package test")
          }
        }
      }
    }
  }
}



