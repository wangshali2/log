package likou;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author wsl
 * @version 2022-05-30-10:18
 */
public class demo01 {


    //排序

    public boolean test(int [] num) {
        Arrays.sort(num);
        for (int i = 0; i < num.length-1; i++) {
            if (num[i]==num[i+1]){
                return true;
            }
        }

        return false;
    }

    public boolean test2(int [] num) {
        HashSet<Object> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (!set.add(i)){
                return true;
            }
        }

        return false;
    }
}



