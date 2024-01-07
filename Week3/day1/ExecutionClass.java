package week3Assignments.day1;

public class ExecutionClass extends Button{
	
	public static void main(String[] args) {
		
		ExecutionClass e = new ExecutionClass();
		e.setText("Calling from Execution Class");
		e.click(); // From Base class WebElement
		
		
		RadioButton r = new RadioButton();
		r.selectRadioButton(); // from class Radio Button
		r.click();
		
		CheckBoxButton c = new CheckBoxButton();
		c.clickCheckButton();
		c.click();
		
		TextField t = new TextField();
		t.getText();
		t.click();
		
		
		e.submit();  // From Parent class Button
	}

}
