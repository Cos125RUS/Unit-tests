package seminars.first;

import static org.assertj.core.api.Assertions.*;
import static seminars.first.Tests.assertConditionA;

public class Test {
    public static void main(String[] args) {
//        method1();
        assertConditionA();
    }

    public static void method1() {
        Assertions.assertThatThrownBy(() ->
                Calculator.squareRootExtraction(0))
                .isInstanceOf(ArithmeticException.class);
    }
}