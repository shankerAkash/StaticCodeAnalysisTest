package com.project.staticCodeAnalysis.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.staticCodeAnalysis.model.TestModel;
import com.project.staticCodeAnalysis.service.TestService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class TestController {
	
	private TestService testService;
	
	@GetMapping("/getTest")
    public ResponseEntity<List<TestModel>> get() {
		
		return ResponseEntity.ok().body(testService.getTest());
		
    }
	
	@PostMapping("/addTest")
    public ResponseEntity<TestModel> add(@RequestParam TestModel modelRequest) {
		
		return ResponseEntity.ok().body(testService.addTest(modelRequest));
		
    }

}
