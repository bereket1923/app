package arrayBegin;

public class ArrayDemo {
    public static void main(String[] args) {

        // Declare POP.array for rainfall and object creation
        double[] rainfall = new double[12];

        // Store rainfall values from January to December
       rainfall[0] = 0.29;
       rainfall[1] = -0.70;
       rainfall[2] = 0.36;
       rainfall[3] = -0.68;
        rainfall[4] = -1.61;
        rainfall[5] = -0.68;
        rainfall[6] = 3.19;
        rainfall[7] = -1.52;
        rainfall[8] = 2.18;
        rainfall[9] = 1.94;
        rainfall[10] = -1.26;
        rainfall[11] = 1.94;
//        System.out.println(rainfall[0]);
//        System.out.println(rainfall[1]);
//        System.out.println(rainfall[2]);
//        //
//        System.out.println(rainfall[11]);
        //extract common thing
        for(int i = 0; i < 12; i++) {
            System.out.println(rainfall[i]);
        }
        //how to find the size of Array
        int sizeOfRainfall = rainfall.length;
        for(int i = 0; i < sizeOfRainfall; i++) {
            System.out.println(" month of first:" +(i+1)+ "is" +rainfall[i]);//for first month

        }
        //fina average value for the year,2007
        //find sum first
        double sum = 0.0;
//        sum = sum +rainfall[0];
//        sum = sum +rainfall[1];
//        sum = sum +rainfall[2];
        //
        sum = sum +rainfall[11];

        //extract common thing for logic(for)
        //sum=sum+rainfall[i] as indicated above, i start at 0 and ends 11 that means
        for(int i = 0; i < 12; i++) {
             sum = sum + rainfall[i];
            System.out.println("the sum of rainfall is:" +sum);
        }
        //find average value
        double average = sum / 12;
        System.out.println("the average rainfall for 2007 is:" +average);
        // Declare and initialize POP.array for month names
       String[] month = new String[12];
        month[0] = "Jan";
        month[1] = "Feb";
        month[2] = "Mar";
        month[3] = "Apr";
        month[4] = "May";
        month[5] = "Jun";
        month[6] = "Jul";
        month[7] = "Aug";
        month[8] = "Sep";
        month[9] = "Oct";
        month[10] = "Nov";
        month[11] = "Dec";
//        System.out.println(month[0]);
//        System.out.println(month[1]);
//        System.out.println(month[2]);
        //
        //System.out.println(month[11]);
        //
        //extract common term for logic
        //month[i]=x as i starts from zero and length up to 12
        for(int i = 0; i < 12; i++) {
            System.out.println("The rainfall for first month:" + month[i]+ " is " + rainfall[i]);
        }
        }
    }