package challenge;
public class LogicChallenge {
    /*
    Logical Reasoning:

    What day is the fourteenth of a given month?

    I. The last day of the month is a Wednesday.
    II. The third Saturday of the month was seventeenth.
    (a) if the data in statement I alone are sufficient to answer the question;
    (b) if the data in statement II alone are sufficient to answer the question;
    (c) if the data either in I or II alone are sufficient to answer the question;
    (d) if the data even in both the statements together are not sufficient to answer the question;
    (e) if the data in both the statements together are needed;

    Each Question given below has a problem and three statements numbered I,II and III giving certain information.
    You have to decide if the information given in the statements is sufficient for answering the problem.
    Remember out of the three statements, each of them alone can also be sufficient to answer the question.
    In such cases for example, your answer should be taken as Only I or Only II or Only III and not Only I.
     */
    public void AnswerA(){
    System.out.println("Statement I should not be enough info to determine what day of the week the fourteenth day of the Month is.");
    }
    public void AnswerB(){
        System.out.println("Statement II contains enough info to determine what day of the week the fourteenth day of the Month is. (It was wednesday)");
    }
    public void AnswerC() {
        System.out.println("Since Statement II was sufficient to determine the day of the week of day 17, the answer is yes");
    }
    public void AnswerD(){
        System.out.println("Since Statement II was sufficient to determine the day of the week of day 17, a combination of Statement I and II is also sufficient... however, there are no months with 27 or 34 days in them so this month should not exist.");
    }
    public void AnswerE(){
        System.out.println("Data from both statements are ... however, there are no months with 27 or 34 days in them so this month should not exist.");
    }
}
