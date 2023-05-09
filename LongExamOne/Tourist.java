interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);
    void visit(Batanes batanes);
    void visit(Siargao siargao);
    void visit(Cebu cebu);
    void visit(Ilocos ilocos);
    void visit(Palawan palawan);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };


    void checkBudget(int budget);    
}