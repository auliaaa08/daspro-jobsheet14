public class Percobaan1 {

/* FUNGSI STATIC DENGAN NAMA faktorialRekursif() */
static int faktorialRekursif(int n) {
    if (n == 0) {
        return (1);
    } else {
        return (n * faktorialRekursif(n - 1));
    }
}

/* FUNGSI STATIC DENGAN NAMA faktorialInteratif() */
static int faktorialInteratif(int n) {
    int faktor = 1;
    for (int i = n; i >= 1; i--) {
        faktor = faktor * i;
    }
    return faktor;
}

/* FUNGSI MAIN *//*  */
public static void main(String[] args) {
    System.out.println(faktorialRekursif(5));
    System.out.println(faktorialInteratif(5));
}

}