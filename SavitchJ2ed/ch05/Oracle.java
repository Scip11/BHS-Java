public class Oracle
{
    private String oldAnswer = "The answer is in your heart.";
    private String newAnswer;
    private String question;

    public void dialog()
    {
       char ans;
       do
        {
            answerOne();
            System.out.println("Do you wish to ask another question? (y/n)");
            ans = SavitchIn.readLineNonwhiteChar();
        } while ((ans != 'n') && (ans != 'N'));

        System.out.println("The oracle will now rest.");
    }

    private void answerOne()
    {
        System.out.println("I am the oracle.");
        System.out.println("I will answer any one-line question.");
        System.out.println("What is your question?");
        question = SavitchIn.readLine();
        seekAdvice();
        System.out.println("You asked the question:");
        System.out.println(question);
        System.out.println("Now, here is my answer:");
        System.out.println(oldAnswer);
        update();
    }

    private void seekAdvice()
    {
        System.out.println("Hmm, I need some help on that.");
        System.out.println("Please give me one line of advice.");
        newAnswer = SavitchIn.readLine();
        System.out.println("Thank you. That helped a lot.");
    }

    private void update()
    {
        oldAnswer = newAnswer;
    }
}