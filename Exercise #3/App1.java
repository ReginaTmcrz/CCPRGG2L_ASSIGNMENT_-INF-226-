 public class App1 {
        public static void main(String[] args) {
          
            Character knight = new Character();
            knight.strength = 10;
            knight.agility = 5;
            knight.intelligence = 0;
            knight.name = "Chen";
            knight.sayMyName();
            knight.sayMyStrength();
            knight.Attack();
            System.out.println("----- Weapons ------");
            Weapon bowAndArrow = new Weapon();
            bowAndArrow.name = "Bow and Arrow Crmli";
            bowAndArrow.damage = 30;
            bowAndArrow.rarity = "Maniac";

            bowAndArrow.sayDamage();
            bowAndArrow.addDamage(10);
            System.out.println(bowAndArrow.sayRarityandName());


       
            
    
            System.out.println();
            Character mage = new Character();
    
            mage.strength = 5;
            mage.agility = 5;
            mage.intelligence = 10;
            mage.name = "Akasha";
            mage.sayMyName();
            mage.sayMyStrength();
            mage.Attack();
            System.out.println("----- Weapons ------");
            Weapon halberd = new Weapon();
            halberd.name = "Halbert Bia";
            halberd.damage = 50;
            halberd.rarity = "Savage";
            halberd.sayDamage();
            halberd.addDamage(10);
            System.out.println(halberd.sayRarityandName());


            System.out.println();
            Character thief = new Character();
    
            thief.strength = 5;
            thief.agility = 10;
            thief.intelligence = 0;
            thief.name = "Gondar";
            thief.sayMyName();
            thief.sayMyStrength();
            thief.Attack();
            System.out.println("----- Weapons ------");
            Weapon sword = new Weapon();
            sword.name = " Sword Biancakes";
            sword.damage = 100;
            sword.addDamage(10);
            sword.rarity = "Legendary";

            sword.sayDamage();
            sword.addDamage(10);
            System.out.println(sword.sayRarityandName());

            
            System.out.println();
            Character jungler = new Character();
    
            thief.strength = 8;
            thief.agility = 10;
            thief.intelligence = 10;
            thief.name = "Mimi";
            thief.sayMyName();
            thief.sayMyStrength();
            thief.Attack();
            System.out.println("----- Weapons ------");
            Weapon ax = new Weapon();
            ax.name = " ax mia";
            ax.damage = 90;
            ax.addDamage(10);
            ax.rarity = "Legendary";

            ax.sayDamage();
            ax.addDamage(10);
            System.out.println(ax.sayRarityandName());


        }
    }

