package com.ivaneye.singleton;

public class App {

  public static void main(String[] args) {
    HungrySingleton hungrySingleton = HungrySingleton.getInstance();
    HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
    System.out.println("ivoryTower1={}" + hungrySingleton);
    System.out.println("ivoryTower2={}" + hungrySingleton1);

    LazySingleton lazySingleton = LazySingleton.getInstance();
    LazySingleton lazySingleton1 = LazySingleton.getInstance();
    System.out.println("threadSafeIvoryTower1={}" + lazySingleton);
    System.out.println("threadSafeIvoryTower2={}" + lazySingleton1);

    EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
    EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
    System.out.println("enumIvoryTower1={}" + enumSingleton);
    System.out.println("enumIvoryTower2={}" + enumSingleton1);

    DCLSingleton dclSingleton = DCLSingleton.getInstance();
    System.out.println(dclSingleton.toString());
    DCLSingleton dclSingleton1 = DCLSingleton.getInstance();
    System.out.println(dclSingleton1.toString());

    HolderSingleton holderSingleton = HolderSingleton.getInstance();
    System.out.println(holderSingleton.toString());
    HolderSingleton holderSingleton1 = HolderSingleton.getInstance();
    System.out.println(holderSingleton1.toString());
  }
}
