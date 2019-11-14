package programacion.enumerators;

public enum Continents {

    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int countries;

    Continents(int countries){
        this.countries = countries;
    }

    public int getCountries(){
        return countries;
    }
}

class FreshJuice{
    enum FreshJuiceSize{ Small, Medium, Large }
    FreshJuiceSize size;
}