package Sembarang;
import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        int option;
        int pilihan;
        Scanner inputan = new Scanner(System.in);
        Scanner lololo = new Scanner(System.in);

        Assassin as = new Assassin("Assassin", 3000, 800, 300);
        Mage mg = new Mage("Mage", 2500, 700, 200);
        Tank tn = new Tank("Tank", 7000, 500, 500);
        String ANSI_RESETT = "\u001B[0m";
        String ANSI_BLUE = "\u001B[46m";
        as.getAttackDamage();
        do {
            System.out.println();
            System.out.println("Hei King! Before You Start the Battle, You Want to Leveling ?\t: ");
            System.out.println("1. Levelup Assassin ");
            System.out.println("2. Levelup Tank ");
            System.out.println("3. Levelup Mage ");
            System.out.println("4. Battle now ");
            System.out.println();
            System.out.print("What hero You want to Upgrade ? ");
            option = inputan.nextInt();
             if (option == 1) {
            as.levelup(0);
            }else if(option == 2){
             tn.levelup(0);
            }else if(option == 3){
             mg.levelup(0);
            }
        } while (option != 4);
        System.out.println("Hey Soldier You  Have Done Your Leveling, Now Choose The Battle");
        System.out.println("You only have one chance, and one battle ");
        System.out.println("1. Assassin Vs Tank");
        System.out.println("2. Assassin Vs Mage");
        System.out.println("3. Tank Vs Mage");
        System.out.print("What battle you wanna see?");
        pilihan = lololo.nextInt();
        if (pilihan == 1) {
            as.reviewDamage(as.truedamage(), tn.getDefense(), as.getHeroName());
            as.show();
            as.infoLevel();
            tn.reviewDamage(tn.truedamage(), as.getDefense(), tn.getHeroName());
            tn.show();
            tn.infoLevel();
            as.spawnIntro();
            tn.spawnIntro();
            while (!as.isDead() &&  !tn.isDead()) {
                System.out.println("Assassin\t: Shadow Kiru!@!@!@");
                as.attack(as, tn);
                System.out.println("Tank\t\t: Doton Sando No Jutsu");
                tn.attack(tn, as);
                if (as.isDead()) {
                    System.out.println(ANSI_BLUE+"ASSASSIN LOOSE"+ANSI_RESETT);
                    System.out.println( "Tank\t\t: YAYAYA! TOO EZ !TOO EZ" );
                } else if (tn.isDead()) {
                    System.out.println(ANSI_BLUE+"TANK LOOSE"+ANSI_RESETT);
                    System.out.println("Assassin\t: Huh! My sword has spoken");
                }
            }
        } else if (pilihan == 2) {
            as.reviewDamage(as.truedamage(), mg.getDefense(), as.getHeroName());
            as.show();
            as.infoLevel();
            mg.reviewDamage(tn.truedamage(), mg.getDefense(), mg.getHeroName());
            mg.show();
            mg.infoLevel();
            as.spawnIntro();
            mg.spawnIntro();
            while (!as.isDead() && !mg.isDead()) {
                System.out.println("Assassin\t: Shadow Kiru!@!@!@");
                as.attack(as, mg);
                System.out.println("Mage\t\t: Ryoki Tenkai!$!$!$!");
                mg.attack(mg, as);
                if (as.isDead()) {
                    System.out.println(ANSI_BLUE+"ASSASSIN LOOSE"+ANSI_RESETT);
                    System.out.println("Mage\t\t: Ahehe! My Spell never miss");
                } else if (mg.isDead()) {
                    System.out.println(ANSI_BLUE+"Mage loose"+ANSI_RESETT);
                    System.out.println("Assassin\t: Huh! My sword has spoken");
                }
            }

        } else if (pilihan == 3) {
            tn.reviewDamage(tn.truedamage(), mg.getDefense(), tn.getHeroName());
            tn.show();
            tn.infoLevel();
            mg.show();
            mg.reviewDamage(mg.truedamage(), tn.getDefense(),mg.getHeroName());
            mg.infoLevel();
            tn.spawnIntro();
            mg.spawnIntro();
            while (!tn.isDead() && !mg.isDead()) {
                tn.attack(tn, mg);
                mg.attack(mg, tn);
                if (tn.isDead()) {
                    System.out.println(ANSI_BLUE+"Tank LOOSE"+ANSI_RESETT);

                } else if (mg.isDead()) {
                    System.out.println(ANSI_BLUE+"Mage LOOSE"+ANSI_RESETT);
                    System.out.println("Tank\t\t: YAYAYA! TOO EZ !TOO EZ" );
                }
            }
        }
    }
}


