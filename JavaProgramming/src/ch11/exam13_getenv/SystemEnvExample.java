package ch11.exam13_getenv;

public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("[JAVA_HOME] "+javaHome);
	}
}
