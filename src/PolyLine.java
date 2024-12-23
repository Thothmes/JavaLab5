import java.util.*;
import java.util.stream.Collectors;

class Polyline {
    private List<Point> points;

    public Polyline(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Линия " + points;
    }
}