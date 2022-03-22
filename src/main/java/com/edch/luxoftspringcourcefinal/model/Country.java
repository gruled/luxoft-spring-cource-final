package com.edch.luxoftspringcourcefinal.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "country")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code_name")
    private String codeName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return getId().equals(country.getId()) && Objects.equals(getName(), country.getName()) && Objects.equals(getCodeName(), country.getCodeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCodeName());
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", codeName='" + codeName + '\'' +
                '}';
    }
}
