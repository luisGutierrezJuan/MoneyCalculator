package persistencia;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class CurrencyLoader {
    
    public static float loadCurrencyExchange(String d1, String d2){
        try{
            String urlCambio = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies/" + d1 + "/" + d2 + ".json";  
            BufferedReader bf = new BufferedReader(new InputStreamReader(new URL(urlCambio).openStream()));
            String linea;
            while ( (linea = bf.readLine()) != null){
                if (linea.contains(d2)){
                    return Float.parseFloat(linea.split(": ")[1]);
                }
            }
            bf.close();
        } catch (Exception e){
            System.out.println("Se produjo un error en la carga de la divisa: " + e.getMessage());
        }
        return 0.0f;
    }
    
    public static ArrayList<String> loadCurrencies(){
        ArrayList<String> divisas = new ArrayList<String>();
        try{
            File f = new File("divisas.txt");
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ( (linea = bf.readLine()) != null){
                divisas.add(linea.split(":")[1]);
            }
            bf.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return divisas;
    }
    
    public static String loadCurrency(String divisa){
        try{
            File f = new File("divisas.txt");
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            while ( (linea = bf.readLine()) != null){
                if (linea.split(":")[1].equals(divisa)) return linea.split(":")[0];
            }
            bf.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
