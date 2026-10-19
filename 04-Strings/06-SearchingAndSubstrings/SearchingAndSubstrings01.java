public class SearchingAndSubstrings01{
    public static void main(String[] args) {
        // CONCEPT 01 - indexOf()
        // find the index(position) where a character or substring first appears
        String text0 = "Banana";
        System.out.println(text0.indexOf('a')); // 1
        System.out.println(text0.indexOf("na")); // 2
        System.out.println(text0.indexOf('z'));  // -1

        // Concept 02 - lastIndexOf()
        // find the last occurance of a character or substring
        String text1 = "banana";
        System.out.println(text1.lastIndexOf('a'));  // 5
        System.out.println(text1.lastIndexOf("na")); // 4

        // Concept 03 - contains()
        // Check whether a string contains particular text.(case-senstive)
         String name = "Amarnath";
         System.out.println(name.contains("Amar")); // true
         System.out.println(name.contains("xyz"));  // false

         // Concept 04 - substring()
         // extract part of a string.
         // substring(start) - extract from 'start' through the end.
         // substring(start,end) - extracts from 'start' up to,not including , 'end'.
         String text3 = "Programming";
         System.out.println(text3.substring(3));   // gramming
         System.out.println(text3.substring(0,4)); // prog

         // Concept 05 - startsWith() and endsWith()
         String file = "notes.txt";
         System.out.println(file.startsWith("notes")); // true
         System.out.println(file.endsWith(".txt"));   // true
         System.out.println(file.endsWith(".pdf"));   // false
      


    }
}