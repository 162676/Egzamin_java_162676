package pl.imiajd.Rutkowski;

public class PairUtil {
    public static <T> Pair<T> swap(Pair<T> duo) {
        Pair<T> last_pair = new Pair<>(duo.getFirst(), duo.getSecond());
        duo.swap();
        return last_pair;
    }
}
