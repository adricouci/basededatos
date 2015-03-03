package edu.upc.eetac.acouceiro.ejemplo;


import edu.upc.eetac.acouceiro.ejemplo.MySQLAccess;

public class Main {
  public static void main(String[] args) throws Exception {
    MySQLAccess dao = new MySQLAccess();
    dao.readDataBase();
  }

} 
