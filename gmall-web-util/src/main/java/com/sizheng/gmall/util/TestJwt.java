package com.sizheng.gmall.util;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestJwt {

    @Test
    public void test(){
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", "1");
        map.put("nickname", "Tom");
        String ip = "127.0.0.1";
        String time = new SimpleDateFormat("yyyMMdd HHmmss").format(new Date());
        String encode = JwtUtil.encode("2020gmall", map, ip + time);

        System.err.println(encode);
    }

}
