// Toplamı sıfıra en yakın olan iki öğeyi bulan java programı

package com.g;
class Main {
    static void sifiraEnYakin(int dizi[]) {
        int i, j, min_sum, min_i = 0, min_j = 1;

        min_sum = dizi[0] + dizi[1];

        for (i = 0; i < dizi.length - 1; i++) {
            for (j = i + 1; j < dizi.length; j++) {
                int sum = dizi[i] + dizi[j];
                if (Math.abs(min_sum) > Math.abs(sum)) // Math.abs ile mutlak değeri alınıyor ve karşılaştırma yapılıyor
                {
                    min_sum = sum;
                    min_i = i;
                    min_j = j;
                }
            }
        }

        System.out.println("\tToplamı sıfıra en yakın olan iki öğe : " + "[" + dizi[min_i] + " , " + dizi[min_j] + "]");
    }

    public static void main(String[] args) {
        int dizi[] = {38, 44, 63, -51, -35, 19, 84, -69, -46};
        sifiraEnYakin(dizi);
    }

}
