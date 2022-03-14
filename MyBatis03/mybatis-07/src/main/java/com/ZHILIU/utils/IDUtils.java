package com.ZHILIU.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author ZHI LIU
 * @date 2022-01-13
 */

public class IDUtils {

    public static String getId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
        System.out.println(IDUtils.getId());
    }

}
