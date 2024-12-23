import java.util.List;

public class Meowing {
    public void makeAllMeow(List<Meowable> meowables) {
        for (Meowable meowable : meowables) {
            meowable.meow();
        }
    }
}