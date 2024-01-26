public class Online extends Course{
    public String link;

    public Online(String title, String crn, int cap, String link) {
        super(title, crn, cap);
        this.link = link;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // 使用 super 调用父类方法
        System.out.println("link: " + link);
    }
}
