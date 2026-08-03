import java.util.*;
public class validParatheses {
    public static void main(String[] args) {
        
        Stack<Character> s1 = new Stack<>();

        char arr[] = {'(', ')', '{', '}'};

        for(int i=0; i<arr.length; i++){
            if(arr[i] =='(' || arr[i] == '[' || arr[i] == '{'){
                s1.push(arr[i]);
            }else{
                if(s1.isEmpty()){
                    // System.out.println("False");
                    continue;
                }
                char top = s1.pop();
                if(arr[i] ==')' && top == '(' || arr[i] == ']' && top == '[' || arr[i] == '}' && top == '{'){
                    // System.out.println("False");
                    continue;
                }
            }
        }

        if(s1.isEmpty() == true){
            System.out.println("Balanced Stack");
        }else{
            System.out.println("Not Balanced stack");
        }
    }
}

