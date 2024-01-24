package Problem5;

import java.util.Objects;

public class Computer {
    String manufacturer;
    String processor;
    int ramSize;
    double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    double computePower(){
        return ramSize * processorSpeed;
    }
    @Override
    public String toString(){
        return  "Computer Manufacturer= " + manufacturer + "\n" +
                "Processor= " + processor + "\n" +
                "Ram Size= " + ramSize + "\n" +
                "Processor Speed= " + processorSpeed + "\n" +
                "Compute Power= " + computePower();
    }
    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, processor, ramSize, processorSpeed, computePower());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return processorSpeed == computer.processorSpeed && ramSize == computer.ramSize && Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(processor, computer.processor);
    }
}
