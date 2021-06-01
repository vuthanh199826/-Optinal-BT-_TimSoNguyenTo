public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization("lazy");
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization("optimized");
        Thread threadOptimized = new Thread(optimizedPrimeFactorization);
        Thread threadLazy = new Thread(lazyPrimeFactorization);
        threadLazy.start();
        threadOptimized.start();
    }
}
