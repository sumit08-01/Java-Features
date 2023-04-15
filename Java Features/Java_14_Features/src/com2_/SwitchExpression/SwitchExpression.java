package com2_.SwitchExpression;

public class SwitchExpression {

	public static String findDayOfTheWeek(int day) {
		String dayofweek = "";
		
		switch (day) {
		case 1 : dayofweek = "Sunday"; break; 
		case 2 : dayofweek = "Monday"; break; 
		case 3 : dayofweek = "Tuesday"; break; 
		case 4 : dayofweek = "Wednesday"; break; 
		case 5 : dayofweek = "Thursday"; break; 
		case 6 : dayofweek = "Friday"; break; 
		case 7 : dayofweek = "Saturday"; break; 
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
		return dayofweek;
	}
	
	// In java 12 and 13 it is only preview it's sandradize in java 14
	public static String findDayOfTheWeekWithSwitchExpresion(int day) {
		String dayofweek = switch (day) {
		case 1 -> {
			System.out.println("If you write more line ");
			yield "Sunday";
		}
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		case 7 -> "Saturday";
		default -> 
			throw new IllegalArgumentException("Unexpected value: " + day);
		};
		return dayofweek;
	}
	
	public static String getDayType(String day) {

	      var result = switch (day) {
	         case "Monday", "Tuesday", "Wednesday","Thursday", "Friday" -> {
	        	 yield "Weekday";
	         }
	         case "Saturday", "Sunday" ->{
	        	 yield "Weekend";
	         }
	         default -> "Invalid day.";
	      };
	      return result;
	   }
	
	
	public static void main(String[] args) {
		
		System.out.println(findDayOfTheWeek(3));
		System.out.println(findDayOfTheWeekWithSwitchExpresion(1));
		System.out.println(getDayType("Monday"));
				System.out.println(getDayType("Saturday"));
		
	}

}
