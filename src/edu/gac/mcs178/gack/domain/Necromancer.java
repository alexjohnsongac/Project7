package edu.gac.mcs178.gack.domain;

import java.util.List;
import java.util.Random;


public class Necromancer extends Autoperson {

	private Place goodShipOlin
	
	public Necromance(String name, Place place, int threshold) {
		super(name, place, threshold);
	}
		
	public void challenge(Person person) {
			say("Welcome traveller, an object to aid you on your journey" + person);
			//duel
			//if won, give object
			//say something else
	}
	
	
	public int duel(Person, person) {
		Random rand = new Random();
		int rand_int = rand.nextInt(100);
		if (rand_int % 2 == 0) {
			// give object to player
		} else {
			// say something
		}
	}
}