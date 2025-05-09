class HexDecimalAddition {
    public static void main(String args[]) {
        String a = "9B3";
        String b = "168";
        String hexa = "0123456789ABCDEF"; 
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder(); 

        while (i >= 0 || j >= 0 || carry > 0) {
            int d1 = (i >= 0) ? Character.digit(a.charAt(i), 16) : 0;
            int d2 = (j >= 0) ? Character.digit(b.charAt(j), 16) : 0;

            int sum = d1 + d2 + carry;
            carry = sum / 16;

            result.insert(0, hexa.charAt(sum % 16));

            i--;
            j--;
        }

        System.out.println("Hexadecimal Sum: " + result.toString()); 
    }
}
