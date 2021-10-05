package com.github.ylc.main;

import com.github.ylc.midi.MidiPlayer;

/** 
 * RandomSounds
 * 
 * The main method class for RandomSounds example.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class RandomSounds {
	
	/**
	 * The main method of RandomSounds.
	 * 
	 * @param args				an array of String values that can be used by main method (not applicable).
	 */
	public static void main(String[] args) {
		
		//initialize a new MidiPlayer object assigned to audioPlayer variable
		MidiPlayer audioPlayer = new MidiPlayer();
		
		//check if audioPlayer has a initialized sequencer 
		if(audioPlayer.isPlayerSet()) {
			System.out.println("Audio player is ready to go.");
			
			String sequenceName = "Random Sounds Playlist";
			audioPlayer.loadNewSequence(sequenceName, 5);
			audioPlayer.playSequence(sequenceName);
		}
	}
}