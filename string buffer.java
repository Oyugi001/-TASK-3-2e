public class String buffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("study");
		System.out.println(sb);
		// modifying object
		sb.append("tonight");
		System.out.println(sb);    // Output: studytonight

	}
}
