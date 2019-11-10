package Homework13;

public class LettersInText {
    String text;
    public void lettersInText(String text){
        this.text=text;
        for (int i = 0; text.length() > i; i++){
            if (text.charAt(0+i)=='а'){
                System.out.println("голосний а");

            }else if (text.charAt(0+i)=='о'){
                System.out.println("голосний о");
            }else if (text.charAt(0+i)=='у'){
                System.out.println("голосний у");

            }else if (text.charAt(0+i)=='е'){
                System.out.println("голосний е");
            }
            else if (text.charAt(0+i)=='и'){
                System.out.println("голосний и");
            }else if (text.charAt(0+i)=='і'){
                System.out.println("голосний і");
            }else {
                System.out.println("приголосний" + " " + text.charAt(0+i));
            }
        }

    }
}
