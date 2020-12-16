package stringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String str ="HelloSJCET";
		StringBuilder builder = new StringBuilder(str);
		builder.append(", have a nice day");
		System.out.println(builder);

	}

}
