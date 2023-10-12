package seminars.first;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
//        if (4 != Calculator.calculation(2,2,'+')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (2 != Calculator.calculation(4,2,'-')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (4 != Calculator.calculation(2,2,'*')) {
//            throw new AssertionError("Ошибка в методе");
//        }
//        if (4 != Calculator.calculation(8,2,'/')) {
//            throw new AssertionError("Ошибка в методе");
//        }

//        assert 4 == Calculator.calculation(2,2,'+');
//        assert 2 == Calculator.calculation(4,2,'-');
//        assert 612 == Calculator.calculation(3,2,'*');
//        assert 4 == Calculator.calculation(8,2,'/');

        assertThat(Calculator.calculation(2,2,'+')).isEqualTo(4);
        assertThat(Calculator.calculation(4,2,'-')).isEqualTo(2);
        assertThat(Calculator.calculation(3,2,'*')).isEqualTo(6);
        assertThat(Calculator.calculation(8,2,'/')).isEqualTo(4);

        Assertions.assertThatThrownBy(() -> Calculator.calculation(8,4,'_'))
                .isInstanceOf(IllegalStateException.class);
        Assertions.assertThatThrownBy(() -> Calculator.calculation(8,0,'/'))
                .isInstanceOf(ArithmeticException.class);

//        try {
//            Calculator.calculation(8,4,'_');
//        } catch (IllegalStateException e) {
//            if (!e.getMessage().equals("Неизвестная операция: _")){
//                throw new AssertionError("Ошибка в методе");
//            }
//        }
    }
}
