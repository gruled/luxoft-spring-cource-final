package com.edch.luxoftspringcourcefinal.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Objects;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    private Integer id;

    @Field("name")
    private String name;

    @Field("bank")
    private Bank bank;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return getId().equals(client.getId()) && Objects.equals(getName(), client.getName()) && Objects.equals(getBank(), client.getBank());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBank());
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bank=" + bank +
                '}';
    }
}
