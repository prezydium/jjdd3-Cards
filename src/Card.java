public class Card {

    Suits suite;

    Ranks rank;

    public Suits getSuite() {
        return suite;
    }

    public void setSuite(Suits suite) {
        this.suite = suite;
    }

    public Ranks getRank() {
        return rank;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }


    public void getDescription(){
        System.out.println(rank + " - " + suite);
    }

    public Card (){

    }

    public Card(Suits suite, Ranks rank){
      this.suite = suite;
      this.rank = rank;
    }

}
