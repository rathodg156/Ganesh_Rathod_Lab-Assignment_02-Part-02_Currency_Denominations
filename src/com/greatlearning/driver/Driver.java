package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;
import com.greatlearning.services.MergeSort;
import com.greatlearning.services.NotesCount;
	public class Driver {

		public static void main(String[] args) {
		//init Scanner
		Scanner sc = new Scanner(System.in);
		//init MergeSort and NotesCount objects
		MergeSort mergeSort = new MergeSort();
		NotesCount notesCount = new NotesCount();
		System.out.println("Enter the total no of denominations");
		//Get size of the denomination
		int totalNoOfDenominations = sc.nextInt();
		// initialize the notes array
		int [] notes = new int[totalNoOfDenominations];
		//get currency denominations value
		System.out.println("Enter the Currency denominations value");
		for(int i=0; i<totalNoOfDenominations;i++) {
			notes[i] = sc.nextInt();
		}
		//ge the amount to pay
		System.out.println("Enter the amount you want to Pay");
		int amount = sc.nextInt();
		//Merge sort
		mergeSort.sort(notes, 0, notes.length-1);
		//countNotes
		System.out.println(Arrays.toString(notes));
		notesCount.notesCountImplementation(notes, amount);
		}
		
	}

