package test.com.google.project.test;

public class Shows implements TvShows, Movies {

	
    @Override
    public void shows() {
        System.out.println("Method shows from TvShows");
    }
    @Override
    public void movies() {
        System.out.println("Method movies from Movies");
    }
}
