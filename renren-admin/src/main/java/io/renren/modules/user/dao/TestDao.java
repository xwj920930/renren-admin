package io.renren.modules.user.dao;

import io.renren.modules.user.entity.TestEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-06-25 10:19:09
 */
public interface TestDao extends BaseMapper<TestEntity> {
    /**
     * 测试自定义查询
     * @return
     */
	List<TestEntity> queryForTest(int id);
}
