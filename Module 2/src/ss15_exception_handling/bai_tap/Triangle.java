package ss15_exception_handling.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int canhA;
    private int canhB;
    private int canhC;

    public Triangle() {
    }

    public Triangle(int canhA, int canhB, int canhC) throws SizeTriangleException, SumsizeTriangleException {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
        if (canhA < 0 || canhB <0 || canhC < 0 ){
            throw new SizeTriangleException();
        }else if (canhA + canhB < canhC || canhA + canhC < canhB || canhB + canhC < canhA){
            throw new SumsizeTriangleException();
        }else {
            System.out.println("3 cạnh của tam giác là " + this);
        }
    }

    public int getCanhA() {
        return canhA;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public int getCanhC() {
        return canhC;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "canhA=" + canhA +
                ", canhB=" + canhB +
                ", canhC=" + canhC +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao 3 canh cua tam giac");
        int canhA = Integer.parseInt(scanner.nextLine());
        int canhB = Integer.parseInt(scanner.nextLine());
        int canhC = Integer.parseInt(scanner.nextLine());
        try {
            Triangle triangle = new Triangle(canhA,canhB,canhC);
        }
        catch (SizeTriangleException e){
            System.out.println(e.getMessage());
        }
        catch (SumsizeTriangleException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Kết thúc chương trình");
        }

    }
}
