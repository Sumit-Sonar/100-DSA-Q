public class Countvowelsinstr {
    char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

    int countvowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            for (char vowel : vowels) {
                if (vowel == ch){
                    count++;
                    break;
            }

        }}
        return count;

    }

    public static void main(String[] args) {
        String str = "abc deu";
        Countvowelsinstr cnt = new Countvowelsinstr();
        int result = cnt.countvowels(str);
        System.out.println("vowels are : " + result);
    }
}
