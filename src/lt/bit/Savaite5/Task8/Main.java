package lt.bit.Savaite5.Task8;

public class Main {
//    Implement the
//    Validator interface, which will include a boolean validate(Parcel input) method in its
//    declaration. Create a Parcel class with the parameters:
//    int xLength
//    int yLength
//    int zLength
//    float weight
//    boolean isExpress
//    The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300, whether each size is
//    not less than 30, whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true. In
//case of errors, it should inform the user about them.
    public static void main(String[] args) {
    Parcel object = new Parcel(10,20,30, 123, false);
    object.validate(object);
    }
}

