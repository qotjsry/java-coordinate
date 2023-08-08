package coordinate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangleTest {
        List<Point> points;
        Rectangle rectangle;
    @BeforeEach
    void setup() {
        points = Arrays.asList(new Point(1,1), new Point(1,4), new Point(3,1), new Point(3,4));
        rectangle = new Rectangle(points);
    }
    @Test
    public void rectangle_생성() throws Exception {
        assertThat(rectangle).isEqualTo(new Rectangle(points));
    }
    @Test
    public void rectangle_생성_오류() throws Exception {
        List<Point> IllegalPoint = Arrays.asList(new Point(1,1), new Point(2,2), new Point(3,3), new Point(4,4));
        List<Point> IllegalPoint2 = Arrays.asList(new Point(1,1), new Point(2,2), new Point(3,3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(IllegalPoint);
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(IllegalPoint2);
        });
    }
}
