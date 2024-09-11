package test02;

import java.util.*;

public class StudentScore {
	HashMap <String, Integer> map = new HashMap <>() ;
	int mapSize = map.size();
	int stuTotal = 0;
	
	private void addStudent(String name, int score) {
		map.put(name, score);
	}
	
	private void getStudentScore(String name) {
		map.get(name);
	}
	
	private void showStudents() {
		for(int i=1; i<=mapSize; i++) {
			
		}
	}
	
	private void showAvgStu() {
		
		
	}
	
	private void showStored() {
		
	}
	
	private void showTop() {
		
	}
	
	public static void main(String[] args) {
		StudentScore ssc = new StudentScore();
		
	}
}
