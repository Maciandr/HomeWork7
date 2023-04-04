package Task2;

public class Task2 {
    public static void main(String[] args) {
        String text = new String(" Каждая строка, создаваемая с помощью оператора new, литерала (заключенная в двойные апострофы) и\n" +
                "ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является\n" +
                "то, что его значение не может быть изменено после создания объекта при помощи\n" +
                "любого метода класса. Изменение строки всегда приводит к созданию нового\n" +
                "объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение\n" +
                "и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.");
        char xxx = 'X';
        int k = 7;
        //   texttask1(text, k, xxx);
        texttask2(text, "ая", "Привет");
    }

    public static void texttask1(String text, int k, char xxx) {
        var newText = "";
        String[] massiveWords = text.split(" ");
        for (int i = 0; i < massiveWords.length; i++) {
            if (massiveWords[i].length() > k) {
                char[] chars = massiveWords[i].toCharArray();
                chars[k] = xxx;
                massiveWords[i] = new String(chars);
            }
            newText = newText + " " + massiveWords[i];
        }
        System.out.println(newText);
    }

    public static void texttask2(String text, String ending, String word) {
        var newText2 = "";
        String[] massiveWords = text.split(" ");
        for (int i = 0; i < massiveWords.length; i++) {
            if (massiveWords[i].endsWith(ending)) {
                newText2 = newText2 + " " + massiveWords[i] + " " + word;
            } else {
                newText2 = newText2 + " " + massiveWords[i];
            }
        }
        System.out.println(newText2);
    }

}
//2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку.
//2.2 После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.