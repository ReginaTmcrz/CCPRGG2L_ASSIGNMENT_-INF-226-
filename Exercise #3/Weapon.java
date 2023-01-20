public class Weapon {
    String name;
    int damage;
    String rarity; 



    public void addDamage(int addDamage){
       int newDamage = this.damage + addDamage;
       
        System. out.println("New damage: " + newDamage);
      
    }

  
    public void sayDamage(){
        System.out.println("Damage: " + damage);
    }

 
       String sayRarityandName(){
            return "Name: " + name + "\n" + "Rarity: " + rarity;




        }

        
}