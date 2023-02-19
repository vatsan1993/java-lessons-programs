package ch3;

// Transportation cypher encryption
// odds + evens
public class Chap3Ex32 {
    public static void main(String[] args) {
        String myString= "How are you?";
        StringBuffer evens = new StringBuffer("");
        StringBuffer odds= new StringBuffer("");

        for(int i=0; i< myString.length(); i++){
            if(i%2==0){
                evens.append(myString.charAt(i));
            }
            else{
                odds.append(myString.charAt(i));
            }
        }
        String encryptedString= odds.toString()+ evens.toString();
        System.out.println(encryptedString);
    }
}
