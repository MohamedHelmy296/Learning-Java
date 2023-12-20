import java.util.Objects;

// Inherited class for CD
public class CD extends LibraryItem {
    private String artist;
    private String issn;

    public CD(String title, String author, String artist) {
        super(title, author);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CD otherCD = (CD) obj;
        return Objects.equals(issn, otherCD.issn);
    }
}