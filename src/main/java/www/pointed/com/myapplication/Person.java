package www.pointed.com.myapplication;


/**
 * Created by ivan on 14/02/2014.
 * <p/>
 * The data item class
 */
public class Person {

  private String name;
  private String phoneNumber;
  private int resDrawableId;

  public Person() {

  }

  public Person(String name, String phoneNumber, int resDrawableId) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.resDrawableId = resDrawableId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getResDrawableId() {
    return resDrawableId;
  }

  public void setResDrawableId(int resDrawableId) {
    this.resDrawableId = resDrawableId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (resDrawableId != person.resDrawableId) return false;
    if (name != null ? !name.equals(person.name) : person.name != null) return false;
    return !(phoneNumber != null ? !phoneNumber.equals(person.phoneNumber) : person.phoneNumber != null);

  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
    result = 31 * result + resDrawableId;
    return result;
  }
}