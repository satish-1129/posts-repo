package com.likeAndComment.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.likeAndComment.entities.LikesAndCom;
import com.likeAndComment.services.LikesAndComService;

@Controller
public class LikesAndComController 
{
	@Autowired
	LikesAndComService service;
	
	@PostMapping("/createPost")
	public String createPost(@RequestParam ("caption") String caption,
							@RequestParam("photo") MultipartFile photo,
							Model model)
	{
	
	LikesAndCom lac=new LikesAndCom();
	lac.setCaption(caption);
	try
	{
		lac.setPhoto(photo.getBytes());
	}
	catch(IOException e) 
	{
		e.printStackTrace();
	}
	service.createPost(lac);
	List<LikesAndCom> allPosts=service.fetchAllPosts();
	model.addAttribute("allPosts",allPosts);
	return "posts";
	
	
	}

}
