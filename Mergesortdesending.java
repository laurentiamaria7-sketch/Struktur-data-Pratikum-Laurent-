// Nama : Laurentia Maria Olivianica
// Nim :052666739

public class Mergesortdesending {

    // Fungsi utama untuk menjalankan program
    public static void main(String[] args) {
        int[] data = {45, 12, 78, 23, 56, 89, 343, 67};

        System.out.println("Data sebelum diurutkan:");
        tampilkanArray(data);

        mergeSort(data, 0, data.length - 1);

        System.out.println("\nData setelah diurutkan (terbesar ke terkecil:");
        tampilkanArray(data);
    }

    // Fungsi rekursif Merge Sort
    public static void mergeSort(int[] arr, int  kiri, int kanan) {
        if (kiri < kanan) {
            int tengah = (kiri + kanan) / 2;

            // Bagi dua bagian
            mergeSort(arr, kiri, tengah);
            mergeSort(arr, tengah + 1, kanan);

            // Gabungkan hasil pengurutan
            merge(arr, kiri, tengah, kanan);
        }   
    }
    // Fungsi untuk menggabungkan dua bagian array
    public static void merge(int[] arr, int kiri, int tengah, int kanan) {
        int n1 = tengah - kiri + 1;
        int n2 = kanan - tengah;

        int[] kiriArr = new int[n1];
        int[] kananArr = new int[n2];

        for (int i = 0; i < n1; i++)
            kiriArr[i] = arr[kiri + i];
        for (int j = 0; j < n2; j++)
            kananArr[j] = arr[tengah + 1 + j];

        int i =0, j = 0, k = kiri;
    
        // Menggabungkan array dengan urutan DESCENDING
        while (i < n1 && j < n2) {
            if (kiriArr[i] >= kananArr[j]) {
                arr[k] = kiriArr[i];
                i++;
            }else {
                arr[k] = kananArr[j];
                j++;
            }
            k++;

        while (j < n2){
            arr[k] = kiriArr[i];
            i++;
            k++;
        }    

        while (j < n2) {
            arr[k] = kananArr[j];
            j++;
            k++;
        }
        }

    }

    // Menampilkan isi array
    public static void tampilkanArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}