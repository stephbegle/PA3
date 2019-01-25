
public class MostChar {
    /*
    findMostChar // TODO write description of function here
    @params S string to be analyzed
    @returns char that occurs most frequently
     */
    public static char findMostChar(String s) {
        int size = 256;
        int count[] = new int[size];
        int len = s.length();

        for (int i=0; i<len; i++)
            count[s.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++) {
            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args){
        char c = findMostChar("abcaadddb");
        System.out.println(c);
    }
}
