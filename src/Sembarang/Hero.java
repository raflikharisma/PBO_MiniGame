package Sembarang;

abstract class Hero {
    public String heroName;
    public double healthPoint;
    public double attackDamage;
    public double defense;
    public int level = 1;

    private boolean isDead;

    public void setDead(boolean isDead){
    this.isDead = isDead;
    }
    public boolean isDead(){
        return isDead;
    }

    Hero (String heroName,double healthPoint, double attackDamage, double defense){
        this.heroName = heroName; this.healthPoint = healthPoint;this.attackDamage = attackDamage;this.defense = defense;
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[41m";

    public void determineHealth(double damageTaken, double healthPoint) {
        if( healthPoint - damageTaken <= 0 ){
            this.healthPoint = 0;
            setDead(true);
        }
        else {
         this.healthPoint = this.healthPoint - damageTaken;
        }
    }
    public void attack(Hero attacker, Hero enemy){
        enemy.determineHealth(attacker.attackDamage, enemy.healthPoint);
        System.out.println( enemy.heroName + " has taken a hit of " + ANSI_RED+attacker.attackDamage +ANSI_RESET+ " his health now " + enemy.healthPoint);
   }
   public void reviewDamage(double Attackdgmg, double dfens, String name){
       this.attackDamage = Attackdgmg - dfens;
       System.out.println("Real damage " + name + "\t: " + this.attackDamage);
   }
    abstract void show();
    abstract double truedamage();
    abstract void spawnIntro();
    abstract void levelup(int level);


}
