package com.sizheng.gmall.service;

import com.sizheng.gmall.bean.PmsProductImage;
import com.sizheng.gmall.bean.PmsProductInfo;
import com.sizheng.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {

    List<PmsProductInfo> spuList(String catlog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductImage> spuImageList(String spuId);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(String productId, String skuId);
}
