package Article;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String title = text.split(", ")[0];
        String content = text.split(", ")[1];
        String author = text.split(", ")[2];

        Article article = new Article(title,content,author);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            // · "Edit: {new content}"
            //· "ChangeAuthor: {new author}
            //· "Rename: {new title}".
            String commandName = input.split(": ")[0];
            String newValue = input.split(": ")[1];

            if (commandName.equals("Edit")) {
                article.editContent(newValue);
            } else if (commandName.equals("ChangeAuthor")) {
                article.changeAuthor(newValue);
            } else if (commandName.equals("Rename")) {
                article.rename(newValue);
            }


        }
        System.out.println(article.toString());
    }
}
