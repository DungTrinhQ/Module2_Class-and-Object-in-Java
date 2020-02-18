public class Account {
    private double a, b, c;

    public Account() {
    }

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = this.b * this.b - 4 * this.a * this.c;
    }

    public String solveTheEquation() {
        String ketqua = null;

        // kiểm tra các hệ số
        if (this.a == 0) {
            if (this.b == 0) {
                ketqua = "Phương trình vô nghiệm!";
            } else {
                ketqua = "Phương trình có một nghiệm: " + "x = " + (-c / b);
            }
        }
        // tính delta
        double delta = this.b * this.b - 4 * this.a * this.c;
        double x1;
        double x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = ((-this.b + Math.sqrt(delta)) / (2 * this.a));
            x2 = ((-this.b - Math.sqrt(delta)) / (2 * this.a));
            ketqua = "Phương trình có 2 nghiệm là: " + "x1 = " + x1
                    + " và x2 = " + x2;
        } else if (delta == 0) {
            x1 = (-this.b / (2 * this.a));
            ketqua = "Phương trình có nghiệm kép: " + "x1 = x2 = " + x1;
        } else {
            ketqua = "Phương trình vô nghiệm!";
        }
        return ketqua;
    }
}
