package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number/100;
        int dozens = (number-hundreds*100)/10;
        int units = number - hundreds*100 - dozens*10;
        System.out.println("" + units + dozens + hundreds);
    }
}
