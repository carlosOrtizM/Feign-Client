package com.example.dogs.service;

import com.example.dogs.dto.DogDTO;
import com.example.dogs.dto.GodDTO;
import com.example.dogs.dto.GroupDTO;
import com.example.dogs.dto.PostDTO;

import java.util.ArrayList;
import java.util.List;

public interface DogService {
    public GroupDTO findDog();
    public List<PostDTO> findPost();
    public GodDTO findGod();
}
