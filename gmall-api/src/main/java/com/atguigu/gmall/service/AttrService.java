package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.BaseAttrInfo;

import java.util.List;

public interface AttrService {
    List<BaseAttrInfo> getAttrListByCtg3(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);

    List<BaseAttrInfo> getAttrListByValueId(String join);

}
