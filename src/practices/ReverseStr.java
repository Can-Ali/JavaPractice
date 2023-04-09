package practices;

public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverse("school"));
    }
    public static String reverse(String input)
    {
        String reversed= "";
        for(int i = input.length()-1; i>=0; i--){
            reversed += input.charAt(i)+"";

        }
        return reversed;

    }


    // this is only for practice
}
