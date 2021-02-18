package Definition;

public class Video {
    // Creating Definition Classes
    // Rules :
    // 1. Always set the visibility modifier of fields to private unless otherwise specific
    // 2. Always set the access modifier of fields non-static unless otherwise specific

    //fields
    private String videoName;
    private int rating;
    private boolean checkOut;

    //methods

    /**
     * This method returns the name of the video.
     *
     * @return The name of the video
     */
    public String getVideoName() {
        return videoName;
    }

}
