//package Java-programs.LinearSearch;

public class SearchinStrings {
    public static void main(String args[]) {
        String str = "I LOVE YOU KARAN";
        char target = 'U';
        // System.out.println(search(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
