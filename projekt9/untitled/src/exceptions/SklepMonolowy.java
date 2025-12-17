package exceptions;

public class SklepMonolowy {

    public static void checkAge(int age){
        if (age >= 18){
            System.out.println("Pomyślnie zweryfikowano wiek");
        }else{
            throw new IllegalArgumentException("Wiek zbyt niski");
        }
    }

    public static void checkName(String name) throws NiepoprawnyFormatDanychException{
//        if(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z'){
//            Character.
//        }
        if(Character.isUpperCase(name.charAt(0))){
            System.out.println("Dane są ok");
        }
        else{
            throw new NiepoprawnyFormatDanychException("Dowód podrobiony");
        }
    }


    public static void main(String[] args) {
        checkAge(18);
        try{
            checkAge(15);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }

        //checkName("Samuel");
    }
}

