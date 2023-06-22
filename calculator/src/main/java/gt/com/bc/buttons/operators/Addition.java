package gt.com.bc.buttons.operators;

import gt.com.bc.Panel;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author cjbojorquez
 */
public class Addition extends Operator {

    public Addition(String name, String value, int x, int y, int w, int h, JTextField textbox, Panel calculator) {
        super(name, value, x, y, w, h, textbox, calculator);
        
    }

    @Override
    public String operation(String valueA, String valueB) {
        return String.valueOf(Integer.parseInt(valueA)+Integer.parseInt(valueB));
    }

    @Override
    public void setTypeOperator() {
        calculator.setBtnSelectedOperator(Addition.this);
    }
    
}
