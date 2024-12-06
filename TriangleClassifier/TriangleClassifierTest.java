import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {
    @Test
    void testTriangleClassifier() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.side(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier2() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.side(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier3() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "tam giác thường";
        String result = TriangleClassifier.side(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier4() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.side(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier5() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.side(a, b, c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "không phải là tam giác";
        String result = TriangleClassifier.side(a, b, c);
        assertEquals(expected, result);
    }
}