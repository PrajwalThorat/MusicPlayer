public class MusicNodeCreate {

    private MusicNodeCreate nextNode;
    private MusicNodeCreate previousNode;
    private MusicItem musicItem = new MusicItem();



    public MusicNodeCreate getNextNode() {
        return nextNode;
    }




    public void setNextNode(MusicNodeCreate nextNode) {
        this.nextNode = nextNode;
    }




    public MusicNodeCreate getPreviousNode() {
        return previousNode;
    }




    public void setPreviousNode(MusicNodeCreate previousNode) {
        this.previousNode = previousNode;
    }




    public MusicItem getMusicItem() {
        return musicItem;
    }




    public void setMusicItem(MusicItem musicItem) {
        this.musicItem = musicItem;
    }


    @Override
    public String toString() {
        return  musicItem.toString();
    }
   



    
   

    
    
}
