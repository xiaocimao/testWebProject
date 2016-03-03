package test;

public class Test {

	public static void main(String[] args) {
		String string = "-1,;892,开磷;893,贵化";
		String[] brandArrays = string.split(";");
		for (String str : brandArrays) {
			if (str.indexOf(",") != -1) {
				String[] singleBrandArray = str.split(",");
				if (null != singleBrandArray && singleBrandArray.length == 2) {
					// if(null!=singleBrandArray && singleBrandArray.length==2){
					System.out.println(singleBrandArray[0]);
					System.out.println(singleBrandArray[1]);
				}
				
				// }
			}
		}

	}

	// public static void main(String[] args) {
	// User user1 = new User(2, "xx");
	// User user2 = new User(1, "cc");
	// User user3 = new User(1, "bb");
	// User user4 = new User(1, "zz");
	// List<User> array = new ArrayList<User>();
	// array.add(user1);
	// array.add(user2);
	// array.add(user3);
	// array.add(user4);
	// final boolean reverse = false;
	// Collections.sort(array, new Comparator<User>() {
	// @Override
	// public int compare(User o1, User o2) {
	// if (true) {
	// return o1.getId() - o2.getId() >= 0 ? -1 : 0;
	// } else {
	// return o1.getId() - o2.getId() <= 0 ? -1 : 0;
	// }
	// }
	// });
	// Collections.sort(array, new Comparator<User>() {
	// @Override
	// public int compare(User o1, User o2) {
	// if (true) {
	// return o1.getId() - o2.getId() >= 0 ? -1 : 0;
	// } else {
	// return o1.getId() - o2.getId() <= 0 ? -1 : 0;
	// }
	// }
	// });
	// for (User user : array) {
	// System.out.println(user.getId() + ";" + user.getName());
	// }
	//
	// }
	// public static void main(String[] args) throws ParseException {
	// DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	// DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//
	// String dateStr="2015-11-26";
	// String dateStr1="2015-11-26 20:00:13";
	// System.out.println(dateFormat.parse(dateStr));
	// System.out.println(dateFormat1.parse(dateStr1));
	// Long number = new Long( 2 );
	// System.out.println(number.intValue() != 2);
	// }
	// public static void main(String[] args) {
	// Set<User> set = new TreeSet<User>(new Comparator<User>() {
	// @Override
	// public int compare(User o1, User o2) {
	// return o1.getId() == o2.getId() ? 0 : 1;
	// }
	// });
	// User user = new User();
	// user.setId(908);
	// user.setName("中国农资");
	//
	// User user1 = new User();
	// user1.setId(908);
	// user1.setName("你大爷");
	//
	//// User user2 = new User();
	//// user2.setId(1);
	//// user2.setName("aaa");
	////
	//// User user3 = new User();
	//// user3.setId(3);
	//// user3.setName("ccc");
	////
	//// User user4 = new User();
	//// user4.setId(4);
	//// user4.setName("eee");
	////
	//// User user5 = new User();
	//// user5.setId(5);
	//// user5.setName("ddd");
	// set.add(user);
	// set.add(user1);
	//
	//// set.add(user2);
	//// set.add(user3);
	//// set.add(user4);
	//// set.add(user5);
	//// Collections.sort(set);
	// for (User userT : set) {
	// System.out.println(userT.getId() + ";" + userT.getName());
	// }
	// }
	// public static void main(String[] args) {
	//
	// Double doubleValue=Double.parseDouble("1.6000000");
	// System.out.println(doubleValue);
	// System.out.println(BigDecimal.valueOf(doubleValue));
	// System.out.println(new BigDecimal(doubleValue));
	// Object obj=null;
	// Object[] array=new Object[1];
	// array[0]=new Integer(3);
	// Integer haha=(Integer) array[0];
	// System.out.println(array[0] instanceof Integer);
	// System.out.println(array[0]);
	// Integer number=(Integer)obj;
	// System.out.println(number);
	// }
}

class User {
	private int id;
	private String name;

	public User() {
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
