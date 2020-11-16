package com.sizheng.gmall.payment;

import com.sizheng.gmall.mq.ActiveMQUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.jms.*;

@SpringBootTest
class GmallPaymentApplicationTests {
    @Autowired
    ActiveMQUtil activeMQUtil;

    @Test
    void contextLoads() throws JMSException {
        ConnectionFactory connectionFactory = activeMQUtil.getConnectionFactory();

        Connection connection = connectionFactory.createConnection();

        System.out.println(connection);
    }
}
