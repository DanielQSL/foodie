package com.qsl.foodie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qsl.foodie.pojo.entity.ItemsSpec;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 Mapper 接口
 * </p>
 *
 * @author qianshuailong
 * @since 2020-01-08
 */
public interface ItemsSpecMapper extends BaseMapper<ItemsSpec> {

}
