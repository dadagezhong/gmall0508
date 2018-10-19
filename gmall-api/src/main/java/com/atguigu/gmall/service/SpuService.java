package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuImage;
import com.atguigu.gmall.bean.SpuInfo;
import com.atguigu.gmall.bean.SpuSaleAttr;

import java.util.List;

public interface SpuService {
    List<BaseSaleAttr> baseSaleAttrList();

    void saveSpu(SpuInfo spuInfo);

    List<SpuInfo> spuList(String catalog3Id);

    List<SpuSaleAttr> spuSaleAttrList(String spuId);

    List<SpuImage> spuImageList(String spuId);
}
