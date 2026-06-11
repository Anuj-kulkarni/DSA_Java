
public class test {

    public int[] beautifulArray(int n){
        if(n == 1){
            return new int[] {1};
        }

        int[] oddpart = beautifulArray((n+1) >> 1);

        int[] evenpart = beautifulArray(n >> 1);

        int[] result = new int[n];
        int index = 0;

        for(int value : oddpart){
            result[index++] = value * 2 -1;
        }
        for(int value : evenpart){
            result[index++] = value *2;
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
