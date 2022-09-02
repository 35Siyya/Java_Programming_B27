package day21_nested_loops;

public class FirstDublicateIQ {
    public static void main(String[] args) {
        /*
        Write a program that can return the first duplicated character from a string
         */
        String str="abccccccdffddd";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count>1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
