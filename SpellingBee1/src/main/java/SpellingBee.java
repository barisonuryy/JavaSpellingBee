import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class SpellingBee {
    public static String[] uret(){

        String harf[]=new String[6];
        for(int i=0;i<6;i++){
            Scanner scanner=new Scanner(System.in);
            harf[i]=scanner.next();
        }
        //Buradan sonra merkez harf üretilmeli displayi çıkmalı
        Scanner scanner1=new Scanner(System.in);
        harf[6]=scanner1.next();
    return harf;
    }
    public void  karsilastir(String acAns[]){
        acData();
    }
    public  boolean isWord(String kelime[],String harf[]){
      boolean isW=true;
     while(true){
         if(kelime.length<3){
             //Kelimenin 3 harf ve daha küçük olamayacagını gösteren bir display lazım
             return false;
         }
         for(int i=0;i< kelime.length;i++){
             if(!kelime[i].equals(harf[i])){
                 //Kelimenin icinded türettiğimiz harflerin olmadığıyla ilgili bir display yazilmali
                 return false;
             }
             if(!kelime[i].equals(harf[6])){
                 //try catch out yazılsın
                 return false;
             }
             else
                 return true;

         }
      }
    }
    public String acData()  {
        //Buraya klavyeden basılan değerlerin display edildiği bir text yeri lazım
        Scanner a=new Scanner(System.in);
        String keyboardI;
        keyboardI=a.next();
        return keyboardI;
    }
    public void veriCek() throws FileNotFoundException {
        File file = new File("/Pangram.txt");
        Scanner scanner = new Scanner(file);
        String fileContent = "";
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

    }
    public void veriFiltrele(){
        FileWriter words=new FileWriter();
    }
    public static void main(String[] args)  {
        while (true) {
            uret();


        }




        }
    }



