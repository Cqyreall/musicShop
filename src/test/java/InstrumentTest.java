import Behaviours.InstrumentType;
import Classes.Guitar;
import Classes.Instruments;
import Classes.Trumpet;
import Items.DrumSticks;
import Items.MusicSheet;
import Shop.ShopClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {


    Instruments guitar;
    MusicSheet musicSheet;
    ShopClass instrumentality;
    DrumSticks drumSticks;


    @Before
    public void before(){
        guitar = new Guitar("White", "Wood", InstrumentType.STRING, 125, 130, 6);
        musicSheet = new MusicSheet("Music Sheet", 35, 45);
        drumSticks = new DrumSticks("Drum Sticks", 25, 30);
        instrumentality = new ShopClass();
    }

    @Test
    public void guitarTypeHasClass(){
        InstrumentType type = guitar.getType();
        assertEquals("String Instrument", type.getName());
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar strummed", guitar.playInstrument());
    }

    @Test
    public void canAdd(){
        instrumentality.addToCollection(guitar);
        assertEquals(1, instrumentality.getCollections().size());
    }

    @Test
    public void canRemove(){
        instrumentality.addToCollection(guitar);
        instrumentality.addToCollection(musicSheet);
        instrumentality.removeFromCollection(guitar);
        assertEquals(1, instrumentality.getCollections().size());
    }

    @Test
    public void canGetProfit(){
        instrumentality.addToCollection(guitar);
        instrumentality.addToCollection(musicSheet);
        instrumentality.addToCollection(drumSticks);
        assertEquals(53, Math.round(instrumentality.profitMargin()), 0.000001);
    }

}
