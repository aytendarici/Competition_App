package com.ayten.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_yarismaci")
public class Yarismaci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    Integer yas;
    String katildigiYer;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "yarismacilar")
    List<Unlu> unluler;
}