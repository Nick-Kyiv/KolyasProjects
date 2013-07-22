package my;

public class Company {
    private String companyName;
    private String type;
    private Worker[] workers;
    private double sumSalaryOfWorkersInThatCompanyIs;
    private double arithmeticalMeanOfSalaryOfWorkersInThatCompanyIs;

    public void changeMinAndMax() {
        int iMax = 0, iMin = 0;
        for (int j = 0; j < workers.length; j++) {
            if (workers[iMax].getSalary() < workers[j].getSalary()) {
                iMax = j;
            }
            if (workers[iMin].getSalary() > workers[j].getSalary()) {
                iMin = j;
            }
        }
        long tmp = workers[iMax].getSalary();
        workers[iMax].setSalary(workers[iMin].getSalary());
        workers[iMin].setSalary(tmp);
    }

}
