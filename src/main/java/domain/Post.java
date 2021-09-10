package domain;

public class Post {
    private String id;
    private String profilePicture;
    private String title;
    private String dateOfPosting;
    private String contentOfPost;
    private int totalLikes;
    private int totalComments;
    private int totalReposts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfPosting() {
        return dateOfPosting;
    }

    public void setDateOfPosting(String dateOfPosting) {
        this.dateOfPosting = dateOfPosting;
    }

    public String getContentOfPost() {
        return contentOfPost;
    }

    public void setContentOfPost(String contentOfPost) {
        this.contentOfPost = contentOfPost;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(int totalComments) {
        this.totalComments = totalComments;
    }

    public int getTotalReposts() {
        return totalReposts;
    }

    public void setTotalReposts(int totalReposts) {
        this.totalReposts = totalReposts;
    }

    public int getViewsCounter() {
        return viewsCounter;
    }

    public void setViewsCounter(int viewsCounter) {
        this.viewsCounter = viewsCounter;
    }

    private int viewsCounter;


}
