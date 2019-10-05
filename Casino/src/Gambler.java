
// Die Klasse Gambler steht f�r einen Spieler der ins Casino geht.
// Jeder Spieler hat einen Namen,einen Geldstand,einen Wahrheitswert ob er das Casino verl�sst und eine mindest- und maximale �berlegenszeit. Auch besitz er eine Liste in dem der Geldstant pro Runde erfasst wird um sie am Ende auswerten zu k�nnen und die Rundennummer


import java.util.Random;
import java.util.ArrayList;

public class Gambler extends Thread
{
    public int money = 5;
    public boolean leaving = false;
    public int minNap;
    public int maxNap;
    ArrayList<Integer> protocol;
	int runde = 0;
    
    // mindestens muss ein Name �bergeben werden
    //  Die �berlegenszeit liegt zwischen 5 - 20 Sekunden wenn keine eigene angegeben wird
    public Gambler(String name)
    {
        super(name);
        this.minNap = 500;
        this.maxNap = 2000;
        protocol = new ArrayList<Integer>();
    }
    // die �berlegenszeit kann auch selber �bergeben werden
    public Gambler(String name,int minNap,int maxNap)
    {
        super(name);
        this.minNap = minNap;
        this.maxNap = maxNap;
        protocol = new ArrayList<Integer>();
    }
    
    Random random = new Random();
    
    
    
    public void run()
    {
        try
        {
            do
            {
                // Zu Begin macht der Spieler eine Denkpause die standartm��ig zwischen 5-20 sekunden dauert
                Nap.randomNap(this.minNap,this.maxNap);
                
                
                if(random.nextBoolean()) //zuf�lllig wird entschieden ob der Spieler gewonnen oder verloren hat
                {
                    this.money++;
                }else
                {
                    this.money--;
                }
                
                System.out.println(this.getName() + " hat noch " + Integer.toString(money) + " Euro ");
                
                
                // Im Protokoll wird die Runde erfasst 
                protocol.add(runde, money);
                runde++;
                
                // Am Ende der do-while-Schleife  wird �berpr�ft ob das Geld des Spielers 0 oder 10 betr�gt. Ist dem so verl�sst er das Casino 
                
                
                
                if(money == 0)
                {
                    leaving = true;
                    return;
                }
                else if(money == 10)
                {
                    
                    leaving = true;
                    return;
                }
                
               
                
            }while(leaving==false);
        }
        catch(InterruptedException e) //https://www.ibm.com/developerworks/library/j-jtp05236/
        // https://www.tutorialspoint.com/java/lang/thread_isinterrupted.htm
        {
            System.out.print(this.getName() + " unterbrochen !");
            System.out.println(e.toString());
        
        }
        
    }
    
}