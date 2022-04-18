package dev.ranieri.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dog {

    @NonNull // uses reflection to ensure this value is not set to null
    private String name = "no name";
    private String owner;
    private int age;

}
