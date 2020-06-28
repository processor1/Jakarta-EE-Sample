/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irg.jms.demos;

import javax.ejb.Singleton;
import javax.ejb.Startup;

import javax.jms.*;
import javax.inject.Inject;
import javax.annotation.Resource;
import javax.annotation.PostConstruct;
import javax.ejb.SessionContext;
import javax.ejb.TimerConfig;

/**
 *
 * @author Mobile Apps
 */
@Singleton
@Startup
public class JmsTopicDemo {

    @Resource(lookup = "jms/myTopic")
    private Topic topic;
    @Inject
    private JMSContext jmsContext;
    @Resource
    private SessionContext context; // needed for the timer

    @PostConstruct
    public void go() {
        
        context.getTimerService().createSingleActionTimer(5000, new TimerConfig());
    }
}
