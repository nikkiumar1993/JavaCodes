package abs;

public class Chrome implements Bookmark {


    @Override
    public void addUrlBookmark(String url) {
        System.out.println(url + " given url added to bookmarks");
    }

    @Override
    public void removeUrlFromBookmark(String url) {
        System.out.println(url + " given url removed form bookmarks");
    }
}
