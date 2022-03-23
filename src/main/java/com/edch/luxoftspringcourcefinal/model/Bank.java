package com.edch.luxoftspringcourcefinal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.annotation.processing.Generated;
import java.util.Objects;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bank {
    @Id
    private Integer id;

    @Field("name")
    private String name;

    @Field("country")
    private Country country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return getId().equals(bank.getId()) && Objects.equals(getName(), bank.getName()) && Objects.equals(getCountry(), bank.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCountry());
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                '}';
    }
}
