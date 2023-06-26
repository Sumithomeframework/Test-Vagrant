package TestVagrant.CodingAssignment.Project;

public class App 
{
	public static void main(String[] args) {
        RecentlyPlayedStore store = new RecentlyPlayedStore(3);

        store.playSong("User1", "S1");
        store.playSong("User1", "S2");
        store.playSong("User1", "S3");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // [S3, S2, S1]

        store.playSong("User1", "S4");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // [S4, S2, S3]

        store.playSong("User1", "S2");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // [S2, S4, S3]

        store.playSong("User1", "S1");
        System.out.println(store.getRecentlyPlayedSongs("User1")); // [S1, S2, S4]
    }
}
