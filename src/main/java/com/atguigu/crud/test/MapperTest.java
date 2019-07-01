package com.atguigu.crud.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.crud.dao.DepartmentMapper;

//import com.atguigu.crud.dao.DepartmentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/ssm-crud/src/main/resources/applicationContext.xml" }) 

public class MapperTest {
	@Autowired
	DepartmentMapper departmentMapper;
	
    @Test
	public void testCRUD(){
    	/*ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    	ioc.getBean(DepartmentMapper.class);*/
    	
    	
    	System.out.println(departmentMapper);
    }
}
