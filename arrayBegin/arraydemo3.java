package arrayBegin;

public class arraydemo3 {
    public static void main(String[] args) {
        // declare 2d POP.array
        double[][] rainfall;
        //creat 2d POP.array
        rainfall = new double[3][4];
        //3 means store rainfall values from 2007 t0 2009
        //2007
        rainfall[0][0] = 0.29;
        rainfall[0][1] = 0.28;
        rainfall[0][2] = 0.29;
        rainfall[0][3] = 0.28;
//        System.out.println(rainfall[0][0]);
//        System.out.println(rainfall[0][1]);
//        System.out.println(rainfall[0][2]);
//        System.out.println(rainfall[0][3]);
        //extract common thing
        for (int i = 0; i < 4; i++) {
            //System.out.println(rainfall[0][i]);
        }
        //2008
        rainfall[1][0] = 0.29;
        rainfall[1][1] = 0.28;
        rainfall[1][2] = 0.29;
        rainfall[1][3] = 0.28;
//        System.out.println(rainfall[1][0]);
//        System.out.println(rainfall[1][1]);
//        System.out.println(rainfall[1][2]);
//        System.out.println(rainfall[1][3]);
        //extract common thing
        for (int i = 0; i < 4; i++) {
           // System.out.println(rainfall[1][i]);
        }
        //2009
        rainfall[2][0] = 0.29;
        rainfall[2][1] = 0.28;
        rainfall[2][2] = 0.29;
        rainfall[2][3] = 0.28;
//        System.out.println(rainfall[2][0]);
//        System.out.println(rainfall[2][1]);
//        System.out.println(rainfall[2][2]);
//        System.out.println(rainfall[2][3]);
        //extract common thing
        for (int i = 0; i < 4; i++) {
            //System.out.println(rainfall[2][i]);
        }
        // total display /extract common thing
        //year2007=System.out.println(rainfall[0][i]);
        //year2008= System.out.println(rainfall[1][i]);
        //year2009= System.out.println(rainfall[2][i]);
        for (int x = 0; x < 3; x++) {//loop through year//row
            for (int i = 0; i < 4; i++) {//loop through month//column
               // System.out.println(rainfall[x][i]);
                //or
                System.out.println("Year " + (2007 + x) + ", month " + (i + 1) + ": " + rainfall[x][i]);
            }
        }
    }
}