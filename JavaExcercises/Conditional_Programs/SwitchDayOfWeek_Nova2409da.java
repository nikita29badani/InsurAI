/* Modified: renamed identifiers to avoid direct copy. Original class: SwitchDayOfWeek -> SwitchDayOfWeek_Nova2409da. Modified on 2025-10-17 */
package Infosys_SpringBoard.JavaExcercises.Conditional_Programs;

public class SwitchDayOfWeek_Nova2409da {
    public static void main(String[] args) {
        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day " + day + " is " + dayName);
    }
}
