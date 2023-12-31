/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package newton.raphson;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import metnum.procesos.FuncionAlgebraicaGrado6;
import metnum.utilidades.FuncionesNumericas;
import metnum.utilidades.GUI;
import metnum.utilidades.algebraicas.Iteracion;

/**
 *
 * @author DrunkedOwly
 */
public class Cocos extends javax.swing.JFrame {
    static double coef[] = new double[100];
    static double comp1 = 0, comp2 = 0, comp3 = 0, aprox=0, aprox2=0, aprox3=0, pm=0, error=0, y=0, Errori=0, constante=0, Grado1=0, Grado2=0, Grado3=0, Grado4=0, Grado5=0, Grado6=0;
    static boolean salir = false;
    static int iteracion = 1, decimal=0, x=0;
    /**
     * Creates new form Cocos
     */
    public Cocos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConstante = new javax.swing.JTextField();
        lblConstante = new javax.swing.JLabel();
        txtGrado1 = new javax.swing.JTextField();
        lblGrado1 = new javax.swing.JLabel();
        lblGrado2 = new javax.swing.JLabel();
        txtGrado2 = new javax.swing.JTextField();
        lblGrado3 = new javax.swing.JLabel();
        txtGrado3 = new javax.swing.JTextField();
        lblGrado4 = new javax.swing.JLabel();
        txtGrado4 = new javax.swing.JTextField();
        lblGrado5 = new javax.swing.JLabel();
        txtGrado5 = new javax.swing.JTextField();
        lblGrado6 = new javax.swing.JLabel();
        txtGrado6 = new javax.swing.JTextField();
        lblError = new javax.swing.JLabel();
        txtError = new javax.swing.JTextField();
        lblDecimales = new javax.swing.JLabel();
        txtDecimales = new javax.swing.JTextField();
        btnResolver = new javax.swing.JButton();
        lblIntervalo2 = new javax.swing.JLabel();
        txtIntervalo2 = new javax.swing.JTextField();
        JpanelTabla = new javax.swing.JPanel();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        txtConstante.setMaximumSize(null);
        txtConstante.setPreferredSize(new java.awt.Dimension(55, 22));
        txtConstante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConstanteKeyTyped(evt);
            }
        });

        lblConstante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConstante.setText("Constante");
        lblConstante.setMinimumSize(new java.awt.Dimension(63, 16));
        lblConstante.setPreferredSize(new java.awt.Dimension(63, 16));

        txtGrado1.setMaximumSize(null);
        txtGrado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrado1ActionPerformed(evt);
            }
        });
        txtGrado1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrado1KeyTyped(evt);
            }
        });

        lblGrado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado1.setText("1°Grado");
        lblGrado1.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGrado1.setPreferredSize(new java.awt.Dimension(63, 16));

        lblGrado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado2.setText("2°Grado");
        lblGrado2.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGrado2.setPreferredSize(new java.awt.Dimension(63, 16));

        txtGrado2.setMaximumSize(null);
        txtGrado2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrado2KeyTyped(evt);
            }
        });

        lblGrado3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado3.setText("3°Grado");
        lblGrado3.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGrado3.setPreferredSize(new java.awt.Dimension(63, 16));

        txtGrado3.setMaximumSize(null);
        txtGrado3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrado3KeyTyped(evt);
            }
        });

        lblGrado4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado4.setText("4°Grado");
        lblGrado4.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGrado4.setPreferredSize(new java.awt.Dimension(63, 16));

        txtGrado4.setMaximumSize(null);
        txtGrado4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrado4KeyTyped(evt);
            }
        });

        lblGrado5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado5.setText("5°Grado");
        lblGrado5.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGrado5.setPreferredSize(new java.awt.Dimension(63, 16));

        txtGrado5.setMaximumSize(null);
        txtGrado5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrado5KeyTyped(evt);
            }
        });

        lblGrado6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGrado6.setText("6°Grado");
        lblGrado6.setMinimumSize(new java.awt.Dimension(63, 16));
        lblGrado6.setPreferredSize(new java.awt.Dimension(63, 16));

        txtGrado6.setMaximumSize(null);
        txtGrado6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGrado6KeyTyped(evt);
            }
        });

        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("Error deseado");
        lblError.setMaximumSize(new java.awt.Dimension(55, 22));
        lblError.setMinimumSize(new java.awt.Dimension(55, 22));
        lblError.setName(""); // NOI18N

        txtError.setMaximumSize(new java.awt.Dimension(55, 22));
        txtError.setMinimumSize(new java.awt.Dimension(55, 22));
        txtError.setName(""); // NOI18N
        txtError.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtErrorKeyTyped(evt);
            }
        });

        lblDecimales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDecimales.setText("N°Decimales");
        lblDecimales.setMaximumSize(new java.awt.Dimension(55, 22));
        lblDecimales.setMinimumSize(new java.awt.Dimension(55, 22));
        lblDecimales.setName(""); // NOI18N

        txtDecimales.setMaximumSize(new java.awt.Dimension(55, 22));
        txtDecimales.setMinimumSize(new java.awt.Dimension(55, 22));
        txtDecimales.setName(""); // NOI18N
        txtDecimales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDecimalesKeyTyped(evt);
            }
        });

        btnResolver.setText("Resolver");
        btnResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResolverActionPerformed(evt);
            }
        });

        lblIntervalo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIntervalo2.setText("Intervalo 2");
        lblIntervalo2.setToolTipText("");

        txtIntervalo2.setPreferredSize(new java.awt.Dimension(55, 22));
        txtIntervalo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIntervalo2KeyTyped(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(lblDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(370, 370, 370)
                            .addComponent(lblIntervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(388, 388, 388)
                            .addComponent(txtIntervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnResolver)
                            .addGap(16, 16, 16)
                            .addComponent(btnReiniciar)
                            .addGap(25, 25, 25)
                            .addComponent(JpanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblConstante, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(lblGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(lblGrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(lblGrado3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(lblGrado4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(lblGrado5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(lblGrado6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtConstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtGrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtGrado3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtGrado4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(7, 7, 7)
                                    .addComponent(txtGrado5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(13, 13, 13)
                                    .addComponent(txtGrado6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblConstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblGrado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtConstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGrado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIntervalo2))
                    .addGap(8, 8, 8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDecimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIntervalo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JpanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnResolver)
                                .addComponent(btnReiniciar))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtConstanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConstanteKeyTyped
        digito(evt);
    }//GEN-LAST:event_txtConstanteKeyTyped

    private void txtGrado1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado1KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtGrado1KeyTyped

    private void txtGrado2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado2KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtGrado2KeyTyped

    private void txtGrado3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado3KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtGrado3KeyTyped

    private void txtGrado4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado4KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtGrado4KeyTyped

    private void txtGrado5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado5KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtGrado5KeyTyped

    private void txtGrado6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGrado6KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtGrado6KeyTyped

    private void txtErrorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtErrorKeyTyped
        digito2(evt);
    }//GEN-LAST:event_txtErrorKeyTyped

    private void txtDecimalesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecimalesKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtDecimalesKeyTyped

    private void btnResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResolverActionPerformed
        
        limpiar();
       
        if(!error(txtConstante) || !error(txtDecimales) || !error(txtError) || !error(txtGrado1) || !error(txtGrado2) || !error(txtGrado3) || !error(txtGrado4) || !error(txtGrado5) || !error(txtGrado6) || !error(txtIntervalo2))
        {
            JOptionPane.showMessageDialog(this, "Rellene todos los campos.\n Campos vacios con 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //parametros
        y=Double.parseDouble(txtIntervalo2.getText());
        Errori=Double.parseDouble(txtError.getText());
        //grados de valor con las que se haran las operaciones
        decimal=Integer.parseInt(txtDecimales.getText());
        constante=Double.parseDouble(txtConstante.getText());
        Grado1=Double.parseDouble(txtGrado1.getText());
        Grado2=Double.parseDouble(txtGrado2.getText());
        Grado3=Double.parseDouble(txtGrado3.getText());
        Grado4=Double.parseDouble(txtGrado4.getText());
        Grado5=Double.parseDouble(txtGrado5.getText());
        Grado6=Double.parseDouble(txtGrado6.getText());
        
        coef[0] = Grado6;
        coef[1] = Grado5;
        coef[2] = Grado4;
        coef[3] = Grado3;
        coef[4] = Grado2;
        coef[5] = Grado1;
        
        resolver(constante, x, coef, error, decimal);
        //resolver(double x0, int grado, double[] coef, double errorPer, int decim)
        

    }//GEN-LAST:event_btnResolverActionPerformed

    private void txtIntervalo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntervalo2KeyTyped
        digito(evt);
    }//GEN-LAST:event_txtIntervalo2KeyTyped

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        limpiar();
        txtConstante.setText("");
        txtDecimales.setText("");
        txtError.setText("");
        txtGrado1.setText("");
        txtGrado2.setText("");
        txtGrado3.setText("");
        txtGrado4.setText("");
        txtGrado5.setText("");
        txtGrado6.setText("");
        txtIntervalo2.setText("");
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txtGrado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrado1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cocos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cocos().setVisible(true);
            }
        });
    }
    public static void digito(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && c!='.' && c!='-')
        {
            evt.consume();
        }
    }
    public static void digito2(java.awt.event.KeyEvent evt)
    {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && c!='.')
        {
            evt.consume();
        }
    }

     public static boolean error(javax.swing.JTextField t)
     {
        if("".equals(t.getText())) 
        {
            return false;
        }
        return true;
     }
     public static void limpiar()
     {
         salir = false;
            iteracion = 0;
            x = 0;
            y = 0;
            Errori = 0;
            decimal = 0;
            constante = 0;
            Grado1 = 0;
            Grado2 = 0;
            Grado3 = 0;
            Grado4 = 0;
            Grado5 = 0;
            Grado6 = 0;
            
            
     }
     
     public static boolean resolver(double x0, int grado, double[] coef, double errorPer, int decim) {

        //limpiamos las iteraciones
        Iteracion.limpiarIteraciones();

        //---- Validacion: Si el valor dado es solucion ----
        {
            //obtener valores de funcion para ambos intervalos
            double t0 = FuncionAlgebraicaGrado6.resolver(x0, grado, coef);

            //si f(x0) = 0 entonces es solucion
            if (t0 == 0) {
                Iteracion it = new Iteracion(1, x0, 0);
                Iteracion.iteraciones.add(it);
                return true;
            }
        }

        //prepare variables
        double Xi, Xj, errorR;
        Xj = x0;
        int i = 1;

        do {

            if (i >= Iteracion.MAX_ITERACIONES) {
                GUI.PopUps.showSinSolucionWarning(null);
                break;
            }

            //actualizar variable
            Xi = Xj;

            //calcular funcion y derivada
            double y = FuncionAlgebraicaGrado6.resolver(Xi, grado, coef);
            double[] derivada = FuncionAlgebraicaGrado6.derivar(coef);
            double dy = FuncionAlgebraicaGrado6.resolver(Xi, grado, derivada);
            y = FuncionesNumericas.redondearDouble(y, decim);
            dy = FuncionesNumericas.redondearDouble(dy, decim);
            //ejecutar formula iterativa
            Xj = Xi - (y / dy);
            Xj = FuncionesNumericas.redondearDouble(Xj, decim);
            errorR = FuncionesNumericas.errorRelativo(Xj, Xi);
            
            System.out.println("------------------------");
            System.out.println("Iteracion: " + i);
            System.out.println("------------------------");
            System.out.println("Error: " + errorR);
            String FXj = String.format("%."+decimal+"f", Xj);
            System.out.println("Punto medio: " + FXj);
            System.out.println("------------------------");

            //agregar iteraciones
            Iteracion it = new Iteracion(i, Xj, errorR);
            Iteracion.iteraciones.add(it);
            i++;

        } while (errorR > errorPer);

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpanelTabla;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnResolver;
    private javax.swing.JLabel lblConstante;
    private javax.swing.JLabel lblDecimales;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblGrado1;
    private javax.swing.JLabel lblGrado2;
    private javax.swing.JLabel lblGrado3;
    private javax.swing.JLabel lblGrado4;
    private javax.swing.JLabel lblGrado5;
    private javax.swing.JLabel lblGrado6;
    private javax.swing.JLabel lblIntervalo2;
    private javax.swing.JTextField txtConstante;
    private javax.swing.JTextField txtDecimales;
    private javax.swing.JTextField txtError;
    private javax.swing.JTextField txtGrado1;
    private javax.swing.JTextField txtGrado2;
    private javax.swing.JTextField txtGrado3;
    private javax.swing.JTextField txtGrado4;
    private javax.swing.JTextField txtGrado5;
    private javax.swing.JTextField txtGrado6;
    private javax.swing.JTextField txtIntervalo2;
    // End of variables declaration//GEN-END:variables
}
