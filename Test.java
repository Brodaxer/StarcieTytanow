public class Test {
    public static void main(String[] args) {

        Teams keki = new Teams();
        Teams aluchy = new Teams();
       

        aluchy.add(new Dps("miecznik", 100, 100, 50));
        aluchy.add(new Tank("tarczownik", 100, 40, 100));
        aluchy.add(new Dps("drot", 100, 50, 60));
        keki.add(new Tank("lucznik", 100, 100, 50));
        keki.add(new Dps("lucznik", 100, 100, 10));
        keki.add(new Tank("lucznik", 100, 100, 100));

//        System.out.println(keki.attack(aluchy));
//        System.out.println(aluchy.attack(keki));
        if (keki.attack(aluchy)<aluchy.attack(keki)){
            System.out.println("Team2 wygrywa");
        }else System.out.println("Team1 wygrywa");

    }
}
