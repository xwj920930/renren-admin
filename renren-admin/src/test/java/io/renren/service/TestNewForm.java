package io.renren.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.renren.modules.user.entity.TestEntity;
import io.renren.modules.user.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestNewForm {
    @Autowired
    TestService testService;
    @Test
    public void insert(){
        TestEntity testEntity=new TestEntity();
        testEntity.setId(11L);
        testEntity.setAddress("cd");
        testEntity.setName("xwj");
        testEntity.setDate(new Date());
        testEntity.setIsdel(0);
        testService.insert(testEntity);
    }
    @Test
    public void updateById(){
        TestEntity testEntity=new TestEntity();
        testEntity.setId(11L);
        testEntity.setAddress("成都");
        testEntity.setName("xwj");
        testEntity.setDate(new Date());
        testEntity.setScenicId("lgh");
        testService.updateById(testEntity);
    }
    @Test
    public void deleteByLogic(){
        TestEntity testEntity=new TestEntity();
        testEntity.setId(11L);
        testService.deleteById(testEntity);
    }
    @Test
    public void selectById(){
        TestEntity testEntity=testService.selectById(11L);
        System.err.print(testEntity.getName());
    }
    @Test
    public void selectByCondition(){
        List<TestEntity> testEntities=testService.selectList(
                new EntityWrapper<TestEntity>().eq("isdel","0").eq("address","成都")
        );
        for (TestEntity testEntity : testEntities) {
            System.err.println(testEntity.getName());
        }
    }
    //使用xml方式自定义查询
    @Test
    public void queryForTest(){
        List<TestEntity> testEntity=testService.queryForTest(5);
        for (TestEntity entity : testEntity) {
            System.err.println(entity.getName());
        }

    }
}
