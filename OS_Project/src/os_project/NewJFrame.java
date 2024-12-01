package os_project;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
       DefaultTableModel model;
       File f;
    public NewJFrame() {
        initComponents();
                model = (DefaultTableModel) processTable.getModel();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        processIdField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpuTimeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        priorityField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        timeQuantumField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboBoxAlgorithms = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        processTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 520));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(870, 520));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 520));
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(435, 520));
        jPanel2.setPreferredSize(new java.awt.Dimension(435, 520));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CPU Scheduler");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "ADD Process\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Num OF Processes");

        processIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("CPU Time");

        cpuTimeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Priority");

        priorityField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Time Quantum");

        timeQuantumField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(processIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cpuTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(priorityField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(timeQuantumField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpuTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(priorityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeQuantumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Select Algorithm");

        comboBoxAlgorithms.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxAlgorithms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Round Robin", "Priority Scheduling" }));
        comboBoxAlgorithms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAlgorithmsActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Add Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Run Algorithm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboBoxAlgorithms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBoxAlgorithms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(clear))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 435, 520);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setMinimumSize(new java.awt.Dimension(435, 520));
        jPanel4.setPreferredSize(new java.awt.Dimension(435, 520));

        processTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Process ID", "CPU Time", "Priority", "Time Quantum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(processTable);
        if (processTable.getColumnModel().getColumnCount() > 0) {
            processTable.getColumnModel().getColumn(0).setResizable(false);
            processTable.getColumnModel().getColumn(0).setPreferredWidth(10);
            processTable.getColumnModel().getColumn(1).setResizable(false);
            processTable.getColumnModel().getColumn(2).setResizable(false);
            processTable.getColumnModel().getColumn(3).setResizable(false);
            processTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(425, 0, 450, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if (!processIdField.getText().trim().isEmpty() && !cpuTimeField.getText().trim().isEmpty()) {
    try {
        // قراءة المدخلات من الحقول النصية
        int processId = Integer.parseInt(processIdField.getText().trim());
        int cpuTime = Integer.parseInt(cpuTimeField.getText().trim());
        int priority = priorityField.getText().trim().isEmpty() ? 0 : Integer.parseInt(priorityField.getText().trim());
        Integer timeQuantum = timeQuantumField.getText().trim().isEmpty() ? null : Integer.parseInt(timeQuantumField.getText().trim());

        // إنشاء كائن العملية
        Process newProcess = new Process(processId, cpuTime, priority, timeQuantum);

        // التحقق من صلاحية العملية
        if (!newProcess.isValid()) {
            JOptionPane.showMessageDialog(this, newProcess.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // إضافة العملية إلى الجدول
            addToTable(newProcess);
            JOptionPane.showMessageDialog(this, "Process added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Process ID, CPU Time, Priority, and Time Quantum.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "An unexpected error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
} else {
    // إذا كانت الحقول الأساسية فارغة
    JOptionPane.showMessageDialog(this, "Please enter the main information (Process ID and CPU Time)!", "Input Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
    clearFields();
        JOptionPane.showMessageDialog(this, "Process Done successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_clearActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
deleteSelectedRow();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboBoxAlgorithmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAlgorithmsActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxAlgorithmsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   // الحصول على الخوارزمية المختارة من ComboBox
    String selectedAlgorithm = comboBoxAlgorithms.getSelectedItem().toString();

    // التحقق من الخوارزمية المختارة وتشغيلها
    if (selectedAlgorithm.equals("FCFS")) {
        runFCFS();  // تنفيذ خوارزمية FCFS
    } else if (selectedAlgorithm.equals("SJF")) {
        runSJF();   // تنفيذ خوارزمية SJF
    } else if (selectedAlgorithm.equals("Round Robin")) {
        // الحصول على قيمة Time Quantum
        try {
            int timeQuantum = Integer.parseInt(timeQuantumField.getText().trim());
            runRoundRobin(timeQuantum); // تنفيذ خوارزمية Round Robin
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Time Quantum!", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // في حالة عدم اختيار خوارزمية
        JOptionPane.showMessageDialog(this, "Please select a valid algorithm.", "Error", JOptionPane.ERROR_MESSAGE);
    }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
   public void deleteSelectedRow() {
    // الحصول على النموذج المرتبط بالجدول
    DefaultTableModel model = (DefaultTableModel) processTable.getModel();
    
    // التحقق إذا كان هناك صف محدد
    int selectedRow = processTable.getSelectedRow();
    if (selectedRow == -1) {
        // إذا لم يتم تحديد أي صف، إظهار رسالة للمستخدم
        JOptionPane.showMessageDialog(this, "Please select a row to delete!", "Error", JOptionPane.ERROR_MESSAGE);
    } else {
        // حذف الصف المحدد
        model.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Row deleted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
    
    
    public void clearFields() {
    processIdField.setText("");   // تفريغ حقل Process ID
    cpuTimeField.setText("");     // تفريغ حقل CPU Time
    priorityField.setText("");    // تفريغ حقل Priority
    timeQuantumField.setText(""); // تفريغ حقل Time Quantum
}
   
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> comboBoxAlgorithms;
    private javax.swing.JTextField cpuTimeField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priorityField;
    private javax.swing.JTextField processIdField;
    private javax.swing.JTable processTable;
    private javax.swing.JTextField timeQuantumField;
    // End of variables declaration//GEN-END:variables
 
    //*************************************************
    private void runPriorityScheduling() {
    DefaultTableModel model = (DefaultTableModel) processTable.getModel();
    int rowCount = model.getRowCount();

    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "No processes available in the table!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // إعداد قائمة العمليات بدون Generics
    ArrayList processes = new ArrayList();
    for (int i = 0; i < rowCount; i++) {
        // إضافة العمليات إلى القائمة
        processes.add(new Process(
            Integer.parseInt(model.getValueAt(i, 1).toString()), // Process ID
            Integer.parseInt(model.getValueAt(i, 2).toString()), // CPU Time
            Integer.parseInt(model.getValueAt(i, 3).toString()), // Priority
            0 // Time Quantum (لن نستخدمه هنا)
        ));
    }

    // ترتيب العمليات حسب الأولوية (أعلى قيمة تعني أعلى أولوية)
    Collections.sort(processes, new Comparator() {
        public int compare(Object o1, Object o2) {
            Process p1 = (Process) o1;
            Process p2 = (Process) o2;
            return Integer.compare(p2.getPriority(), p1.getPriority());
        }
    });

    int currentTime = 0;
    StringBuilder result = new StringBuilder("Priority Scheduling Execution Order:\n");

    // تنفيذ العمليات بناءً على الأولوية
    for (int i = 0; i < processes.size(); i++) {
        Process process = (Process) processes.get(i);
        result.append("Process ").append(process.getProcessId())
              .append(" starts at ").append(currentTime)
              .append(" and runs for ").append(process.getCpuTime()).append(" units.\n");
        currentTime += process.getCpuTime();
    }

    JOptionPane.showMessageDialog(this, result.toString(), "Priority Scheduling Results", JOptionPane.INFORMATION_MESSAGE);
}

//--------------------------------------------------------------
    private void runRoundRobin(int timeQuantum) {
    DefaultTableModel model = (DefaultTableModel) processTable.getModel();
    int rowCount = model.getRowCount();

    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "No processes available in the table!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (timeQuantum <= 0) {
        JOptionPane.showMessageDialog(this, "Invalid Time Quantum value!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // إعداد قائمة العمليات
    ArrayList<Process> processes = new ArrayList<>();
    for (int i = 0; i < rowCount; i++) {
        processes.add(new Process(
            Integer.parseInt(model.getValueAt(i, 1).toString()), // Process ID
            Integer.parseInt(model.getValueAt(i, 2).toString()), // CPU Time
            Integer.parseInt(model.getValueAt(i, 3).toString()), // Priority
            0 // Time Quantum (لن نستخدمه هنا كخاصية لكل عملية)
        ));
    }

    int currentTime = 0;
    StringBuilder result = new StringBuilder("Round Robin Execution Order:\n");

    while (!processes.isEmpty()) {
        Process process = processes.remove(0); // احصل على أول عملية
        int remainingTime = process.getCpuTime();

        if (remainingTime > timeQuantum) {
            result.append("Process ").append(process.getProcessId())
                  .append(" runs from ").append(currentTime)
                  .append(" to ").append(currentTime + timeQuantum).append(" units.\n");
            currentTime += timeQuantum;
            process.setcpuTime(remainingTime - timeQuantum); // تحديث الزمن المتبقي
            processes.add(process); // إرجاع العملية إلى نهاية القائمة
        } else {
            result.append("Process ").append(process.getProcessId())
                  .append(" runs from ").append(currentTime)
                  .append(" to ").append(currentTime + remainingTime).append(" units.\n");
            currentTime += remainingTime;
        }
    }

    JOptionPane.showMessageDialog(this, result.toString(), "Round Robin Results", JOptionPane.INFORMATION_MESSAGE);
}
    

//-----------------------------------------------------------------------------
    ////////////////////ٍSJF
    private void runSJF() {
    DefaultTableModel model = (DefaultTableModel) processTable.getModel();
    int rowCount = model.getRowCount();

    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "No processes available in the table!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // إنشاء قائمة تحتوي على العمليات بدون Generic Types
    ArrayList processes = new ArrayList();
    for (int i = 0; i < rowCount; i++) {
        int processId = Integer.parseInt(model.getValueAt(i, 1).toString());
        int cpuTime = Integer.parseInt(model.getValueAt(i, 2).toString());
        int priority = Integer.parseInt(model.getValueAt(i, 3).toString());
        int timeQuantum = Integer.parseInt(model.getValueAt(i, 4).toString());

        // إضافة كائن العملية إلى القائمة
        processes.add(new Process(processId, cpuTime, priority, timeQuantum));
    }

    // ترتيب العمليات يدويًا بناءً على CPU Time
    for (int i = 0; i < processes.size() - 1; i++) {
        for (int j = i + 1; j < processes.size(); j++) {
            Process p1 = (Process) processes.get(i);
            Process p2 = (Process) processes.get(j);
            if (p1.getCpuTime() > p2.getCpuTime()) {
                // تبديل العناصر
                processes.set(i, p2);
                processes.set(j, p1);
            }
        }
    }

    int currentTime = 0;
    StringBuilder result = new StringBuilder("SJF Execution Order:\n");

    for (int i = 0; i < processes.size(); i++) {
        Process process = (Process) processes.get(i);
        result.append("Process ").append(process.getProcessId())
              .append(" starts at ").append(currentTime)
              .append(" and runs for ").append(process.getCpuTime()).append(" units.\n");

        currentTime += process.getCpuTime();
    }

    JOptionPane.showMessageDialog(this, result.toString(), "SJF Results", JOptionPane.INFORMATION_MESSAGE);
}
    //-------------------------------------------------------------------------
    ////FCFS
    private void runFCFS() {
    DefaultTableModel model = (DefaultTableModel) processTable.getModel();
    int rowCount = model.getRowCount();

    if (rowCount == 0) {
        JOptionPane.showMessageDialog(this, "No processes available in the table!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int currentTime = 0;
    StringBuilder result = new StringBuilder("FCFS Execution Order:\n");

    for (int i = 0; i < rowCount; i++) {
        int processId = Integer.parseInt(model.getValueAt(i, 1).toString());
        int cpuTime = Integer.parseInt(model.getValueAt(i, 2).toString());

        result.append("Process ").append(processId)
              .append(" starts at ").append(currentTime)
              .append(" and runs for ").append(cpuTime).append(" units.\n");

        currentTime += cpuTime;
    }

    JOptionPane.showMessageDialog(this, result.toString(), "FCFS Results", JOptionPane.INFORMATION_MESSAGE);
}

    void addToTable(Process newProcess) {
       // الحصول على DefaultTableModel المرتبط بـ JTable
       DefaultTableModel model = (DefaultTableModel) processTable.getModel();


    // إضافة صف جديد للجدول يحتوي على بيانات العملية
    model.addRow(new Object[]{
        model.getRowCount() + 1,       // رقم الصف
        newProcess.getProcessId(),    // Process ID
        newProcess.getCpuTime(),      // CPU Time
        newProcess.getPriority(),     // Priority
        newProcess.getTimeQuantum()   // Time Quantum
    });
    }
}
