package be.bstorm.bf_java2024_exospringmvc01.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private String firstname;
    private String lastname;
    private String phone;
    private String email;
    private String content;
}
