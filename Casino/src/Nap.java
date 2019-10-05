import java.lang.Math;

public class Nap extends Thread
{   
    public static void nap(int milisekunden) throws InterruptedException
    {
        sleep(milisekunden);
    }
    
    public static void randomNap(int minMilisekunden,int maxMilisekunden) throws InterruptedException
    {
        if(minMilisekunden <= maxMilisekunden) 
        {
            // Aus den übergebenden Argumenten und einer Zufallszahl wird eine Überlegenszeit bestimmt
            // Die funktion sleep bekommt diese Zahl und dann wartet der Thread in dem die Funktion ausgeführt wird entsprechend lange
            sleep((int)(Math.random() * ((double)maxMilisekunden - (double)minMilisekunden) + (double)minMilisekunden));
        }
        else
        {
            //No sleep
        }
    }
    

}