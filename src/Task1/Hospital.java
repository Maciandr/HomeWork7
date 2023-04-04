package Task1;

public class Hospital {
    public static void main(String[] args) {
        Pacient[] pacients = inicialize();
        System.out.println("Все пациенты Больницы: \n" + allpacients(pacients));
        Pacient[] diagnoz1 = allDiagnoz(pacients, "Укушен Журавля");
        System.out.println("C Укасами Журавля: \n" + allpacients(diagnoz1));
        Pacient[] diagnoz2 = allDiagnoz(pacients, "Не может ходить");
        System.out.println("Не могут ходить: \n" + allpacients(diagnoz2));
        Pacient[] diagnoz3 = allDiagnoz(pacients, "Просто так зашел");
        System.out.println("Просто так защел: \n" + allpacients(diagnoz3));
        int a = 1;
        int b = 10;
        Pacient[] spisokcads1 = spisokcards(pacients, a, b);
        System.out.println("Cписок пациентов с номерами личных медицинских карточек от 1 до 10 \n" + allpacients(spisokcads1));

    }

    static Pacient[] inicialize() {
        Pacient[] pacients = new Pacient[6];
        Pacient Pacient1 = new Pacient(1, "Петя", "Петров", "Петькин", "+37544246544", 1, "Укушен Журавля");
        Pacient Pacient2 = new Pacient(2, "Иван", "Иванов", "Иванович", "+37544246548", 3, "Укушен Журавля");
        Pacient Pacient3 = new Pacient(3, "Колян", "Сидоров", "Колянович", "+375442465447", 5, "Укушен Журавля");
        Pacient Pacient4 = new Pacient(4, "Сергей", "Петренко", "Сергеевич", "+37544246541", 7, "Просто так зашел");
        Pacient Pacient5 = new Pacient(5, "Яна", "Иванова", "Петровна", "+37544246545", 11, "Не может ходить");
        Pacient Pacient6 = new Pacient(6, "Ваня", "Троцкий", "Васильевич", "+3754424654", 15, "Не может ходить");
        pacients[0] = Pacient1;
        pacients[1] = Pacient2;
        pacients[2] = Pacient3;
        pacients[3] = Pacient4;
        pacients[4] = Pacient5;
        pacients[5] = Pacient6;
        return pacients;
    }

    public static String allpacients(Pacient[] pacients) {
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < pacients.length; i++) {
            if (pacients[i] != null) {
                SB.append(pacients[i].toString() + "\n");
            }
        }

        return SB.toString();
    }


    static Pacient[] allDiagnoz(Pacient[] pacients, String diagnoz) {
        Pacient[] diagnoz1 = new Pacient[pacients.length];
        int j = 0;
        for (int i = 0; i < pacients.length; i++) {
            if (pacients[i].getDiagnoz().equals(diagnoz)) {
                diagnoz1[j] = pacients[i];
                j++;
            }

        }
        return diagnoz1;


    }

    static Pacient[] spisokcards(Pacient[] pacients, int a, int b) {
        Pacient[] spisokcars = new Pacient[pacients.length];
        int j = 0;
        for (int i = 0; i < pacients.length; i++)
            if (pacients[i].getNumberMedicalCard() >= a && pacients[i].getNumberMedicalCard() < b) {
                spisokcars[j] = pacients[i];
                j++;
            }
        return spisokcars;
    }
}