package Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSongs = Integer.parseInt (scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 1; i <= countSongs ; i++) {
            String input = scanner.nextLine(); //"{typeList}_{name}_{time}"
            String typeList = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];

            Song song = new Song(time,typeList,name);
            song.setTypeList(typeList);
            song.setName(name);
            song.setTime(time);
            songs.add(song);

        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")){
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        }else {
            for (Song song : songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
