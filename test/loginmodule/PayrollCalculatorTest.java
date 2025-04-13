
package loginmodule;


import org.junit.Test;
import static org.junit.Assert.*;


public class PayrollCalculatorTest {
    
    PayrollCalculator payrollCal = new PayrollCalculator();
    
    @Test
    public void testGetTotalSalary1(){
        double result = payrollCal.getTotalSalary(50, 5, 100);
        assertEquals(7750.0,result);
    
    }
    @Test
    void testGetTotaSalary2(){
        double result = payrollCal.getTotalSalary(65.75, 5.5, 100.25);
        assertEquals(10248.78125,result);
    }
    @Test
    void testGetTotaSalary3(){
        double result = payrollCal.getTotalSalary(100, 10.5, 300.2);
        assertEquals(46080.0,result);
    }
    @Test
    void testGetRegularPay1(){
        payrollCal.getTotalSalary(200, 8, 2);
        double result = payrollCal.getRegularPay();
        assertEquals(1600.0,result);
    }
    @Test
    void testGetRegularPay2(){
        payrollCal.getTotalSalary(300.5, 9.25, 2000);
        double result = payrollCal.getRegularPay();
        assertEquals(2779.625,result);
    }
    @Test
    void testGetOverTimePay1(){
        payrollCal.getTotalSalary(200, 8, 2);
        double result = payrollCal.getOverTimePay();
        assertEquals(600.0,result);
    }
    @Test
    void testGetOverTimePay2(){
        payrollCal.getTotalSalary(300.5, 9.25, 2000);
        double result = payrollCal.getOverTimePay();
        assertEquals(901500.0,result);
    }
}
