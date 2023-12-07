package com.project.staticCodeAnalysis.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.project.staticCodeAnalysis.api.IdeaApi;
import com.project.staticCodeAnalysis.model.Idea;
import com.project.staticCodeAnalysis.service.IdeaService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class IdeaController implements IdeaApi {

	private IdeaService ideaService;

	@Override
	public ResponseEntity<List<Idea>> getIdeas() {
		return ResponseEntity.ok().body(ideaService.getIdeas());
	}

	@Override
	public ResponseEntity<Idea> getIdea(String id) {
		return ResponseEntity.ok().body(ideaService.getIdea(id));
	}

	@Override
	public ResponseEntity<Idea> addIdea(Idea idea) {
		return ResponseEntity.ok().body(ideaService.addIdea(idea));
	}

	@Override
	public ResponseEntity<Void> deleteIdea(String id) {
		boolean isDeleted = ideaService.deleteIdea(id);
		if (isDeleted) {
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@Override
	public ResponseEntity<Idea> updateIdea(Idea idea) {
		return ResponseEntity.ok().body(ideaService.updateIdea(idea));
	}

}
