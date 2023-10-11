package com.project.staticCodeAnalysis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.staticCodeAnalysis.Repository.TestRepository;
import com.project.staticCodeAnalysis.model.TestModel;


@Service
public class TestService {

	private TestRepository testRepository;

	public TestModel addTest(TestModel model) {

		TestModel modelResponse = testRepository.save(model);
		
		return modelResponse;

	}

	public List<TestModel> getTest() {

		return testRepository.findAll();

	}

}
