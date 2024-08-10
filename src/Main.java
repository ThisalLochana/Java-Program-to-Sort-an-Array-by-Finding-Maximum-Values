public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {15,12,50,4,17,1,57,49,3,1001,63,100,1000,10};
        int temp;
        int max = 0;
        int indexOfMax = 0;
        int length = numbers.length;
        for (int i = 0; i< numbers.length; i++){
            for (int x = 0; x < length; x++){
                if (max < numbers[x]){
                    max = numbers[x];
                    indexOfMax = x;
                }
            }
            max = 0;
            System.out.println("Max value is: " + numbers[indexOfMax]);
            temp = numbers[length-1];
            numbers[length-1] = numbers[indexOfMax];
            numbers[indexOfMax] = temp;
            length--;
            System.out.println("length is: " + length);
        }
        for (int iterator: numbers){
            System.out.println(iterator);
        }
    }
}