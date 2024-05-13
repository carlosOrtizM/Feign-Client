package com.example.dogs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GodDTO {
    List<Translations> translations;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Translations{
    String id;
    String name;
    String englishName;
    String shortName;
    String language;
    String licenseUrl;
    String website;
    String listOfBooksApiLink;
    String textDirection;
    List<String> availableFormats;
}
