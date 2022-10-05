package arabian;

import java.util.TreeMap;

public class Converter {
    TreeMap<Character, Integer> nikitaKeyMap = new TreeMap<>();


    public Converter() {
        nikitaKeyMap.put('I', 1);
        nikitaKeyMap.put('V', 5);
        nikitaKeyMap.put('X', 10);
        nikitaKeyMap.put('L', 50);
        nikitaKeyMap.put('C', 100);
        nikitaKeyMap.put('D', 500);
        nikitaKeyMap.put('M', 1000);




    }

    public boolean isNikita(String number){
        //"V"->'V'
        return nikitaKeyMap.containsKey(number.charAt(0));
    }



}
