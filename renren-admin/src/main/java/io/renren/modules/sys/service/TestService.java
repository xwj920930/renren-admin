package io.renren.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.sys.entity.TestEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-06-25 10:19:09
 */
public interface TestService extends IService<TestEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<TestEntity> queryForTest(int id);

}

