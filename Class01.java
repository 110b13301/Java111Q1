class area {
	public static double pi=3.14;
	public static void Cal_area(int r) {
		System.out.println("半徑="+r);
		System.out.println("球型體積="+4/3*pi*Math.pow(r, 3));
	}
	public static void Cal_area(int l, int w, int h) {
		System.out.println("長="+l+",寬="+w+"高="+h);
		System.out.println("立方體表面積="+2*(l*w+w*h+h*l));
	}
}
public class Class01 {
	public static void main(String[] args) {
		area a=new area();
		a.Cal_area(10);
		a.Cal_area(4, 5, 6);
	}
}