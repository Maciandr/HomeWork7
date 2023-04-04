package Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String text = ("Да1та выпуска 8 декабр\n" +
                "        \"я 1998 года[12]. Кодовое имя Playground. В данном случае встречается путаница.\n" +
                "                \"Выпускались книги, например, Beginning Java 2 by Ivor Horton (Mar 1999), фактически по J2SE 1.2 (бывшее название — Java 2).\n" +
                "        \"Вместе с тем по сей день такие книги публикуются, например: Х. М. Дейтел, П. Дж. Дейтел, С. И. Сантри.\n" +
                "                \"Технологии программирования на Java 2. Распределённые приложения (2011).\n" +
                "                \"В то время, когда, как известно, Java 2 была исторически заменена следующими релизами, подобные названия книг дезориентируют в понимании,\n" +
                "                \"о какой же версии Java они написаны на самом деле. Если J2SE 1.2 принято считать за Java 2, а авторы книг за Java 2 принимают JDK 7," +
                "+ это приводит к полной путаницУ");
        texttask3(text);

    }

    public static void texttask3(String text) {
        var newText = "";
        String[] mastext=text.split(" ");
    //    Pattern pattern = Pattern.compile("\s");

   //     char[]symbols=text.toCharArray();
        for(int i =0; i< mastext.length;i++){
            Pattern pattern = Pattern.compile("a-z");
            Matcher matcher = pattern.matcher(mastext[i]);
            if( !matcher.find()){
                newText="adas";
            }
        }
       System.out.println(newText);


    }

}

