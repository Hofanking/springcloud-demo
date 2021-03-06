package com.scorpios.springcloud.dao;

import com.scorpios.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// @Repository
@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
