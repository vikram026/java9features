package com.nisum.java9Features.trywithresourcesenhancements;

import java.util.logging.Logger;


public class TryWithResourceApp {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public static void preJDK7()
    {
         MyResources r=null;
         try
         {
             r=new MyResources();
             r.doProcess();
             }
         catch (Exception e)
         {
             log.info("Handling:"+e);
         }
         finally
         {
             try
             {
                    if (r!=null)
                    {
                          r.close();
                    }
             }
             catch (Exception e)
             {
                 log.info("Handling:"+e);
             }
         }
    }
    public static void JDK7()
    {
         try(MyResources r=new MyResources())
         {
             r.doProcess();
         }
         catch(Exception e)
         {
             log.info("Handling:"+e);
         }
    }
     public static void JDK9()
    {
        MyResources r= new MyResources();
        try(r)
        {
             r.doProcess();
        }
         catch(Exception e)
         {
             log.info("Handling:"+e);
         }
    }
 public static void multipleJDK9()
 {
         MyResources r1= new MyResources();
         MyResources r2= new MyResources();
         MyResources r3= new MyResources();
         MyResources r4= new MyResources();
         try(r1;r2;r3;r4)
         {
            r1.doProcess();
            r2.doProcess();
            r3.doProcess();
            r4.doProcess();
         }
        catch(Exception e)
        {
            log.info("Handling:"+e);
        }
 }
 public static void main(String[] args)
 {

    log.info("Program Execution With PreJDK7");

    preJDK7();

    log.info("Program Execution With JDK7");
    JDK7();

    log.info("Program Execution With JDK9");
    JDK9();

    log.info("Program Execution Multiple Resources With JDK9");
    multipleJDK9();
         }
 }
