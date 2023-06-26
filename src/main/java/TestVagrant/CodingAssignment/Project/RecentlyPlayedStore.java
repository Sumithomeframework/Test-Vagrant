package TestVagrant.CodingAssignment.Project;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RecentlyPlayedStore {
	private final int capacity;
    private final Map<String, LinkedList<String>> store;

    public RecentlyPlayedStore(int capacity) {
        this.capacity = capacity;
        this.store = new HashMap<>();
    }

    public void playSong(String user, String song) {
        if (!store.containsKey(user)) {
            store.put(user, new LinkedList<>());
        }

        LinkedList<String> songs = store.get(user);

        if (songs.contains(song)) {
            songs.remove(song);
        } else if (songs.size() >= capacity) {
            songs.removeLast();
        }

        songs.addFirst(song);
    }

    public LinkedList<String> getRecentlyPlayedSongs(String user) {
        return store.getOrDefault(user, new LinkedList<>());
    }
}
