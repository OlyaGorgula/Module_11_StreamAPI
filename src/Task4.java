import java.math.BigInteger;
import java.util.stream.Stream;

public class Task4 implements LinearCongruentGenerator {

    @Override
    public Stream<Long> generatorNumber(Long a, int c, Long m) {
        //x[n + 1] = 1 (a x[n] + c) % m
        return Stream.iterate(0L, n -> 1 * (a * n + c) % m)
                .limit(10);
    }

    public static void main(String[] args) {
//        a = 25214903917
//        c = 11
//        m = 2^48 (2в степені48`)

        Long a = 25214903917L;
        int c = 11;
        BigInteger pow2 = new BigInteger(String.valueOf(2));
        Long m = pow2.pow(48).longValue();

        Task4 task4 = new Task4();
        task4.generatorNumber(a, c, m).forEachOrdered(System.out::println);
    }
}
