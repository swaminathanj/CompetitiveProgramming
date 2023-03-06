
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Computer {
    
    private Map<String, String> computerParts = new HashMap<>();
    
    public Computer(Map<String, String> computerParts) {
        this.computerParts = computerParts;
    }
    
    public Map<String, String> getComputerParts() {
        return computerParts;
    }
}

abstract class ComputerBuilder {

    protected Map<String, String> computerParts = new HashMap<>();
    protected List<String> motherboardSetupStatus = new ArrayList<>();
    
    public final Computer buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
        return getComputer();
    }
    
    public abstract void addMotherboard();

    public abstract void setupMotherboard();
    
    public abstract void addProcessor();

    public List<String> getMotherboardSetupStatus() {
        return motherboardSetupStatus;
    }
    
    public Map<String, String> getComputerParts() {
        return computerParts;
    }
    
    private Computer getComputer() {
        return new Computer(computerParts);
    }
}

class HighEndComputer extends Computer {
    
    public HighEndComputer(Map<String, String> computerParts) {
        super(computerParts);
    }
}

class HighEndComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        computerParts.put("Motherboard", "High-end Motherboard");
    }
    
    @Override
    public void setupMotherboard() {
        motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
        motherboardSetupStatus.add("Pluging in the power supply connectors.");
        motherboardSetupStatus.forEach(step -> System.out.println(step));
    }
    
    @Override
    public void addProcessor() {
        computerParts.put("Processor", "High-end Processor");
    }
}

class StandardComputer extends Computer {
    
    public StandardComputer(Map<String, String> computerParts) {
        super(computerParts);
    }
}

class StandardComputerBuilder extends ComputerBuilder {

   @Override
   public void addMotherboard() {
       computerParts.put("Motherboard", "Standard Motherboard");
   }
   
   @Override
   public void setupMotherboard() {
       motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
       motherboardSetupStatus.add("Pluging in the power supply connectors.");
       motherboardSetupStatus.forEach(step -> System.out.println(step));
   }
   
   @Override
   public void addProcessor() {
       computerParts.put("Processor", "Standard Processor");
   }
}


public class ComputerConfiguration {
    
    public static void main(String[] args) {
        ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
        Computer standardComputer = standardComputerBuilder.buildComputer();
        standardComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
        
        ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
        Computer highEndComputer = highEndComputerBuilder.buildComputer();
        highEndComputer.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }
}