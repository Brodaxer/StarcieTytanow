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

    public double attack(Teams teams) {
        if (sumDps() < teams.sumDef()) {
            return teams.totalHp();
        } else
            return teams.totalHp() - (sumDps() - teams.sumDef());
    }

}