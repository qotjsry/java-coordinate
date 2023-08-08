package coordinate;

import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;

public class Rectangle {

    List<Point> points;

    public Rectangle(List<Point> points) {
        if (checkRectangle(points))
            ;
        this.points = points;
    }

    private boolean checkRectangle(List<Point> points) {
        if (points.size() != 4) {
            throw new IllegalArgumentException("사각형은 4개의 점으로 이루어져야 합니다.");
        }
        Set<Integer> xValuesOfPoints = convertToUniqueXValues(points);
        Set<Integer> yValuesOfPoints = convertToUniqueYValues(points);
        if (xValuesOfPoints.size() != 2 | yValuesOfPoints.size() != 2) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
        return true;
    }

    private Set<Integer> convertToUniqueXValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getX);
    }
    private Set<Integer> convertToUniqueYValues(List<Point> points) {
        return convertToUniqueValues(points, Point::getY);
    }

    private Set<Integer> convertToUniqueValues(List<Point> points, Function<Point,Integer> func) {
        return points.stream()
            .map(func)
            .collect(toSet());
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(points, rectangle.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
