package VIEW;
import Model.Model_Customers;
import DAO.D_CUSTOMERS;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.DeviceRgb;
public class DISPLAY_CUSTOMERS extends javax.swing.JFrame {

    /**
     * Creates new form DISPLAY_GUI
     */
    private String username ;
    public DISPLAY_CUSTOMERS(String username) {
        initComponents();
        this.username = username ;
        
    }
    
    
     // Method to populate the table with loan records
    private void populateTable() {
        D_CUSTOMERS d_customer = new D_CUSTOMERS ();
        DefaultTableModel model = (DefaultTableModel) data_table.getModel();
        
        model.setRowCount(0);
        
        List <Model_Customers> customers = d_customer.display_customers();
        
        for(Model_Customers customer :customers){
            
            Object [] row = {
                
                customer.getCustomer_id(),
                customer.getName(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getContact_number()
                
            };
            
            model.addRow(row);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        data_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Back_btn = new javax.swing.JButton();
        retrieve_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        customer_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contact_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        report_btn = new javax.swing.JButton();
        add_cust = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        data_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Customer_id", "Customer Name", "Email", "Address", "Contact Number"
            }
        ));
        data_table.setGridColor(new java.awt.Color(102, 255, 204));
        data_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_table);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("All customers");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Resized_Logo.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(102, 255, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 204));
        jLabel3.setText("Speedy Loans");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Back_btn.setBackground(new java.awt.Color(102, 255, 204));
        Back_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Back_btn.setText("Back");
        Back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_btnActionPerformed(evt);
            }
        });

        retrieve_btn.setBackground(new java.awt.Color(102, 255, 204));
        retrieve_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        retrieve_btn.setText("Retrieve");
        retrieve_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrieve_btnActionPerformed(evt);
            }
        });

        clear_btn.setBackground(new java.awt.Color(102, 255, 204));
        clear_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear_btn.setText("Clear");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        jLabel4.setText("______________________________________________________________________________________________________________________________________");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Customer Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contact Number:");

        delete_btn.setBackground(new java.awt.Color(102, 255, 204));
        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        update_btn.setBackground(new java.awt.Color(102, 255, 204));
        update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        report_btn.setBackground(new java.awt.Color(102, 255, 204));
        report_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        report_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/290137_clipboard_document_file_list_report_icon.png"))); // NOI18N
        report_btn.setText("Report");
        report_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                report_btnActionPerformed(evt);
            }
        });

        add_cust.setBackground(new java.awt.Color(102, 255, 204));
        add_cust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/Add_1.png"))); // NOI18N
        add_cust.setText("CUSTOMER");
        add_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_custActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 42, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customer_field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(85, 85, 85)
                            .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(40, 40, 40)
                            .addComponent(contact_field, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(retrieve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(report_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_cust, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(customer_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(contact_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retrieve_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void Back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_btnActionPerformed
      this.dispose();
      new ADMIN_DASHBOARD(username).show();
    }//GEN-LAST:event_Back_btnActionPerformed

    private void retrieve_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrieve_btnActionPerformed
        populateTable();
    }//GEN-LAST:event_retrieve_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) data_table.getModel();
        model.setRowCount(0); 
        customer_field.setText("");
        email_field.setText("");
        address_field.setText("");
        contact_field.setText("");
    }//GEN-LAST:event_clear_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
               
            D_CUSTOMERS d_customer = new D_CUSTOMERS();
            DefaultTableModel model = (DefaultTableModel) data_table.getModel();
            if (data_table.getSelectedRowCount() == 1) {
            int selectedRow = data_table.getSelectedRow();
            int customer_id = (int) model.getValueAt(selectedRow, 0); 
            model.removeRow(selectedRow);
            d_customer.delete_customer(customer_id);
            JOptionPane.showMessageDialog(null, "Row deleted successfully");
        } else {
            if (data_table.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a single row to delete");
            }
        } 
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        
        D_CUSTOMERS d_customer  = new D_CUSTOMERS();
        DefaultTableModel model = (DefaultTableModel) data_table.getModel();
        if(data_table.getSelectedRowCount()==1){
            
            int selectedRow = data_table.getSelectedRow();
            int customer_id = (int) model.getValueAt(selectedRow, 0);
            String name = customer_field.getText();
            String email = email_field.getText();
            String address = address_field.getText();
            String contact = contact_field.getText();
            
            model.setValueAt(name,data_table.getSelectedRow(), 1);
            model.setValueAt(email,data_table.getSelectedRow(), 2);
            model.setValueAt(address,data_table.getSelectedRow(), 3);
            model.setValueAt(contact,data_table.getSelectedRow(), 4);
            
            d_customer.update_customer(customer_id, name, email, address, contact);
            JOptionPane.showMessageDialog(null, "Updated successfully");
        }else{
            
            if(data_table.getRowCount()==0){
                
                JOptionPane.showMessageDialog(null,"Table is empty");
            }else{
                
                JOptionPane.showMessageDialog(null, "Please select one row");
            }
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void data_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_tableMouseClicked
       
       DefaultTableModel model = (DefaultTableModel) data_table.getModel();
       String name = model.getValueAt(data_table.getSelectedRow(),1).toString();
       String email = model.getValueAt(data_table.getSelectedRow(),2).toString();
       String adress = model.getValueAt(data_table.getSelectedRow(),3).toString();
       String contact_number = model.getValueAt(data_table.getSelectedRow(),4).toString();
       
       customer_field.setText(name);
       email_field.setText(email);
       address_field.setText(adress);
       contact_field.setText(contact_number);
    }//GEN-LAST:event_data_tableMouseClicked

    private void report_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_report_btnActionPerformed

        try {
            String fileName = "customer_report_" + System.currentTimeMillis() + ".pdf"; // Unique filename based on timestamp
            PdfDocument pdfDoc = new PdfDocument(new PdfWriter(fileName));
            Document document = new Document(pdfDoc);
            Color blueColor = new DeviceRgb(0, 0, 255);
            // Title of the report
            document.add(new Paragraph("Customer Report").setFontColor(blueColor).setBold().setFontSize(20f));
            document.add(new Paragraph("______________________________________________________________________________"));
            document.add(new Paragraph());

            // Table header
            Table table = new Table(new float[]{1, 3, 3, 5, 2}).useAllAvailableWidth();
            table.addCell(new Cell().add(new Paragraph("ID")));
            table.addCell(new Cell().add(new Paragraph("Name")));
            table.addCell(new Cell().add(new Paragraph("Email")));
            table.addCell(new Cell().add(new Paragraph("Address")));
            table.addCell(new Cell().add(new Paragraph("Contact Number")));

            // Populate table with customer data
            D_CUSTOMERS d_customer = new D_CUSTOMERS();
            List<Model_Customers> customers = d_customer.display_customers();
            for (Model_Customers customer : customers) {
                table.addCell(new Cell().add(new Paragraph(String.valueOf(customer.getCustomer_id()))));
                table.addCell(new Cell().add(new Paragraph(customer.getName())));
                table.addCell(new Cell().add(new Paragraph(customer.getEmail())));
                table.addCell(new Cell().add(new Paragraph(customer.getAddress())));
                table.addCell(new Cell().add(new Paragraph(customer.getContact_number())));
            }

            // Add the table to the document
            document.add(table);

            document.close();
            JOptionPane.showMessageDialog(this, "Report generated successfully!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LOAN_REG_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_report_btnActionPerformed

    private void add_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_custActionPerformed
        this.dispose();
        new ADD_CUSTOMER_GUI(username).show();
        
    }//GEN-LAST:event_add_custActionPerformed

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
            java.util.logging.Logger.getLogger(DISPLAY_CUSTOMERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_CUSTOMERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_CUSTOMERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DISPLAY_CUSTOMERS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        String user_name = "your_username";
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DISPLAY_CUSTOMERS(user_name).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_btn;
    private javax.swing.JButton add_cust;
    private javax.swing.JTextField address_field;
    private javax.swing.JButton clear_btn;
    private javax.swing.JTextField contact_field;
    private javax.swing.JTextField customer_field;
    private javax.swing.JTable data_table;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField email_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton report_btn;
    private javax.swing.JButton retrieve_btn;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
