package cn.surfing.nuggets;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zouzc
 * @Time: 2022/4/22 17:03
 * @Description:
 */
public class Master {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("3", "4", "5", "8");
        for (String s : list) {
            System.out.println("s = " + s);
        }
    }
}
