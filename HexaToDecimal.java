public class HexaToDecimal {

    public static int pow(int x, int y){

        int prod = 1;
        int p = 0;

        while(p < y){
            prod = prod * x;
            p = p+1;
        }

        return prod;
    }

    public static void main(String[] args) {

        String hexadecimal = "DADFA";
        hexadecimal = hexadecimal.toUpperCase();
        int quant = hexadecimal.length();

        int result = 0;
        int j = 0;
        for(int i = quant - 1; i > -1 ; i--) {

           // System.out.println(hexadecimal.charAt(i));

            switch (hexadecimal.charAt(i)) {
                case '0':
                    result =  0 * pow(16, j) + result;
                    j++;
                    break;
                case '1':
                    result =   pow(16, j) + result;
                    j++;
                    break;
                case '2':
                    result = 2 * pow(16, j) + result;
                    j++;
                    break;
                case '3':
                    result =  3 * pow(16, j) + result;
                    j++;
                    break;
                case '4':
                    result =  4 * pow(16, j) + result;
                    j++;
                    break;
                case '5':
                    result =  5 * pow(16, j) + result;
                    j++;
                    break;
                case '6':
                    result =  6 * pow(16, j) + result;
                    j++;
                    break;
                case '7':
                    result =  7 * pow(16, j) + result;
                    j++;
                    break;
                case '8':
                    result =  8 * pow(16, j) + result;
                    j++;
                    break;
                case '9':
                    result =  9 * pow(16, j) + result;
                    j++;
                    break;
                case 'A':
                    result =  10 * pow(16, j) + result;
                    j++;
                    break;
                case 'B':
                    result =  11 * pow(16, j) + result;
                    j++;
                    break;
                case 'C':
                    result =  12 * pow(16, j) + result;
                    j++;
                    break;
                case 'D':
                    result =  13 * pow(16, j) + result;
                    j++;
                    break;
                case 'E':
                    result =  14 * pow(16, j) + result;
                    j++;
                    break;
                case 'F':
                    result =  15 * pow(16, j) + result;
                    j++;
                    break;

                default:
                    break;

            }

        }

        System.out.println("Resutado: " + result);

    }

}
