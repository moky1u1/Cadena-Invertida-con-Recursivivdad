import static jdk.nashorn.internal.objects.NativeString.charAt;

public class CadenaInvertida {

    public static String cadenaInvertida(String cadena){
        if(cadena.length()==1){
            return cadena;
        } else {
            return cadenaInvertida(cadena.substring(1)) + cadena.charAt(0);
        }
    }
}
