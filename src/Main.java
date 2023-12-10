public class Main {
    public static void main(String[] args) {

        DataBaseCompany dataBaseCompany = new DataBaseCompany ();
        dataBaseCompany.addEmpoyee ( " Иванов Владимир Михайлович ", 1, 110000 );
        dataBaseCompany.addEmpoyee ( " Романова Татьяна Анатольевна ", 2, 46000 );
        dataBaseCompany.addEmpoyee ( " Привалов Андрей Витальевич ", 1, 158000 );
        dataBaseCompany.addEmpoyee ( " Петров Иван Иванович ", 2, 122000 );
        dataBaseCompany.addEmpoyee ( " Куприянова Наталья Дмитриевна ", 1, 92000 );
        dataBaseCompany.addEmpoyee ( " Уваров Сергей Сергеевич ", 2, 58000 );
        dataBaseCompany.addEmpoyee ( " Липина Анна Андреевна ", 1, 130000 );
        dataBaseCompany.printAllInfo ();
        dataBaseCompany.printAllEmployeesFullNames ();
        dataBaseCompany.calculateSalary ();
        dataBaseCompany.minimalSalaryWorker ();
        dataBaseCompany.maximalSalaryWorker ();
        dataBaseCompany.indexSalary ();
        dataBaseCompany.averSalary ();
        dataBaseCompany.minSalary ( 1 );
        dataBaseCompany.maxSalary ( 2 );
        dataBaseCompany.departCosts ( 1 );
        dataBaseCompany.findAverageSalaryOfDepartment ( 1 );
        dataBaseCompany.indexSalaryOfDepartment ( 10, 1 );
        dataBaseCompany.printAllInformation ();
        dataBaseCompany.printAllInformationOfDepartment ( 1 );
        dataBaseCompany.findWorkersWithSalaryBelowParameter ( 45000 );
        dataBaseCompany.findWorkersWithSalaryHigherParameter ( 250000 );
    }
}

