package job;

import emailutil.EmailUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class Job1 implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Job --->>> Time is " + new Date());
        EmailUtil.sendEmail("sonyciro@gmail.com", "Email testing subject1", "Deu certo carai!");
    }
}
