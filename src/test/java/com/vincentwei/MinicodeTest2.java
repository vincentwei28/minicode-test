package com.vincentwei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by weihuajiang on 2018/10/30.
 */
@RunWith(Parameterized.class)
public class MinicodeTest2 {

    private int index;
    private int paramter;

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {1, 3}, {2, 5}, {3, 35}, {4, 15}, {5, 51}
        });
    }

    public MinicodeTest2(int index, int paramter) {
        this.index = index;
        this.paramter = paramter;
    }

    @Test
    public void stageTwo() throws Exception {
        System.out.println(index);
        System.out.println(paramter);
        new Minicode().stageTwo(paramter);
    }

}