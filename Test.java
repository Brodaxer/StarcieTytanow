public class Test {
    public static void main(String[] args) {
        //GameCharacter dps = new Dps("lucznik", 100, 100, 50);
        Teams keki = new Teams();
        Teams aluchy = new Teams();
        Clash test = new Clash();

        aluchy.add(new Dps("miecznik", 100, 100, 50));
        aluchy.add(new Tank("tarczownik", 120, 40, 100));
        aluchy.add(new GameCharacter("drot", 40, 50, 60));
        keki.add(new GameCharacter("lucznik", 100, 100, 10));
        keki.add(new Dps("lucznik", 100, 100, 10));
        keki.add(new Tank("lucznik", 100, 100, 100));


        System.out.println(test.resoultClash(aluchy, keki));
        System.out.println(test.resoultClash(keki,aluchy));
    }
}
