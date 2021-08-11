import java.util.Random;
public class App{
        public static int x;
        public static int y;
        public static int bx = 200;
        public static int by = 80;
        public static int pd;
        public  static void main(String[] args) throws Exception {
                System.out.println("What do you do.");


                Random rnd = new Random();
                int terra[][] = new int[by][bx];
                iMadeBox(terra);

                x=30;
                y=30;

                for(int i=0; i < 200000; i++){
                        lolCats(terra, rnd);
                }
                eventIt(terra, rnd);
                colorIt(terra);
        }

        private static void iMadeBox(int[][] terra){
                for(int i=0; i<by; i++){
                        for(int j=0; j<bx; j++){
                                terra[i][j] = 0;
                        }
                }
        }
        public static void lolCats(int [][] terra, Random rnd){
                int compus =0;
                int i=0;
                if (pd ==0){//東
                        while(i==0){
                                compus = rnd.nextInt(4);
                                if(compus==0){
                                        i=0;
                                }else{
                                        i=1;
                                }
                        }
                }else if(pd == 1){//西
                        while(i==0){
                                compus = rnd.nextInt(4);
                                if(compus==1){
                                        i=0;
                                }else{
                                        i=1;
                                }
                        }
                }else if(pd == 2){//南
                        while(i==0){
                                compus = rnd.nextInt(4);
                                if(compus==2){
                                        i=0;
                                }else{
                                        i=1;
                                }
                        }
                }else if(pd == 3){//北
                        while(i==0){
                                compus = rnd.nextInt(4);
                                if(compus==3){
                                        i=0;
                                }else{
                                        i=1;
                                }
                        }
                }
                int lolX = x;
                int lolY = y;

                switch(compus){
                        case 0://東
                        pd=0;
                        lolX++;
                        break;
                        case 1://南
                        lolY--;
                        pd=1;
                        break;
                        case 2://西
                        lolX--;
                        pd=2;
                        break;
                        case 3://北
                        lolY++;
                        pd=3;
                        break;
                }
                if(lolX<0){
                        lolX++;
                }else if(lolY<0){
                        lolY++;
                }else if(lolX>=bx){
                        lolX--;
                }else if(lolY>=by){
                        lolY--;
                }
                x = lolX;
                y = lolY;
                terra [y][x] ++;
        }
        private static void eventIt(int[][] terra, Random rnd){
                for(int i=0; i<by; i++){
                        for(int j=0; j<bx; j++){
                                int r = rnd.nextInt(1000);
                                if(4<=terra[i][j] && terra[i][j]<=15){
                                        if(10<=r && r<20){
                                        terra[i][j]=-20;
                                        }
                                }
                                if(4<=terra[i][j] && terra[i][j]<=15){
                                        if(30<=r && r<35){
                                        terra[i][j]=-30;
                                        }
                                }
                                if(31<=terra[i][j]){
                                        if(0<=r && r<10){
                                        terra[i][j]=-10;
                                        }
                                }
                        }
                }
        }
        private static void colorIt(int[][] terra){
                System.out.print("＿");
                for(int t=0; t<bx; t++){
                        System.out.print("＿");
                        }
                System.out.println("");
                for(int i=0; i<by; i++){
                        System.out.print("|");
                        for(int j=0; j<bx; j++){
                                if (terra[i][j]==-10){
                                        System.out.print("\u001b[38;5;088m"+"■"+"\u001b[0m");
                                }else if(terra[i][j]==-30){
                                        System.out.print("\u001b[38;5;014m"+"■"+"\u001b[0m");
                                }else if(terra[i][j]==-20){
                                        System.out.print("\u001b[38;5;165m"+"■"+"\u001b[0m");
                                }else if(terra[i][j]==0){
                                        System.out.print("\u001b[38;5;021m"+"■"+"\u001b[0m");
                                }else if(1<=terra[i][j] && terra[i][j]<=3){
                                        System.out.print("\u001b[38;5;228m"+"■"+"\u001b[0m");
                                }else if(4<=terra[i][j] && terra[i][j]<=15){
                                        System.out.print("\u001b[38;5;040m"+"■"+"\u001b[0m");
                                }else if(16<=terra[i][j] && terra[i][j]<=18){
                                        System.out.print("\u001b[38;5;022m"+"■"+"\u001b[0m");
                                }else if(19<=terra[i][j] && terra[i][j]<=30){
                                        System.out.print("\u001b[38;5;245m"+"■"+"\u001b[0m");
                                }else {
                                        System.out.print("\u001b[38;5;252m"+"■"+"\u001b[0m");
                                }
                        }
                        System.out.print("|");
                        System.out.println("");
                }
                System.out.print("￣");
                for(int t=0; t<bx; t++){
                        System.out.print("￣");
                }
                System.out.println("");

        }
}
