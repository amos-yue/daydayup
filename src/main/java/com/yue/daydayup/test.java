package com.yue.daydayup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * author: yue
 * date: 2017/11/07
 * description:
 */
public class test {
    private static Session session;

    public static Session getSession(){
        ApplicationContext appContext=new FileSystemXmlApplicationContext("classpath:hibernate.cfg.xml");
        if(appContext==null){
            System.out.println("appContext is null");
            return null;
        }
        SessionFactory sessionFactory=(SessionFactory) appContext.getBean("sessionFactory");
        if (sessionFactory==null){
            System.out.println("sessionFactory is null");
            return null;
        }
        session=sessionFactory.openSession();
        return session;
    }
    public static void main(String[]args){
        getSession();
        if (session==null){
            System.out.println("error");
            return;
        }

    }

}
