public class Vector {

    public int greater (int[] array){
        int greater=Integer.MIN_VALUE;
        for (int n: array) {
            if (n>greater)
                greater=n;
        }
        return greater;
    }

    public int minor(int[] array){
        int minor=Integer.MAX_VALUE;
        for (int n: array) {
            if (n<minor)
                minor=n;
        }
        return minor;
    }
    
    public int sumatory(int[] array){
        int sum=0;
        for (int n: array
             ) {
            sum+=n;
        }
        return sum;
    }

    public boolean isFirstElementEven(int[] array){
        if (array.length>0 && array[0] % 2 == 0)
            return true;
        else
            return false;
    }
}
