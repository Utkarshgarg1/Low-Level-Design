package patterns.behavioral.strategy;

public class Context {
    private Route route;
    Context (Route route){
        this.route = route;
    }

    void setRoute(Route route){
        this.route = route;
    }

    void buildRoute(){
        route.buildRoute();
    }
}
