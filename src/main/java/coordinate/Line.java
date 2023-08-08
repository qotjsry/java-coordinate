package coordinate;

import java.util.List;

public class Line {
    List<Point> points;
    public Line(List<Point> points) {
        this.points = points;
    }

    public double area() {
        return points.get(0).calculate(points.get(1));
    }

    public boolean hasPoint(Point point) {
        for(Point p : points){
            return p.equals(point);
        }
        return false;
    }

}
