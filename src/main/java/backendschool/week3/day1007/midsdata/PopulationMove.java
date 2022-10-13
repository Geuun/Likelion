package main.java.backendschool.week3.day1007.midsdata;

public class PopulationMove {

    private int fromSido;
    private int toSido;

    // constructor 추가 fromSido, toSido를 받아서 멤버 변수에 넣는 기능

    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }

    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

}
