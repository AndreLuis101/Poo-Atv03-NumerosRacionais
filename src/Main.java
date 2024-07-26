public class Main {
    public static void main(String[] args) {
        Racional r1 = new Racional(1, 2);
        Racional r2 = new Racional(1, 3);

        System.out.println(r1.adiciona(r2).converteParaString());
        System.out.println(r2.adiciona(r1).converteParaString());
        System.out.println(r1.subtrai(r2).converteParaString());
        System.out.println(r2.subtrai(r1).converteParaString());
        System.out.println(r1.multiplica(r2).converteParaString());
        System.out.println(r2.multiplica(r1).converteParaString());
        System.out.println(r1.divide(r2).converteParaString());
        System.out.println(r2.divide(r1).converteParaString());
        System.out.println(r1.igual(r1));
        System.out.println(r2.igual(r2));
        System.out.println(r1.igual(r2));
        System.out.println(r2.igual(r1));
        System.out.println(new Racional(1, 2).igual(new Racional (16 , 32)));
    }
}
