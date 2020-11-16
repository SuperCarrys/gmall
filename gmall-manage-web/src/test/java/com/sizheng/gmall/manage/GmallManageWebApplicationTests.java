package com.sizheng.gmall.manage;

import com.sizheng.gmall.bean.Constant;
import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
class GmallManageWebApplicationTests {

    @Test
    void contextLoads() throws IOException, MyException {

        //配置fdfs的全局连接地址
        String tracker = GmallManageWebApplicationTests.class.getResource("/tracker.conf").getPath();//获得配置文件的路径

        ClientGlobal.init(tracker);

        TrackerClient trackerClient = new TrackerClient();

        //获得一个trackerServer的实例
        TrackerServer trackerServer = trackerClient.getTrackerServer();

        //通过tracker获得一个 Storage 链接客户端
        StorageClient storageClient = new StorageClient(trackerServer, null);

        String[] uploadInfo = storageClient.upload_file("C:/Users/12195/Desktop/截图/1.jpg", "jpg", null);

        String url = new Constant().getHttpString();

        for (String s : uploadInfo) {
            url += "/" + s;
        }

        System.out.println(url);
    }

}
