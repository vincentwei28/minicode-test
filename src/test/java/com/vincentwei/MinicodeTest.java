package com.vincentwei;


import org.junit.Before;
import org.junit.Test;

/**
 * Created by weihuajiang on 2018/10/29.
 */
public class MinicodeTest {

    private Minicode minicode;

    @Before
    public void init() {
        minicode = new Minicode();
    }

    @Test
    public void stageOne() throws Exception {
        minicode.stageOne();
    }

    @Test
    public void stageTwo() throws Exception {
        minicode.stageTwo();
    }

}