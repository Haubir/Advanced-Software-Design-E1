package SocialCare;

public class Preference {
    private int age;
    private String gender;
    private int duration;
    private long time;

    public Preference(int age, String gender, int duration, long time) {
        this.age = age;
        this.gender = gender;
        this.duration = duration;
        this.time = time;
    }

    public int getAge() {
	    return this.age;
    }

    public String getGender() {
	    return this.gender;
    }

    public int getDuration() {
	    return this.duration;
    }

    public long getTime() {
	    return this.time;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
