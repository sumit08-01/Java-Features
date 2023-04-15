package com.question;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		EmployeeService employeeService = new EmployeeService();
		long count = employeeService.getEmoloyeeData().stream().count();
		System.out.println("Number of Employee is the orgination : " + count);

//--->>>1:How many male and female employees are there in the organization?

		System.out.println("Number of Male Employee in the organization : "
				+ employeeService.getEmoloyeeData().stream().filter(m -> m.getGender().equals("Male")).count());
		System.out.println("Number of Female Employee in the organization : "
				+ employeeService.getEmoloyeeData().stream().filter(m -> m.getGender() == "Female").count());
		long count2 = employeeService.getEmoloyeeData().stream().filter(m -> m.getGender() == "Male").count();
		System.out.println("Number of Male Employee in the organization : " + count2);

		long count3 = employeeService.getEmoloyeeData().stream().filter(m -> m.getGender() == "Female").count();
		System.out.println("Number of Female Employee in the organization : " + count3);

//--->>>2:Print the name of all departments in the organization?
		System.out.println("Number Of Departments in the organization : ");
		Collection<String> collect = employeeService.getEmoloyeeData().stream().map(d -> d.getDepartment())
				.collect(Collectors.toSet());

		employeeService.getEmoloyeeData().stream().map(d -> d.getDepartment()).distinct().forEach(System.out::println);
		for (int i = 0; i < collect.size(); i++) {
			System.out.println(i + 1 + ":" + collect.toArray()[i]);
		}

//--->>>3:What is the average age of male and female employees?
		/*
		 * System.out.println("Average age of Male Employee in the organization : " +
		 * (employeeService.getEmoloyeeData().stream().filter(m -> m.getGender() ==
		 * "Male").map(a -> a.getAge()) .reduce( 0, (sum, age) -> sum + age)) / count2);
		 * 
		 * Double avgAge = employeeService.getEmoloyeeData().stream().filter(m ->
		 * m.getGender() == "Male") .collect(Collectors.averagingDouble(e ->
		 * e.getAge())); System.out.println(avgAge);
		 * 
		 * System.out.println("Average age of Female Employee in the organization : " +
		 * (employeeService.getEmoloyeeData().stream().filter(m -> m.getGender() ==
		 * "Female") .map(a -> a.getAge()).reduce((int) 0.0f, (sum, age) -> sum + age))
		 * / count3);
		 */
		Map<String, Double> avgAge = employeeService.getEmoloyeeData().stream()
				.collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(e -> e.getAge())));
		System.out.println(avgAge);

//--->>>4:Get the details of highest paid employee in the organization?
		Employee employee = employeeService.getEmoloyeeData().stream()
				.max((salary1, salary2) -> salary1.getSalary() > salary2.getSalary() ? 1 : -1).get();
		System.out.println("Maximum Salary of the employee is -> " + employee);

//--->>>5:Get the names of all employees who have joined after 2015?
//		employeeService.getEmoloyeeData().stream().filter(x -> x.getYearOfJoining()> 2015).collect(Collectors.toList()).forEach(System.out::println);
		/*
		 * List<Employee> list = employeeService.getEmoloyeeData().stream().filter(x ->
		 * x.getYearOfJoining()> 2015).collect(Collectors.toList()); for(Employee
		 * employees : list) {
		 * System.out.println("Name of the employee who's join after 2015 : "+employees)
		 * ; }
		 */
//--->>>6:  What is the average salary of each department?
		/*
		 * Stream<Employee> stream1 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Product Development"); long count1 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Product Development").count(); Double reduce1 = stream1.map(s ->
		 * s.getSalary()).reduce((double) 0.0f,(sum, salary)->sum+salary)/count1;
		 * System.out.
		 * println("Average salary of \"Product Development\" Department is : " +
		 * reduce1);
		 * 
		 * Stream<Employee> stream2 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Sales And Marketing"); long countt2 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Sales And Marketing").count(); Double reduce2 = stream2.map(s ->
		 * s.getSalary()).reduce((double) 0.0f,(sum, salary)->sum+salary)/countt2;
		 * System.out.
		 * println("Average salary of \"Sales And Marketing\" Department is : " +
		 * reduce2);
		 * 
		 * Stream<Employee> stream3 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Security And Transport"); long countt3 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Security And Transport").count(); Double reduce3 = stream3.map(s ->
		 * s.getSalary()).reduce((double) 0.0f,(sum, salary)->sum+salary)/countt3;
		 * System.out.
		 * println("Average salary of \"Security And Transport\" Department is : " +
		 * reduce3);
		 * 
		 * Stream<Employee> stream4 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Infrastructure"); long count4 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Infrastructure").count(); Double reduce4 = stream4.map(s ->
		 * s.getSalary()).reduce((double) 0.0f,(sum, salary)->sum+salary)/count4;
		 * System.out.println("Average salary of \"Infrastructure\" Department is : " +
		 * reduce4);
		 * 
		 * Stream<Employee> stream5 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="HR"); long count5 = employeeService.getEmoloyeeData().stream().filter(x ->
		 * x.getDepartment() =="HR").count(); Double reduce5 = stream5.map(s ->
		 * s.getSalary()).reduce((double) 0.0f,(sum, salary)->sum+salary)/count5;
		 * System.out.println("Average salary of \"HR\" Department is : " + reduce5);
		 * 
		 * Stream<Employee> stream6 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Account And Finance"); long count6 =
		 * employeeService.getEmoloyeeData().stream().filter(x -> x.getDepartment()
		 * =="Account And Finance").count(); Double reduce6 = stream6.map(s ->
		 * s.getSalary()).reduce((double) 0.0f,(sum, salary)->sum+salary)/count6;
		 * System.out.
		 * println("Average salary of \"Account And Finance\" Department is : " +
		 * reduce6);
		 */

//--->>>7: Get the details of youngest male employee in the product development department?
		Employee employee2 = employeeService.getEmoloyeeData().stream()
				.filter(x -> x.getDepartment() == "Product Development").filter(m -> m.gender == "Male")
				.collect(Collectors.toList()).stream().min((age1, age2) -> age1.getAge() > age2.getAge() ? 1 : -1)
				.get();
		System.out.println("youngest male employee of the \"Product Development\" Department is : " + employee2);

//--->>>8: Who has the most working experience in the organization?
		Employee employee3 = employeeService.getEmoloyeeData().stream()
				.max((age1, age2) -> age1.getAge() > age2.getAge() ? 1 : -1).get();
		System.out.println("Most working experience on the basis of age -: " + employee3);

//--->>>9 How many male and female employees are there in the sales and marketing team?
		/*
		 * long male = employeeService.getEmoloyeeData().stream() .filter(x ->
		 * x.getDepartment() == "Sales And Marketing").filter(m -> m.getGender() ==
		 * "Male").count(); long female = employeeService.getEmoloyeeData().stream()
		 * .filter(x -> x.getDepartment() == "Sales And Marketing").filter(m ->
		 * m.getGender() == "Female").count(); // long male = stream.filter(m ->
		 * m.getGender() == "Male").count(); // long female = stream.filter(m ->
		 * m.getGender() == "Female").count();
		 * System.out.println("Male is the Sales And Marketing team are : " +male);
		 * System.out.println("Female is the Sales And Marketing team are : " +female);
		 * System.out.
		 * println("Total Number of Male & Female employee in the Sales And Marketing team are : "
		 * + (male + female));
		 */

//--->>>10:What is the average salary of male and female employees?
		List<Double> maleAvgSalary = employeeService.getEmoloyeeData().stream().filter(x -> x.gender == "Male")
				.map(s -> s.getSalary()).collect(Collectors.toList());
		System.out.println("Average salary of Male Employee in the organisation : "
				+ (maleAvgSalary.stream().reduce((sum, salary) -> sum + salary).get()) / count2);
		List<Double> femaleAvgSalary = employeeService.getEmoloyeeData().stream().filter(x -> x.gender == "Female")
				.map(s -> s.getSalary()).collect(Collectors.toList());
		System.out.println("Average salary of Female Employee in the organisation : "
				+ (femaleAvgSalary.stream().reduce((sum, salary) -> sum + salary).get()) / count3);

//--->>>11: List down the names of all employees in each department?
		List<String> listOfAllemployee = employeeService.getEmoloyeeData().stream().map(name -> name.getName())
				.collect(Collectors.toList());
		System.out.println("List of All Employee Name is the organisation : " + listOfAllemployee);

//--->>>12: What is the average salary and total salary of the whole organization?
		Double reduce = employeeService.getEmoloyeeData().stream().map(s -> s.getSalary()).collect(Collectors.toList())
				.stream().reduce((sum, salary) -> sum + salary).get();
		System.out.println("Average salary of the whole organisation is : " + reduce / count);
		System.out.println("Total salary of the whole organisation is : " + reduce);

//--->>>13: Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		/*
		 * List<Employee> collect2 =
		 * employeeService.getEmoloyeeData().stream().filter(age -> age.getAge()
		 * <=25).collect(Collectors.toList()); for(int i=0; i<collect2.size(); i++) {
		 * System.out.
		 * println("Details of Employee Who's age is Less than or Equal to 25 -> "
		 * +collect2.toArray()[i]); }
		 * 
		 * List<Employee> collect3 =
		 * employeeService.getEmoloyeeData().stream().filter(age -> age.getAge() >
		 * 25).collect(Collectors.toList()); for(int i=0; i<collect3.size(); i++) {
		 * System.out.println("Details of Employee Who's age is Greater than 25 -> "
		 * +collect3.toArray()[i]); }
		 */

//--->>>14: Who is the oldest employee in the organization? What is his age and which department he belongs to?
		int age = employeeService.getEmoloyeeData().stream().max((age1, age2) -> age1.getAge() > age2.getAge() ? 1 : -1)
				.get().getAge();
		String department = employeeService.getEmoloyeeData().stream()
				.max((age1, age2) -> age1.getAge() > age2.getAge() ? 1 : -1).get().getDepartment();
		System.out.println("The Oldest Employee in the organisation who's age is " + age + " and he/she belong to "
				+ department + " department");

	}

}