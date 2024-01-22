package com.ayten;

import com.ayten.entity.Unlu;
import com.ayten.entity.Yarismaci;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Unlu unlu1 = Unlu.builder()
                .ad("Tarkan Tevetoğlu")
                .resim("https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tarkan_vienna2006_1.JPG/220px-Tarkan_vienna2006_1.JPG")
                .yas(51)
                .meslek("Şarkıcı")
                .memleket("İzmir")
                .evliMi(false)
                .oynadigiFilmler(null)
                .sarkilari(List.of("Kış Güneşi", "Dudu Dudu", "Kuzu Kuzu"))
                .build();
        Unlu unlu2 = Unlu.builder()
                .ad("Gülşen Bayraktar")
                .resim("https://upload.wikimedia.org/wikipedia/commons/4/44/G%C3%BCl%C5%9Fen%27s_Concert_2013_%28cropped%29.jpg")
                .yas(47)
                .meslek("Şarkıcı")
                .memleket("Istanbul")
                .evliMi(true)
                .oynadigiFilmler(null)
                .sarkilari(List.of("Of.. Of", "Yurtta Aşk Cihanda Aşk", "Bangır Bangır"))
                .build();
        Unlu unlu3 = Unlu.builder()
                .ad("Yalın")
                .resim("https://upload.wikimedia.org/wikipedia/tr/0/0b/Yal%C4%B1n_-_Bay%C4%B1la_Bay%C4%B1la.jpg")
                .yas(44)
                .meslek("Şarkıcı")
                .memleket("Istanbul")
                .evliMi(false)
                .oynadigiFilmler(null)
                .sarkilari(List.of("Tatlıyla Balla", "Bayıla Bayıla", "Yelkovan"))
                .build();
        Unlu unlu4 = Unlu.builder()
                .ad("Kayahan Açar")
                .resim("https://upload.wikimedia.org/wikipedia/commons/7/72/Kayahan.jpg")
                .yas(66)
                .meslek("Şarkıcı")
                .memleket("Istanbul")
                .evliMi(true)
                .oynadigiFilmler(null)
                .sarkilari(List.of("Kar Taneleri", "Yağmur", "Geceler"))
                .build();
        Unlu unlu5 = Unlu.builder()
                .ad("Mehmet Yaşar Günaçgün")
                .resim("https://upload.wikimedia.org/wikipedia/tr/3/37/Ya%C5%9Far_-_Esirinim.jpg")
                .yas(53)
                .meslek("Şarkıcı")
                .memleket("Adana")
                .evliMi(true)
                .oynadigiFilmler(null)
                .sarkilari(List.of("Kuşlar", "Esirinim", "Nazlı Kız"))
                .build();
        Unlu unlu6 = Unlu.builder()
                .ad("İrem Sak")
                .resim("https://img-s2.onedio.com/id-627ac1e316c70749411a09d4/rev-0/w-600/h-337/f-jpg/s-8547e1b7d2c44d92bb8a4c22e12c67f6edf7f018.jpg")
                .yas(37)
                .meslek("Oyuncu")
                .memleket("Sivas")
                .evliMi(false)
                .oynadigiFilmler(List.of("Yalan Dünya", "Kuş Uçuşu", "Yılbaşı Gecesi"))
                .sarkilari(null)
                .build();
        Unlu unlu7 = Unlu.builder()
                .ad("Demet Evgar")
                .resim("https://upload.wikimedia.org/wikipedia/commons/8/8b/DemetEvgar1.jpg")
                .yas(43)
                .meslek("Oyuncu")
                .memleket("Manisa")
                .evliMi(true)
                .oynadigiFilmler(List.of("Aile Arasında", "Sofra Sırları", "Bir Kadın Bir Erkek"))
                .sarkilari(null)
                .build();
        Unlu unlu8 = Unlu.builder()
                .ad("Haluk Bilginer")
                .resim("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Haluk_Bilginer2022.jpg/440px-Haluk_Bilginer2022.jpg")
                .yas(69)
                .meslek("Oyuncu")
                .memleket("İzmir")
                .evliMi(false)
                .oynadigiFilmler(List.of("Pencere", "Polis", "Kış Uykusu"))
                .sarkilari(null)
                .build();

        Yarismaci yarismaci1 = Yarismaci.builder()
                .ad("Bulut")
                .soyad("Gök")
                .katildigiYer("Antalya")
                .yas(18)
                .build();
        Yarismaci yarismaci2 = Yarismaci.builder()
                .ad("Ateş")
                .soyad("Barut")
                .katildigiYer("İstanbul")
                .yas(21)
                .build();
        Yarismaci yarismaci3 = Yarismaci.builder()
                .ad("Güneş")
                .soyad("Toprak")
                .katildigiYer("İzmir")
                .yas(32)
                .build();

        yarismaci1.setUnluler(List.of(unlu1, unlu2, unlu3, unlu4, unlu5, unlu6, unlu7, unlu8));
        yarismaci2.setUnluler(List.of(unlu1, unlu2, unlu3, unlu4, unlu5, unlu6, unlu7, unlu8));
        yarismaci3.setUnluler(List.of(unlu1, unlu2, unlu3, unlu4, unlu5, unlu6, unlu7, unlu8));

        unlu1.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu2.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu3.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu4.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu5.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu6.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu7.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));
        unlu8.setYarismacilar(List.of(yarismaci1, yarismaci2, yarismaci3));

        Scanner input = new Scanner(System.in);
        System.out.println("""
                ****************************************
                ****************************************
                        Welcome to CompetitionApp
                ****************************************
                ****************************************
                """);
        String[] resimler = new String[8];
        resimler[0] = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/17/Tarkan_vienna2006_1.JPG/220px-Tarkan_vienna2006_1.JPG";
        resimler[1] = "https://upload.wikimedia.org/wikipedia/commons/4/44/G%C3%BCl%C5%9Fen%27s_Concert_2013_%28cropped%29.jpg";
        resimler[2] = "https://upload.wikimedia.org/wikipedia/tr/0/0b/Yal%C4%B1n_-_Bay%C4%B1la_Bay%C4%B1la.jpg";
        resimler[3] = "https://upload.wikimedia.org/wikipedia/commons/7/72/Kayahan.jpg";
        resimler[4] = "https://upload.wikimedia.org/wikipedia/tr/3/37/Ya%C5%9Far_-_Esirinim.jpg";
        resimler[5] = "https://img-s2.onedio.com/id-627ac1e316c70749411a09d4/rev-0/w-600/h-337/f-jpg/s-8547e1b7d2c44d92bb8a4c22e12c67f6edf7f018.jpg";
        resimler[6] = "https://upload.wikimedia.org/wikipedia/commons/8/8b/DemetEvgar1.jpg";
        resimler[7] = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Haluk_Bilginer2022.jpg/440px-Haluk_Bilginer2022.jpg";

        Unlu[] unluler = {unlu1, unlu2, unlu3, unlu4, unlu5, unlu6, unlu7, unlu8};

        Long[] yarismaciSure1 = new Long[8];
        Long[] yarismaciSure2 = new Long[8];
        Long[] yarismaciSure3 = new Long[8];

        int yarismaci1DogruCevapSayisi = 0;
        int yarismaci2DogruCevapSayisi = 0;
        int yarismaci3DogruCevapSayisi = 0;

        for (int i = 0; i < unluler.length; i++) {

            System.out.println("Ünlü " + (i + 1) + " : " + unluler[i].getResim());
            System.out.println("Ünlünün bilgileri : ");
            System.out.println(unluler[i].getMemleket());
            System.out.println(unluler[i].getMeslek());
            System.out.println(unluler[i].getYas());
            System.out.println(unluler[i].getEvliMi());
            System.out.println(unluler[i].getSarkilari());
            System.out.println(unluler[i].getOynadigiFilmler());

            Long baslangic1 = System.currentTimeMillis();
            String cevap1 = input.nextLine();
            System.out.println("Yarışmacı1 : " + cevap1);
            Long bitis1 = System.currentTimeMillis();
            yarismaciSure1[i] = bitis1 - baslangic1;
            if (cevap1.equalsIgnoreCase(unluler[i].getAd())) {
                yarismaci1DogruCevapSayisi++;
            }

            Long baslangic2 = System.currentTimeMillis();
            String cevap2 = input.nextLine();
            System.out.println("Yarışmacı2 : " + cevap2);
            Long bitis2 = System.currentTimeMillis();
            yarismaciSure2[i] = bitis2 - baslangic2;
            if (cevap2.equalsIgnoreCase(unluler[i].getAd())) {
                yarismaci2DogruCevapSayisi++;
            }

            Long baslangic3 = System.currentTimeMillis();
            String cevap3 = input.nextLine();
            System.out.println("Yarışmacı3 : " + cevap3);
            Long bitis3 = System.currentTimeMillis();
            yarismaciSure3[i] = bitis3 - baslangic3;
            if (cevap3.equalsIgnoreCase(unluler[i].getAd())) {
                yarismaci3DogruCevapSayisi++;
            }
        }
        double toplamSure1 = yarismaciSure1[0] + yarismaciSure1[1] + yarismaciSure1[2] + yarismaciSure1[3] + yarismaciSure1[4] + yarismaciSure1[5] + yarismaciSure1[6] + yarismaciSure1[7];
        double toplamSure2 = yarismaciSure2[0] + yarismaciSure2[1] + yarismaciSure2[2] + yarismaciSure2[3] + yarismaciSure2[4] + yarismaciSure1[5] + yarismaciSure1[6] + yarismaciSure1[7];
        double toplamSure3 = yarismaciSure3[0] + yarismaciSure3[1] + yarismaciSure3[2] + yarismaciSure3[3] + yarismaciSure3[4] + yarismaciSure1[5] + yarismaciSure1[6] + yarismaciSure1[7];
        if(yarismaci1DogruCevapSayisi / toplamSure1 > yarismaci2DogruCevapSayisi / toplamSure2 && yarismaci1DogruCevapSayisi / toplamSure1 > yarismaci3DogruCevapSayisi / toplamSure3){
            System.out.println("Kazanan : " + yarismaci1.getAd());
        } else if (yarismaci2DogruCevapSayisi / toplamSure2 > yarismaci1DogruCevapSayisi / toplamSure1 && yarismaci2DogruCevapSayisi / toplamSure2 > yarismaci3DogruCevapSayisi / toplamSure3) {
            System.out.println("Kazanan : " + yarismaci2.getAd());
        } else {
            System.out.println("Kazanan : " + yarismaci3.getAd());
        }
    }
}