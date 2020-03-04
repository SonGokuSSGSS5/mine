package com.cts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.CategoryRepBean;

@Repository
public interface categoryRepdao extends JpaRepository<CategoryRepBean, Integer>{

}
