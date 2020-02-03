// This is a very simple program to demonstrate how access modifiers work within classes;
// We usually want to set class variables to private to prevent access to that variable;
// If we do not set it to private, variables may be accessed ANYWHERE, so KEEPING TRACK would be difficult.

public class SampleClass {
    int x  = 0; // this class does not provide an access modifier, is public implied?
    public int y = 0; // public access
    private int z = 0; // private access, it is still accessible but only within this class.
    /*
    If you use public static void main[...] inside the class here, you do not need
    getters and setters to change the values of member variables, not even the ones with private access.
    However, if outside of this class, any main method calling this class WILL NEED public getters and setters.
     */

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
