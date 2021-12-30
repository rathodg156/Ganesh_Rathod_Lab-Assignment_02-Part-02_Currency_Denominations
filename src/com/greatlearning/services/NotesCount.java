package com.greatlearning.services;

public class NotesCount {
		//notes ---> already sorted
		//amount ---> input
	public void notesCountImplementation(int notes[],int amount) {
		int[]notesCounter = new int[notes.length];
		  try {
			//across all the notes i.e. loop if amount>notes[i]
				//update notesCounter
				// update amount
			  for(int i=0; i<notes.length;i++) {
				  if(amount>= notes[i]) {
					  notesCounter[i] = amount / notes[i];
					  amount = amount - notesCounter[i]*notes[i];	  
				  }
			  }
			// if amount cannot be paid
			  if(amount>0)   {
				  System.out.println("exact amount cannot be given with the highest denomination");
			  } else {
				  System.out.println("Your Payment approach in order to give min no of notes will be");
				  for(int i=0;i< notes.length;i++) {
					  if(notesCounter[i] != 0) {
						  System.out.println(notes[i]+ " : "+notesCounter[i] );
					  }
				  }
			  }
			  // handle thr notes with 0 denomination
		} catch (ArithmeticException e) {
			System.out.println("notes of denomination 0 is invalid");
		}
		
	}

}