/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CicloController;
import Entidades.Ciclo;
import Main.FrontEndDesktop;
import Model.CicloModel;
import java.sql.Date;
import java.util.Calendar;
import java.util.Observable;

/**
 *
 * @author Usuario1
 */
public class CicloView extends javax.swing.JInternalFrame implements java.util.Observer{

    /**
     * Creates new form CicloView
     */
    public CicloView() {
        initComponents();
        DatePickerFI.setFormats("dd/MM/yyyy");
        DatePickerFI.setDate(Calendar.getInstance().getTime());
        
        DatePickerFF.setFormats("dd/MM/yyyy");
        DatePickerFF.setDate(Calendar.getInstance().getTime());
    }
    
    CicloController controller;
    CicloModel model;
    
     public CicloController getController() {
        return controller;
    }
    public void setController(CicloController controller){
        this.controller=controller;
    }
    public void setModel(CicloModel model){
        this.model=model;
         model.addObserver(this);
    }

    public CicloModel getModel() {
        return model;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoEstado = new javax.swing.ButtonGroup();
        grupoCiclo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        codigoFld = new javax.swing.JTextField();
        anoFld = new javax.swing.JTextField();
        RBActivo = new javax.swing.JRadioButton();
        RBInactivo = new javax.swing.JRadioButton();
        RBPrimero = new javax.swing.JRadioButton();
        RBSegundo = new javax.swing.JRadioButton();
        RBVerano = new javax.swing.JRadioButton();
        DatePickerFI = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        DatePickerFF = new org.jdesktop.swingx.JXDatePicker();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Ciclo");

        jLabel1.setText("Código");

        jLabel2.setText("Año");

        jLabel3.setText("Estado");

        jLabel4.setText("Ciclo");

        jLabel5.setText("Fecha de Inicio");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        grupoEstado.add(RBActivo);
        RBActivo.setText("Activo");

        grupoEstado.add(RBInactivo);
        RBInactivo.setText("Inactivo");

        grupoCiclo.add(RBPrimero);
        RBPrimero.setText("Primer");

        grupoCiclo.add(RBSegundo);
        RBSegundo.setText("Segundo");

        grupoCiclo.add(RBVerano);
        RBVerano.setText("Verano");

        jLabel6.setText("Fecha de Finalización");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBActivo)
                                .addGap(18, 18, 18)
                                .addComponent(RBInactivo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBPrimero)
                                .addGap(18, 18, 18)
                                .addComponent(RBSegundo)
                                .addGap(18, 18, 18)
                                .addComponent(RBVerano))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DatePickerFI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(DatePickerFF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(codigoFld, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(anoFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(codigoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(anoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RBActivo)
                    .addComponent(RBInactivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(RBPrimero)
                    .addComponent(RBSegundo)
                    .addComponent(RBVerano))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(DatePickerFI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DatePickerFF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.controller.guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public org.jdesktop.swingx.JXDatePicker DatePickerFF;
    public org.jdesktop.swingx.JXDatePicker DatePickerFI;
    public javax.swing.JRadioButton RBActivo;
    public javax.swing.JRadioButton RBInactivo;
    public javax.swing.JRadioButton RBPrimero;
    public javax.swing.JRadioButton RBSegundo;
    public javax.swing.JRadioButton RBVerano;
    public javax.swing.JTextField anoFld;
    private javax.swing.JButton btnGuardar;
    public javax.swing.JTextField codigoFld;
    private javax.swing.ButtonGroup grupoCiclo;
    private javax.swing.ButtonGroup grupoEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    
    public Date getDateFromDatePickerFI(){
        return new java.sql.Date(DatePickerFI.getDate().getTime());
    }
    
    public Date getDateFromDatePickerFF(){
        return new java.sql.Date(DatePickerFF.getDate().getTime());
    }
    
    @Override
    public void update(Observable o, Object arg) {
        Ciclo cicloCurrent = model.getCurrent();        
       
       codigoFld.setText(cicloCurrent.getCodigo());
       if (model.getErrores().get("CODIGO")!=null){
            codigoFld.setBorder(FrontEndDesktop.BORDER_ERROR);
            codigoFld.setToolTipText(model.getErrores().get("CODIGO"));
        }
        else{
            codigoFld.setBorder(null);
            codigoFld.setToolTipText("");
        }
       
        anoFld.setText(cicloCurrent.getAno());
        if (model.getErrores().get("ANO")!=null){
            anoFld.setBorder(FrontEndDesktop.BORDER_ERROR);
            anoFld.setToolTipText(model.getErrores().get("ANO"));
        }
        else{
           anoFld.setBorder(null);
           anoFld.setToolTipText("");
        }

        DatePickerFI.setDate(cicloCurrent.getFecha_inicio());
//        if(cicloCurrent.getFecha_inicio().toString().isEmpty()){
//            DatePickerFI.setBorder(FrontEndDesktop.BORDER_ERROR);
//            DatePickerFI.setToolTipText(model.getErrores().get("Fecha_Inicio"));
//        }
//        else{
//            DatePickerFI.setBorder(null);
//            DatePickerFI.setToolTipText("");
//        }
        
        DatePickerFF.setDate(cicloCurrent.getFecha_finalizacion());
//        if(cicloCurrent.getFecha_finalizacion().toString().isEmpty()){
//            DatePickerFF.setBorder(FrontEndDesktop.BORDER_ERROR);
//            DatePickerFF.setToolTipText(model.getErrores().get("Fecha_Finalizacion"));
//        }
//        else{
//            DatePickerFF.setBorder(null);
//            DatePickerFF.setToolTipText("");
//        }



        this.validate();
        if (!model.getMensaje().equals(""))
        {
            //JOptionPane.showMessageDialog(this, model.getMensaje(), "",JOptionPane.INFORMATION_MESSAGE,FrontEndDesktop.CARRERAS_VIEW.iconoload);
        }
    }
}
