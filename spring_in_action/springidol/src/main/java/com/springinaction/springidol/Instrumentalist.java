package com.springinaction.springidol;

public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist() { }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) { //<co id="co_injectSong"/>
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) { //<co id="co_injectInstrument"/>
        this.instrument = instrument;
    }

}
