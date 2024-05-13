package com.example.dogs.controller;

import com.example.dogs.dto.DogDTO;
import com.example.dogs.dto.GodDTO;
import com.example.dogs.dto.GroupDTO;
import com.example.dogs.dto.PostDTO;
import com.example.dogs.service.DogService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class DogController {

    private DogService dogService;

    @GetMapping("dogs")
    public ResponseEntity<GroupDTO> getDog(){
        return new ResponseEntity<>(dogService.findDog(), HttpStatus.OK);
    }
    @GetMapping("god")
    public ResponseEntity<GodDTO> getGod(){
        return new ResponseEntity<>(dogService.findGod(), HttpStatus.OK);
    }
    @GetMapping("posts")
    public ResponseEntity<List<PostDTO>> getPost(){return new ResponseEntity<>(dogService.findPost(), HttpStatus.OK);}
}
