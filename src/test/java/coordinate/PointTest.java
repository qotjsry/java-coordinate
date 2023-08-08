package coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointTest {

    @Test
    public void point_set_test() throws Exception {
        //given
        Point point = new Point(1,2);
        //then
        assertThat(new Point(1,2)).isEqualTo(point);
    }

    @Test
    public void point_over_error_test() throws Exception {
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(0,1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(1,0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(25,1);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Point(1,25);
        });
        assertThatThrownBy(() -> {
            new Point(0,25);
        }).isInstanceOf(IllegalArgumentException.class);
    }

}
