package com.example.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reggie.entity.Dish;
import com.example.reggie.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;
//mapper层的作用是对数据库进行数据持久化操作
@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {

}
