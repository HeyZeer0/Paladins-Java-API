# Paladins Java API <img align="right" src="https://hzweb.hi-rezgame.net/paladins-web/wp-content/uploads/2016/06/cropped-2016-06-03-192x192.png" height="192" width="192">
[![Build Status](http://ci.heyzeer0.cf/buildStatus/icon?job=Paladins%20Java%20API)](http://ci.heyzeer0.cf/job/Paladins%20Java%20API/) [![Version](https://api.bintray.com/packages/heyzeer0/maven/Paladins-Java-API/images/download.svg)]()</br>
This is a simple wrapper for HiRez paladins API.</br>
This project is in a Working in Progress status and more functions will be added soon.

Maven
========
Don't forget to add jcenter repository ;)
```maven
<dependency>
  <groupId>net.heyzeer0.papi</groupId>
  <artifactId>PaladinsAPI</artifactId>
  <version>1.0.0_8</version>
</dependency>
```


Usage example
========
```java
    public class Example {

        public static PaladinsAPI api = new PaladinsAPI("your dev_id", "your_dev_key", Platform.PC);
        //                                               ^ dev_id       ^ dev_key      ^ Platform#PC/XBOX/PS4

        public static void main(String args[]) {
            //getting a player info
            try{
                PaladinsPlayer p = api.getRequestManager().requestPlayer("HeyZeer0");
                System.out.println("User: " + p.getName() + " | ID: " + p.getID() + " | Level: " + p.getLevel());
                System.out.println("Wins: " + p.getWins() + " | Losses: " + p.getLosses() + " | Leaves: " + p.getLeaves());
                System.out.println("Join date: " + p.getJoinDate() + " | Last login: " + p.getLastLogin());
                /// and others
            }catch (UnknowPlayerException e) {
                System.out.print("There is no player with that nick");
            }catch (SessionException e) {
                System.out.println("An error ocurred while trying to create the session: " + e.getLocalizedMessage());
            }catch (Exception e) {
                e.printStackTrace();
            }

            //applying a created session
            //Use: if your program restart, you can simple save your actual key and use it when restarts, respecting the 15m time limit
            try{
                api.getRequestManager().applySession("your_key");
            }catch (SessionException e) {
                System.out.println("An error ocurred while trying to create the session: " + e.getLocalizedMessage());
            }catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
```

Paladins Logo is over copyright © by HiRez Studios so it is not my property.
