package PATTERNS;

class SLITE{
    public static void main(String[] args) {
//        METHOD 1;
//        for(int i=0;i<3;i++){
//            for(int j=0;j<i;j++){
//                System.out.print(" ");
//            }
//            for (int j = i; j <3; j++) {
//                System.out.print("& ");
//
//            }
//            System.out.println();
//

//        }
        // METHOD 2;

        for(int i=3;i>0;i--){
            for(int j=3-i;j>0;j--){
                System.out.print(" ");
            }
            for (int j =i; j >0; j--) {
                System.out.print("& ");

            }
            System.out.println();

        }
    }
}
