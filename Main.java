import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner hentai = new Scanner(System.in);

        String[] questions = {
                "1.Who is the wind hashira in Demon Slayer?",
                "2.What is the main power system in My Hero Academia?",
                "3.Who is the control devil in Chainsaw Man?",
                "4.What is the name of the anime that revolves around defeating trash monsters?",
                "5.What is Marcus Tabano favorite anime genre"
        };

        String[] choices = {
                "A-Tomioka B-Mitsuri C-Rengoku D-Senemi",
                "A-Nen B-Breathing Style  C-Quirk D-Stands",
                "A-Makima B-Denji C-Reze D-Aki",
                "A-MHA B-Gachiakuta C-Demon Slayer D-JJBA",
                "A-Action B-Sci-Fi C-Ecchi D-Horror",
        };

        String[] answers = {"D","C","A","B","C"};

        String[] userAnswer = new String[5];

        double score = 0;


        System.out.println("===Anime Quiz===");
        System.out.print("What's your name?: ");
        String name = hentai.nextLine();

        System.out.print("What's your section?: ");
        String section = hentai.nextLine();
        System.out.println();

        for (int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.println(choices[i]);
            System.out.print("What's your answer?: ");
            userAnswer[i] = hentai.nextLine();
            System.out.println();
        }

        for (int i = 0; i < questions.length; i++){
        if(userAnswer[i].equalsIgnoreCase(answers[i])){
            score++;
        }
        }

        double percentage = score/ questions.length * 100;

        System.out.println("===Quiz Result===");
        System.out.println("Name    | " + name);
        System.out.println("Section | " + section);
        System.out.println("Score   | " + score);
        System.out.println("Percent | " + percentage);




    }
}