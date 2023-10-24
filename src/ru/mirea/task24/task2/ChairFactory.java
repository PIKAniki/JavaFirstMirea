package ru.mirea.task24.task2;

public class ChairFactory implements AbstractChairFactory{
    public Chair createChair(ChairTypes type) {
        Chair chair = null;
        switch (type) {
            case VIC:
                chair = createVictorianChair();
                break;
            case FUNCT:
                chair = createFunctionalChair();
                break;
            case MAGIC:
                chair = createMagicChair();
                break;
        }
        return chair;
    }
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
