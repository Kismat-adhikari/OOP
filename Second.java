public class Second {
    private double principal, rate, time;

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }

    public static void main(String[] args) {
        Second si = new Second();
        si.setPrincipal(1000);
        si.setRate(5);
        si.setTime(2);
        System.out.println("Principal: " + si.getPrincipal());
        System.out.println("Rate: " + si.getRate());
        System.out.println("Time: " + si.getTime());
    }
}