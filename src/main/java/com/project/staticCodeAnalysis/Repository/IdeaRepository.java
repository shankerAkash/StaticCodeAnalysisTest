package com.project.staticCodeAnalysis.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.staticCodeAnalysis.model.IdeaDocument;

public interface IdeaRepository extends MongoRepository<IdeaDocument, String> {

}
