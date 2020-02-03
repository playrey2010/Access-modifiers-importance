public class Main {
    public static void main(String[] args) {
        // Read comments in SampleClass.java
        SampleClass sampleObj = new SampleClass();

        System.out.println("I can access SampleClass variable x with 'sampleObj.x': " + sampleObj.x);
        sampleObj.x = 3;
        System.out.println("I can change the value of SampleClass variable x directly 'sampleObj.x = 3': " + sampleObj.x);


        System.out.println("I can access SampleClass variable y with 'sampleObj.y': " + sampleObj.y);
        sampleObj.y = 6;
        System.out.println("I can change the value of SampleClass variable x directly 'sampleObj.y = 6': " + sampleObj.y);

        // To access z, use getters and setters.
        System.out.println("I can ONLY access z through 'sampleObj.getZ(): " + sampleObj.getZ());
        sampleObj.setZ(10);
        System.out.println("Finally, I can change the value of z ONLY through sampleObj.setZ(10): " + sampleObj.getZ());




    }
}
