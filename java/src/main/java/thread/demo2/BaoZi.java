package thread.demo2;

/**
 * @Author wsl
 * @Date 2021-08-13
 * @Description
 * @Version 1.0
 */
public class BaoZi {

    //定义包子资源的状态
    private boolean flag = false;

    public BaoZi() {
    }

    public BaoZi(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
