/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelPage;


import static hotel.Hotel.CheckIn;
import static hotel.Hotel.habitaciones;
import static hotel.Hotel.registroClientes;
import static hotel.Hotel.registronumhab;
import static hotel.Hotel.reservas;
import hotel.Proyecto;
import hotel.Reserva;
import static java.lang.String.valueOf;
import javax.swing.JOptionPane;

/**
 *
 * @author donat
 */
public class menu extends javax.swing.JFrame {
    
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        check_in.setVisible(false);
        check_out.setVisible(false);
        buscar.setVisible(false);
        HistorialC.setVisible(false);
        registros.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Registros = new javax.swing.JButton();
        CheckOut = new javax.swing.JButton();
        CheckIn = new javax.swing.JButton();
        Historial = new javax.swing.JButton();
        Busqueda = new javax.swing.JButton();
        check_out = new javax.swing.JLayeredPane();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nombre3 = new javax.swing.JTextField();
        Cedula3 = new javax.swing.JTextField();
        listoReserva4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        apellido4 = new javax.swing.JTextField();
        check_in = new javax.swing.JLayeredPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre2 = new javax.swing.JTextField();
        Cedula2 = new javax.swing.JTextField();
        listochein = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        apellido3 = new javax.swing.JTextField();
        HistorialC = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        NumH = new javax.swing.JTextField();
        listoReserva = new javax.swing.JButton();
        buscar = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        Cedula1 = new javax.swing.JTextField();
        listoReserva3 = new javax.swing.JButton();
        DataReservas = new javax.swing.JLabel();
        registros = new javax.swing.JLayeredPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        apellido1 = new javax.swing.JTextField();
        listohab = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setFocusable(false);
        jLayeredPane1.setOpaque(true);

        Registros.setBackground(new java.awt.Color(0, 255, 255));
        Registros.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Registros.setForeground(new java.awt.Color(0, 0, 0));
        Registros.setText("Registro");
        Registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrosActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Registros);
        Registros.setBounds(10, 0, 130, 40);

        CheckOut.setBackground(new java.awt.Color(0, 255, 255));
        CheckOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckOut.setForeground(new java.awt.Color(0, 0, 0));
        CheckOut.setText("Check-Out");
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });
        jLayeredPane1.add(CheckOut);
        CheckOut.setBounds(570, 0, 120, 40);

        CheckIn.setBackground(new java.awt.Color(0, 255, 255));
        CheckIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CheckIn.setForeground(new java.awt.Color(0, 0, 0));
        CheckIn.setText("Check-In");
        CheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInActionPerformed(evt);
            }
        });
        jLayeredPane1.add(CheckIn);
        CheckIn.setBounds(440, 0, 120, 40);

        Historial.setBackground(new java.awt.Color(0, 255, 255));
        Historial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Historial.setForeground(new java.awt.Color(0, 0, 0));
        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Historial);
        Historial.setBounds(290, 0, 140, 40);

        Busqueda.setBackground(new java.awt.Color(0, 255, 255));
        Busqueda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(0, 0, 0));
        Busqueda.setText("Reservas");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Busqueda);
        Busqueda.setBounds(150, 0, 130, 40);

        jPanel1.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        check_out.setOpaque(true);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Numero de Habitacion: ");
        check_out.add(jLabel10);
        jLabel10.setBounds(40, 120, 170, 20);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Nombre: ");
        check_out.add(jLabel11);
        jLabel11.setBounds(40, 40, 70, 20);

        nombre3.setBackground(new java.awt.Color(255, 255, 255));
        nombre3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre3.setForeground(new java.awt.Color(0, 0, 0));
        nombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre3ActionPerformed(evt);
            }
        });
        check_out.setLayer(nombre3, javax.swing.JLayeredPane.DRAG_LAYER);
        check_out.add(nombre3);
        nombre3.setBounds(120, 40, 200, 26);

        Cedula3.setBackground(new java.awt.Color(255, 255, 255));
        Cedula3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cedula3.setForeground(new java.awt.Color(0, 0, 0));
        Cedula3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cedula3ActionPerformed(evt);
            }
        });
        check_out.add(Cedula3);
        Cedula3.setBounds(200, 120, 200, 26);

        listoReserva4.setBackground(new java.awt.Color(0, 204, 0));
        listoReserva4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listoReserva4.setForeground(new java.awt.Color(0, 0, 0));
        listoReserva4.setText("Buscar");
        check_out.add(listoReserva4);
        listoReserva4.setBounds(530, 260, 73, 26);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Apellido: ");
        check_out.add(jLabel12);
        jLabel12.setBounds(40, 80, 70, 20);

        apellido4.setBackground(new java.awt.Color(255, 255, 255));
        apellido4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellido4.setForeground(new java.awt.Color(0, 0, 0));
        apellido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido4ActionPerformed(evt);
            }
        });
        check_out.add(apellido4);
        apellido4.setBounds(120, 80, 200, 26);

        jPanel1.add(check_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 310));

        check_in.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cedula: ");
        check_in.add(jLabel6);
        jLabel6.setBounds(40, 120, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Nombre: ");
        check_in.add(jLabel7);
        jLabel7.setBounds(40, 40, 70, 20);

        nombre2.setBackground(new java.awt.Color(255, 255, 255));
        nombre2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre2.setForeground(new java.awt.Color(0, 0, 0));
        nombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre2ActionPerformed(evt);
            }
        });
        check_in.setLayer(nombre2, javax.swing.JLayeredPane.DRAG_LAYER);
        check_in.add(nombre2);
        nombre2.setBounds(120, 40, 200, 26);

        Cedula2.setBackground(new java.awt.Color(255, 255, 255));
        Cedula2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cedula2.setForeground(new java.awt.Color(0, 0, 0));
        Cedula2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cedula2ActionPerformed(evt);
            }
        });
        check_in.add(Cedula2);
        Cedula2.setBounds(110, 120, 200, 26);

        listochein.setBackground(new java.awt.Color(0, 204, 0));
        listochein.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listochein.setForeground(new java.awt.Color(0, 0, 0));
        listochein.setText("Buscar");
        listochein.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listocheinActionPerformed(evt);
            }
        });
        check_in.add(listochein);
        listochein.setBounds(530, 260, 73, 26);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Apellido: ");
        check_in.add(jLabel9);
        jLabel9.setBounds(40, 80, 70, 20);

        apellido3.setBackground(new java.awt.Color(255, 255, 255));
        apellido3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellido3.setForeground(new java.awt.Color(0, 0, 0));
        apellido3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido3ActionPerformed(evt);
            }
        });
        check_in.add(apellido3);
        apellido3.setBounds(120, 80, 200, 26);

        jPanel1.add(check_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 310));

        HistorialC.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Numero de Habitacion: ");
        HistorialC.add(jLabel3);
        jLabel3.setBounds(50, 40, 170, 20);

        NumH.setBackground(new java.awt.Color(255, 255, 255));
        NumH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumH.setForeground(new java.awt.Color(0, 0, 0));
        NumH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumHActionPerformed(evt);
            }
        });
        HistorialC.setLayer(NumH, javax.swing.JLayeredPane.DRAG_LAYER);
        HistorialC.add(NumH);
        NumH.setBounds(220, 40, 200, 26);

        listoReserva.setBackground(new java.awt.Color(0, 204, 0));
        listoReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listoReserva.setForeground(new java.awt.Color(0, 0, 0));
        listoReserva.setText("Buscar");
        listoReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoReservaActionPerformed(evt);
            }
        });
        HistorialC.add(listoReserva);
        listoReserva.setBounds(530, 260, 73, 26);

        jPanel1.add(HistorialC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 310));

        buscar.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cedula: ");
        buscar.add(jLabel8);
        jLabel8.setBounds(40, 40, 70, 30);

        Cedula1.setBackground(new java.awt.Color(255, 255, 255));
        Cedula1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cedula1.setForeground(new java.awt.Color(0, 0, 0));
        Cedula1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cedula1ActionPerformed(evt);
            }
        });
        buscar.setLayer(Cedula1, javax.swing.JLayeredPane.DRAG_LAYER);
        buscar.add(Cedula1);
        Cedula1.setBounds(110, 40, 200, 26);

        listoReserva3.setBackground(new java.awt.Color(0, 204, 0));
        listoReserva3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listoReserva3.setForeground(new java.awt.Color(0, 0, 0));
        listoReserva3.setText("Buscar");
        listoReserva3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listoReserva3ActionPerformed(evt);
            }
        });
        buscar.add(listoReserva3);
        listoReserva3.setBounds(530, 260, 73, 26);
        buscar.add(DataReservas);
        DataReservas.setBounds(80, 80, 430, 200);

        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 310));

        registros.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido: ");
        registros.add(jLabel4);
        jLabel4.setBounds(40, 80, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nombre: ");
        registros.add(jLabel5);
        jLabel5.setBounds(40, 40, 70, 20);

        nombre1.setBackground(new java.awt.Color(255, 255, 255));
        nombre1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre1.setForeground(new java.awt.Color(0, 0, 0));
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        registros.setLayer(nombre1, javax.swing.JLayeredPane.DRAG_LAYER);
        registros.add(nombre1);
        nombre1.setBounds(120, 40, 200, 26);

        apellido1.setBackground(new java.awt.Color(255, 255, 255));
        apellido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        apellido1.setForeground(new java.awt.Color(0, 0, 0));
        apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellido1ActionPerformed(evt);
            }
        });
        registros.add(apellido1);
        apellido1.setBounds(120, 80, 200, 26);

        listohab.setBackground(new java.awt.Color(0, 204, 0));
        listohab.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listohab.setForeground(new java.awt.Color(0, 0, 0));
        listohab.setText("Buscar");
        listohab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listohabActionPerformed(evt);
            }
        });
        registros.add(listohab);
        listohab.setBounds(530, 260, 73, 26);

        jPanel1.add(registros, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 640, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/fondeeee700.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        // TODO add your handling code here:
        check_in.setVisible(false);
        check_out.setVisible(false);
        buscar.setVisible(false);
        HistorialC.setVisible(true);
        registros.setVisible(false);
    }//GEN-LAST:event_HistorialActionPerformed

    private void RegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrosActionPerformed
        // TODO add your handling code here:
        check_in.setVisible(false);
        check_out.setVisible(false);
        buscar.setVisible(false);
        HistorialC.setVisible(false);
        registros.setVisible(true);
    }//GEN-LAST:event_RegistrosActionPerformed

    private void NumHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumHActionPerformed

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido1ActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
        check_in.setVisible(false);
        check_out.setVisible(false);
        buscar.setVisible(true);
        HistorialC.setVisible(false);
        registros.setVisible(false);
    }//GEN-LAST:event_BusquedaActionPerformed

    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
        // TODO add your handling code here:
        check_in.setVisible(false);
        check_out.setVisible(true);
        buscar.setVisible(false);
        HistorialC.setVisible(false);
        registros.setVisible(false);
    }//GEN-LAST:event_CheckOutActionPerformed

    private void nombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre2ActionPerformed

    private void Cedula2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cedula2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cedula2ActionPerformed

    private void Cedula1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cedula1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cedula1ActionPerformed

    private void apellido3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido3ActionPerformed

    private void nombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre3ActionPerformed

    private void Cedula3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cedula3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cedula3ActionPerformed

    private void apellido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellido4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellido4ActionPerformed

    private void CheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInActionPerformed
        // TODO add your handling code here:
        check_in.setVisible(true);
        check_out.setVisible(false);
        buscar.setVisible(false);
        HistorialC.setVisible(false);
        registros.setVisible(false);
    }//GEN-LAST:event_CheckInActionPerformed

    private void listoReserva3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoReserva3ActionPerformed
        try{
        String ci = Cedula1.getText().replace(".", "");
        Long cedulaB =  Long.valueOf(ci);
        JOptionPane.showMessageDialog(null, valueOf(reservas.get(cedulaB)));
        }catch (Exception e){
            System.out.println(e + " coso");
        }
    }//GEN-LAST:event_listoReserva3ActionPerformed

    private void listoReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listoReservaActionPerformed
        try{
        int habitaN =  Integer.parseInt(NumH.getText());
        JOptionPane.showMessageDialog(null, habitaciones.search(habitaN).getHistorial());
        }catch (Exception e){
            System.out.println(e + " cosa");
        }
    }//GEN-LAST:event_listoReservaActionPerformed

    private void listohabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listohabActionPerformed
        try{
        String habitaN =  nombre1.getText() + ", " + apellido1.getText();
            if (registronumhab.get(habitaN) != null) {
                JOptionPane.showMessageDialog(null, habitaN + " se encuentra en la habitacion numero: " +registronumhab.get(habitaN));
            }else{
                JOptionPane.showMessageDialog(null, " No se encuentra hospedado");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_listohabActionPerformed

    private void listocheinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listocheinActionPerformed
        String ci = Cedula2.getText().replace(".", "");
        
        Long cedulaB =  Long.valueOf(ci);
        if (reservas.get(cedulaB) != null) {
            JOptionPane.showMessageDialog(null, valueOf(reservas.get(cedulaB)) + " papapappapapa");  
            CheckIn(reservas.get(cedulaB));
            reservas.remove(cedulaB);
        }else{
          JOptionPane.showMessageDialog(null, "No se encontro la reservacion");  
        }
        
    }//GEN-LAST:event_listocheinActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto();
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Busqueda;
    private javax.swing.JTextField Cedula1;
    private javax.swing.JTextField Cedula2;
    private javax.swing.JTextField Cedula3;
    private javax.swing.JButton CheckIn;
    private javax.swing.JButton CheckOut;
    private javax.swing.JLabel DataReservas;
    private javax.swing.JButton Historial;
    private javax.swing.JLayeredPane HistorialC;
    private javax.swing.JTextField NumH;
    private javax.swing.JButton Registros;
    private javax.swing.JTextField apellido1;
    private javax.swing.JTextField apellido3;
    private javax.swing.JTextField apellido4;
    private javax.swing.JLayeredPane buscar;
    private javax.swing.JLayeredPane check_in;
    private javax.swing.JLayeredPane check_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton listoReserva;
    private javax.swing.JButton listoReserva3;
    private javax.swing.JButton listoReserva4;
    private javax.swing.JButton listochein;
    private javax.swing.JButton listohab;
    private javax.swing.JTextField nombre1;
    private javax.swing.JTextField nombre2;
    private javax.swing.JTextField nombre3;
    private javax.swing.JLayeredPane registros;
    // End of variables declaration//GEN-END:variables
}
