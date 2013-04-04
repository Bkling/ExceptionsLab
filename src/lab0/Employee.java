package lab0;

import java.util.Calendar;
import java.util.Date;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid. <p> For example, String
 * arguments may be null or empty; other objects may be null; or primitive
 * numbers may be out of acceptable range. <p> You need to validate ALL method
 * parameters to make sure any and all arguments are valid. The only exception
 * is when any argument is acceptable based on requirements. Fix the code below
 * using if logic to validate method arguments and throw
 * IllegalArgumentException or a custom exception if the validation fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MIN_VACATION_DAYS = 0;
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    /**
     * This method sets the vacation days for a employee.
     *
     * @param daysVacation - uses a amount of days vacation an employee has
     * @throws IllegalVacationDaysException - if the days vacation given is not
     * between the specified range then an IllegalVacationDaysException is
     * thrown.
     */
    public void setDaysVacation(int daysVacation) throws IllegalVacationDaysException {
        if (daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalVacationDaysException();
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Do not allow null or zero length. Ask about numeric first names. Maybe
     * allow numbers at end only. Allow hypens (-) in first names. Allow any
     * letter case for the text and message later in code depending.
     *
     * @param firstName - the first name of an employee
     * @throws IllegalFirstNameException if first name is null or 0 in length
     * then a IllegalFirstNameException is thrown.
     */
    public void setFirstName(String firstName) throws IllegalFirstNameException {
        if (firstName == null || firstName.length() == 0) {
            throw new IllegalFirstNameException();
        }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    /**
     * This method sets the hire date for an employee.
     *
     * @param hireDate - a validated date within the range.
     * @throws IllegalDateException - if the date isn't valid it will throw this exception.
     */
    public void setHireDate(Date hireDate) throws IllegalDateException {
        Calendar minCal = Calendar.getInstance();
        minCal.set(2012, Calendar.JUNE, 1);
        Date today = new Date();
        Date minDate = minCal.getTime();
        if (hireDate == null || hireDate.before(minDate) || hireDate.after(today)) {
            throw new IllegalDateException();
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * This method sets the last name for an employee.
     *
     * @param lastName - a valid last name.
     * @throws IllegalLastNameException - if the last name is null or has a
     * length of 0 then throw IllegalLastNameException.
     */
    public void setLastName(String lastName) throws IllegalLastNameException {
        if (lastName == null || lastName.length() == 0) {
            throw new IllegalLastNameException();
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    /**
     * This method sets the SSN of an Employee
     *
     * @param ssn - a valid SSN
     * @throws IllegalSsnException - if SSN equals a badValue or is equal to
     * null, the length is less than 9 or greater than 9.
     */
    public void setSsn(String ssn) throws IllegalSsnException {
        String[] badValues = {
            "999999999", "888888888", "012345678", "900123456"
        };
        if (ssn == null || ssn.length() < 9 || ssn.length() > 9) {
            throw new IllegalSsnException();
        }
        for (String bad : badValues) {
            if (ssn.equals(bad)) {
                throw new IllegalSsnException();
            }
        }

        char[] chars = ssn.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                throw new IllegalSsnException();
            }
            this.ssn = ssn;
        }
        this.ssn = ssn;
    }
}
