import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MusicCatalog {

    private MusicNodeCreate startNode;
    private BufferedReader bufferedReader;


    public MusicCatalog() throws FileNotFoundException,IOException
    {
        startNode=null;
        bufferedReader=new BufferedReader(new FileReader("./data/music-catalog.csv"));
        
    }


    public MusicNodeCreate createMusic(String str)
    {
        
        MusicItem musicItem=new MusicItem(); //Creating object for the musicItem
        MusicNodeCreate  musicNodeCreate=new MusicNodeCreate();  //Creating object for the MusicNodeCreate
        String[] strArray=str.split(",");
        musicItem.setReleaseType(strArray[0]);
        musicItem.setArtist(strArray[1]);
        musicItem.setMusicItemName(strArray[2]);
        musicItem.setGenre(strArray[3]);
        musicItem.setYearOfRelease(strArray[4]);
        musicItem.setNumOfSongs(strArray[5]);
        musicItem.setTotalPlayingTime(strArray[6]);
        musicNodeCreate.setMusicItem(musicItem);
        musicNodeCreate.setPreviousNode(null);
        musicNodeCreate.setNextNode(null);
        return musicNodeCreate;
    }

    public void storeMusic() throws FileNotFoundException,IOException
    {
        while(true)
        {
        String line=bufferedReader.readLine();
        if(line!=null)
        {
        MusicNodeCreate musicNodeCreate=createMusic(line);
        if(startNode==null)
        {
            startNode=musicNodeCreate;
        }
        else
        {
            MusicNodeCreate tempNode=startNode;
            while(tempNode.getNextNode()!=null)
            {
               tempNode=tempNode.getNextNode();
            }
            tempNode.setNextNode(musicNodeCreate);
            musicNodeCreate.setPreviousNode(tempNode);
            musicNodeCreate.setNextNode(null);
        }
    }
    else 
    {
        break;
    }
    }
    }


    public boolean readMusic() throws FileNotFoundException, IOException
    {
       
        storeMusic();
        if(startNode==null)
        {
           return false;
        }
        else
        {
           return true;
        }
    }


    public void displayMusic()
    {
        MusicNodeCreate musicNodeCreate=startNode;
        if(startNode==null)
        {
            return;
        }
       else{
            while(musicNodeCreate!=null)
            {
                System.out.println(musicNodeCreate.toString());
                musicNodeCreate=musicNodeCreate.getNextNode();
            }
        }
    }

    public MusicNodeCreate startNode()
    {
        return startNode;
    }

    
}
