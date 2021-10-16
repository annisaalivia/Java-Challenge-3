public class Perulangan {
    public static void main(String[] args){
        int x,y;
        // deklarasi variabel

        for (x = 8; x >= 1; x--) {
            System.out.println();
            for (y = 1; y <= x; y++) {
                System.out.print("*");
            }
        }
    }
}