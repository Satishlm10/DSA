public class ReverseAString {

    // Manual method
    String original = "Hello World!";
    String reversed = reverseString(original);
    public String reverseString(String str){
       char[] charArray = str.toCharArray();
       // toCharArray convert String into array of characters

        int left = 0;
        int right = charArray.length - 1;

        while (left < right)
        {
            // Swap the characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
}
