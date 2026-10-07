public class Program {
    public static void main(String[] args) {
        int[] y = new int[]{2, 4, 6, 8, 10, 12, 14, 16};
        float[] x = new float[14];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random() * 18.0 - 12.0);
        }

        float[][] r = new float[8][14];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                r[i][j] = computeElement(y[i], x[j]);
            }
        }
        printMatrix(r);
    }

    static float computeElement(int yVal, float xVal){

        if (yVal==16){
                  return  (float) (Math.asin(Math.exp(-Math.abs(xVal))));


              } else if (yVal==2 || yVal==6 || yVal==10 || yVal==12){
                  return (float) (Math.pow(((Math.atan(1/Math.exp(Math.abs(xVal))))/2),(Math.pow(0.25/(Math.tan(xVal+4)),Math.sin(xVal)))));


              } else {
                  return (float) Math.sin(Math.pow(Math.log(Math.abs(xVal)), 3*Math.tan(Math.log(Math.abs(xVal)))));

              }

          }

        static void printMatrix(float[][]matrix){
            for (int i =0; i < matrix.length; i++){
                for (int j =0; j<matrix[i].length; j++){
                    System.out.printf("%10.4f ", matrix[i][j]);
                }
                System.out.println();


      }





    }

}


