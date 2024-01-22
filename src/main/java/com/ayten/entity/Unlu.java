package com.ayten.entity;

//import entity.enums.*;
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
@Table(name = "tbl_unlu")
public class Unlu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String resim;
    Integer yas;
    String meslek;
    String memleket;
    Boolean evliMi;
    List<String> oynadigiFilmler;
    List<String> sarkilari;
    @ManyToOne
    List<Yarismaci> yarismacilar;
}