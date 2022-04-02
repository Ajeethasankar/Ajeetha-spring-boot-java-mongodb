package com.upload.folder.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.upload.folder.model.Photo;
import com.upload.folder.repository.Repository;

@Service
public class PhotoService {

    @Autowired
    private Repository Repo;
   
    public Photo addPhoto(String name, String email,MultipartFile file) { 
    {
    	 String docname = file.getOriginalFilename();
    	 
    	 
   	  try {
   		  Photo photo = new Photo(name,email,docname,file.getContentType(),file.getBytes());
   		  return Repo.save(photo);
   	  }
   	  catch(Exception e) {
   		  e.printStackTrace();
   	  }
   	  return null;
     }
    	 
    }
    
    public Optional<Photo> getFile(String fileId) {
  	  return Repo.findById(fileId);
    }
    
    
    	  public List<Photo> getFiles(){
    		  return Repo.findAll();
    	  }

    	 
    }  
     
   /* public Photo getPhoto(String id) {
     return Repo.findById(id).get();
    }

public List<Photo> getAllPhotos() {
		return Repo.findAll();
}*/

    

 

       
    
