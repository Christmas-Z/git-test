package cn.surfing.nuggets;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: zouzc
 * @Time: 2022/4/22 16:59
 * @Description:
 */
public class HotFix {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 6, 2, 8, 0, 9, 2, 1);
        list.forEach(l -> {
            System.out.println("l = " + l);
        });
    }
}
