public class Main {
    public static void main(String[] args) {
        int sayi1;
        sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enbuyuk= sayi1;
        if(sayi2>enbuyuk)
            enbuyuk= sayi2;
        if(sayi3>enbuyuk)
            enbuyuk= sayi3;

        System.out.println("en büyük sayı : "+enbuyuk);
    }
}