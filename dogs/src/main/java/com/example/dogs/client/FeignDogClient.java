package com.example.dogs.client;

import com.example.dogs.configuration.FeignClientConfig;
import com.example.dogs.dto.DogDTO;
import com.example.dogs.dto.GodDTO;
import com.example.dogs.dto.GroupDTO;
import com.example.dogs.dto.PostDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "dogwebsites", url = "www.dog", configuration = FeignClientConfig.class)
public interface FeignDogClient {

    @GetMapping(path = "/breeds", consumes = MediaType.APPLICATION_JSON_VALUE)
    GroupDTO getDog(URI baseURL);
    @GetMapping(path = "/available_translations.json", consumes = MediaType.APPLICATION_JSON_VALUE)
    GodDTO getGod(URI baseURL);
    @GetMapping(path = "/posts", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<PostDTO> getPost(URI baseURL);

}
