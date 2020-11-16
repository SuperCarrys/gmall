package com.sizheng.gmall.service;

import com.sizheng.gmall.bean.PmsSkuInfo;

import java.math.BigDecimal;
import java.util.List;

public interface SkuService{
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuById(String skuId);

    List<PmsSkuInfo> selectSkuSaleAttrValueListBySpu(String productId);

    List<PmsSkuInfo> getAllSku();

    boolean checkPrice(String productSkuId, BigDecimal price);
}
