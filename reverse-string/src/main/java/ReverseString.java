package main.java;

public class ReverseString {

    public String reverse(String inputString) {
        String invertedText = "";
        for(int i = inputString.length(); i > 0; i--) {
            invertedText += inputString.charAt(i-1);
        }
        return invertedText;
    }
  
}
