package com.upload.folder.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.upload.folder.model.Photo;


public interface Repository extends MongoRepository<Photo, String> {

}