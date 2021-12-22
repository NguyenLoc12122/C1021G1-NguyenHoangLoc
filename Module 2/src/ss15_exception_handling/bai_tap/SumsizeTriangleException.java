package ss15_exception_handling.bai_tap;

public class SumsizeTriangleException extends Exception{
    public SumsizeTriangleException() {
        super("Tổng của 2 cạnh không lớn hơn cạnh còn lại");
    }
}
