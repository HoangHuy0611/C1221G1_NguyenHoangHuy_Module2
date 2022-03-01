package ss10_dsa_danh_sach.thuc_hanh.trien_khai_lop_linkedlist_don_gian;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.add(3,8);
        ll.add(3,8);
        ll.printList();
    }
}
