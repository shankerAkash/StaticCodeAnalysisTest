package com.project.staticCodeAnalysis.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.staticCodeAnalysis.model.TestModel;

public interface TestRepository extends JpaRepository<TestModel, Long>{

}
