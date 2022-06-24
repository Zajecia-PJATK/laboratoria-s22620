abstract class Maszyna {
    protected String marka;
    protected String nazwa;
    protected double pojemnoscSilnika;
    protected enum rodzajSilnika {DIESEL, BENZYNA, HYBRYDA, LPG, ELEKTRYCZNY, BRAK}
}

class Kosiarka extends Maszyna {
    private boolean czyMelekser;
    private boolean czyNaped;
    private int liczbaOstrzy;
    private Maszyna.rodzajSilnika silnik;

    public Kosiarka(boolean czyMelekser, boolean czyNaped, int liczbaOstrzy, String marka, String nazwa, double pojemnoscSilnika, String rodzajSilnika) {
        this.czyMelekser = czyMelekser;
        this.czyNaped = czyNaped;
        this.liczbaOstrzy = liczbaOstrzy;
        super.marka = marka;
        super.nazwa = nazwa;
        super.pojemnoscSilnika = pojemnoscSilnika;
        this.silnik = Enum.valueOf(Maszyna.rodzajSilnika.class, rodzajSilnika.toUpperCase());
    }

    public String wyswietl() {
        return "Kosiarka{" +
                "czyMelekser=" + czyMelekser +
                ", czyNaped=" + czyNaped +
                ", liczbaOstrzy=" + liczbaOstrzy +
                ", marka='" + marka + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", pojemoscSilnika=" + pojemnoscSilnika +
                ", rodzajSilnika=" + silnik +
                '}';
    }

    public boolean isCzyMelekser() {
        return czyMelekser;
    }

    public void setCzyMelekser(boolean czyMelekser) {
        this.czyMelekser = czyMelekser;
    }

    public boolean isCzyNaped() {
        return czyNaped;
    }

    public void setCzyNaped(boolean czyNaped) {
        this.czyNaped = czyNaped;
    }

    public int getLiczbaOstrzy() {
        return liczbaOstrzy;
    }

    public void setLiczbaOstrzy(int liczbaOstrzy) {
        this.liczbaOstrzy = liczbaOstrzy;
    }
}