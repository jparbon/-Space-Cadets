package byui.cit260.returnToRexburg.model;

public enum Trophy {
    Trophy1("This is a description of Trophy1"),
    Trophy2("This is a description of Trophy2"),
    Trophy3("This is a description of Trophy3"),
    Trophy4("This is a description of Trophy4"),
    Trophy5("This is a description of Trophy5");

    private String description;

    Trophy(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}