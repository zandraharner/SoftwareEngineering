package JUnitExampleSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Member implements Comparable<Member> {
	private Integer ID;
	private String name;
	private int age;
	
	private double[] questionsIndex = new double[GlobalVariables.numOfQuestions];
	private double matchingvalue = Integer.MAX_VALUE;
	Random r;

	Member(String name, int age, Random r) {
		this.ID = GlobalVariables.getID();
		this.name = name;
		this.age = age;
		this.r = r;
		// random set its questions measurements
		setQuestionsIndex();
	}

	public void setQuestionsIndex() {
		for (int i = 0; i < GlobalVariables.numOfQuestions; i++) {
			questionsIndex[i] = r.nextDouble();
		}
	}

	public double[] getQuestionsIndex() {
		return questionsIndex;
	}

	public double getMatchingvalue() {
		return matchingvalue;
	}

	public void setMatchingvalue(double matchingvalue) {
		this.matchingvalue = matchingvalue;
	}	
	

	public Random getR() {
		return r;
	}

	public void setR(Random r) {
		this.r = r;
	}

	public String toString() {
		String questionsindex = "";
		for (int i = 0; i < GlobalVariables.numOfQuestions; i++)
			questionsindex += String.format("%.2f", questionsIndex[i]) + " ";
		return "[ID=" + ID + ", name=" + name + ", age=" + age + ", QuestionsIndex={" + questionsindex + "}]";
	}

	public double getSimilarity(Member anotherMember) {
		double similarities = 0;
		for (int i = 0; i < GlobalVariables.numOfQuestions; i++) {
			similarities += Math.pow(this.questionsIndex[i] - anotherMember.getQuestionsIndex()[i], 2);
		}
		return similarities;
	}

	@Override
	public int compareTo(Member o) {
		// return an int value: 0 if the string is equal to the other string.
		// < 0 if the string is lexicographically less than the other string
		// > 0 if the string is lexicographically greater than the other string (more
		// characters)
		if (this.getMatchingvalue() < o.getMatchingvalue())
			return -1;
		else if (this.getMatchingvalue() < o.getMatchingvalue())
			return 1;
		return 0;
	}

	public String getMatchingMembersInDescendingOrder(ArrayList<Member> othermembers) {
		if (othermembers == null) {
			System.out.println("no members to match");
			return "no members to match";
		}
		int numofmembers = othermembers.size();
		for (int i = 0; i < numofmembers; i++) {
			Member curmember = othermembers.get(i);
			double cursimilarity = getSimilarity(curmember);
			curmember.setMatchingvalue(cursimilarity);
		}
		Collections.sort(othermembers);
		// print out this member
		System.out.println(this.toString());
		// print out the members in descending order
		System.out.println("First 10 Friends matching in descending order: ");
		// print the first 100 members
		for (int i = 0; i < Math.min(10, numofmembers); i++) {
			System.out.println(othermembers.get(i).toString());
		}
		return "success";
	}

}
