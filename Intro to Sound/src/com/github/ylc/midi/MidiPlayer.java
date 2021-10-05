package com.github.ylc.midi;

import java.util.HashMap;
import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

/**
 * An object used to create sequence of sounds for player to play random sounds.
 * 
 * @author 			Yue Chen (yuelchen)
 * @version			1.0.0
 * @since			2020-08-08
 */
public class MidiPlayer {
	/**
	 * Static final class variable to max number of notes can be played.
	 * 
	 * MidiEvent note to play range is 0 - 127. 
	 */
	private static final int MAX_NOTE_INDEX = 127;
	
	//====================================================================================================
	
	/**
	 * The sequencer for this player.
	 */
	private Sequencer player = null;
	
	//====================================================================================================
	
	/**
	 * A collection of sequences for this player. 
	 * 
	 * Storage relationship as sequence name to sequence object. 
	 */
	private Map<String, Sequence> sequences;
	
	//====================================================================================================
	
	/**
	 * Constructor 
	 * 
	 * Initialize the sequencer for this player and 
	 * initialize collection for sequences data structure. 
	 * 
	 * Catches MidiUnavailableException and SecurityException in the event
	 * Midi player is unable to initialize sequencer or data structure. 
	 * Logs the failure message as system output. 
	 */
	public MidiPlayer() {
		try {
			this.player = MidiSystem.getSequencer();
			this.player.open();
			this.sequences = new HashMap<String, Sequence>();
			
		} catch (MidiUnavailableException e) {
			System.out.println(String.format("Unable to set player due to MidiUnavailableException "
					+ "with message '%s'; caused by '%s'", e.getMessage(), e.getCause().toString()));
		} catch (SecurityException e) {
			System.out.println(String.format("Unable to set player due to SecurityException "
					+ "with message '%s'; caused by '%s'", e.getMessage(), e.getCause().toString()));
		}
	}
	
	//====================================================================================================
	
	/**
	 * Returns whether or not sequencer player was successfully set by constructor. 
	 * @return					true if sequencer was successfully set.
	 */
	public boolean isPlayerSet() {
		return this.player != null;
	}
	
	//====================================================================================================
	
	/**
	 * Plays the sequence of track if correspong track name exists in collection of sequences. 
	 * 
	 * Catches InvalidMidiDataException and InterruptedException in the event
	 * MIDI data passed invalid data or thread sleep isn't able to execute 
	 * for waiting before printing out system finish message.
	 * 
	 * @param name				the name of the sequence that will be played.
	 */
	public void playSequence(String name) {
		//check if given sequence exists and only try to play if found
		if(this.sequences.containsKey(name)) {
			Sequence sequence = this.sequences.get(name);
			System.out.println(String.format("Sequence with name '%s' found, "
					+ "adding to player for a listening. Enjoy!", name));
			
			try {
				//set player with sequence and play
				this.player.setSequence(sequence);				
				this.player.start();
				
				while(this.player.isRunning()) {
					Thread.sleep(1000);
				}
				
				//once player is completed, print out message
				this.player.close();
				System.out.println(String.format("Sequence with name '%s' is done playing. "
						+ "Hope you enjoyed it!", name));
				
			} catch(InvalidMidiDataException e) {
				System.out.println(String.format("Unable to play sequence with name '%s' "
						+ "due to InvalidMidiDataException with message '%s'; "
						+ "caused by '%s'", name, e.getMessage(), e.getCause().toString()));
			} catch(InterruptedException e) {
				System.out.println(String.format("Unable to play sequence with name '%s' "
						+ "due to InterruptedException with message '%s'; "
						+ "caused by '%s'", name, e.getMessage(), e.getCause().toString()));
			}
			
		} else {
			System.out.println(String.format("Sequence with name '%s' not found", name));
		}
	}
	
	//====================================================================================================
	
	/**
	 * Creates a new sequence of tracks based off the track count number and then
	 * add the new sequence to the collection of sequences with given name. 
	 * 
	 * Catches InvalidMidiDataException in the event MIDI data passed invalid data.
	 * 
	 * Returns whether or not a new sequence was created. 
	 * 
	 * @param name				the name of the new sequence to be mapped. 
	 * @param noteCount			the number of notes for track.
	 * 	
	 * @return					true if a new sequence was successfully added to collection. 
	 */
	public boolean loadNewSequence(String name, int noteCount) {
		try {
			//create a new sequence
			Sequence sequence = new Sequence(Sequence.PPQ, 4);
			
			//load a new track with given track count
			Track track = sequence.createTrack();
			this.loadTrack(track, noteCount);
			
			//load sequence into sequences
			this.sequences.put(name, sequence);	
			
			return true;
			
		} catch (InvalidMidiDataException e) {
			System.out.println(String.format("Unable to set player due to InvalidMidiDataException "
					+ "with message '%s'; caused by '%s'", e.getMessage(), e.getCause().toString()));
		}
		
		return false;
	}
	
	//====================================================================================================
	
	/**
	 * Private class method for loading MidiEvent for given track for the sequence it was created from. 
	 * 
	 * @param track				the track for which MidiEvent on and off will be added.
	 * @param noteCount			the number of notes which will be added.
	 * 
	 * @throws InvalidMidiDataException		in the event MIDI data passed is considered invalid data.
	 */
	private void loadTrack(Track track, int noteCount) throws InvalidMidiDataException {
		int beatIndex = 0;
		
		//add MidiEvents to track based off trackCount
		for(int index = 1; index <= noteCount; index++) {
			int noteToPlay = (int) (Math.random() * MAX_NOTE_INDEX);

			//set on event for track
			beatIndex += 1;
			MidiEvent eventOn = this.getMidiEvent(true, 1, noteToPlay, 100, beatIndex);
			track.add(eventOn);
			
			//set off event for track
			int beatDuration = (int) ((Math.random() * 32) + 1);
			int beatEnd = beatIndex + beatDuration;
			MidiEvent eventOff = this.getMidiEvent(false, 1, noteToPlay, 100, beatEnd);		
			track.add(eventOff);
			
			//print (log) system action
			System.out.println(String.format("Added note '%d' for static channel '%d' at velocity '%d',"
					+ " on beat at '%d' with a duration of '%s' beats; off beat at '%d'", noteToPlay, 1, 100, 
					beatIndex, beatDuration, beatEnd));
			beatIndex = beatEnd;
		}	
		
	}
	
	//====================================================================================================
	
	/**
	 * Private class method for creating MidiEvent using given arguments. 
	 * 
	 * @param noteOnOff			whether or not return will be note on type or note off type.
	 * @param channel			the channel for the note (i.e. channel 1 = piano).
	 * @param noteToPlay		the note number for given channel (i.e. 0 - 127). 
	 * @param velocity			the velocity for note to be played (i.e. how fast or how loud).
	 * @param beat				the beat duration for midiEvent.
	 * 
	 * @return					a MidiEvent object containing MIDI data. 
	 * 
	 * @throws InvalidMidiDataException		in the event MIDI data passed is considered invalid data.
	 */
	private MidiEvent getMidiEvent(boolean noteOnOff, int channel, int noteToPlay, int velocity, int beat) 
			throws InvalidMidiDataException {
		//set noteType to ON (144) if true, otherwise set to OFF (128)
		int noteType = noteOnOff ? 144 : 128;
		
		ShortMessage shortMessage = new ShortMessage();
		shortMessage.setMessage(noteType, channel, noteToPlay, velocity);		
		return new MidiEvent(shortMessage, beat);		
	}
}
