package cn.myphoenix.timer;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

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
    public void execute() throws MojoExecutionException, MojoFailureException {
        this.getLog().info("现在是北京时间：" + LocalDateTime.now());
    }
}
