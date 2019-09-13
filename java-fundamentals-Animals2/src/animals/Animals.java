/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;


public class Animals {

    
    public static void main(String[] args) {
       int DOGS = 10;
       String dogLabel = "Puppies: ";
       int cats = 28;
       String catLabel = "Cats: ";
       int pYtHoNs = 1;
       String snakeLabel = "Snakes: ";
       int Rats = 17;
       String ratLabel = "Rats: ";
       int totalAnimals = DOGS + cats + pYtHoNs + Rats;
       String totalLabel = "All Animals: ";
       char dayOfWeek = 'M';
       String dayLabel= "Day: ";
       
       System.out.println(dayLabel + dayOfWeek);
       System.out.println(dogLabel + DOGS);
       System.out.println(catLabel + cats);
       System.out.println(snakeLabel + pYtHoNs);
       System.out.println(ratLabel + Rats);
       System.out.println(totalLabel + totalAnimals);
       
    }
    
}
