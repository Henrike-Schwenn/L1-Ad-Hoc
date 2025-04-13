## Skizzierte Vorgehensweise Ausnahmebehandlung

```
public class ExceptionTest{
    public static void main (String[] args){
        try{
            //Allerlei Anweisungen, die verschiedene Exceptions auslösen können
        } catch (Exception e) {
            // Behandlung
        } catch (ArrayIndexOutOfBoundsException e){
            // Behandlung
        } catch (NumberFormatException e){
            // Behandlung
        }
    }
}
```

An sich würde ich die Vorgehensweise als korrekt einschätzen, weil alle erforderlichen syntaktischen Bestandteile gegeben sind. Die finally-Klausel ist nicht zwingend erforderlich. Allerdings würde ich eine finally-Klausel hinzufügen für den Fall, dass eine Exception auftritt, für die es keine passende catch-Klausel gibt.
