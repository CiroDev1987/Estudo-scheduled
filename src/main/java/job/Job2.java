package job;

import emailutil.EmailUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class Job2 implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Job2 --->>> Time is " + new Date());
        EmailUtil.sendEmail("sonyciro@gmail.com", "Email testing subject2", "Email testing body2");
    }
}
