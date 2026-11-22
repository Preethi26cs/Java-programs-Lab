public class LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 45, c = 27;

        int largest = (a >= b && a >= c) ? a : 
                      (b >= a && b >= c) ? b : c;

        System.out.println("Largest number : " + largest);
    }
}