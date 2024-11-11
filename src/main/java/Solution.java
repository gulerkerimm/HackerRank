import java.util.HashMap;
import java.util.Map;

//Oran Hesaplama: Her dikdörtgenin kenar uzunluklarının oranını, bir kesir olarak kaydet.
//
//Yani, her dikdörtgeni (genişlik, yükseklik) olarak temsil ettiğimizde, oranı genişlik / yükseklik olarak ele alırız.
//Bu oranı, sadeleştirilmiş kesir formatında (örneğin a/b) kaydedebiliriz.
//Benzer Dikdörtgenleri Sayma: Aynı orana sahip dikdörtgenleri saymak için
// bir harita (dictionary veya hashmap) kullanabiliriz.
//
//Oranları aynı olan dikdörtgenler neredeyse benzer olacakları için, aynı oranı paylaşan
// her grup için (n * (n-1)) / 2 kadar benzer çift sayısı vardır (burada n, aynı orana sahip dikdörtgenlerin sayısıdır).
//Toplam Benzer Çiftleri Hesaplama: Tüm benzer çiftleri toplayarak sonucu elde ederiz.

public class Solution {
    public static int nearlySimilarRectangles(int[][] sides) {
        Map<Double, Integer> ratioCount = new HashMap<>();
        int similarPairs = 0;

        for (int[] side : sides) {
            double ratio = (double) side[0] / side[1];  // Oranı double olarak hesapla
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0) + 1);
        }

        // Aynı oranı paylaşan dikdörtgen çiftlerini say
        for (int count : ratioCount.values()) {
            if (count > 1) {
                similarPairs += (count * (count - 1)) / 2;
            }
        }

        return similarPairs;
    }
}