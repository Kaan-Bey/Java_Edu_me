package day28_constructorCall;

public class C01_constructureCall {

        C01_constructureCall () {

            System.out.println("Parametresiz constructor calisti.");
        }

        C01_constructureCall (String str) {
            System.out.println(" String parametreli constructure calisti.");
        }

        C01_constructureCall (int a) {

            System.out.println(" int parametreli constructure calisti.");
        }



    public static void main(String[] args) {

     C01_constructureCall obj1 = new C01_constructureCall();

            }
        }


