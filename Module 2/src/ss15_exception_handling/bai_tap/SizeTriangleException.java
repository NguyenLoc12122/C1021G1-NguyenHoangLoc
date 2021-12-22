package ss15_exception_handling.bai_tap;

public class SizeTriangleException extends Exception{
    public SizeTriangleException() {
        super("Cạnh nhập vào phải lớn hơn 0");
    }
}
