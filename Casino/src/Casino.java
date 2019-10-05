// Das Casino startet die Spieler die dann parallel und unabhängig voneinander spielen.

// Beim Starten soll eine Zahl als Parameter übergeben werden und je nach Anzahl sollen soviele Threads von der Klasse Gambler erstellt und anschließend gestartet werden

// Das Casino selbst wartet auch bis alle Spieler es verlassen haben und gibt zum Schluß das Protokoll aus

public class Casino{
    public static void main(String[] args)
    {
         try
        {
            //Es wird nur ein int als Eingabeparameter akzeptiert 
            // Gibt es nicht nur ein Argument oder ist das Argument kein int wird ein WrongArgExeption geworfen

            if (args.length != 1 ) // Gibt es nicht genau 1 Parameter werfen wir einen Fehler
            {
                throw new WrongArgException();    
            }
            int anzahl_Spieler; // der Parameter wird in der Variablen loop gespeichert und dient uns für die Erstellung der Threads 
            try{
                anzahl_Spieler = Integer.parseInt(args[0]);
            }
            catch(NumberFormatException e) // ist der Parameter kein int werfen wir einen Fehler
            {
                throw new WrongArgException();
            }
            
            Gambler[] spielerArray = new Gambler[anzahl_Spieler]; // In einem Array werden die Spieler gespeichert 
            for (int spielernr = 0; spielernr<anzahl_Spieler; spielernr++) 
            {
                
                String name = Integer.toString(spielernr);
                spielerArray[spielernr] = new Gambler("S Nr."+name);
            }
        
            for (int spielernr = 0; spielernr<anzahl_Spieler; spielernr++) // und anschließend gestartet
            {
                spielerArray[spielernr].start();
            }
            
            // Um zum Schluß auszugeben welche Spieler gewonnen haben wartet das Casino bis alle Spieler es verlassen haben
            boolean alleFertig;
            do
            {
                alleFertig = true;
                for (int spielernr = 0; spielernr<anzahl_Spieler; spielernr++)
                {
                    if (spielerArray[spielernr].leaving == false)
                    {
                    alleFertig = false;
                    }
                }
            }while(alleFertig == false);
            
            
            //Zur Darstellung werden die Protocolle der Spieler ausgewertet und eine Tabelle die den Geldstand pro Runde ausgibt ausgegeben
            
            // Die Maximale Rundenanzahl für die Schleife wird erfasst
            int max_Runden = 0;
            for (int spielernr = 0; spielernr<anzahl_Spieler; spielernr++) {
                if (max_Runden < spielerArray[spielernr].protocol.size()) {
                    max_Runden = spielerArray[spielernr].protocol.size();
                }
            }
            // Oberste Zeile der Tabelle
            System.out.print("Spieler:   ");
            for (int spielernr = 0; spielernr<anzahl_Spieler; spielernr++) 
            {
                System.out.print(spielerArray[spielernr].getName() + "  ");
            }
            System.out.println("\n");
            // Rest der Tabelle
            for (int runde = 0; runde<max_Runden; runde++) {	// alle runden
                if (runde>9) {
                    System.out.print("Runde " + runde + ":  ");
                }
                else {
                    System.out.print("Runde  " + runde + ":  ");
                }
                for (int spielernr = 0; spielernr<anzahl_Spieler; spielernr++) {
                    if (!(spielerArray[spielernr].protocol.size() <= runde)) {
                       
                        System.out.print(spielerArray[spielernr].protocol.get(runde) + "\t   ");
                        
                    }
                    else {
                        System.out.print(" \t   ");
                    }
                }
                System.out.println();
            }
                
              
        }
        catch(WrongArgException e)
        {
            System.out.println("Bitte genau eine Nummer als Parameter uebergeben");
        }
        
	}
    



}