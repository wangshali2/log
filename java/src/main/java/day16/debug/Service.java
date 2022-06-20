package day16.debug;

/**
 * @Author wsl
 * @Date 2022-04-06-11:30
 * @Description
 */
public interface Service {
    //在接口上打方法断点自动跑到它的实现类上
    void show();
}
