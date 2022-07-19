    package E03Arrays;

    import java.util.Arrays;
    import java.util.Scanner;

    public class P08MagicNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int number = Integer.parseInt(scanner.nextLine());
            int currentNumber = 0;
            for (int i = 0; i < array.length; i++) {
                int currentElement = array[i];
                for (int j = i+1; j < array.length; j++) {
                    int elemement2= array[j];
                    if (number == currentElement + elemement2) {
                        System.out.printf("%d %d%n",currentElement, elemement2);

                    }
                }
            }
        }
    }
