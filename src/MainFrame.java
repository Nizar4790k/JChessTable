import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private  GridLayout layout;

    public MainFrame(){
        setVisible(true);
        setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        setBounds(100,200,640,480);
        setTitle("JChessTable");
        add(new ChessPanel());
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);






    }


}
