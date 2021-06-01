public class LazyPrimeFactorization implements Runnable{
    private String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int count = 0;
        int x = 2;
        while (count<10){
            boolean isPrime = true;
            for (int i = 2; i < x ; i++) {
                if(x%i==0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(name+" : " + x);
                count++;
            }
            x++;

        }
    }
}
