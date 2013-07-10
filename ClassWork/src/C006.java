// агрегация композиция
public class C006 {
    public static void main(String[] args) {
        Worker w0 = new Worker();
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Worker w3 = new Worker();
        Worker w4 = new Worker();
        Worker w5 = new Worker();

        Worker[] ws0 = {w0, w1}, ws1 = {w2}, ws2 = {w3, w4, w5};

        Company c0 = new Company();
        c0.workers = ws0;
        c0.companyName = "Haloo!";
        w0.salary = 12345;
        w1.salary = 12222222;
        Company c1 = new Company();
        c1.workers = ws1;
        c1.companyName = "Ciao!";
        w2.salary = 1000000000;
        Company c2 = new Company();
        c2.workers = ws2;
        c2.companyName = "Catcha!";
        w3.salary = 657;
        w4.salary = 665;
        w5.salary = 566;

        Company[] cs = {c0, c1, c2};

        for (int i = 0; i < cs.length; i++) {
            cs[i].sumSalaryOfWorkersInThatCompanyIs = 0;
            for (int j = 0; j < cs[i].workers.length; j++) {
                cs[i].sumSalaryOfWorkersInThatCompanyIs += cs[i].workers[j].salary;
            }
        }

        int maxQuantityWorkersInCompanyIs = cs[0].workers.length, iMaxQuantityWorkersInCompanyIs = 0;
        for (int i = 0; i < cs.length; i++) {
            if (maxQuantityWorkersInCompanyIs <= cs[i].workers.length) {
                maxQuantityWorkersInCompanyIs = cs[i].workers.length;
                iMaxQuantityWorkersInCompanyIs = i;
            }
        }
        System.out.println("maxQuantityWorkersInCompanyIs " + maxQuantityWorkersInCompanyIs + " in \"" + cs[iMaxQuantityWorkersInCompanyIs].companyName + "\" company.");
    }
}

