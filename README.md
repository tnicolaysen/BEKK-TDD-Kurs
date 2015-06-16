# BEKK-TDD-Kurs

## Hva trenger du?

### Et IDE
[IntelliJ IDEA](https://www.jetbrains.com/idea/download)
eller
[Eclipse](https://eclipse.org/downloads)

### Java
Forhåndsinstallert på OSX

http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

## Del 1: Bowling Kata

### [Presentasjon](https://drive.google.com/open?id=0B9c7hhH1egrrbzBsN091RDI5YkE&authuser=0)

### [Last ned ZIP-fil med startkode](https://github.com/EsbenAarz/bekk-bowlingkata/archive/master.zip)
Om du kan bruke git kan du clone repositoriet her: https://github.com/EsbenAarz/bekk-bowlingkata

### Kom igang

* Import ved klikk. 
* Bruk standardvalg gjennom guiden.
* `⌘+N` / `CTRL+N` etterfulgt av å skrive inn BGT (BowlingGameTest). Enter. 
* Deretter `SHIFT+F10` Enter for å kjøre testen. 
 
### [Alternativ Kata](http://nimblepros.com/media/36760/supermarket%20pricing%20kata.pdf)
+ Nye krav som kommer etterhvert!

## Del 2: Enterprise Bowling System

### [Last ned ZIP-fil med startkode](TODO)

### Tips

```java
// Lese ut innholdet i en OutputStream til en String
ByteArrayOutputStream os = new ByteArrayOutputStream();
String aString = new String(os.toByteArray(),"UTF-8");

// Eller om du allerede har en instans av en ByteArrayOutputStream kalt baos
// HINT: Kanskje det passer i testene? 
baos.toString("UTF-8");
```

#### Løsningsforslag

##### [Del 1 (ZIP)](https://github.com/EsbenAarz/bekk-bowlingkata/archive/solution.zip)
https://github.com/EsbenAarz/bekk-bowlingkata/tree/solution

##### Del 2 
Løsning vil bli gjennomgått i plenum
