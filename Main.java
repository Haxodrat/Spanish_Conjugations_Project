import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //region Array Lists

        //region Verb Roots
        String[] verbRoots = {"andar", "ir", "comer", "nadar", "dormir", "averiguar", "cantar",
                "bailar", "volver", "poder", "llevar", "limpiar", "salir", "jugar", "beber", "besar",
                "abrazar", "estudiar", "encontrar", "ser", "estar", "venir", "decir", "pedir",
                "sentir", "haber", "tener", "conocer", "saber", "hablar", "aprender", "hacer", "ver",
                "dar", "construir", "contribuir", "incluir", "distribuir", "influir", "terminar",
                "permitir", "servir", "sacar", "trabajar", "caminar", "leer", "caer", "ganar", "morir",
                "oir"};
        //endregion

        //region Verb Present Yo
        String[] verbPresentYo = {"ando", "voy", "como", "nado", "duermo", "averiguo", "canto",
                "bailo", "vuelvo", "puedo", "llevo", "limpio", "salgo", "juego", "bebo", "beso",
                "abrazo", "estudio", "encuentro", "soy", "estoy", "vengo", "digo", "pido", "siento",
                "he", "tengo", "conozco", "se", "hablo", "aprendo", "hago", "veo", "doy", "construyo",
                "contribuyo", "incluyo", "distribuyo", "influyo", "termino", "permito", "sirvo",
                "saco", "trabajo", "camino", "leo", "caigo", "gano", "muero", "oigo"};
        //endregion

        //region Verb Present Tu
        String[] verbPresentTu = {"andas", "vas", "comes", "nadas", "duermes", "averiguas", "cantas",
                "bailas", "vuelves", "puedes", "lleves", "limpias", "sales", "juegas", "bebes",
                "besas", "abrazas", "estudias", "encuentras", "es", "estás", "vienes", "dices",
                "pides", "sientes", "has", "tienes", "conoces", "sabes", "hablas", "aprendes",
                "haces", "ves", "das", "construyes", "contribuyes", "incluyes", "distribuyes",
                "influyes", "terminas", "permites", "sirves", "sacas", "trabajas", "caminas", "lees",
                "caes", "ganas", "mueres", "oyes"};
        //endregion

        //region Verb Present El
        String[] verbPresentEl = {"anda", "va", "come", "nada", "duerme", "averigua", "canta", "baila",
                "vuelve", "puede", "lleve", "limpia", "sale", "juega", "bebe", "besa", "abraza",
                "estudia", "encuentra", "es", "esta", "viene", "dice", "pide", "siente", "ha", "tiene",
                "conoce", "sabe", "habla", "aprende", "hace", "ve", "da", "construye", "contribuye",
                "incluye", "distribuye", "influye", "termina", "permite", "sirve", "saca", "trabaja",
                "camina", "lee", "cae", "gana", "muere", "oye"};
        //endregion

        //region Verb Preterite Yo
        String[] verbPreteritesYo = {"anduve", "fui", "comi", "nade", "dormi", "averigue", "cante",
                "baile", "volvi", "pude", "lleve", "limpie", "sali", "jugue", "bebi", "bese", "abrace",
                "estudie", "encontre", "fui", "estuve", "vine", "dije", "pedi", "senti", "hube",
                "tuve", "conoci", "supe", "habe", "aprendi", "hice", "vi", "di", "construi",
                "contribui", "inclui", "distribui", "influi", "termine", "permiti", "servi", "saque",
                "trabaje", "camine", "lei", "cai", "gane", "mori", "oi"};
        //endregion

        //region Verb Preterite Tu
        String[] verbPreteritesTu = {"anduviste", "fuiste", "comiste", "nadaste", "dormiste",
                "averiguaste", "cantaste", "bailaste", "volviste", "pudiste", "llevaste", "limpiaste",
                "saliste", "jugaste", "bebiste", "besaste", "abrazaste", "estudiaste", "encontraste",
                "fuiste", "estuviste", "viniste", "diciste", "pediste", "sentiste", "hubiste",
                "tuviste", "conociste", "supiste", "hablaste", "aprendiste", "hiciste", "viste",
                "diste", "construiste", "contribuiste", "incluiste", "distribuiste", "influiste",
                "terminaste", "permitiste", "serviste", "sacaste", "trabajaste", "caminaste", "leiste",
                "caiste", "ganaste", "moriste", "oiste"};
        //endregion

        //region Verb Preterite El
        String[] verbPreteritesEl = {"anduvo", "fue", "comio", "nado", "durmio", "averiguo", "canto",
                "bailo", "volvio", "pudo", "llevo", "limpio", "alio", "jugo", "bebio", "beso",
                "abrazo", "estudio", "encontro", "fue", "estuvo", "vino", "dijo", "pidio", "sintio",
                "hubo", "tuvo", "conocio", "supo", "hablo", "aprendio", "hizo", "vio", "dio",
                "construyo", "contribuyo", "incluyo", "distribuyo", "influyo", "termino", "permitio",
                "sirvio", "saco", "trabajo", "camino", "leyo", "cayo", "gano", "murio", "oye"};
        //endregion

        //region Verb Conditional Yo
        String[] verbConditionalYo = {"andaria", "iria", "comeria", "nadaria", "dormiria",
                "averiguaria", "cantaria", "bailaria", "volveria", "podria", "llevaria", "limpiaria",
                "saldria", "jugaria", "beberia", "besaria", "abrazaria", "estudiaria", "encontraria",
                "seria", "estaria", "vendria", "diria", "pediria", "sentiria", "habria", "tendria",
                "conoceria", "sabria", "hablaria", "aprenderia", "haria", "veria", "daria",
                "construiria", "contribuiria", "incluiria", "distribuiria", "influiria", "terminaria",
                "permitiria", "serviria", "sacaria", "trabajaria", "caminaria", "leeria", "caeria",
                "ganaria", "moriria", "oiria"};
        //endregion

        //region Verb Conditional Tu
        String[] verbConditionalTu = {"andarias", "irias", "comerias", "nadarias", "dormirias",
                "averiguarias", "cantarias", "bailarias", "volverias", "podrias", "llevarias",
                "limpiarias", "saldrias", "jugarias", "beberias", "besarias", "abrazarias",
                "estudiarias", "encontrarias", "serias", "estarias", "vendrias", "dirias", "pedirias",
                "sentirias", "habrias", "tendrias", "conocerias", "sabrias", "hablarias",
                "aprenderias", "harias", "verias", "darias", "construirias", "contribuirias",
                "incluirias", "distribuirias", "influirias", "terminarias", "permitirias", "servirias",
                "sacarias", "trabajarias", "caminarias", "leerias", "caerias", "ganarias", "moririas",
                "oirias"};
        //endregion

        //region Verb Conditional El
        String[] verbConditionalEl = {"andaria", "iria", "comeria", "nadaria", "dormiria",
                "averiguaria", "cantaria", "bailaria", "volveria", "podria", "llevaria", "limpiaria",
                "saldria", "jugaria", "beberia", "besaria", "abrazaria", "estudiaria", "encontraria",
                "seria", "estaria", "vendria", "diria", "pediria", "sentiria", "habria", "tendria",
                "conoceria", "sabria", "hablaria", "aprenderia", "haria", "veria", "daria",
                "construiria", "contribuiria", "incluiria", "distribuiria", "influiria", "terminaria",
                "permitiria", "serviria", "sacaria", "trabajaria", "caminaria", "leeria", "caeria",
                "ganaria", "moriria", "oiria"};
        //endregion

        //endregion

        //Scanner
        Scanner scan = new Scanner(System.in);

        //User can choose the verb tense
        System.out.println("Hello, user. Please Select the verb tense: Present, Preterite, " +
                "Conditional");

        String oldanswer = scan.next();
        String answer = oldanswer.toLowerCase();

        //Present Tense Questions
        if (answer.equals("present")) {

            // Up to ten, ask questions that only ask for conjugations. If correct, increase count
            for (int present_count = 0; present_count <= 5; present_count++) {

                Random random = new Random();
                int index = random.nextInt(verbRoots.length);

                //User can select perspective
                System.out.println("Select perspective: Yo, Tu, El");
                String oldperspective1 = scan.next();
                String perspective1 = oldperspective1.toLowerCase();


                if (perspective1.equals("stop"))
                {
                    System.exit(0);
                }
                else if (perspective1.equals("yo"))
                {
                    //Ask conjugations of present tense verb in yo form
                    System.out.println("What is the present form of " + verbRoots[index] + " for yo?");
                    String response1 = scan.next();
                    if (response1.equals(verbPresentYo[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "present form of " + verbRoots[index]);
                        System.out.println("This is your current present count: " + present_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbPresentYo[index]);
                        present_count -= 2;
                        System.out.println("This is your current present count: " + present_count);
                    }
                }

                else if (perspective1.equals("tu"))
                {
                    //Ask conjugations of present tense verb in tu form
                    System.out.println("What is the present form of " + verbRoots[index] + " for tu?");
                    String response2 = scan.next();
                    if (response2.equals(verbPresentTu[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "present form of " + verbRoots[index]);
                        System.out.println("This is your current present count: " + present_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbPresentTu[index]);
                        present_count -= 2;
                        System.out.println("This is your current present count: " + present_count);
                    }
                }

                else if (perspective1.equals("el"))
                {
                    //Ask conjugations of present tense verb in el form
                    System.out.println("What is the present form of " + verbRoots[index] + " for el?");
                    String response3 = scan.next();
                    if (response3.equals(verbPresentEl[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "present form of " + verbRoots[index]);
                        System.out.println("This is your current present count: " + present_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbPresentEl[index]);
                        present_count -= 2;
                        System.out.println("This is your current present count: " + present_count);
                    }
                }
            }

            //User is sent to the advanced level for present verbsafter six straight correct answers
            System.out.println("Welcome to the advanced level of Present Verbs");
            for (int j = 0;j<=5;j++)
            {
                //User selects perspective
                System.out.println("Please select your perspective: Yo, Tu, El");
                String oldadvancedresponse1 = scan.next();
                String advancedresponse1 = oldadvancedresponse1.toLowerCase();

                //User can opt out
                if (advancedresponse1.equals("stop"))
                {
                    System.exit(0);
                }


                else if (advancedresponse1.equals("yo"))
                {
                    //Pastes sentences and answer choices for present conjugations in yo form
                    System.out.println("Yo [verb] muy enojado.");
                    System.out.println("A. estoy, B. soy, C. voy, D. fui");
                    String oldadvancedanswer1 = scan.next();
                    String advancedanswer1 = oldadvancedanswer1.toLowerCase();
                    if (advancedanswer1.equals("soy")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                verbPresentYo[19]);

                    }
                    System.out.println("En mi casa, yo [verb] mucha comida.");
                    System.out.println("A. soy, B. fue, C. como, D. comes");
                    String oldadvancedanswer2 = scan.next();
                    String advancedanswer2 = oldadvancedanswer2.toLowerCase();
                    if (advancedanswer2.equals("como")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "como");
                    }
                    }
                    else if (advancedresponse1.equals("tu"))
                {
                    //Pastes sentences and answer choices for present conjugations in tu form
                    System.out.println("Tu [verb] un chico y tienes una familia en tu vida.");
                    System.out.println("A. estas, B. eres, C. es, D. lee");
                    String oldadvancedanswer3 = scan.next();
                    String advancedanswer3 = oldadvancedanswer3.toLowerCase();
                    if (advancedanswer3.equals("eres")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "eres");

                    }
                    System.out.println("En repuesta a mi carta, tu [verb] una carta.");
                    System.out.println("A. volves, B. vuelves, C. fuiste, D. volvio");
                    String oldadvancedanswer4 = scan.next();
                    String advancedanswer4 = oldadvancedanswer4.toLowerCase();
                    if (advancedanswer4.equals("vuelves")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "vuelves");
                    }
                }
                    else if (advancedresponse1.equals("el"))
                {
                    //Pastes sentences and answer choices for present conjugations in el form
                    System.out.println("En un piscina, usted [verb] con sus amigos.");
                    System.out.println("A. esta, B. juegue, C. nade, D. nada");
                    String oldadvancedanswer5 = scan.next();
                    String advancedanswer5 = oldadvancedanswer5.toLowerCase();
                    if (advancedanswer5.equals("nada")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "nada");

                    }
                    System.out.println("Porque usted [verb] un libro en mi dormitorio en esta hora?");
                    System.out.println("A. lees, B. lee, C. pone, D. pongo");
                    String oldadvancedanswer6 = scan.next();
                    String advancedanswer6 = oldadvancedanswer6.toLowerCase();
                    if (advancedanswer6.equals("lee")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "lee");
                    }
                }
                System.out.println("Congrats, you have finished Presents!!");

                    //Ends the program.
                    System.exit(0);
            }
        }

        //Past Tense Questions
        else if (answer.equals("preterite")) {

            //Up ot ten, ask questions that only ask for conjugations. If correct, increase count.
            for (int preterite_count = 0; preterite_count <= 5; preterite_count++) {
                Random random = new Random();
                int index = random.nextInt(verbRoots.length);

                // Select perspective
                System.out.println("Select perspective: Yo, Tu, El");
                String oldperspective2 = scan.next();
                String perspective2 = oldperspective2.toLowerCase();

                //User can opt out
                if (perspective2.equals("stop"))
                {
                    System.exit(0);
                }
                else if (perspective2.equals("yo")) {
                    //Ask conjugations of preterite verb in yo form
                    System.out.println("What is the preterite of " + verbRoots[index] + " for yo?");
                    String user1 = scan.next();

                    if (user1.equals(verbPreteritesYo[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "preterite form of " + verbRoots[index]);
                        System.out.println("This is your current preterite count: " + preterite_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbPreteritesYo[index]);
                        preterite_count -= 2;
                        System.out.println("This is your current preterite count: " + preterite_count);
                    }
                }

                else if (perspective2.equals("tu"))
                {
                    //Ask conjugations of preterite verb in tu form
                    System.out.println("What is the preterite of " + verbRoots[index] + " for tu?");
                    String user2 = scan.next();

                    if (user2.equals(verbPreteritesTu[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "preterite form of " + verbRoots[index]);
                        System.out.println("This is your current preterite count: " + preterite_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbPreteritesTu[index]);
                        preterite_count -= 2;
                        System.out.println("This is your current preterite count: " + preterite_count);
                    }
                }

                else if (perspective2.equals("el"))
                {
                    //Ask conjugations of preterite verb in el form
                    System.out.println("What is the preterite of " + verbRoots[index] + " for el");
                    String user3 = scan.next();

                    if (user3.equals(verbPreteritesEl[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "preterite form of " + verbRoots[index]);
                        System.out.println("This is your current preterite count: " + preterite_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbPreteritesEl[index]);
                        preterite_count -= 2;
                        System.out.println("This is your current preterite count: " + preterite_count);
                    }
                }
            }
            //Transports user to advanced level for preterite conjugations after six straight answers
            System.out.println("Welcome to the advanced level of Preterite Verbs");
            for (int j = 0;j<=5;j++)
            {
                System.out.println("Please select your perspective: Yo, Tu, El");
                String oldadvancedresponse2 = scan.next();
                String advancedresponse2 = oldadvancedresponse2.toLowerCase();

                //User can opt out
                if (advancedresponse2.equals("stop"))
                {
                    System.exit(0);
                }
                else if (advancedresponse2.equals("yo"))
                {
                    //Pastes sentences and answer choices, asking for preterite conjugations in yo form
                    System.out.println("En acuerdo con la opinion de mi mama, yo [verb] a su " +
                            "escuela cuando tu viviste con tu padre.");
                    System.out.println("A. fue, B. fui, C. vas, D. voy");
                    String oldadvancedanswer7 = scan.next();
                    String advancedanswer7 = oldadvancedanswer7.toLowerCase();
                    if (advancedanswer7.equals("fui")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                verbPreteritesYo[1]);

                    }
                    System.out.println("La pasada semana, yo [verb] mi abrigo con mis zapatos.");
                    System.out.println("A. llevo, B. lleviste, C. llevar, D. lleve");
                    String oldadvancedanswer8 = scan.next();
                    String advancedanswer8 = oldadvancedanswer8.toLowerCase();
                    if (advancedanswer8.equals("lleve")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "lleve");
                    }
                }
                else if (advancedresponse2.equals("tu"))
                {
                    //Pastes sentences and answer choices, asking for preterite conjugations in tu form
                    System.out.println("Por el examen hoy, tu [verb] mucho.");
                    System.out.println("A. estudias, B. estudiaste, C. estudio, D. jugaste");
                    String oldadvancedanswer9 = scan.next();
                    String advancedanswer9 = oldadvancedanswer9.toLowerCase();
                    if (advancedanswer9.equals("estudiaste")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "estudiaste");

                    }
                    System.out.println("Para ir a la escuela, tu [verb] con tus amigos.");
                    System.out.println("A. caminar, B. caminas, C. caminaste, D. camino");
                    String oldadvancedanswer10 = scan.next();
                    String advancedanswer10 = oldadvancedanswer10.toLowerCase();
                    if (advancedanswer10.equals("caminaste")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "caminaste");
                    }
                }
                else if (advancedresponse2.equals("el"))
                {
                    //Pastes sentences and answer choices, asking for preterite conjugations in el form
                    System.out.println("Por el articulo, usted lei y [verb] mucha gente.");
                    System.out.println("A. influir, B. influyes, C. influi, D. influiste");
                    String oldadvancedanswer11 = scan.next();
                    String advancedanswer11 = oldadvancedanswer11.toLowerCase();
                    if (advancedanswer11.equals("influi")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "influi");

                    }
                    System.out.println("En mi computadora, el [verb] por su familia");
                    System.out.println("A. trabajo, B. trabaje, C. trabaja, D. trabajaste");
                    String oldadvancedanswer12 = scan.next();
                    String advancedanswer12 = oldadvancedanswer12.toLowerCase();
                    if (advancedanswer12.equals("trabaje")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "trabaje");
                    }
                }
                System.out.println("Congrats, you have finished Preterites!!");

                //Ends the program
                System.exit(0);
            }
        }

        //Conditional Tense Questions
        else if (answer.equals("conditional")) {
            for (int conditional_count = 0; conditional_count <= 5; conditional_count++) {
                Random random = new Random();
                int index = random.nextInt(verbRoots.length);

                //Select perspective
                System.out.println("Select perspective: Yo, Tu, El");
                String oldperspective3 = scan.next();
                String perspective3 = oldperspective3.toLowerCase();

                //User can opt out
                if (perspective3.equals("stop"))
                {
                    System.exit(0);
                }
                else if (perspective3.equals("yo"))
                {
                    //Asks user conditional verb conjugations in yo form
                    System.out.println("What is the conditional of " + verbRoots[index] + " for yo?");
                    String user1 = scan.next();

                    if (user1.equals(verbConditionalYo[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "conditional form of " + verbRoots[index]);
                        System.out.println("This is your current conditional count: " +
                                conditional_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbConditionalYo[index]);
                        conditional_count -= 2;
                        System.out.println("This is your current conditional count: " +
                                conditional_count);
                    }
                }

                else if (perspective3.equals("tu"))
                {
                    //Ask conjugations of conditional verb in tu form
                    System.out.println("What is the conditional of " + verbRoots[index] + " for tu?");
                    String user2 = scan.next();

                    if (user2.equals(verbConditionalTu[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "conditional form of " + verbRoots[index]);
                        System.out.println("This is your current conditional count: " +
                                conditional_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbConditionalTu[index]);
                        conditional_count -= 2;
                        System.out.println("This is your current conditional count: " +
                                conditional_count);
                    }
                }

                else if (perspective3.equals("el"))
                {
                    //Ask conjugations of conditional verb in el form
                    System.out.println("What is the Conditional of " + verbRoots[index] + " for el");
                    String user3 = scan.next();

                    if (user3.equals(verbConditionalEl[index])) {
                        System.out.println("You are correct!! That is the correct conjugation for the "
                                + "conditional form of " + verbRoots[index]);
                        System.out.println("This is your current conditional count: " +
                                conditional_count);
                    } else {
                        System.out.println("You are incorrect. This is the correct answer: " +
                                verbConditionalEl[index]);
                        conditional_count -= 2;
                        System.out.println("This is your current conditional count: " +
                                conditional_count);
                    }
                }

            }
            //Transports user to advanced level for conditional conjugations after six straight answers
            System.out.println("Welcome to the advanced level of Conditional Verbs");
            for (int j = 0;j<=5;j++)
            {
                System.out.println("Please select your perspective: Yo, Tu, El");
                String oldadvancedresponse3 = scan.next();
                String advancedresponse3 = oldadvancedresponse3.toLowerCase();

                //User can opt out
                if (advancedresponse3.equals("stop"))
                {
                    System.exit(0);
                }
                else if (advancedresponse3.equals("yo"))
                {
                    //Pastes sentences and answer choices, asking for conditional conjugations in yo
                    //form.
                    System.out.println("Yo [verb] a la puerta pero yo tengo la tarea.");
                    System.out.println("A. ir, B. voy, C. vi, D. iria");
                    String oldadvancedanswer13 = scan.next();
                    String advancedanswer13 = oldadvancedanswer13.toLowerCase();
                    if (advancedanswer13.equals("iria")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "iria");

                    }
                    System.out.println("Si no hay la comida, yo [verb]");
                    System.out.println("A. moririan, B. moririamos, C. moririas, D. moriria");
                    String oldadvancedanswer14 = scan.next();
                    String advancedanswer14 = oldadvancedanswer14.toLowerCase();
                    if (advancedanswer14.equals("moriria")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "moriria");
                    }
                }
                else if (advancedresponse3.equals("tu"))
                {
                    //Pastes sentences and answer choices, asking for conditional conjugations in tu
                    //form.
                    System.out.println("Si tienes las orejas, tu [verb] a mi diccion");
                    System.out.println("A. oiria, B. oirias, C. oyen, D. oyes");
                    String oldadvancedanswer15 = scan.next();
                    String advancedanswer15 = oldadvancedanswer15.toLowerCase();
                    if (advancedanswer15.equals("oirias")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "oirias");

                    }
                    System.out.println("Cuando tu bebiste el agua, tu [verb] sin una taza.");
                    System.out.println("A. bebes, B. bebiria, C. bebia, D. bebio");
                    String oldadvancedanswer16 = scan.next();
                    String advancedanswer16 = oldadvancedanswer16.toLowerCase();
                    if (advancedanswer16.equals("beberia")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "bebiria");
                    }
                }
                else if (advancedresponse3.equals("el"))
                {
                    //Pastes sentences and answer choices, asking for conditional conjugations in el
                    //form.
                    System.out.println("Despues de un examen, el [verb] para muchas horas.");
                    System.out.println("A. estudia, B. estudio, C. estudiemos, D. estudiaria");
                    String oldadvancedanswer17 = scan.next();
                    String advancedanswer17 = oldadvancedanswer17.toLowerCase();
                    if (advancedanswer17.equals("estudiaria")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " +
                                "estudiaria");

                    }
                    System.out.println("Antes de cada ejercio, usted [verb] su mama.");
                    System.out.println("A. abrazar, B. abrazaras, C. abrazaria, D. abrazarias");
                    String oldadvancedanswer18 = scan.next();
                    String advancedanswer18 = oldadvancedanswer18.toLowerCase();
                    if (advancedanswer18.equals("abrazaria")) {
                        System.out.println("You are a Spanish whiz!!");
                    }
                    else
                    {
                        System.out.println("You are wrong. The correct answer is: " + "abrazaria");
                    }
                }
                System.out.println("Congrats, you have finished Conditionals!!");

                //Ends the program
                System.exit(0);
            }
        }

        // The end

    }
}

