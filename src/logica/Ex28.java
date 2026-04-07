package logica;

public class Ex28 {


    void main(){

        int x = -12121;

        String[] filterNumbers = String.valueOf(x).split("");

        for(int i=0; i<filterNumbers.length;i++){

            if(filterNumbers[i].equals("-")){
                filterNumbers[i+1] = "-"+filterNumbers[i+1];
                filterNumbers[i] = "";
            }
        }



        String[] transformNumber = filterNumbers;




        if(transformNumber.length == 1){
            return;
        }



        Integer[] vectorNumber = new Integer[transformNumber.length];
        Integer[] vectorNumberReverse = new Integer[transformNumber.length];


        boolean isPalindromo = false;

        for(int i=0; i< transformNumber.length; i++){

            if(!transformNumber[i].isBlank()){
                vectorNumber[i] = Integer.parseInt(transformNumber[i]);
                vectorNumberReverse[i] = Integer.parseInt(transformNumber[(transformNumber.length -1) -i]);
            }

            if(vectorNumber[i].equals(vectorNumberReverse[i])){
                isPalindromo = true;
            }
        }

        return;

    }
}
