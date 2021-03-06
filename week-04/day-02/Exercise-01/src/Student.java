/**
 * Created by zsuzsanna.padar on 2017. 04. 04..
 */
public class Student extends Person {
  private  String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a" + this.getAge() + " year old" + this.getGender() + "," +
            previousOrganization +
            " to The" +
            " School of Life," + "skipped" + skippedDays + 0 + "days.");
  }

  public void skipDays (int numberOfDays) {
    this.skippedDays += numberOfDays;
  }

  Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  Student() {
    super();
    previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

}
