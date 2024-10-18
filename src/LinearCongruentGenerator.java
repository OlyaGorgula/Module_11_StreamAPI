import java.util.stream.Stream;

@FunctionalInterface
public interface LinearCongruentGenerator {
    Stream<Long> generatorNumber(Long a, int c, Long m);
}
