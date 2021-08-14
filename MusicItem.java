
public class MusicItem
{  
    String ReleaseType;
    String Artist;
    String MusicItemName;
    String Genre;
    String YearOfRelease;
    String NumOfSongs;
    String TotalPlayingTime; 
    public MusicItem()
    {

    }
    public MusicItem(String releaseType, String artist,
            String musicItemName, String genre, String yearOfRelease, String numOfSongs, String totalPlayingTime) {

        ReleaseType = releaseType;
        Artist = artist;
        MusicItemName = musicItemName;
        Genre = genre;
        YearOfRelease = yearOfRelease;
        NumOfSongs = numOfSongs;
        TotalPlayingTime = totalPlayingTime;
    }


    public String getReleaseType() {
        return ReleaseType;
    }



    public void setReleaseType(String releaseType) {
        ReleaseType = releaseType;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getMusicItemName() {
        return MusicItemName;
    }

    public void setMusicItemName(String musicItemName) {
        MusicItemName = musicItemName;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getYearOfRelease() {
        return YearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        YearOfRelease = yearOfRelease;
    }

    public String getNumOfSongs() {
        return NumOfSongs;
    }

    public void setNumOfSongs(String numOfSongs) {
        NumOfSongs = numOfSongs;
    }

    public String getTotalPlayingTime() {
        return TotalPlayingTime;
    }

    public void setTotalPlayingTime(String totalPlayingTime) {
        TotalPlayingTime = totalPlayingTime;
    }

    @Override
    public String toString() {
        return "MusicItem [Artist=" + Artist + ", Genre=" + Genre + ", MusicItemName=" + MusicItemName + ", NumOfSongs="
                + NumOfSongs + ", ReleaseType=" + ReleaseType + ", TotalPlayingTime=" + TotalPlayingTime
                + ", YearOfRelease=" + YearOfRelease + "]";
    }






    


    


   

    


    

}