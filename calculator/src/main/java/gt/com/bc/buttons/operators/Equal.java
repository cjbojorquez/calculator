package gt.com.bc.buttons.operators;

import gt.com.bc.Panel;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author cjbojorquez
 */
public class Equal extends Operator {

    public Equal(String name, String value, int x, int y, int w, int h, JTextField textbox, Panel calculator) {
        super(name, value, x, y, w, h, textbox, calculator);
        
    }

    @Override
    public String operation(String valueA, String valueB) {
        return valueA;
    }

    @Override
    public void setTypeOperator() {
        calculator.setBtnSelectedOperator(null);
    }

    @Override
    public void executeAction() {
        if (calculator.getBtnSelectedOperator() == null) {
            //calculator.setNumberOne(Integer.parseInt(textbox.getText()));
            textbox.setText(calculator.getNumberOne() + "");
            setTypeOperator();
            calculator.setIsSecondNumber(false);
        } else {
            textbox.setText(calculator.btnSelectedOperator.operation(String.valueOf(calculator.getNumberOne()), textbox.getText()));
            calculator.setNumberOne(Integer.parseInt(textbox.getText()));
            setTypeOperator();
            calculator.setIsSecondNumber(false);
        }
    }

}
