package com.upload.folder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.upload.folder.model.Photo;
import com.upload.folder.service.PhotoService;

@Controller
public class PhotoController{
	@Autowired 
	private PhotoService service;
	
	@GetMapping("/")
	public String get(Model model) {
		List<Photo> photo = service.getFiles();
		model.addAttribute("docs", photo);
		return "doc";
	}
	
	@PostMapping("/uploadFiles")
	public String uploadMultipleFiles(@RequestParam("name") String name,@RequestParam("email")String email,@RequestParam("files") MultipartFile[] files)
{
		for (MultipartFile file: files)
		{
			service.addPhoto(name,email,file);
			
		}
		return "redirect:/";
}
	
	@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable String fileId){
		Photo file = service.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(file.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+file.getDocName()+"\"")
				.body(new ByteArrayResource(file.getData()));
	}
}