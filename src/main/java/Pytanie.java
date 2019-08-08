public class Pytanie {
    private String zdanie;
    private String kategoria;

    public Pytanie(String zdanie, String kategoria) {
        this.zdanie = zdanie;
        this.kategoria = kategoria;
    }

    public String getZdanie() {
        return zdanie;
    }

    public void setZdanie(String zdanie) {
        this.zdanie = zdanie;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
