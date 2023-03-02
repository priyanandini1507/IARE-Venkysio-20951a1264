public class Reverse_of_string_recursion_java {
     public static void printReverse (String str)
        {
                if ((str==null)||(str.length() <= 1)) 
                   System.out.print(str); 
                else
                { 
                    System.out.print(str.charAt(str.length()-1));             
                    printReverse(str.substring(0,str.length()-1)); 
                }    
        }
    public static void main(String[] args) {
        String str="this function reverse";
        printReverse(str);
    }

}
