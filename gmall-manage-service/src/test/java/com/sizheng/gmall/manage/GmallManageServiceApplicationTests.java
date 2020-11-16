package com.sizheng.gmall.manage;

import com.sizheng.gmall.util.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
class GmallManageServiceApplicationTests {

    @Autowired
    RedisUtil redisUtil;

    @Test
    void contextLoads() {
        Jedis jedis = redisUtil.getJedis();

        System.out.println(jedis.ping());
    }

}
