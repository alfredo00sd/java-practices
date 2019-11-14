package programacion.enumerators;

public class RunExample {
    public static void main(String[] args) {

        //System.out.println(" Day : "+Dias.THURSDAY + "\n" + checkDay(Dias.THURSDAY));
        //System.out.println(checkCountriesInContinent(Continents.AFRICA));
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.Medium;
        System.out.println("Size is: "+juice.size);
    }



    private static String checkCountriesInContinent(Continents continents){
        String msg;
        switch (continents){
            case AMERICA :
                msg = "El continente americano tiene : "+Continents.AMERICA.getCountries()+" paises.";
                break;
            case ASIA :
                msg = "El continente asiatico tiene : "+Continents.ASIA.getCountries()+" paises.";
                break;
            case EUROPA :
                msg = "El continente europeo tiene : "+Continents.EUROPA.getCountries()+" paises.";
                break;
            case OCEANIA :
                msg = "El continente oceanico tiene : "+Continents.OCEANIA.getCountries()+" paises.";
                break;
            case AFRICA :
                msg = "El continente africano tiene : "+Continents.AFRICA.getCountries()+" paises.";
                break;
            default : msg = "Yolo";
        }return msg;
    }

    private static String checkDay(Dias dias){
        String msg;
        switch (dias){
            case MONDAY :
                msg = "First day of the week";
                break;
            case FRIDAY :
                msg = "Fridaaaaaaaaaaay!!!";
            default :
                msg = "Megh.. :v";
        }
        return msg;
    }
}
