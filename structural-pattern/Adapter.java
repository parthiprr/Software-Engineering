interface Target {
       void request();
   }
   
   class Adaptee {
       public void specificRequest() {
           System.out.println("Adaptee's specific request");
       }
   }
   
   class Adapter implements Target {
       private Adaptee adaptee;
       
       public Adapter(Adaptee adaptee) {
           this.adaptee = adaptee;
       }
       
       public void request() {
           adaptee.specificRequest();
       }
   }