import java.util.HashMap;
import java.util.Map;

class SherlockValidString {

    public static String isValid(String s) {
        // Her bir karakterin dizide kaç kez tekrar ettiğini tutmak için bir harita oluşturuyoruz
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Dizinin her karakterini gezip, frekansını artırıyoruz
        for (char c : s.toCharArray()) {
            charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
        }

        // Frekansların tekrar sayılarını saymak için yeni bir harita oluşturuyoruz
        Map<Integer, Integer> frequencyCounts = new HashMap<>();

        // Her karakterin frekansını alıyoruz ve bu frekansların kaç kez görüldüğünü kaydediyoruz
        for (int freq : charFrequency.values()) {
            frequencyCounts.put(freq, frequencyCounts.getOrDefault(freq, 0) + 1);
        }

        // Eğer sadece bir frekans değeri varsa (tüm karakterler aynı sayıda tekrar ediyorsa), dize geçerli kabul edilir
        if (frequencyCounts.size() == 1) {
            return "YES";
        }

        // Eğer iki farklı frekans değeri varsa, geçerli olup olmadığını anlamak için özel koşullara bakıyoruz
        if (frequencyCounts.size() == 2) {
            // İki farklı frekansın değerlerini ve tekrar sayılarını alıyoruz
            int freq1 = (int) frequencyCounts.keySet().toArray()[0]; // İlk frekans değeri
            int freq2 = (int) frequencyCounts.keySet().toArray()[1]; // İkinci frekans değeri
            int count1 = frequencyCounts.get(freq1); // İlk frekansın tekrar sayısı
            int count2 = frequencyCounts.get(freq2); // İkinci frekansın tekrar sayısı

            // Koşul 1: Eğer bir frekans değeri 1 ise ve bu frekans yalnızca bir kez görülmüşse
            // Örneğin, "aabbccd" -> d'nin frekansı 1, diğer karakterlerin frekansı 2, bu durumda geçerli
            if ((freq1 == 1 && count1 == 1) || (freq2 == 1 && count2 == 1)) {
                return "YES";
            }

            // Koşul 2: İki frekans arasındaki fark 1 ise ve yüksek frekans yalnızca bir kez görünmüşse
            // Örneğin, "aabbccc" -> 'c' frekansı 3, diğerleri 2. Aradaki fark 1 ve yalnızca bir karakterin yüksek frekansı var
            if ((Math.abs(freq1 - freq2) == 1) && (count1 == 1 || count2 == 1)) {
                return "YES";
            }
        }

        // Yukarıdaki koşullardan hiçbiri sağlanmazsa, dize geçerli değildir
        return "NO";
    }

    public static void main(String[] args) {
        String s = "aabbcc"; // Örnek bir string
        System.out.println(isValid(s)); // "YES" veya "NO" çıktısını verir
    }
}
