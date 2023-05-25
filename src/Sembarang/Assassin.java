package Sembarang;



public class Assassin extends Hero implements bonusDamage {

    Assassin(String heroName,double healthPoint, double attackDamage, double defense) {
        super(heroName,healthPoint, attackDamage, defense);
    }
    public String getHeroName(){
        return this.heroName;
    }
    public double truedamage(){
        return this.attackDamage;
    }
    public double getAttackDamage(){
        return this.attackDamage += attackDamage*bonusDamage;
    }
    public double getDefense(){
        return this.defense;
    }

    void levelup(int level) {
        this.level++;
        this.attackDamage = this.attackDamage + 30;
        this.healthPoint = this.healthPoint + 90;
        this.defense = this.defense + 15;  
        System.out.println("Assassin\t\t: NO BODY CAN BEAT US ");
        System.out.println("Level Right now (+1) " + this.level);
        System.out.println("Attack Damage Increase by 30 " + this.attackDamage);
        System.out.println("Health Point Increase by 90 " + this.healthPoint);
        System.out.println("Defense Increase by 15 " + this.defense);

    }
    public void infoLevel(){
        System.out.println("Assassin Level\t\t\t: "+this.level);
    }
    @Override
    void show() {
        System.out.println("Ass Healthpoint\t\t\t: " + this.healthPoint);
        System.out.println("Ass Attack Damage\t\t: " + this.attackDamage);
        System.out.println("Ass Defense Stat\t\t: "+ this.defense);
        System.out.println("Ass Criticall Maseee\t: "+ truedamage());
    }

    @Override
    void spawnIntro() {
        System.out.println("");
        System.out.println("Hero " + this.heroName);
        System.out.println("Assassin\t: YOU WANT TO PLAY LETS PLAY ");
    }
}

