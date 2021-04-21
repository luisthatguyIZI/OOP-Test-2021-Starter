package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Note{
    private char note;
    private int duration;

    

    //Constructor
    public Note() {
        this.note = note;
        this.duration = duration;
    }
    public void render(PApplet pa)
    {
        float border = pa.width * 0.1f;
        float x = PApplet.map(x, -5, 5, border, pa.width - border);
        float y = PApplet.map(y, -5, 5, border, pa.width - border);
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
