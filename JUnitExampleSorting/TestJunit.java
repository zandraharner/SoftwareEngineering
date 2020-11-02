package JUnitExampleSorting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Random;

public class TestJunit {
	
	Random r = new Random();	
	
	public String generateName() {	
		NameGenerator curname = new NameGenerator(7);
		return curname.getName() ;
	}
	
	public int generateAge() {
		return 13 + r.nextInt(87);
	}
	
	public void testSortingWithNumOfMembers(int numofmembers) {			  
		   r.setSeed(10000L);
		   
		   // test there are 100,000 members
		   Member m1 = new Member("Mary Steel", 65, r);
		   
		   ArrayList<Member> listofmembers = new ArrayList<Member>();
		   for (int i=0; i<numofmembers;i++) {
			   Member curmember = new Member(generateName(), generateAge(), r);
			   listofmembers.add(curmember);
		   }
		   
		   m1.getMatchingMembersInDescendingOrder(listofmembers);
		   
		   // checking whether the list is sorted	   
		   for (int i=0; i<numofmembers-1; i++) {
		        assertTrue(listofmembers.get(i).getMatchingvalue() <= listofmembers.get(i+1).getMatchingvalue());	       
		    }
		   
		   System.out.println();
		   System.out.println();
	   }
	
	@Test
	public void testSorting0() {	
	   r.setSeed(10000L);	   
	   // test there is only one member, no other members to match
	   Member m1 = new Member("Mary Steel", 65, r);
	   
	   ArrayList<Member> listofmembers = new ArrayList<Member>();   
	   
       assertEquals(m1.getMatchingMembersInDescendingOrder(listofmembers), "no members to match");	       
	   
	   System.out.println();
	   System.out.println();
   }

   @Test
   public void testSorting1() {	
	   r.setSeed(10000L);
	   
	   // test there are five members
	   Member m1 = new Member("Mary Steel", 65, r);
	   Member m2 = new Member("Alice Smith", 35, r);
	   Member m3 = new Member("Jatin Patel", 23, r); 
	   Member m4 = new Member("Shady", 28, r);
	   Member m5 = new Member("Mounica Veeranki", 24, r);
	   
	   ArrayList<Member> listofmembers = new ArrayList<Member>();
	   listofmembers.add(m2);
	   listofmembers.add(m3);
	   listofmembers.add(m4);
	   listofmembers.add(m5);
	   
	   m1.getMatchingMembersInDescendingOrder(listofmembers);
	   
	   // checking whether the list is sorted	   
	   for (int i=0; i<=2; i++) {
	        assertTrue(listofmembers.get(i).getMatchingvalue() <= listofmembers.get(i+1).getMatchingvalue());	       
	    }
	   
	   System.out.println();
	   System.out.println();
   }

   @Test
   public void testSortingBigList1000() {	
	   testSortingWithNumOfMembers(1000);
   }
   
   @Test
   public void testSortingBigList10000() {	
	   testSortingWithNumOfMembers(10000);
   }
   
   @Test
   public void testSortingBigList100000() {	
	   testSortingWithNumOfMembers(100000);
   }
   
   @Test
   public void testSortingBigList1000000() {	
	   testSortingWithNumOfMembers(1000000);
   }
   
   
   @Test
   public void testSortingRepeating() {	
	   r.setSeed(10000L);
	   
	   // test there are five members
	   Member m1 = new Member("Mary Steel", 65, r);
	   Member m2 = new Member("Alice Smith", 35, r);
	   Member m3 = new Member("Jatin Patel", 23, r); 
	   Member m4 = new Member("Shady", 28, r);
	   Member m5 = new Member("Mounica Veeranki", 24, r);
	   
	   ArrayList<Member> listofmembers = new ArrayList<Member>();
	   listofmembers.add(m2);
	   listofmembers.add(m3);
	   listofmembers.add(m4);
	   listofmembers.add(m5);
	   
	   m1.getMatchingMembersInDescendingOrder(listofmembers);
	   
	   System.out.println();
	   System.out.println();
	   
	   r.setSeed(10000L);
	   
	   // test there are five members
	   Member m1prime = new Member("Mary Steel", 65, r);
	   Member m2prime = new Member("Alice Smith", 35, r);
	   Member m3prime = new Member("Jatin Patel", 23, r); 
	   Member m4prime = new Member("Shady", 28, r);
	   Member m5prime = new Member("Mounica Veeranki", 24, r);
	   
	   ArrayList<Member> listofmembersprime = new ArrayList<Member>();
	   listofmembersprime.add(m2prime);
	   listofmembersprime.add(m3prime);
	   listofmembersprime.add(m4prime);
	   listofmembersprime.add(m5prime);
	   
	   m1prime.getMatchingMembersInDescendingOrder(listofmembersprime);
	   
	// checking whether two results are the same	   
	   for (int i=0; i<listofmembers.size(); i++) {
	        assertTrue(listofmembers.get(i).getMatchingvalue() == listofmembersprime.get(i).getMatchingvalue());
	        double[] QuestionsIndex = listofmembers.get(i).getQuestionsIndex();
	        double[] QuestionsIndexPrime = listofmembersprime.get(i).getQuestionsIndex();
	        for (int j=0; j<GlobalVariables.numOfQuestions;j++) {
	        	assertTrue(QuestionsIndex[j]==QuestionsIndexPrime[j]);
	        }
	    }
	   
   }
   
   
}