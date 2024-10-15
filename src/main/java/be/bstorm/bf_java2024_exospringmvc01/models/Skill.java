package be.bstorm.bf_java2024_exospringmvc01.models;

import lombok.Data;

@Data
public class Skill {

    private static Long nextId = 1L;

    private Long id;
    private String name;
    private String description;

    public Skill(){
        this.id = nextId++;
    }

    public Skill(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }
}
