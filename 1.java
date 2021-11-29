// d.jamaatul anbiya
// dumbways
// link runner https://onecompiler.com/java/3xjuajatj

import java.util.*;

public class main {
    public static void main(String[] args) {
        bilang(4,3); //jalan fungsi
    }

    public static void bilang(int kolom, int baris) {
        ArrayList prima = new ArrayList(); //array dinamis menampung bilangan prima sebanyak baris * kolom
        int counter = 0;

        ///error jika tidak memenuhi syarat
        if (kolom <= 0) {
            System.err.println("ERR0R : PRIMA HARUS LEBIH DARI 0");
            return;
        }
        if (baris <= 0) {
            System.err.println("ERR0R : BARIS SETIDAKNYA HARUS LEBIH DARI 0");
            return;
        }

        ///// generate bilangan prima :
            while (prima.size() != kolom * baris) { // while loop sebanyak bilangan prima sebanyak baris * kolom

                int faktor = 0; 
                for (int j = counter; j > 0; j--) {
                    if (counter % j == 0) { //logika jika bilangan yang mempunyai 2 faktor adalah bilangan prima yaitu 1 dan bilanga itu sendiri;
                        faktor++;
                    }
                }
                if (faktor == 2) {
                    prima.add(counter); //menambah bilangan prima 

                }
                
                counter++;
            }


            ////print ke terminal : 
        int buffer = 0; //untuk menampung index selanjutnya
        int current = 0; //menangkap index yang sudah di print;
        for (int i = 0; i < baris; i++) {
            for (int j = buffer; j < kolom + buffer; j++) {
                System.out.print(prima.get(j) + ",");
                current = j;
            }
            buffer = current + 1;
            System.out.println(); //print kosong sebagai baris 
        }
    }
}
