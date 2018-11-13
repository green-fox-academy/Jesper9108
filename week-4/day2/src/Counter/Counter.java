package Counter;

public class Counter {

    int ini = 0;
    int num = ini;


    public Counter() {

    }

    public Counter(int number) {
        this.ini = number;
        this.num = this.ini;
    }

    public void add(int number) {
        this.num = num + number;
    }

    public void add() {
        num++;
    }

    public void reset() {
        num = ini;
    }

    public int get(){
      return num;
    }


}
