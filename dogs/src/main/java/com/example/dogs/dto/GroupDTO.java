package com.example.dogs.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class GroupDTO {
    private List<GroupData> data;
    private Links links;
}

@Data
@NoArgsConstructor
class GroupData {
    private String id;
    private String type;
    private Attributes attributes;
    private Relationships relationships;
}

@Data
@NoArgsConstructor
class Attributes {
    private String name;
    private String description;
    private boolean hypoallergenic;
}

@Data
@NoArgsConstructor
class Relationships {
    private List<BreedData> breeds;
}

@Data
@NoArgsConstructor
class BreedData {
    private String id;
    private String type;
}

@Data
@NoArgsConstructor
class Links {
    private String self;
    private String current;
    private String next;
    private String last;
}

