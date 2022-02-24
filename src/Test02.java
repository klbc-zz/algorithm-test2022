import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        System.out.println(letterCombinations("23"));

    }
    public static List<String> letterCombinations(String digits) {
        List<String> re = new ArrayList<>();
        if(digits=="") return re;
        String[] two = {"a","b","c"};
        String[] three = {"d","e","f"};
        String[] four = {"g","h","i"};
        String[] five = {"j","k","l"};
        String[] six = {"m","n","o"};
        String[] seven = {"p","q","r","s"};
        String[] eight = {"t","u","v"};
        String[] nine = {"w","x","y","z"};
        if(digits.substring(0,1)=="2"){
            for (String i : two){
                if(letterCombinations(digits)== null) break;
                for (String j : letterCombinations(digits.substring(1))){
                    re.add(i+j);

                }


            }
        }
        return null;

        //if (digits==)

    }
}
