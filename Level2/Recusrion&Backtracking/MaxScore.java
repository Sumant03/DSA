

// import java.io.*;
// import java.util.*;

// public class MaxScore {

// 	public static int solution(String[] words, int[] farr, int[] score, int idx) {
// 		//write your code here
		
// 		// not inc
// 		int scoreNInc= solution(words,farr,score,idx+1);
// 		//inc 
// 		String word=words[idx];
// 		boolean flag=true;
// 		int score=0;
// 		for(int i=0;i<word.length();i++){
// 		    char ch=word.charAt(i);
		    
// 		    if(farr[ch-'a']==0){
// 		        flag=false;
// 		    }
		    
// 		    farr[ch-'a']--;
		    
// 		    if(flag==true){
// 		        score+=score[]
// 		    }
		    
// 		}
		
// 		for(int i=0;i<word.length();i++){
// 		    char ch=word.charAt(i);
		    
// 		    farr[ch-'a']++;
		    
// 		}
		
		
		
// 		return Math.max(score,scoreNInc);
// 	}

// 	public static void main(String[] args) {

// 		Scanner scn = new Scanner(System.in);
// 		int nofWords = scn.nextInt();
// 		String[] words = new String[nofWords];
// 		for(int i = 0 ; i < words.length; i++) {
// 			words[i] = scn.next();
// 		}
// 		int nofLetters = scn.nextInt();
// 		char[] letters = new char[nofLetters];
// 		for (int i = 0; i < letters.length; i++) {
// 			letters[i] = scn.next().charAt(0);
// 		}
// 		int[] score = new int[26];
// 		for (int i = 0; i < score.length; i++) {
// 			score[i] = scn.nextInt();
// 		}
// 		if (words == null || words.length == 0 || letters == null || letters.length == 0 || score == null
// 				|| score.length == 0) {
// 			System.out.println(0);
// 			return;
// 		}
// 		int[] farr = new int[score.length];
// 		for (char ch : letters) {
// 			farr[ch - 'a']++;
// 		}
// 		System.out.println(solution(words, farr, score, 0));

// 	}
// }