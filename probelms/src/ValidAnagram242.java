public class ValidAnagram242 {


    public boolean isAnagram ( String s , String r) {

        if (s.length() != r.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[r.charAt(i) - 'a']--;
        }
        for (int value = 0; value < count.length; value++) {
            if (count[value] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ValidAnagram242 checker = new ValidAnagram242();
        System.out.println(checker.isAnagram("listen" ,"silent"));
    }
}
//
//
//The idea of the probelm is we are checking is the two strings has the same characters regardless of the order
//
//
//so we first we checked of the two string has the same size otherwise return false
//
//
//if so then go to the next step ;
//
//we created an array of the same size of the english alphapet which is 26
//
//then we loop over the two strings at the same time ; as they are the say lenght
//
//        then we put inside the array of the alphapet the ascki code of each character in the array
//
//
//        for the s we add the index inside the array
//
//        for r we mince the index inside the array
//
//
//        then at the end of the day if we found that the array of alphapet all is zero so we have added we have subtracted too
//
//        Meaning that this letter happens two times




