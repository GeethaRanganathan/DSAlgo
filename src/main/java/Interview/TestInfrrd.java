package Interview;

public class TestInfrrd {
    // Ge@t#a -  at@e#G 97,122, 65, 90
    public static void main(String[] args) {
        String name = "r$v@%rsi*";
        StringBuilder newStr = new StringBuilder();
        int j=name.length()-1;
        char[] newString = new char[name.length()];
        int i=0;
        while(i<=j){
            if (((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') ||
                    (name.charAt(i)  >= 'a' && name.charAt(i)  <= 'z')) &&
                    ((name.charAt(j)  >= 'A' && name.charAt(j)
                    <= 'Z') ||
                    (name.charAt(j) >= 'a' && name.charAt(j) <= 'z'))){
             newString[i] = name.charAt(j);
             newString[j] = name.charAt(i);
             i++;
             j--;
        }else if ((name.charAt(i) >= 'A' && name.charAt(i)  <='Z') ||
                        (name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
                    newString[j]=name.charAt(j);
                    j--;
                }else if ((name.charAt(j) >= 'A' && name.charAt(j)  <='Z') ||
                    (name.charAt(j) >= 'a' && name.charAt(j) <= 'z')) {
                    newString[i] = name.charAt(i);
                    i++;
                } else{
                    newString[i] = name.charAt(j);
                    newString[j] = name.charAt(i);
                    i++;
                    j--;
                }
        }
        for (int k=0;k<name.length();k++){
            newStr.append(newString[k]);
        }
        System.out.println("Reversed string : " + newStr.toString());
    }
}
