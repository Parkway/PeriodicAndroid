package parkway.periodicandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class atomgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atomgame);
    }
    public void main(String[] args) {
        int guessCount = 3; //Number of guesses
        String[] elementList = {"","Hydrogen","Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "" +
                "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon", "Phosphorous", "Sulfur", "" +
                "Chlorine", "Argon", "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "" +
                "Iron", "Cobalt", "Nickel", "Copper", "Zinc", "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "" +
                "Krypton", "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "" +
                "Rhodium", "Palladium", "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon", "" +
                "Caesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "" +
                "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium", "Hafnium", "" +
                "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "" +
                "Bismuth", "Polonium", "Astatine", "Radon", "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "" +
                "Uranium", "Neptunium","Plutonium","Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium", "" +
                "Mendelevium", "Nobelium", "Lawrencium", "Rutherfordium", "Dubnium", "Seaborgium", "Bohrium", "Hassium", "" +
                "Meitnerium", "Darmstadtium", "Roentgenium", "Copernicium", "Nihonium", "Flerovium", "Moscovium", "" +
                "Livermorium", "Tennessine", "Oganesson"}; //Ordered list of allllll the elements to allow for selections.

        int elementLength = elementList.length; //Determines length of elementList{}
        int elementNumber = (int) (Math.random() * elementLength); //Pulls random number from elementLength()
        String elementName = elementList[elementNumber]; //Converts number back to string for initial input.

        TextView atomgame = (TextView) findViewById(R.id.textView2);
        atomgame.setText(elementName);


    }
}
