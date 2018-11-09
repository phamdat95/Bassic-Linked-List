public class MyListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyList<String> ll = new MyList<>();
        ll.addFirst("dat");
        ll.addFirst("hai");
        ll.addFirst("dat");
        ll.addLast("aaa");
        ll.addLast("das");
        ll.addFirst("sxam");
        ll.add(3,"ff");
        ll.print();
        System.out.println();
        System.out.println(ll.get(2));
    }
}
