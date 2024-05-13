package com.example.dogs.service;


import com.example.dogs.client.FeignDogClient;
import com.example.dogs.dto.DogDTO;
import com.example.dogs.dto.GodDTO;
import com.example.dogs.dto.GroupDTO;
import com.example.dogs.dto.PostDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DogImpl implements DogService{

    FeignDogClient dogClient;

    @Override
    public GroupDTO findDog() {
        URI basePath = URI.create("https://dogapi.dog/api/v2");
        GroupDTO dogDTO = dogClient.getDog(basePath);
        return dogDTO;
    }

    @Override
    public List<PostDTO> findPost() {
        URI basePath = URI.create("https://jsonplaceholder.typicode.com");
        List<PostDTO> postDTO = dogClient.getPost(basePath);
        return postDTO;
    }

    @Override
    public GodDTO findGod() {
        URI basePath = URI.create("https://bible.helloao.org/api");
        GodDTO godDTO = dogClient.getGod(basePath);
        return godDTO;
    }
}
