package com.qf.j1902.service;

import com.qf.j1902.pojo.TbContent;
import org.bouncycastle.crypto.paddings.TBCPadding;

import java.util.List;

/**
 * Created by zhou on 2019/7/29.
 */
public interface TbContentService {
    public List<TbContent> findAll();
}
