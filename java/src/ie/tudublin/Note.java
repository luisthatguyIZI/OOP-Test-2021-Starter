package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Note{
    private char note;
    private int duration;

    

    //Constructor
    public Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    //Get & Set
    public char getNote() {
        return note;
    }
    
    public void setNote(char note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //ToString
    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }

    
}
