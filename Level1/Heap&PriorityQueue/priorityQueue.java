import java.util.*;
public class priorityQueue {
    

    public static class Person implements Comparable<Person>{
        int wt,marks,rank;

        Person(int wt,int marks,int rank){
            this.wt=wt;
            this.marks=marks;
            this.rank=rank;
        }

        public String toString(){
            return "WT :"+this.wt+" Makrs: "+this.marks+" Rank: "+this.rank;
        }
        
        //min:this-o
        //max:o-this
        public int compareTo(Person o){
        return this.rank-o.rank;
        }
    } 



    public static void main(String args[]){
 
   PriorityQueue<Person> pq=new PriorityQueue<>();
   
   pq.add(new Person(10,-95,3));
   pq.add(new Person(10,-95,1));
   pq.add(new Person(10,-95,10));
   pq.add(new Person(10,-95,13));
   pq.add(new Person(10,-95,23));
   pq.add(new Person(10,-95,33));
   pq.add(new Person(10,-95,83));


//    System.out.println(pq);
while(pq.size() > 0){
    System.out.println(pq.remove());
}

 








        // PriorityQueue<Integer> pq=new PriorityQueue<>();
//     PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  //for max priority
//     pq.add(10);
//     System.out.println(pq);
//     pq.add(20);
//     System.out.println(pq);
//     pq.add(30);
//     System.out.println(pq);
//     pq.add(100);
//     System.out.println(pq);
//     pq.add(-10);

//     System.out.println(pq);
    
//    System.out.println("Peek"+pq.peek());
//    System.out.println("Size"+pq.size());

//     while(pq.size()>0){
//         System.out.println(pq.remove());
//     }
}

}
