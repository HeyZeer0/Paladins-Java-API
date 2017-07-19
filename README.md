# Paladins Java API - WIP
This is a simple wrapper for HiRez paladins API.
This project is in a Working in Progress status and more functions will be added soon.

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