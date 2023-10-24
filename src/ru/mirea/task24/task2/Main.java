package ru.mirea.task24.task2;

public class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Chair chair1 = factory.createChair(ChairTypes.VIC);
        Chair chair2 = factory.createChair(ChairTypes.FUNCT);
        Chair chair3 = factory.createChair(ChairTypes.MAGIC);

        Client client = new Client(factory, "Nikita");
        client.sit(chair1);
        client.sit(chair2);
        client.sit(chair3);
        client.setChair(ChairTypes.VIC);
    }
}
