package com.sizheng.gmall.service;

import com.sizheng.gmall.bean.PmsSearchParam;
import com.sizheng.gmall.bean.PmsSearchSkuInfo;

import java.util.List;

public interface SearchService {
    List<PmsSearchSkuInfo> list(PmsSearchParam pmsSearchParam);
}
