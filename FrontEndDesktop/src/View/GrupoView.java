/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.GrupoController;
import Entidades.Grupo;
import Entidades.Profesor;
import Main.FrontEndDesktop;
import Model.GrupoModel;
import java.util.Observable;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven Villalobos
 */
public class GrupoView extends javax.swing.JInternalFrame implements java.util.Observer{

    /**
     * Creates new form GrupoView
     */
    private GrupoController controller;
    private GrupoModel model;
    public GrupoView() {
        initComponents();
        
    }
    public GrupoModel getModel(){
        return this.model;
    }
    public GrupoController getController(){
        return this.controller;
    }
    public void setModel(Model.GrupoModel model){
        this.model = model;
        model.addObserver(this);
    }
    public void setController(Controller.GrupoController controller){
        this.controller = controller;
    }
    public Profesor getProfesorComboBox(){
        return (Profesor) this.profesorComboBox.getSelectedItem();
    }
    public Object getCodigoCursoComboBox(){
        return this.codigoCursoComboBox.getSelectedItem();
    }
    public String getCodigoText(){
        return this.codigoText.getText();
    }
    public String getHorarioText(){
        return this.horarioText.getText();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoText = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoCursoLabel = new javax.swing.JLabel();
        profesorLabel = new javax.swing.JLabel();
        profesorLabel1 = new javax.swing.JLabel();
        profesorComboBox = new javax.swing.JComboBox();
        codigoCursoComboBox = new javax.swing.JComboBox();
        horarioText = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Grupo");

        codigoText.setPreferredSize(new java.awt.Dimension(250, 22));

        codigoLabel.setText("Codigo");

        codigoCursoLabel.setText("Codigo del curso");

        profesorLabel.setText("Profesor");
        profesorLabel.setToolTipText("");

        profesorLabel1.setText("Horario");
        profesorLabel1.setToolTipText("");

        guardarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/save.png"))); // NOI18N
        guardarButton.setText("Guardar cambios");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(profesorLabel1)
                            .addComponent(profesorLabel)
                            .addComponent(codigoCursoLabel)
                            .addComponent(codigoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profesorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigoCursoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horarioText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(guardarButton)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoCursoLabel)
                    .addComponent(codigoCursoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profesorLabel)
                    .addComponent(profesorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profesorLabel1)
                    .addComponent(horarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(guardarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        controller.guardar();
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrupoView().setVisible(true);
            }
        });
    }

    @Override
    public void update(Observable o, Object arg) {
//        try{
//            this.getController().actualizaModel();
//        }
//        catch (GlobalException | SQLException ex) {
//            Logger.getLogger(GrupoView.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Grupo grupo = model.getCurrent();
        if(model.getModo() == 1){
            codigoText.setEditable(false);
            this.setTitle("Editar grupo");
        }
        else{
            codigoText.setEditable(true);
            this.setTitle("Crear grupo");
        }
        
        codigoText.setText(grupo.getCodigo());
        if (model.getErrores().get("CODIGO")!=null){
            codigoText.setBorder(FrontEndDesktop.BORDER_ERROR);
            codigoText.setToolTipText(model.getErrores().get("CODIGO"));
        }
        else{
            codigoText.setBorder(null);
            codigoText.setToolTipText("");
        }
       
        horarioText.setText(grupo.getHorario());
        if (model.getErrores().get("HORARIO")!=null){
            horarioText.setBorder(FrontEndDesktop.BORDER_ERROR);
            horarioText.setToolTipText(model.getErrores().get("HORARIO"));
        }
        else{
           horarioText.setBorder(null);
           horarioText.setToolTipText("");
        }
        
        codigoCursoComboBox.setModel(model.getCursos());
        codigoCursoComboBox.setSelectedItem(grupo.getCodigo());
        
        profesorComboBox.setModel(model.getProfesores());
        profesorComboBox.setSelectedItem(grupo.getProfesor()); 
                this.validate();
        if (!model.getMensaje().equals("")){
            JOptionPane.showMessageDialog(this, model.getMensaje(), "",JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox codigoCursoComboBox;
    private javax.swing.JLabel codigoCursoLabel;
    private javax.swing.JLabel codigoLabel;
    public javax.swing.JTextField codigoText;
    private javax.swing.JButton guardarButton;
    public javax.swing.JTextField horarioText;
    public javax.swing.JComboBox profesorComboBox;
    private javax.swing.JLabel profesorLabel;
    private javax.swing.JLabel profesorLabel1;
    // End of variables declaration//GEN-END:variables
}
