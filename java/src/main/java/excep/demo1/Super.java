package excep.demo1;

import java.io.IOException;

/**
 * @author wsl
 * @version 2020091110:32
 */
public abstract class Super {

    public abstract void print(int a) throws IOException;//重写需要在父类声明异常，避免改动父类代码

}
