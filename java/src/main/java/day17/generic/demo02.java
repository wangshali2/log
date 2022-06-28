package day17.generic;

/**
 * @Author wsl
 * @Description 父类有泛型，子类可以选择保留泛型也可以选择指定泛型类型：
 *  子类不保留父类的泛型：按需实现
 *  没有类型 擦除
 *  具体类型
 *  子类保留父类的泛型：泛型子类
 *  全部保留
 *  部分保留
 * 结论：子类必须是“富二代”，子类除了指定或保留父类的泛型，还可以增加自己的泛型
 */
public class demo02 {
}

class Father<T1, T2> {
}

// 子类不保留父类的泛型
// 1)没有类型 擦除
class Son1 extends Father {// 等价于class Son extends Father<Object,Object>{
}

// 2)具体类型
class Son2 extends Father<Integer, String> {
}

// 子类保留父类的泛型
// 1)全部保留
class Son3<T1, T2> extends Father<T1, T2> {
}

// 2)部分保留
class Son4<T2> extends Father<Integer, T2> {
}

