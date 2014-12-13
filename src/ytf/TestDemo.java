package ytf;

public class TestDemo {

	private Test test;

	public TestDemo(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return test.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Skywalker";
		String id = "534243196312307654";
		TestDemo testDemo = new TestDemo(new TestDemo.Test(name, id));
		System.out.println(testDemo.toString());
	}

	public static class Test {
		String name;
		String id;

		public Test(String name, String id) {
			this.name = name;
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public String toString() {
			return "Test [name=" + name + ", id=" + id + "]";
		}
	}

}
