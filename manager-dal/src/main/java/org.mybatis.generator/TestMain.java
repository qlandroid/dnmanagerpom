package org.mybatis.generator;

import com.dnmanager.pojo.User;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;

public class TestMain {
    public static void main(String[] args) {
        BASE64Encoder encoder = new BASE64Encoder();
        try {
            String encode = encoder.encode("123456".getBytes("UTF-8"));
            System.out.println(encode);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
