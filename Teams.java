class Teams {
    private static final int MAX_PARTY_SIZE = 3;
    private GameCharacter[] randoms = new GameCharacter[MAX_PARTY_SIZE];
    private int partySize = 0;


    public void add(GameCharacter gameCharacter) {
        if (partySize < MAX_PARTY_SIZE) {
            randoms[partySize] = gameCharacter;
            partySize++;
        }
    }

    public double sumDps() {
        double a = 0;
        for (int i = 0; i < partySize; i++) {
            a = a + randoms[i].getDmg();
        }
        return a;
    }

    public double sumDef() {
        double b = 0;
        for (int i = 0; i < partySize; i++) {
            b = b + randoms[i].getDef();
        }
        return b;
    }

    public double totalHp() {
        double c = 0;
        for (int i = 0; i < partySize; i++) {
            c = c + randoms[i].getHp();
        }
        return c;
    }

//    public double clash(Teams teams1,Teams teams2) {
//        if (teams1.sumDps() < teams2.sumDef()) {
//            System.out.print("Atak nie przebil obrony: ");
//            return teams2.getTotalHp();
//        } else
//            System.out.print("Pozostale HP: ");
//            return teams2.getTotalHp() - (teams1.sumDps() - teams2.sumDef());
//    }

}
