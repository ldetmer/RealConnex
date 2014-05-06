package test.Support;



import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmailResults  {
    public Properties propEnvDetails;
    private String from = "savitabilli@resultech.com";
    private String password = "qsg@2012";
    private String to = "savitabilli@qsgsoft.com";
    private String cc = "anusha@qsgsoft.com";
    private String subject = "Smoke Execution Result";
    ArrayList<String> failedTests = new ArrayList<String>();
    static Properties properties = new Properties();
    static
    {
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class",
                "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.port", "465");
    }

    /*public boolean sendMail() throws Exception {
        EnvironmentProperty objReadEnvironment = new EnvironmentProperty();
        propEnvDetails = objReadEnvironment.QaPropertiesPath();
        boolean blnStatus = false;
        int intResultArr[] = new int[3];
        try
        {
            Session session = Session.getDefaultInstance(properties,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication
                        getPasswordAuthentication() {
                            return new
                                    PasswordAuthentication(from, password);
                        }});

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(cc));
            message.setSubject(subject);

            String emailBody = "";
            String headerMessage="";
            String testExecutedOn = DateTimeFunctions.getCurrentDate("dd-MMM-yyyy");
            ReadData objReadData =new ReadData();
            intResultArr = objReadData.getResultSheetData();
            int cntSkipped = Integer.parseInt(propEnvDetails.getProperty("TotalTests")) + intResultArr[0];
            List<String> failedTestsStoryList = ReadData.gStrfailedTestsUserStory;
            List<String> failedTestscasesList = ReadData.gStrfailedTestsScenario;
            //If any TestCases are Fail
            if (failedTestscasesList.size() > 0){
                for (int i=0; i < failedTestscasesList.size();i++){
                    emailBody = emailBody.concat((i+1)+".  "+failedTestsStoryList.get(i)+"\t\t\t\t "+failedTestscasesList.get(i)+"\n");
                }
                headerMessage= "\nTest Executed On:  "+ (testExecutedOn) +
                        "\n\n Total TestCases:  "+intResultArr[0]+"\t\tPassed:  "+intResultArr[1]+"\t\tFailed:  "+intResultArr[2]+"\t\tSkipped:  "+cntSkipped+" \n\n " +
                        " =================== \t Failed Test cases \t =================== \n\n Story Id \t\t\t\t Scenario Id \n" ;
            }
            else{
                headerMessage = " =================== \t All The Test cases Passed \t =================== \n \n";
                emailBody = "\nTest Executed On:  "+ (testExecutedOn) +
                        "\n\n Total TestCases:  "+intResultArr[0]+"\t\tPassed:  "+intResultArr[1]+"\t\tFailed:  "+intResultArr[2]+"\t\tSkipped:  "+cntSkipped+" \n\n " ;
            }
            message.setText(headerMessage + emailBody + " \n\n========== ========== ========== ========== ========== ==========");
            Transport.send(message);
            blnStatus = true;
        }
        catch(Exception e)
        {
            blnStatus =false;
            e.printStackTrace();
        }
        return blnStatus;
    }*/
}


