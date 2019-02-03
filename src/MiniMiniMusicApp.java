import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;

import javax.sound.midi.*;

public class MiniMiniMusicApp {

	public static void main(String[] args) {
    MiniMiniMusicApp mini = new MiniMiniMusicApp();
    mini.play();

	}
	public void play() {
		try {
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			player.setSequence(seq);
			player.start();
			
			ShortMessage c = new ShortMessage();
			c.setMessage(144, 1, 53, 100);
			MidiEvent noteOn1 = new MidiEvent(c, 20);
			track.add(noteOn1);
			
			ShortMessage d = new ShortMessage();
			d.setMessage(128, 1, 53, 100);
			MidiEvent noteOff1 = new MidiEvent(d, 42);
			track.add(noteOff1);
			player.setSequence(seq);
			player.start();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
