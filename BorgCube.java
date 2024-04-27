public class BorgCube {
    //Private field
    private int edgeLength;

    //1. Constructor
    public BorgCube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    //2. Calculate the volume of the cube
    public int volume() {
        //Formula edgeLength * edgeLength * edgeLength
        return edgeLength * edgeLength * edgeLength;
    }

    //3. Estimate number of BORG aboard based on the volume of the cube
    public int lifeForms() {
        // Find average volume of a BORG
        double averageBorgVolume = 0.1799;
        //Estimate the number of BORG
        return (int) Math.round(volume() / averageBorgVolume);
    }

    //4. Represent the cube as a string
    @Override
    public String toString() {
        int volume = volume();
        int borgLifeForms = lifeForms();
        return "The length of the edge is " + edgeLength + ", the volume is " + volume +
                ", and there are " + borgLifeForms + " BORG aboard.";
    }

    //Testing
    public static void main(String[] args) {
        BorgCube cube = new BorgCube(5); // Create a BorgCube object with edge length 5
        System.out.println(cube.toString()); // Print the string representation of the cube
    }
}
