
public class BoxingProblem {
	public static void main(String[] args) {
		//只要是new
		//Integer,不管数据是多少，a==b都是false
		Integer a = new Integer(40);
		Integer b = new Integer(40);
		System.out.println(a==b); // false

		//如果不是new
	//	Integer,数据在-128~127之间时，a==b是true，否则为false
		Integer c = 127;
		Integer d = 127;
		System.out.println(c==d); // true

		Integer e = 128;
		Integer f = 128;
		System.out.println(e==f); // false
	}

}
