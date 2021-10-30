package part1;

public class Main {
    public static void main(String[] argc){
        SamiEtRobinJob thread1 = new SamiEtRobinJob();
        Thread T1 = new Thread(thread1);
        Thread T2 = new Thread(thread1);
        T1.setName("SAMI");
        T2.setName("Robin");
        T1.start();
        T2.start();
    }
}
