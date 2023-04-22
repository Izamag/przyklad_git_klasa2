package Klasy;

public class Osoba {
    public String imie;
    public String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
public String getInfo(){
        return "Imię: " + this.imie + "     " + "\nNazwisko: " + this.nazwisko;
}
}
