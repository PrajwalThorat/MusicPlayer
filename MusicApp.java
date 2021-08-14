
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MusicApp {

    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        MusicSorting sorting=new MusicSorting();
        MusicCatalog createCatalog=new MusicCatalog();
        MusicDisplayAccordingToChoice display=new MusicDisplayAccordingToChoice();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
           System.out.println("Enter the choice\n1.Check Music Catalogue Created\n2.Check Music Catalogue Sorted\n3.display Sorted Catologue\n4.View Catalogue based on your preference\n5.Exit");
           int choice=sc.nextInt();
        switch(choice)
        {
            case 1:{
                if(createCatalog.readMusic())
                    System.out.println("Music Catalogue created");
                    else 
                    System.out.println("Music Catalogue not created ");
                     break;
            }
            case 2:{
                if(sorting.isAscending())
                System.out.println("Music Catalogue Sorted ");
                else 
                System.out.println("Music Catalogue  not Sorted");
                break;
            }


            case 3:
            {
                System.out.println("Enter the choice to print \n1.FORWARD DIRECTION\n2.BACKWARD DIRECTION");
                choice=sc.nextInt();
             if(choice==1)
             sorting.showMusicCatalog(MusicForwardBackward.FORWARD);
             else 
             sorting.showMusicCatalog(MusicForwardBackward.BACKWARD);
             break;
            }

            case 4:
            {
                System.out.println("Enter Preference\n1.Artist\n2.Genre\n3.Album or Song");
            choice=sc.nextInt();
            sc.nextLine();
            if(choice==1){
                System.out.println("Enter the Artist");
                String artist=sc.nextLine();
                display.displayByArtist(artist);
            }
            else if(choice==2){
                System.out.println("Enter the Genre");
                String genre=sc.nextLine();
                display.displayByGenre(genre);
            }
            else{
                System.out.println("Enter the Album");
                String album=sc.nextLine();
                display.displayByAlbumOrSong(album);
            }
            break;
            }
            
            case 5:System.exit(0);

        }    
    }
    } 
    
    
}
