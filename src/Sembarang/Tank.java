package Sembarang;

public class Tank extends Hero{
    Tank(String heroName,double healthPoint, double attackDamage, double defense) {
        super(heroName,healthPoint, attackDamage, defense);
    }
    public double truedamage(){
        return attackDamage;
    }
    public String getHeroName(){
        return this.heroName;
    }
    public double getHealthPoint(){
        return this.healthPoint;
    }
    public double getDefense(){
        return this.defense;
    }

    @Override
    void levelup(int level) {
        this.level++ ;
        this.attackDamage = this.attackDamage + 20;
        this.healthPoint = this.healthPoint + 200;
        this.defense = this.defense + 15;
        System.out.println("Tank\t\t: U MAKE ME STRONGER ");
        System.out.println("Level Right now " + this.level);
        System.out.println("Attack Damage Increase by 30 " + this.attackDamage);
        System.out.println("Health Point Increase by 90 " + this.healthPoint);
        System.out.println("Defense Increase by 15 " + this.defense);
    }
    public void infoLevel(){
        System.out.println("Tank Level\t\t\t: "+this.level);
    }

    @Override
    void show() {

        System.out.println("Tank Healthpoint\t\t: " + this.healthPoint);
        System.out.println("Tank Attack Damage\t\t: " + this.attackDamage);
        System.out.println("Tank Defense Stat\t\t: "+ this.defense);

    }
    @Override
    void spawnIntro(){
        System.out.println("Tank\t\t: I WILL PROTECT THE UNIVERSE");
    }
}
