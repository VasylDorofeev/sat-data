import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore);
    System.out.println();

    // prints number of students who took their test
    System.out.println(totalScore.size() + " students took their test.");
    System.out.println();

    // prints the average sat score 
    int total = 0;
    for(int score : totalScore){
      total += score;
    }
    double average = (double)total/totalScore.size();
    System.out.println(average);

    System.out.println();

    int lowScore = 0;
    for(int score : totalScore){
      if(score >= 1000){
      }
      lowScore++;
    }
    System.out.println(lowScore+" students got a low score.");
  }
}
