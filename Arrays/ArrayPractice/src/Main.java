public class Main {
        public static void main(String[] args) {
            ArrayBasics arrayBasics = new ArrayBasics();
            arrayBasics.gettingStartedIntoArray();

            System.out.println();

            // Manual method
            String original = "Hello World";
            ReverseAString reverseAString = new ReverseAString();
            String reversed = reverseAString.reverseString(original);
            System.out.println(reversed);

            // using StringBuilder
            String reverse = new StringBuilder(original).reverse().toString();
            System.out.println(reverse);

            // merge sorted Array
            MergeSortedArray mergeSortedArray = new MergeSortedArray();
            mergeSortedArray.sortedArray();
        }
}