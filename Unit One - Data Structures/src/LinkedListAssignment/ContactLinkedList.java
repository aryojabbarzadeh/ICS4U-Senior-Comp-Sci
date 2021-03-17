package LinkedListAssignment;

public class ContactLinkedList {
    private ContactNode head;
  
    public ContactLinkedList() {
      this.head = null;
    }
<<<<<<< HEAD
  /**
   * //adds a contact
   * @param c
   */
    public void add(Contact c) {  
=======
  
    public void add(Contact c) {  //adds a contact
>>>>>>> 5c173dbad9514d695e2b5e9f52e7929af0d4a338
      ContactNode node = new ContactNode(c, null);
      if (head == null)
        head = node;
      else {
        // iterate to the end and add it there
        ContactNode ptr = head;
        while (ptr.getLink() != null) {
          ptr = ptr.getLink();
        }
  
        ptr.setLink(node);
      }
    }
<<<<<<< HEAD
  /**
   * //remove a contact
   * @param phone
   */
    public void remove(String phone) { 
=======
  
    public void remove(String phone) { //remove a contact
>>>>>>> 5c173dbad9514d695e2b5e9f52e7929af0d4a338
      if (head == null)
        return;
      else if (head.getData().getPhone().equals(phone))
        head = head.getLink();
      else {
        ContactNode ptr = head;
        while (ptr.getLink() != null && !ptr.getLink().getData().getPhone().equals(phone)) { //searches for the phone number
          ptr = ptr.getLink();
        }
        if (ptr.getLink() == null)
          return;
        else
          ptr.setLink(ptr.getLink().getLink());
      }
  
    }

<<<<<<< HEAD
  /**
   * searches for a specific contact
   * @param lName
   */

    public void search (String lName){ 
=======
    public void search (String lName){ //searches for a specific contact
>>>>>>> 5c173dbad9514d695e2b5e9f52e7929af0d4a338
        ContactNode ptr = head;
        while(ptr !=null){
            if (ptr.getData().getlName().equals(lName)){
                System.out.println(ptr.getData().toString()); 
                ptr = ptr.getLink(); //iterates through
            }else{
                ptr = ptr.getLink(); //iterates through
            }
            }

        }
    
    /**
     * prints contact
     * @param list
     */
    public static void printList(ContactLinkedList list) 
    { //prints contact
        ContactNode ptr = list.head; 
    
        System.out.print("Contacts: \n"); 
    
        // Traverse through the LinkedList 
        while (ptr != null) { 
            
            System.out.print(ptr.data + " "); 
    
             
            ptr = ptr.getLink(); 
        } 
    } 
}
  
  
  
