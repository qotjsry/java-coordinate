package coordinate;

import java.util.Objects;

public class Point {

    public static final int LOWER_LIMIT = 1;
    public static final int MAX_LIMIT = 24;
    final private int x;
    final private int y;

    public Point(int x, int y) {
        if (x < LOWER_LIMIT || x > MAX_LIMIT || y < LOWER_LIMIT || y > MAX_LIMIT) {
            throw new IllegalArgumentException("좌표는 0과 24 사이의 값이어야 합니다.");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double calculate(Point point) {
        return Math.sqrt(squareDifference(x, point.x) + squareDifference(y, point.y));
    }

    public double squareDifference(int x, int y) {
        return Math.pow(x - y, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
