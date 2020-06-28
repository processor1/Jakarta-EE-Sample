/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irg.jms.demos;


import javax.ejb.Singleton;
import javax.ejb.Startup;

import javax.jms.Queue;
import javax.jms.JMSContext;

import javax.inject.Inject;

import javax.annotation.Resource;
import javax.annotation.PostConstruct;

/**
 *
 * @author Mobile Apps
 */

@Singleton
@Startup
public class JmsDemo {
    
    @Resource(lookup="jms/myQueue")
    private Queue  myQueue;
    
    @Inject
    private JMSContext context;
    
    @PostConstruct
    public void postMessage(){
        String sime_message="Simple Jms Queue Message";
        context.createProducer().send(myQueue,sime_message);
        System.out.println("**************");
        System.out.println("Message Sent");
        System.out.println("**************");
    }
}
