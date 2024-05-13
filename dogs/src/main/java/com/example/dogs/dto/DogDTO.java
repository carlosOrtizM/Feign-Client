package com.example.dogs.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DogDTO {


    //DataDog dataDog;
    Long id;
    String type;
    private String name;
    private String description;
    private Boolean hypoallergenic;

    //public static class DataDog{
        //Long id;
        //String type;

        //public static class Attributes{
            //private String name;
            //private String description;
            //private Boolean hypoallergenic;
        //}

    //}

    //public static class Links{
        //private String self;
        //private String current;
        //private String next;
        //private String last;
    //}
}
