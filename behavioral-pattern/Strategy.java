interface Strategy {
       int execute(int a, int b);
   }
   
   class AddStrategy implements Strategy {
       public int execute(int a, int b) {
           return a + b;
       }
   }
   
   class SubtractStrategy implements Strategy {
       public int execute(int a, int b) {
           return a - b;
       }
   }
   
   class Context {
       private Strategy strategy;
       
       public Context(Strategy strategy) {
           this.strategy = strategy;
       }
       
       public int executeStrategy(int a, int b) {
           return strategy.execute(a, b);
       }
   }