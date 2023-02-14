class Clash {
    public double clash(Teams teams1, Teams teams2) {
        if (teams1.sumDps() < teams2.sumDef()) {
            return teams2.totalHp();
        } else
            return teams2.totalHp() - (teams1.sumDps() - teams2.sumDef());
    }

    public double resoultClash(Teams teams1, Teams teams2) {
        if (clash(teams1, teams2) < clash(teams2, teams1)) {
            System.out.print("Druzyna 1 wygrywa, pozostalo jej: ");
            return teams1.totalHp();
        } else System.out.print("Druzyna 2 wygrywa, pozostalo jej: ");
        return teams2.totalHp();
    }

}
