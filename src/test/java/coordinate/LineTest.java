package coordinate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LineTest {
    Line line;
    @BeforeEach
    public void setUp() throws Exception {
        List<Point> Points = Arrays.asList(new Point(1,1), new Point(2,2));
        line = new Line(Points);
    }
    @Test
    public void hasPointTest() throws Exception {
        assertThat(line.hasPoint(new Point(1,1))).isTrue();
        assertThat(line.hasPoint(new Point(3,2))).isFalse();
    }
    @Test
    public void line_calculate() throws Exception {
        assertThat(line.area()).isEqualTo(1.414,offset(0.0009));
    }

}
