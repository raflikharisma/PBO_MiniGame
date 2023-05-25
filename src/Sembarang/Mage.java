package Sembarang;

public class Mage extends Hero implements magicalDamage {

    Mage(String heroName, double healthPoint, double attackDamage, double defense) {
        super(heroName, healthPoint, attackDamage, defense);
    }
    public String getHeroName(){
        return this.heroName;
    }
    public double truedamage(){
        return attackDamage;
    }
    public double getAttackDamage(){
        return this.attackDamage += attackDamage*magicDamageBonus;
    }
    @Override
    void show() {
        System.out.println("Healthpoint\t\t\t: " + this.healthPoint);
        System.out.println("Magical Damage\t\t: " + this.attackDamage);
        System.out.println("Defense Stat\t\t: "+ this.defense);
        System.out.println("Damage Bonus\t\t: "+ getAttackDamage());
    }
    public double getDefense(){
        return this.defense;
    }

    @Override
    void levelup(int level) {
        this.level++;
        this.attackDamage = this.attackDamage + 35;
        this.healthPoint = this.healthPoint + 85;
        this.defense = this.defense + 10;
        System.out.println("Mage\t\t: LET'S BE UNDEFEATED");
        System.out.println("Level Right now " + this.level);
        System.out.println("Attack Damage Increase by 30 " + this.attackDamage);
        System.out.println("Health Point Increase by 90 " + this.healthPoint);
        System.out.println("Defense Increase by 15 " + this.defense);

    }
    public void infoLevel(){
        System.out.println("Mage\t\t\t: "+this.level);
    }
    @Override
    void spawnIntro() {
        System.out.println("Mage\t:\t FOCUS FOCUS TRULALA");
    }
}
