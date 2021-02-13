package com.ivaneye.singleton;

public class App {

  public static void main(String[] args) {
    HungrySingleton ivoryTower1 = HungrySingleton.getInstance();
    HungrySingleton ivoryTower2 = HungrySingleton.getInstance();
    System.out.println("ivoryTower1={}" + ivoryTower1);
    System.out.println("ivoryTower2={}" + ivoryTower2);

    LazySingleton threadSafeIvoryTower1 = LazySingleton.getInstance();
    LazySingleton threadSafeIvoryTower2 = LazySingleton.getInstance();
    System.out.println("threadSafeIvoryTower1={}" + threadSafeIvoryTower1);
    System.out.println("threadSafeIvoryTower2={}" + threadSafeIvoryTower2);

    EnumSingleton enumIvoryTower1 = EnumSingleton.INSTANCE;
    EnumSingleton enumIvoryTower2 = EnumSingleton.INSTANCE;
    System.out.println("enumIvoryTower1={}" + enumIvoryTower1);
    System.out.println("enumIvoryTower2={}" + enumIvoryTower2);

    DCLSingleton dcl1 = DCLSingleton.getInstance();
    System.out.println(dcl1.toString());
    DCLSingleton dcl2 = DCLSingleton.getInstance();
    System.out.println(dcl2.toString());

    HolderSingleton demandHolderIdiom = HolderSingleton.getInstance();
    System.out.println(demandHolderIdiom.toString());
    HolderSingleton demandHolderIdiom2 = HolderSingleton.getInstance();
    System.out.println(demandHolderIdiom2.toString());
  }
}
