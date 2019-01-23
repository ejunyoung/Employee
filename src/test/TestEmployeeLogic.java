package test;

public class TestEmployeeLogic {
	
	EmpBusinessLogic empBL = new EmpBusinessLogic();
	Employee employee = new Employee("Ryan");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateAppraisal() {
		employee.setMonthlySalary(8000);
		double appraisal = empBL.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}

	@Test
	public void testCalculateYearlySalary() {
		employee.setMonthlySalary(8000);
		double salary = empBL.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}

}