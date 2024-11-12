public class PlusMines1 {


    //Bu problemde, bir tam sayı dizisinde bulunan elemanların pozitif, negatif ve sıfır olanlarını bulup, bu türden
    // her bir elemanın dizideki toplam eleman sayısına oranını hesaplamamız isteniyor.
    //
    //Problemin Detayları:
    //Bir dizi veriliyor: Örneğin, arr = [1, 1, 0, -1, -1] gibi bir dizi.
    //Bu dizideki elemanlar pozitif, negatif veya sıfır olabilir.
    //Her bir türdeki elemanın oranını ondalık olarak hesaplayacağız ve her oranın 6 ondalık basamakla gösterilmesi
    // gerekiyor.




public static void main(String[] args) {

    int[] arr = {1, 1, 0, -1, -1};
    plusMines(arr);

}

private static void plusMines(int[] arr) {
    int n = arr.length;
    int positiveCount = 0;
    int negativeCount = 0;
    int zeroCount = 0;

    // Diziyi dolaşarak her bir sayı türünün sayısını hesapla

    for (int num : arr) {
        if (num > 0) {
            positiveCount++;
        } else if (num < 0) {
            negativeCount++;
        } else {
            zeroCount++;
        }
    }

    // Oranları hesapla

    double positiveRatio =(double) positiveCount/n;
    double negativeRatio =(double) negativeCount/n;
    double zeroRatio =(double) zeroCount/n;

    // Oranları formatlı bir şekilde yazdır

    System.out.printf("%.6f\n",positiveRatio);
    System.out.printf("%.6f\n",negativeRatio);
    System.out.printf("%.6f\n",zeroRatio);



}
}