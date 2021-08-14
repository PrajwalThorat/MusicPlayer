import java.io.FileNotFoundException;
import java.io.IOException;

public class MusicSorting {

    
    private MusicNodeCreate startNode;
    private MusicCatalog musicCatalog;
  

    public  void Sorting() throws FileNotFoundException, IOException
    {
        musicCatalog=new MusicCatalog();
        musicCatalog.storeMusic();
        startNode=musicCatalog.startNode();
    }
 
    public void sort()
    {
        MusicNodeCreate musicNodeCreate=startNode;
        while(musicNodeCreate!=null)
        {
         MusicNodeCreate tempNode=musicNodeCreate;
           while(tempNode!=null)
           {
               int compare=musicNodeCreate.getMusicItem().getArtist().compareTo(tempNode.getMusicItem().getArtist());
               if(compare>0)
               {
                   MusicItem mitem=musicNodeCreate.getMusicItem();
                   musicNodeCreate.setMusicItem(tempNode.getMusicItem());
                   tempNode.setMusicItem(mitem);
              }
              else if(compare==0)
              {
                  if(Integer.parseInt(musicNodeCreate.getMusicItem().getYearOfRelease().trim())>Integer.parseInt(tempNode.getMusicItem().getYearOfRelease().trim()))
                  {
                     MusicItem mitem=musicNodeCreate.getMusicItem();
                     musicNodeCreate.setMusicItem(tempNode.getMusicItem());
                     tempNode.setMusicItem(mitem);
                  }
              }
              tempNode=tempNode.getNextNode();
 
           }
           musicNodeCreate=musicNodeCreate.getNextNode();
        }
 
    }
 
    public void showMusicDetails()
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
 
    public void showMusicCatalog(MusicForwardBackward direction)
    {
        if(direction.equals(MusicForwardBackward.FORWARD))
        {
             showMusicDetails();
        }
        else
        {
            MusicNodeCreate musicNodeCreate=startNode;
            while(musicNodeCreate.getNextNode()!=null)
            {
                musicNodeCreate=musicNodeCreate.getNextNode();
            }
            while(musicNodeCreate!=null)
            {
                System.out.println(musicNodeCreate.getMusicItem().toString());
                musicNodeCreate=musicNodeCreate.getPreviousNode();
            }
        }
    }
 
    public boolean isAscending()
    {
        sort();
        MusicNodeCreate musicNodeCreate=startNode;
        MusicNodeCreate tempNode=startNode;
        while(musicNodeCreate!=null)
        {
           while(tempNode!=null)
           {
               int compare=musicNodeCreate.getMusicItem().getArtist().compareTo(tempNode.getMusicItem().getArtist());
               if(compare>0)
               return false;
               tempNode=tempNode.getNextNode();
           }
           musicNodeCreate=musicNodeCreate.getNextNode();
        }
        return true;
    }
    
}
