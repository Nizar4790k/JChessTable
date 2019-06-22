import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

public class ChessPanel extends JPanel {

    private GridLayout layout;
    private static String [] letters = {"A","B","C","D","E","F","H","G"};
    private JPanel blackLabel;
    private JPanel whiteLabel;



    public ChessPanel(){
        layout = new GridLayout(10,10);
       setLayout(layout);
       fillPanel();
       setVisible(true);
    }




    private void fillPanel(){


        for(int i=0;i<layout.getRows();i++) {

                for(int j=0;j<layout.getColumns();j++){

                    if(i==0 || i==layout.getRows()-1){

                        if(j==0 || j==layout.getColumns()-1){
                            add(new Container());
                        }else{
                            add(new JLabel(letters[j-1]));
                        }

                    } else {


                        blackLabel = new JPanel();
                        whiteLabel = new JPanel();

                        whiteLabel.setVisible(true);
                        blackLabel.setVisible(true);

                        whiteLabel.setBackground(Color.WHITE);
                        blackLabel.setBackground(Color.BLACK);

                        if( (j!=0 && i!=0) && (j!=layout.getColumns()-1 && i!=layout.getRows()-1)){

                            if(i%2!=0){

                                if(j%2!=0){
                                    add(whiteLabel);
                                } else {
                                    add(blackLabel);
                                }
                            } else {

                                if(j%2!=0){
                                    add(blackLabel);
                                } else {
                                    add(whiteLabel);
                                }
                            }

                        } else {
                            add(new JLabel(String.valueOf(i)));
                        }

                    }








                }


        }







        }




    }




