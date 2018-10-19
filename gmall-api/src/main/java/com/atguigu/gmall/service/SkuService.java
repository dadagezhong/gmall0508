package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.SkuInfo;
import com.atguigu.gmall.bean.SpuSaleAttr;

import java.util.List;

public interface SkuService {
    List<SkuInfo> skuInfoListBySpu(String spuId);

    void saveSku(SkuInfo skuInfo);

    SkuInfo getSkuById(String skuId);

    List<SpuSaleAttr> getSpuSaleAttrListCheckBySku(String spuId, String skuId);

    List<SkuInfo> getSkuSaleAttrValueListBySpu(String spuId);

    List<SkuInfo> getSkuByCatalog3Id(int catalog3Id);
}
