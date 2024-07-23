public class Main{
    public static void main(String[] args){
        /* LL list=new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(17);
        list.insertFirst(8);
        list.insertLast(1);
        list.insert(100,3);
        list.display(); 
       // System.out.println(list.deleteFirst());
        //System.out.println(list.deleteLast());
        System.out.println(list.delete(2));
        System.out.println(list.find(3));
        list.display(); */
       /*  DLL list=new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(17);
        list.insertFirst(8);
       list.insertLast(1);
        list.insertFirst(100);
        list.insert(100,65);
        list.display(); 
         */
       // System.out.println(list.deleteFirst());
        //System.out.println(list.deleteLast());
      //  System.out.println(list.delete(2));
        //System.out.println(list.find(3));
        // list.display();
        CLL list=new CLL();
        list.insert(3);
        list.insert(2);
        list.insert(17);
        list.insert(8);
       list.insert(1);
        list.insert(100);
        list.insert(65);
        list.display(); 
        list.delete(17);
        list.display(); 

        


    }
}