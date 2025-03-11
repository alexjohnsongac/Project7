package edu.gac.mcs178.gack.domain;

import java.util.List;
import java.util.Random;

import edu.gac.mcs178.gack.Utility;


public class Necromancer extends AutoPerson {

	private Place goodShipOlin;
	
	public Necromancer(String name, Place place, int threshold) {
		super(name, place, threshold);
	}
	
	@Override
	public void act() {
		List<Person> others = otherPeopleAtSamePlace();
		if (!others.isEmpty()) {
			Person victim = others.get(Utility.randInt(others.size()));
			if (victim instanceof Person) {
			challenge(victim);
			}
		} 
	}
		
	public void challenge(Person person) {
			say("Welcome traveller, face me to gain an object to aid you on your journey " + person);
			if (duel(person)==1) {
				say("You have emerged victorious, look around for your spoils!");
			} else {
				say("Victory was not yours today, better luck next time.");
			}
	}
	
	
	public int duel(Person person) {
		Random rand = new Random();
		int rand_int = rand.nextInt(100);
		if (rand_int % 2 == 0) {
			goodShipOlin.gain(new Thing("Magic Stone"));
			return 1; //win
		} else {
			return 0; //loss
		}
	}
	
	//add a move around method like the other people
	
	
}