package com.sizheng.gmall.manage.util;

import com.sizheng.gmall.bean.Constant;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class PmsUploadUtil {

    public static String uploadImage(MultipartFile multipartFile) {

        String imageUrl = new Constant().getHttpString();

        //上传图片到服务器
        //配置fdfs的全局连接地址
        String tracker = PmsUploadUtil.class.getResource("/tracker.conf").getPath();//获得配置文件的路径

        try {
            ClientGlobal.init(tracker);
        } catch (Exception e) {
            e.printStackTrace();
        }

        TrackerClient trackerClient = new TrackerClient();

        //获得一个trackerServer的实例
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getTrackerServer();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //通过tracker获得一个 Storage 链接客户端
        StorageClient storageClient = new StorageClient(trackerServer, null);

        try {
            byte[] multipartFileBytes = multipartFile.getBytes();//获得上传的二进制对象
            String originalFileName = multipartFile.getOriginalFilename();//获取文件全名
            int i = originalFileName.lastIndexOf(".");
            String exName = originalFileName.substring(i+1);

            String[] uploadInfo = storageClient.upload_file(multipartFileBytes, exName, null);

            for (String s : uploadInfo) {
                imageUrl += "/" + s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  imageUrl;
    }
}
