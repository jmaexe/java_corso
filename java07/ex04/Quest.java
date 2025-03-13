public class Quest {

    private double experience;
    private double difficulty;
    private String name;

    public Quest(String name,double difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

   public void complete() {
    if(validate()) {
        this.experience = difficulty * 100;
        System.out.println("Quest: "+name+" completed! +" + this.experience + " exp");
    } else {
        System.out.println("Quest: "+name+" failed");
    }
   }
    protected boolean validate() {
    return true;
   }
}