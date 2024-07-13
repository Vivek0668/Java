package Abstract;

public  class Son extends Parent{
    @Override
    void partner() {

        System.out.println("i want to date mikasa");

    }
    @Override
    void career() {
        System.out.println("I want to be a coder");

    }
    Son(int age) {
        super(age);
    }
    @Override
    void age() {
        System.out.println("the age of the son is :" + super.age);

    }


}
