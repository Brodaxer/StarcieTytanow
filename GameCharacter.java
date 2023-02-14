class GameCharacter {
    private String name;
    private double hp;
    private double dmg;
    private double def;

    public GameCharacter(String name, double hp, double dmg, double def) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.def = def;
    }

    public double getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public double getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }
}

class Dps extends GameCharacter {

    public Dps(String name, int hp, int dmg, int def) {
        super(name, hp, dmg * 1.2, def);

    }
}

class Tank extends GameCharacter {

    public Tank(String name, double hp, double dmg, double def) {
        super(name, hp, dmg, def * 1.2);
    }

}