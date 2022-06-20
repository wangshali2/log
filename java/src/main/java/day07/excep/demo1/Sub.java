package day07.excep.demo1;

import java.io.IOException;

/**
 * @author wsl
 * @version 2020091110:45
 */
public class Sub extends Super {

    public void print(int a) throws IOException {
        if (a == 1) {
            throw new IOException("自定义IO异常");
        }

    }
}
