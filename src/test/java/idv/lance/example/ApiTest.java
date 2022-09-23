package idv.lance.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiTest {
    Api api = new Api();

    @BeforeEach
    void init() {

    }

    @Test
    @DisplayName("test case for assert true ")
    void first_test_assert_true() {
        assertTrue(api.validate());
    }

    @Tag("exception")
    @Test
    @DisplayName("test case for test throw descendant exception")
    void test_descendant_exception_being_throw() {
        assertThrows(
                RuntimeException.class,
                () -> api.transfer());
    }

    @Tag("exception")
    @Test
    @DisplayName("test case for test throw exact exception")
    void test_exception_exactly() {
        assertThrows(
                Exception.class,
                () -> api.commit());
    }
}