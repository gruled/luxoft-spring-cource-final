package com.edch.luxoftspringcourcefinal.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "client")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bank")
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
