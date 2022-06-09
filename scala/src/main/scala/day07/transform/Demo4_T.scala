package day07.transform

/**
 * @author wsl
 * @version 2022-04-28-12:58
 *
 */
object Demo4_T {
  def main(args: Array[String]): Unit = {

    //泛型不可变
    val test1: Test[User] = new Test[User] // OK
    //val test2 : Test[User] = new Test[Parent] // Error
    //val test3 : Test[User] = new Test[SubUser]  // Error

    //泛型协变
    val test4: Test2[User] = new Test2[User] // OK
    //val test5 : Test2[User] = new Test2[Parent] // Error
    val test6: Test2[User] = new Test2[SubUser] // ok

    //泛型逆变
    val test7: Test3[User] = new Test3[User] // OK
    val test8: Test3[User] = new Test3[Parent] // OK
    //val test9 : Test3[User] = new Test3[SubUser]  // Error

    val parent : Parent = new Parent()
    val user : User = new User()
    val subUser : SubUser = new SubUser()
    //test[User](parent) // Error  泛型边界
    //test[User](user)   // OK
    //test[User](subUser) // OK

    //test2[Parent](parent) // Error 泛型上限
    test2[User](user)   // OK
    test2[SubUser](subUser) // OK

    test3[Parent](parent) // OK
    test3[User](user)   // OK
   // test3[SubUser](subUser) // Error 泛型下限

    //上下文限定
    def f[A : Test](a: A) = println(a)
    implicit val test : Test[User] = new Test[User]
    f( new User() )

  }

  def test[A](a: A): Unit = {
    println(a)
  }

  def  test2[A<:User]( a : A ): Unit = {
    println(a)
  }

  def  test3[A>:User]( a : A ): Unit = {
    println(a)
  }

}

/**
 * 泛型
 *
 * @tparam T
 */
class Test[T] {
}

/**
 * 泛型协变
 *
 * @tparam T
 */
class Test2[+T] {
}

/**
 * 泛型逆变
 *
 * @tparam T
 */
class Test3[-T] {
}

class Parent {
}

class User extends Parent {
}

class SubUser extends User {
}
