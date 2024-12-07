package cn.myphoenix.timer;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 时间提醒器
 *
 * @author: larry_lwh
 * @date: 2024-12-06 21:09
 * @description: 时间提醒 Mojo
 **/
@Mojo(name = "timer", defaultPhase = LifecyclePhase.VALIDATE)
public class TimerMojo extends AbstractMojo {

    /**
     * timeType = dateTime，则控制台显式日期时间
     * timeType = date，则控制台只显示日期
     */
    @Parameter(property = "timeType", defaultValue = "dateTime")
    private String timeType;

    public void execute() throws MojoExecutionException, MojoFailureException {
        if ("dateTime".equals(timeType)) {
            this.getLog().info("现在是北京时间：" + LocalDateTime.now());
        } else if ("date".equals(timeType)) {
            this.getLog().info("现在是：" + LocalDate.now());
        } else {
            this.getLog().info("现在是北京时间：" + LocalDateTime.now());
        }
    }
}
