## 3.1: Einfache "Hello World!"-Ausgabe

```
public class Aufgabe3_1 {
    public static void main (String[] args) {
        System.out.println("Hello World!");
    }
}
```

Ausgabe:

```
PS G:\Meine Ablage\Dokumente\Zertifikat Mathematische und informatische Grundlagen\2. Semester\63611 Einführung in die objektorientierte Programmierung\L1-Ad-Hoc> java Aufgabe3_1
Hello World!
```

## 3.2: Begrüßung mit Vor- und Nachnamen

```
public class Aufgabe3_2 {
    public static void main(String[] args) {
        String vorname = args[0];
        String nachname = args[1];
        System.out.println("Hallo, " + vorname + " " + nachname);
    }
}
```

Ausgabe:

```
PS G:\Meine Ablage\Dokumente\Zertifikat Mathematische und informatische Grundlagen\2. Semester\63611 Einführung in die objektorientierte Programmierung\L1-Ad-Hoc> java Aufgabe3_2 Henrike, Schwenn
Hallo, Henrike Schwenn
```

## 3.3: Wenn bei 3.2 nur ein Argument statt zwei übergeben wird

Vermutung: Fehlermeldung, dass ein Argument zu wenig übergeben wurde

```
PS G:\Meine Ablage\Dokumente\Zertifikat Mathematische und informatische Grundlagen\2. Semester\63611 Einführung in die objektorientierte Programmierung\L1-Ad-Hoc> java Aufgabe3_2 Henrike
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at Aufgabe3_2.main(Aufgabe3_2.java:4)
```
