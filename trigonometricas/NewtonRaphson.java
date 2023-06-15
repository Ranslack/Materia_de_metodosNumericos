/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package trigonometricas;

import static trigonometricas.GradosT.Decimal;
import static trigonometricas.GradosT.Inter1;
import static trigonometricas.GradosT.err;
import static trigonometricas.GradosT.fxa;
import static trigonometricas.GradosT.xrn;
import java.awt.BorderLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 52333
 */
public class NewtonRaphson extends javax.swing.JPanel {

    static String valorC, valor1, valor2, valor3, valor4, valor5, valor6, int1, int2, error, deci;
    static double GradoC = 0.0, Grado1 = 0.0, Grado2, Grado3, Grado4, Grado5, Grado6 = 0.0, ErrorI;
    static double fxa, fxb, xr, xrn, xrnv, xrv, xa, xb, Inter1 = 0.0, Inter2 = 0.0, Inter2v = 0.0, comp, XRNV, XRN, err;
    static double grad, min, seg, grad2, min2, seg2;
    static double radtime1, radtime2;
    static String Grad = "", Min = "", Seg = "", Grad2 = "", Min2 = "", Seg2 = "";
    static int Decimal, count = 0;
    static double xc = 0.0, xcn = 0.0, xcv = 0.0;

    public NewtonRaphson() {
        initComponents();
        //Intervalo 1

        txtInter1.setText("0");
        //txtInter2.setText("0");
        txtGrado3.setText("0");
        txtGrado4.setText("0");
        txtGrado5.setText("0");
        txtGrado6.setText("0");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtGrado1 = new javax.swing.JTextField();
        txtGrado2 = new javax.swing.JTextField();
        txtGrado3 = new javax.swing.JTextField();
        txtGrado4 = new javax.swing.JTextField();
        txtGrado5 = new javax.swing.JTextField();
        txtGrado6 = new javax.swing.JTextField();
        txtConstante = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        txtInter1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDeciamales = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(650, 500));
        setMinimumSize(new java.awt.Dimension(650, 500));
        setPreferredSize(new java.awt.Dimension(650, 500));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Newton Ramphson");
        add(jLabel1);
        jLabel1.setBounds(30, 30, 220, 19);

        txtGrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrado1ActionPerformed(evt);
            }
        });
        txtGrado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrado1KeyReleased(evt);
            }
        });
        add(txtGrado1);
        txtGrado1.setBounds(110, 100, 71, 30);

        txtGrado2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrado2KeyReleased(evt);
            }
        });
        add(txtGrado2);
        txtGrado2.setBounds(190, 100, 71, 30);

        txtGrado3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrado3KeyReleased(evt);
            }
        });
        add(txtGrado3);
        txtGrado3.setBounds(280, 100, 71, 30);

        txtGrado4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrado4KeyReleased(evt);
            }
        });
        add(txtGrado4);
        txtGrado4.setBounds(360, 100, 71, 30);

        txtGrado5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrado5KeyReleased(evt);
            }
        });
        add(txtGrado5);
        txtGrado5.setBounds(450, 100, 71, 30);

        txtGrado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrado6ActionPerformed(evt);
            }
        });
        txtGrado6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGrado6KeyReleased(evt);
            }
        });
        add(txtGrado6);
        txtGrado6.setBounds(530, 100, 71, 30);

        txtConstante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConstanteActionPerformed(evt);
            }
        });
        txtConstante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConstanteKeyReleased(evt);
            }
        });
        add(txtConstante);
        txtConstante.setBounds(30, 100, 71, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Constante");
        add(jLabel2);
        jLabel2.setBounds(40, 70, 70, 10);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("1");
        add(jLabel3);
        jLabel3.setBounds(140, 70, 20, 10);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("2");
        add(jLabel4);
        jLabel4.setBounds(230, 70, 8, 10);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("3");
        add(jLabel5);
        jLabel5.setBounds(310, 70, 8, 10);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("4");
        add(jLabel6);
        jLabel6.setBounds(400, 70, 8, 10);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("5");
        add(jLabel7);
        jLabel7.setBounds(480, 70, 8, 10);

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("6");
        add(jLabel8);
        jLabel8.setBounds(560, 70, 8, 10);

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 180, 180, 210);

        txtInter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInter1ActionPerformed(evt);
            }
        });
        txtInter1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInter1KeyReleased(evt);
            }
        });
        add(txtInter1);
        txtInter1.setBounds(280, 190, 60, 30);

        jLabel9.setText("Intervalo 1");
        add(jLabel9);
        jLabel9.setBounds(280, 170, 60, 16);

        jLabel11.setText("Error");
        add(jLabel11);
        jLabel11.setBounds(380, 170, 40, 16);

        txtError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtErrorActionPerformed(evt);
            }
        });
        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtErrorKeyReleased(evt);
            }
        });
        add(txtError);
        txtError.setBounds(380, 190, 64, 30);

        jLabel12.setText("Deciamles");
        add(jLabel12);
        jLabel12.setBounds(480, 170, 60, 16);

        txtDeciamales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeciamalesActionPerformed(evt);
            }
        });
        txtDeciamales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDeciamalesKeyReleased(evt);
            }
        });
        add(txtDeciamales);
        txtDeciamales.setBounds(480, 190, 64, 30);

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/plus.png"))); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular);
        btnCalcular.setBounds(440, 370, 110, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void txtConstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConstanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConstanteActionPerformed

    private void txtDeciamalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeciamalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeciamalesActionPerformed

    private void txtGrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrado1ActionPerformed
        // TODO add your handling code here:
        //radian a grado
        /*double num1 = 90;
        double res = Math.toDegrees(num1);

        //grado a radian
        double num2 = 90;
        double res2 = Math.toRadians(num1);*/


    }//GEN-LAST:event_txtGrado1ActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        valorC = txtConstante.getText();
        valor1 = txtGrado1.getText();
        valor2 = txtGrado2.getText();
        valor3 = txtGrado3.getText();
        valor4 = txtGrado4.getText();
        valor5 = txtGrado5.getText();
        valor6 = txtGrado6.getText();
        int1 = txtInter1.getText();//intervalos 1
        //int2 = txtInter2.getText();//intervalos 2
        error = txtError.getText();
        deci = txtDeciamales.getText();
        //string to double grados
        GradoC = Double.parseDouble(valorC);//constante
        Grado1 = Double.parseDouble(valor1);//grado 1
        Grado2 = Double.parseDouble(valor2);//grado 2
        Grado3 = Double.parseDouble(valor3);//grado 3
        Grado4 = Double.parseDouble(valor4);//grado 4
        Grado5 = Double.parseDouble(valor5);//grado 5
        Grado6 = Double.parseDouble(valor6);//grado 6

        count = 0;
        error = txtError.getText();
        deci = txtDeciamales.getText();

        //ERROR
        ErrorI = Double.parseDouble(error);//Error digitado
        //Decimales
        Decimal = Integer.parseInt(deci);
        //  Intervals de xa y xb ya convertidos a double
        Inter1 = Double.parseDouble(int1);
        //Inter2 = Double.parseDouble(int2);

        if (txtConstante.getText().isEmpty()
                || txtGrado1.getText().isEmpty()
                || txtGrado2.getText().isEmpty()
                || txtGrado3.getText().isEmpty()
                || txtGrado4.getText().isEmpty()
                || txtGrado5.getText().isEmpty()
                || txtGrado6.getText().isEmpty()
                || txtError.getText().isEmpty()
                || txtDeciamales.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "CAMPOS VACIOS", "INFORMACION", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Hacemos llamar la regla de la secante. 
        NewtonR();

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void txtConstanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConstanteKeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtConstante.getText());
        if (match.find()) {
            txtGrado1.setEnabled(true);
            txtGrado2.setEnabled(true);
            txtGrado3.setEnabled(true);
            txtGrado4.setEnabled(true);
            txtGrado5.setEnabled(true);
            txtGrado6.setEnabled(true);
            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtGrado1.setEnabled(false);
            txtGrado2.setEnabled(false);
            txtGrado3.setEnabled(false);
            txtGrado4.setEnabled(false);
            txtGrado5.setEnabled(false);
            txtGrado6.setEnabled(false);
            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtConstanteKeyReleased

    private void txtGrado1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado1KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtGrado1.getText());
        if (match.find()) {
            txtGrado2.setEnabled(true);
            txtGrado3.setEnabled(true);
            txtGrado4.setEnabled(true);
            txtGrado5.setEnabled(true);
            txtGrado6.setEnabled(true);
            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtGrado2.setEnabled(false);
            txtGrado3.setEnabled(false);
            txtGrado4.setEnabled(false);
            txtGrado5.setEnabled(false);
            txtGrado6.setEnabled(false);
            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtGrado1KeyReleased

    private void txtGrado2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado2KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtGrado2.getText());
        if (match.find()) {

            txtGrado3.setEnabled(true);
            txtGrado4.setEnabled(true);
            txtGrado5.setEnabled(true);
            txtGrado6.setEnabled(true);
            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            txtGrado3.setEnabled(false);
            txtGrado4.setEnabled(false);
            txtGrado5.setEnabled(false);
            txtGrado6.setEnabled(false);
            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtGrado2KeyReleased

    private void txtGrado3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado3KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtGrado3.getText());
        if (match.find()) {

            txtGrado4.setEnabled(true);
            txtGrado5.setEnabled(true);
            txtGrado6.setEnabled(true);
            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            txtGrado4.setEnabled(false);
            txtGrado5.setEnabled(false);
            txtGrado6.setEnabled(false);
            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtGrado3KeyReleased

    private void txtGrado4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado4KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtGrado4.getText());
        if (match.find()) {

            txtGrado5.setEnabled(true);
            txtGrado6.setEnabled(true);
            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            txtGrado5.setEnabled(false);
            txtGrado6.setEnabled(false);
            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtGrado4KeyReleased

    private void txtGrado5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado5KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtGrado5.getText());
        if (match.find()) {

            txtGrado6.setEnabled(true);
            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            txtGrado6.setEnabled(false);
            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtGrado5KeyReleased

    private void txtGrado6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado6KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtGrado6.getText());
        if (match.find()) {

            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtGrado6KeyReleased

    private void txtInter1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInter1KeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtInter1.getText());
        if (match.find()) {

            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtInter1KeyReleased

    private void txtErrorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtError.getText());
        if (match.find()) {

            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtErrorKeyReleased

    private void txtDeciamalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeciamalesKeyReleased
        // TODO add your handling code here:
        String nombre = "^[-]?[0-9]{1,9}(?:\\.[0-9]{1,10})?$";
        Pattern patron = Pattern.compile(nombre);
        Matcher match = patron.matcher(txtDeciamales.getText());
        if (match.find()) {

            btnCalcular.setEnabled(true);
        } else {
            //JOptionPane.showMessageDialog(this, "NO CARACTER ESPECIAL", "ERROR", JOptionPane.ERROR_MESSAGE);

            btnCalcular.setEnabled(false);
            return;
        }
    }//GEN-LAST:event_txtDeciamalesKeyReleased

    private void txtGrado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrado6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrado6ActionPerformed

    private void txtInter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInter1ActionPerformed

    private void txtErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtErrorActionPerformed

    //Secante
    public void NewtonR() {
        double fxav=0.0;
        do {
            count++;
            System.out.println("---ITERADOR---" + count);
            
            //paso 1
            fxa = (Grado6 * (Math.pow(Inter1, 6)) + Grado5 * (Math.pow(Inter1, 5)) + Grado4 * (Math.pow(Inter1, 4)) + Grado3 * (Math.pow(Inter1, 3)) + Grado2 * (Math.pow(Inter1, 2)) + Grado1 * (Math.pow(Inter1, 1)) + GradoC);
            System.out.println("fxa : " + String.format("%." + Decimal + "f", fxa));// 32.5
            fxav=fxa;
            
            // obtenemos la derivada. 
            double g6=Grado6 * 6;
            System.out.println("6: "+g6);
            double g5= Grado5 * 5;
            System.out.println("5: "+g5);
            Grado5=g6;
            double g4= Grado4 * 4;
            System.out.println("4: "+g4);
            Grado4=g5;
            double g3=Grado3 * 3;
            System.out.println("3: "+g3);
            Grado3=g4;
            double g2=Grado2 * 2;
            System.out.println("5: "+g2);
            Grado2=g3;
            System.out.println("g2: "+Grado2);
            double g1=Grado1 * 1;
            Grado1=g2;
            System.out.println("g1: "+Grado1);
            GradoC=g1;
            System.out.println("Gc: "+GradoC);
            
            
            fxb = (Grado5 * (Math.pow(Inter1, 5)) + Grado4 * (Math.pow(Inter1, 4)) + Grado3 * (Math.pow(Inter1, 3)) + Grado2 * (Math.pow(Inter1, 2)) + Grado1 * (Math.pow(Inter1, 1)) + GradoC);
            System.out.println("Derivada : " + fxb);// 32.5
            
            
            //formula para la primera iteracion
            XRN=(Inter1)-(fxa/fxb);
            System.out.println("XRN: "+XRN);
            err = (Math.abs((XRN - Inter1) / XRN) * 100);
            System.out.println("Error: " + err);
            if(err <= ErrorI){
                System.out.println("Se encontro el error");
                return;
            }else{
                Inter1=XRN;
                valorC = txtConstante.getText();
                valor1 = txtGrado1.getText();
                valor2 = txtGrado2.getText();
                valor3 = txtGrado3.getText();
                valor4 = txtGrado4.getText();
                valor5 = txtGrado5.getText();
                valor6 = txtGrado6.getText();
                int1 = txtInter1.getText();//intervalos 1
                //int2 = txtInter2.getText();//intervalos 2
                error = txtError.getText();
                deci = txtDeciamales.getText();
                //string to double grados
                GradoC = Double.parseDouble(valorC);//constante
                Grado1 = Double.parseDouble(valor1);//grado 1
                Grado2 = Double.parseDouble(valor2);//grado 2
                Grado3 = Double.parseDouble(valor3);//grado 3
                Grado4 = Double.parseDouble(valor4);//grado 4
                Grado5 = Double.parseDouble(valor5);//grado 5
                Grado6 = Double.parseDouble(valor6);//grado 6

            }
            
        } while (count <= 3);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtConstante;
    private javax.swing.JTextField txtDeciamales;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtGrado1;
    private javax.swing.JTextField txtGrado2;
    private javax.swing.JTextField txtGrado3;
    private javax.swing.JTextField txtGrado4;
    private javax.swing.JTextField txtGrado5;
    private javax.swing.JTextField txtGrado6;
    private javax.swing.JTextField txtInter1;
    // End of variables declaration//GEN-END:variables
}
