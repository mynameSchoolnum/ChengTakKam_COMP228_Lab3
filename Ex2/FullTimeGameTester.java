class FullTimeGameTester extends GameTester {

    public FullTimeGameTester(String name) {
        super(name, true);
    }

    public double determineSalary() {
        return 3000.0;
    }
}