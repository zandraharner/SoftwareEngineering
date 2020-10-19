package singletonDPpackage;

public class TestGlobalSettings {
	public static void main(String[] args) {
		
		// GlobalSettings
		GlobalSettings gs = new GlobalSettings();
		System.out.println(gs);
		for (int i=0; i<=9; i++) {
			GlobalSettings gsnew = new GlobalSettings();			
			System.out.println(gsnew);
			if (gs == gsnew)
				System.out.println("Same Global Setting object");
			else 
				System.out.println("Different Global Setting object");	
		}
		
		System.out.println();		
		
		
		// StaticGlobalSettings constructor StaticGlobalSettings() is private
		// no given methods of obtaining a StaticGlobalSettings instance 
		// SingletonGlobalSetting
				// This is not allowed because constructor SingletonGlobalSettings() is private
				// SingletonGlobalSettings gsSingleton = new SingletonGlobalSettings();
				// Only getInstance() method is public and available to use
		StaticGlobalSettings gsStatic = StaticGlobalSettings.getInstance();
		System.out.println(gsStatic);
		for (int i=0; i<=9; i++) {
			StaticGlobalSettings gsnewStatic = StaticGlobalSettings.getInstance();			
			System.out.println(gsnewStatic);
			if (gsStatic == gsnewStatic)
				System.out.println("Same Eager Singleton Global Setting object");
			else 
				System.out.println("Different Eager Singleton Global Setting object");	
		}
		
		System.out.println();
		
		System.out.println();
		
		// SingletonGlobalSetting
		// This is not allowed because constructor SingletonGlobalSettings() is private
		// SingletonGlobalSettings gsSingleton = new SingletonGlobalSettings();
		// Only getInstance() method is public and available to use
		EagerSingletonGlobalSettings gsEagerSingleton = EagerSingletonGlobalSettings.getInstance();
		System.out.println(gsEagerSingleton);
		for (int i=0; i<=9; i++) {
			EagerSingletonGlobalSettings gsnewEagerSingleton = EagerSingletonGlobalSettings.getInstance();			
			System.out.println(gsnewEagerSingleton);
			if (gsEagerSingleton == gsnewEagerSingleton)
				System.out.println("Same Eager Singleton Global Setting object");
			else 
				System.out.println("Different Eager Singleton Global Setting object");	
		}
		
		System.out.println();
		
		// LazySingletonGlobalSetting
		// This is not allowed because constructor SingletonGlobalSettings() is private
		// LazySingletonGlobalSettings gsLazySingleton = new LazySingletonGlobalSettings();
		// Only getInstance() method is public and available to use
		LazySingletonGlobalSettings gsLazySingleton = LazySingletonGlobalSettings.getInstance();
		System.out.println(gsLazySingleton);
		for (int i=0; i<=9; i++) {
			LazySingletonGlobalSettings gsnewLazySingleton = LazySingletonGlobalSettings.getInstance();			
			System.out.println(gsnewLazySingleton);
			if (gsLazySingleton == gsnewLazySingleton)
				System.out.println("Same Lazy Singleton Global Setting object");
			else 
				System.out.println("Different Lazy Singleton Global Setting object");	
		}
						
		System.out.println();
		EagerSingletonGlobalSettings gs1Singleton = EagerSingletonGlobalSettings.getInstance();
		EagerSingletonGlobalSettings clonedSingleton = gs1Singleton.clone();
		System.out.println("The cloned SingletonGlobalSettings is " + clonedSingleton);
		
		System.out.println();
		LazySingletonGlobalSettings gs1LazySingleton = LazySingletonGlobalSettings.getInstance();
		LazySingletonGlobalSettings clonedLazySingleton = gs1LazySingleton.clone();
		System.out.println("The cloned LazySingletonGlobalSettings is " + clonedLazySingleton);
		
		System.out.println();
		
		// StaticGlobalSettings does not have instances
		// new method is private
		// does not have getInstance() method provided
		// The only way is to refer their methods
		// StaticGlobalSettings gs1StaticSingleton = new StaticGlobalSettings();   NOT SUPPORTED
		// No Clone method provided.
		
	}
}