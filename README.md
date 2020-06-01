# Gambler

Lösung der folgenden Aufgabenstellung in Zusammenarbeit mit [Rainier Robles](https://github.com/ren1982) und einem weiteren Kommilitonen, der nicht genannt werden will.

Für die Programmierung dieser Aufgabe definieren Sie zuerst eine Klasse Nap, die unter Anwendung der sleep-Methode der Thread-Klasse mindestens folgende statische Methoden enthält:public static void nap( int milliSekunden );public static void randomNap( int minMillisekunden, int maxMillisekunden ); 

Die erweiterte Aufgabe war eine Gambler Klasse zu definieren, die in der Lage ist, Glücksspieler-Objekte als Threads zu produzieren. Die Glücksspieler wetten parallel und unabhängig von einander. Alle Spieler starten mit 5 Dollar und nach jedem Spiel verlieren oder gewinnen sie einem Dollar. Die Spieler hören auf zu spielen, wenn diese kein Geld mehr haben oder sich ihr Budget verdoppelt haben. Eine Denkpause der Spieler zwischen den Wetten soll mit Hilfe der randomNap-Methode simuliert wird. Die Simulation wird beendet, wenn alle Spieler aufgehört haben zu spielen. Der gesamte Spielverlauf soll protokolliert und als Ergebnis der Simulation ausgegeben werden.


Example output:
```

S Nr.3 hat noch 6 Euro
S Nr.1 hat noch 6 Euro
S Nr.2 hat noch 6 Euro
S Nr.0 hat noch 4 Euro
S Nr.3 hat noch 5 Euro
S Nr.1 hat noch 5 Euro
S Nr.0 hat noch 3 Euro
S Nr.2 hat noch 7 Euro
S Nr.2 hat noch 6 Euro
S Nr.0 hat noch 4 Euro
S Nr.3 hat noch 4 Euro
S Nr.1 hat noch 4 Euro
S Nr.0 hat noch 3 Euro
S Nr.3 hat noch 5 Euro
S Nr.2 hat noch 7 Euro
S Nr.1 hat noch 5 Euro
S Nr.0 hat noch 2 Euro
S Nr.1 hat noch 6 Euro
S Nr.2 hat noch 8 Euro
S Nr.3 hat noch 6 Euro
S Nr.0 hat noch 3 Euro
S Nr.3 hat noch 7 Euro
S Nr.2 hat noch 9 Euro
S Nr.1 hat noch 7 Euro
S Nr.0 hat noch 2 Euro
S Nr.2 hat noch 10 Euro
S Nr.1 hat noch 8 Euro
S Nr.0 hat noch 3 Euro
S Nr.3 hat noch 8 Euro
S Nr.0 hat noch 2 Euro
S Nr.3 hat noch 9 Euro
S Nr.0 hat noch 1 Euro
S Nr.3 hat noch 8 Euro
S Nr.1 hat noch 7 Euro
S Nr.0 hat noch 2 Euro
S Nr.1 hat noch 8 Euro
S Nr.3 hat noch 9 Euro
S Nr.0 hat noch 1 Euro
S Nr.3 hat noch 8 Euro
S Nr.0 hat noch 0 Euro
S Nr.1 hat noch 9 Euro
S Nr.1 hat noch 8 Euro
S Nr.3 hat noch 9 Euro
S Nr.1 hat noch 9 Euro
S Nr.3 hat noch 8 Euro
S Nr.1 hat noch 8 Euro
S Nr.3 hat noch 9 Euro
S Nr.1 hat noch 7 Euro
S Nr.3 hat noch 10 Euro
S Nr.1 hat noch 6 Euro
S Nr.1 hat noch 5 Euro
S Nr.1 hat noch 6 Euro
S Nr.1 hat noch 7 Euro
S Nr.1 hat noch 6 Euro
S Nr.1 hat noch 5 Euro
S Nr.1 hat noch 6 Euro
S Nr.1 hat noch 7 Euro
S Nr.1 hat noch 6 Euro
S Nr.1 hat noch 5 Euro
S Nr.1 hat noch 6 Euro
S Nr.1 hat noch 7 Euro
S Nr.1 hat noch 8 Euro
S Nr.1 hat noch 9 Euro
S Nr.1 hat noch 8 Euro
S Nr.1 hat noch 9 Euro
S Nr.1 hat noch 8 Euro
S Nr.1 hat noch 9 Euro
S Nr.1 hat noch 8 Euro
S Nr.1 hat noch 9 Euro
S Nr.1 hat noch 10 Euro


Spieler:   S Nr.0  S Nr.1  S Nr.2  S Nr.3

Runde  0:  4           6           6           6
Runde  1:  3           5           7           5
Runde  2:  4           4           6           4
Runde  3:  3           5           7           5
Runde  4:  2           6           8           6
Runde  5:  3           7           9           7
Runde  6:  2           8           10           8
Runde  7:  3           7                       9
Runde  8:  2           8                       8
Runde  9:  1           9                       9
Runde 10:  2           8                       8
Runde 11:  1           9                       9
Runde 12:  0           8                       8
Runde 13:              7                       9
Runde 14:              6                       10
Runde 15:              5
Runde 16:              6
Runde 17:              7
Runde 18:              6
Runde 19:              5
Runde 20:              6
Runde 21:              7
Runde 22:              6
Runde 23:              5
Runde 24:              6
Runde 25:              7
Runde 26:              8
Runde 27:              9
Runde 28:              8
Runde 29:              9
Runde 30:              8
Runde 31:              9
Runde 32:              8
Runde 33:              9
Runde 34:              10
```
