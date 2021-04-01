package Exercise4;

import java.util.List;

public class LowestAveragePriceAnalyser implements AvocadoAnalyser{


    @Override
    public void analyse() {
        AvocadoEntryReader avocadoEntryReader = new AvocadoEntryReader();
        avocadoEntryReader.read();
        double lowestPrice = AvocadoEntry.getAveragePrice();

        System.out.println("Lowest average price is: " );
        System.out.println("Region of most sold organic is: ");

    }
}
