import java.io.FileNotFoundException;
import java.io.IOException;

public class MusicDisplayAccordingToChoice {

    private MusicCatalog musicCatalog;
    private MusicItem musicItem;
    private MusicNodeCreate musicNodeCreate;


    public MusicDisplayAccordingToChoice() throws FileNotFoundException, IOException
    {
        musicCatalog=new MusicCatalog();
        musicCatalog.storeMusic();
        musicNodeCreate=musicCatalog.startNode();
    }

    

    public void displayByArtist(String artist)
    {
        MusicNodeCreate musicNodeStart = musicNodeCreate;
        if(musicNodeStart==null)
        {
            return;
        }
        else
        {
            while(musicNodeStart!=null)
            {
                if(musicNodeStart.getMusicItem().getArtist().equalsIgnoreCase(artist))
                    {
                       System.out.println(musicNodeStart.getMusicItem().toString());
                    }
                else{
                       System.out.println("Entered artist doesnt exist");
                    }
                musicNodeStart=musicNodeStart.getNextNode();


            }

        }
        
    }

    public void displayByGenre(String genre)
    {

        MusicNodeCreate musicNodeStart = musicNodeCreate;
        if(musicNodeStart==null)
        {
            return;
        }
        else
        {
            while(musicNodeStart!=null)
            {
                if(musicNodeStart.getMusicItem().getGenre().equalsIgnoreCase(genre))
                    {
                       System.out.println(musicNodeStart.getMusicItem().toString());
                    }
                else{
                       System.out.println("Entered genre doesnt exist");
                    }
                musicNodeStart=musicNodeStart.getNextNode();


            }

        }
        
    
        
    }

    public void displayByAlbumOrSong(String album)
    {


        MusicNodeCreate musicNodeStart = musicNodeCreate;
        if(musicNodeStart==null)
        {
            return;
        }
        else
        {
            while(musicNodeStart!=null)
            {
                if(musicNodeStart.getMusicItem().getReleaseType().equalsIgnoreCase(album))
                    {
                       System.out.println(musicNodeStart.getMusicItem().toString());
                    }
                else{
                       System.out.println("Entered album doesnt exist");
                    }
                musicNodeStart=musicNodeStart.getNextNode();


            }

        }
       
        
    }
 
    
}
