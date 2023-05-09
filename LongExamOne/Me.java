public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("Checking budget...");
        System.out.println("my budget is " + budget);

        if (budget > boracay.airFare) {
        budget = budget - boracay.airFare;
        System.out.println(budget);
        System.out.print("Arrived at Boracay, Getting a tan!"); 
        System.out.println( );

        } else {
            System.out.println("Sorry, you don't have enough budget.");
            System.out.println( );
         }
        }

    public void visit(Batanes batanes) {
        System.out.println("");
        System.out.println("Checking budget...");
        System.out.println("my budget is " + budget);

        if (budget > batanes.airFare) {
        budget = budget - batanes.airFare;
        System.out.println(budget);
        System.out.print("Arrived at Batanes, Visiting Honesty Store!"); 
        System.out.println( );

        } else {
            System.out.println("Sorry, you don't have enough budget.");
            System.out.println( );
         }
        }

    public void visit(Cebu cebu) {
        System.out.println();
        System.out.println("Checking budget...");
        System.out.println("my budget is " + budget);

        if (budget > cebu.airFare) {
        budget = budget - cebu.airFare;
        System.out.println(budget);
        System.out.print("Arrived at Cebu! brb, Attending Sinulog Festival!"); 
        System.out.println( );

        } else {
            System.out.println("Sorry, you don't have enough budget.");
            System.out.println( );
         }
        }
    public void visit(Ilocos ilocos) {
        System.out.println();
        System.out.println("Checking budget...");
        System.out.println("my budget is " + budget);

        if (budget > ilocos.airFare) {
        budget = budget - ilocos.airFare;
        System.out.println(budget);
        System.out.print("Arrived at Ilocos! Gotta ride 4x4 Jeep"); 
        System.out.println( );

        } else {
            System.out.println("Sorry, you don't have enough budget.");
            System.out.println( );
         }
        }
    public void visit(Palawan palawan) {
        System.out.println();
        System.out.println("Checking budget...");
        System.out.println("my budget is " + budget);

        if (budget > palawan.airFare) {
        budget = budget - palawan.airFare;
        System.out.println(budget);
        System.out.print("Arrived at Palawan! Discovering different islands"); 
        System.out.println( );

        } else {
            System.out.println("Sorry, you don't have enough budget.");
            System.out.println( );
         }
        }

    public void visit(Siargao siargao) {
        System.out.println();
        System.out.println("Checking budget...");
        System.out.println("my budget is " + budget);

        if (budget > siargao.airFare) {
        budget = budget - siargao.airFare;
        System.out.println(budget);
        System.out.print("Arrived at Siargao! Conquering my fear, let's go cliff jumping"); 
        System.out.println( );

        } else {
            System.out.println("Sorry, you don't have enough budget.");
            System.out.println( );
         }
        }
   
    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }
}

