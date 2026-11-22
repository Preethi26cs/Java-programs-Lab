
abstract class EnergySource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergySource(int id, String name, double energy) {
        sourceId = id;
        sourceName = name;
        energyGenerated = energy;
    }

    abstract double calculateEfficiency();

    public void display() {
        System.out.println("Source Id : " + sourceId);
        System.out.println("Source Name : " + sourceName);
        System.out.println("Energy Generated : " + energyGenerated);
        System.out.println("Calculate Efficiency : " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {
    SolarEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}
class WindEnergy extends EnergySource {
    WindEnergy(int id, String name, double energy) {
        super(id, name, energy);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class EnergyDemo {
    public static void main(String[] args) {
        EnergySource source = new SolarEnergy(101, "Solar Panel", 4000);
        System.out.println("--- Solar Energy Details ---");
        source.display();

        source = new WindEnergy(102, "Wind Turbine", 6000);
        System.out.println("\n--- Wind Energy Details ---");
        source.display();
    }
}

