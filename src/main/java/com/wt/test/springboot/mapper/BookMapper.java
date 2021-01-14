package com.wt.test.springboot.mapper;

import com.wt.test.springboot.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 书本表 Mapper 接口
 * </p>
 *
 * @author qiyu
 * @since 2021-01-09
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
