/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import dominio.Individuo;
import dominio.Poblacion;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Ruben
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        pcs.addPropertyChangeListener(pclBotones);
        parado = true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entMaterialesPanel = new javax.swing.JPanel();
        materiales = new javax.swing.JPanel();
        material1 = new javax.swing.JPanel();
        m1Label = new javax.swing.JLabel();
        m1TextField = new javax.swing.JTextField();
        material2 = new javax.swing.JPanel();
        m2Label = new javax.swing.JLabel();
        m2TextField = new javax.swing.JTextField();
        material3 = new javax.swing.JPanel();
        m3Label = new javax.swing.JLabel();
        m3TextField = new javax.swing.JTextField();
        material4 = new javax.swing.JPanel();
        m4Label = new javax.swing.JLabel();
        m4TextField = new javax.swing.JTextField();
        material5 = new javax.swing.JPanel();
        m5Label = new javax.swing.JLabel();
        m5TextField = new javax.swing.JTextField();
        material6 = new javax.swing.JPanel();
        m6Label = new javax.swing.JLabel();
        m6TextField = new javax.swing.JTextField();
        material7 = new javax.swing.JPanel();
        m7Label = new javax.swing.JLabel();
        m7TextField = new javax.swing.JTextField();
        material8 = new javax.swing.JPanel();
        m8Label = new javax.swing.JLabel();
        m8TextField = new javax.swing.JTextField();
        opcionesPanel = new javax.swing.JPanel();
        configButton = new javax.swing.JButton();
        genAleatoriaPanel = new javax.swing.JPanel();
        aleatorioButton = new javax.swing.JButton();
        limitadoCheckBox = new javax.swing.JCheckBox();
        desdeLabel = new javax.swing.JLabel();
        desdeTextField = new javax.swing.JTextField();
        hastaLabel = new javax.swing.JLabel();
        hastaTextField = new javax.swing.JTextField();
        avanceEjecPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consolaTextArea = new javax.swing.JTextArea();
        barraDeProgreso = new javax.swing.JProgressBar();
        ejecucionPanel = new javax.swing.JPanel();
        ejecutarButton = new javax.swing.JButton();
        pausarButton = new javax.swing.JButton();
        pararButton = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        graficasButton = new javax.swing.JButton();
        resultadosButton = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        edicion = new javax.swing.JMenu();
        graficas = new javax.swing.JMenu();
        mejorIndivMenuItem = new javax.swing.JMenuItem();
        peorIndivMenuItem = new javax.swing.JMenuItem();
        ApPromMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(900, 500));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("visual/Bundle"); // NOI18N
        entMaterialesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), bundle.getString("Principal.entMaterialesPanel.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102))); // NOI18N
        entMaterialesPanel.setLayout(new java.awt.BorderLayout());

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        materiales.setLayout(flowLayout1);

        m1Label.setText(bundle.getString("Principal.m1Label.text")); // NOI18N
        material1.add(m1Label);

        m1TextField.setColumns(5);
        m1TextField.setText(bundle.getString("Principal.m1TextField.text")); // NOI18N
        material1.add(m1TextField);

        materiales.add(material1);

        m2Label.setText(bundle.getString("Principal.m2Label.text")); // NOI18N
        material2.add(m2Label);

        m2TextField.setColumns(5);
        m2TextField.setText(bundle.getString("Principal.m2TextField.text")); // NOI18N
        material2.add(m2TextField);

        materiales.add(material2);

        m3Label.setText(bundle.getString("Principal.m3Label.text")); // NOI18N
        material3.add(m3Label);

        m3TextField.setColumns(5);
        m3TextField.setText(bundle.getString("Principal.m3TextField.text")); // NOI18N
        material3.add(m3TextField);

        materiales.add(material3);

        m4Label.setText(bundle.getString("Principal.m4Label.text")); // NOI18N
        material4.add(m4Label);

        m4TextField.setColumns(5);
        m4TextField.setText(bundle.getString("Principal.m4TextField.text")); // NOI18N
        material4.add(m4TextField);

        materiales.add(material4);

        m5Label.setText(bundle.getString("Principal.m5Label.text")); // NOI18N
        material5.add(m5Label);

        m5TextField.setColumns(5);
        m5TextField.setText(bundle.getString("Principal.m5TextField.text")); // NOI18N
        material5.add(m5TextField);

        materiales.add(material5);

        m6Label.setText(bundle.getString("Principal.m6Label.text")); // NOI18N
        material6.add(m6Label);

        m6TextField.setColumns(5);
        m6TextField.setText(bundle.getString("Principal.m6TextField.text")); // NOI18N
        material6.add(m6TextField);

        materiales.add(material6);

        m7Label.setText(bundle.getString("Principal.m7Label.text")); // NOI18N
        material7.add(m7Label);

        m7TextField.setColumns(5);
        m7TextField.setText(bundle.getString("Principal.m7TextField.text")); // NOI18N
        material7.add(m7TextField);

        materiales.add(material7);

        m8Label.setText(bundle.getString("Principal.m8Label.text")); // NOI18N
        material8.add(m8Label);

        m8TextField.setColumns(5);
        m8TextField.setText(bundle.getString("Principal.m8TextField.text")); // NOI18N
        material8.add(m8TextField);

        materiales.add(material8);

        entMaterialesPanel.add(materiales, java.awt.BorderLayout.PAGE_START);

        opcionesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), bundle.getString("Principal.opcionesPanel.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102))); // NOI18N

        configButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/package_settings.png"))); // NOI18N
        configButton.setText(bundle.getString("Principal.configButton.text")); // NOI18N
        configButton.setPreferredSize(null);
        configButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configButtonActionPerformed(evt);
            }
        });

        genAleatoriaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), bundle.getString("Principal.genAleatoriaPanel.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102))); // NOI18N

        aleatorioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/1350794191_calculator.png"))); // NOI18N
        aleatorioButton.setText(bundle.getString("Principal.aleatorioButton.text")); // NOI18N
        aleatorioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aleatorioButtonActionPerformed(evt);
            }
        });

        limitadoCheckBox.setText(bundle.getString("Principal.limitadoCheckBox.text")); // NOI18N
        limitadoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitadoCheckBoxActionPerformed(evt);
            }
        });

        desdeLabel.setText(bundle.getString("Principal.desdeLabel.text")); // NOI18N

        desdeTextField.setColumns(15);
        desdeTextField.setText(bundle.getString("Principal.desdeTextField.text")); // NOI18N
        desdeTextField.setEnabled(false);

        hastaLabel.setText(bundle.getString("Principal.hastaLabel.text")); // NOI18N

        hastaTextField.setColumns(15);
        hastaTextField.setText(bundle.getString("Principal.hastaTextField.text")); // NOI18N
        hastaTextField.setEnabled(false);

        javax.swing.GroupLayout genAleatoriaPanelLayout = new javax.swing.GroupLayout(genAleatoriaPanel);
        genAleatoriaPanel.setLayout(genAleatoriaPanelLayout);
        genAleatoriaPanelLayout.setHorizontalGroup(
            genAleatoriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genAleatoriaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aleatorioButton)
                .addGap(18, 18, 18)
                .addComponent(limitadoCheckBox)
                .addGap(18, 18, 18)
                .addComponent(desdeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desdeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hastaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hastaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        genAleatoriaPanelLayout.setVerticalGroup(
            genAleatoriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genAleatoriaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genAleatoriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aleatorioButton)
                    .addComponent(limitadoCheckBox)
                    .addComponent(desdeLabel)
                    .addComponent(desdeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaLabel)
                    .addComponent(hastaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout opcionesPanelLayout = new javax.swing.GroupLayout(opcionesPanel);
        opcionesPanel.setLayout(opcionesPanelLayout);
        opcionesPanelLayout.setHorizontalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genAleatoriaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(configButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        opcionesPanelLayout.setVerticalGroup(
            opcionesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(genAleatoriaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(opcionesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(configButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        entMaterialesPanel.add(opcionesPanel, java.awt.BorderLayout.CENTER);

        avanceEjecPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), bundle.getString("Principal.avanceEjecPanel.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102))); // NOI18N
        avanceEjecPanel.setToolTipText(bundle.getString("Principal.avanceEjecPanel.toolTipText")); // NOI18N
        avanceEjecPanel.setLayout(new java.awt.BorderLayout(0, 5));

        consolaTextArea.setColumns(20);
        consolaTextArea.setLineWrap(true);
        consolaTextArea.setRows(10);
        jScrollPane1.setViewportView(consolaTextArea);

        avanceEjecPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        barraDeProgreso.setStringPainted(true);
        avanceEjecPanel.add(barraDeProgreso, java.awt.BorderLayout.PAGE_END);

        ejecucionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), bundle.getString("Principal.ejecucionPanel.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(102, 102, 102))); // NOI18N
        ejecucionPanel.setMaximumSize(new java.awt.Dimension(797, 90));

        ejecutarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/Play.png"))); // NOI18N
        ejecutarButton.setText(bundle.getString("Principal.ejecutarButton.text")); // NOI18N
        ejecutarButton.setPreferredSize(null);
        ejecutarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarButtonActionPerformed(evt);
            }
        });

        pausarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/Pause.png"))); // NOI18N
        pausarButton.setText(bundle.getString("Principal.pausarButton.text")); // NOI18N
        pausarButton.setEnabled(false);
        pausarButton.setPreferredSize(null);
        pausarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pausarButtonActionPerformed(evt);
            }
        });

        pararButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/Stop.png"))); // NOI18N
        pararButton.setText(bundle.getString("Principal.pararButton.text")); // NOI18N
        pararButton.setEnabled(false);
        pararButton.setPreferredSize(null);
        pararButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pararButtonActionPerformed(evt);
            }
        });

        limpiarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/edit-clear.png"))); // NOI18N
        limpiarButton.setText(bundle.getString("Principal.limpiarButton.text")); // NOI18N

        graficasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/grafica3.png"))); // NOI18N
        graficasButton.setText(bundle.getString("Principal.graficasButton.text")); // NOI18N
        graficasButton.setEnabled(false);

        resultadosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/icons/flag.png"))); // NOI18N
        resultadosButton.setText(bundle.getString("Principal.resultadosButton.text")); // NOI18N
        resultadosButton.setEnabled(false);
        resultadosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadosButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ejecucionPanelLayout = new javax.swing.GroupLayout(ejecucionPanel);
        ejecucionPanel.setLayout(ejecucionPanelLayout);
        ejecucionPanelLayout.setHorizontalGroup(
            ejecucionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ejecucionPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(ejecutarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pausarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pararButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpiarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graficasButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultadosButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ejecucionPanelLayout.setVerticalGroup(
            ejecucionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ejecucionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pararButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpiarButton)
                .addComponent(graficasButton)
                .addComponent(resultadosButton))
            .addGroup(ejecucionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(pausarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ejecutarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        barraMenu.setFont(getFont());

        archivo.setText(bundle.getString("Principal.archivo.text")); // NOI18N
        barraMenu.add(archivo);

        edicion.setText(bundle.getString("Principal.edicion.text")); // NOI18N
        barraMenu.add(edicion);

        graficas.setText(bundle.getString("Principal.graficas.text")); // NOI18N

        mejorIndivMenuItem.setText(bundle.getString("Principal.mejorIndivMenuItem.text")); // NOI18N
        graficas.add(mejorIndivMenuItem);

        peorIndivMenuItem.setText(bundle.getString("Principal.peorIndivMenuItem.text")); // NOI18N
        graficas.add(peorIndivMenuItem);

        ApPromMenuItem.setText(bundle.getString("Principal.ApPromMenuItem.text")); // NOI18N
        graficas.add(ApPromMenuItem);

        barraMenu.add(graficas);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entMaterialesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ejecucionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(avanceEjecPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(entMaterialesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ejecucionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(avanceEjecPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limitadoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitadoCheckBoxActionPerformed
        desdeTextField.setEnabled(limitadoCheckBox.isSelected());
        hastaTextField.setEnabled(limitadoCheckBox.isSelected());
    }//GEN-LAST:event_limitadoCheckBoxActionPerformed

    private void configButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configButtonActionPerformed
        //prueba
        Configuracion configuracion = new Configuracion(this, true);
        configuracion.setVisible(true);
    }//GEN-LAST:event_configButtonActionPerformed

    private void ejecutarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarButtonActionPerformed
        setParado(false);
        setEjecutandose(true);

    }//GEN-LAST:event_ejecutarButtonActionPerformed

    private void resultadosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadosButtonActionPerformed
        Resultado r = new Resultado(this, true);
        r.setLocationRelativeTo(null);
        r.setVisible(true);
    }//GEN-LAST:event_resultadosButtonActionPerformed

    private void pausarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pausarButtonActionPerformed
        setParado(false);
        setEjecutandose(false);

    }//GEN-LAST:event_pausarButtonActionPerformed

    private void pararButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pararButtonActionPerformed
        setEjecutandose(false);
        setParado(true);
    }//GEN-LAST:event_pararButtonActionPerformed

    private void aleatorioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aleatorioButtonActionPerformed
        int desde = 0;
        int hasta = 0;
        if (limitadoCheckBox.isSelected()) {
            desde = Integer.parseInt(desdeTextField.getText());
            hasta = Integer.parseInt(hastaTextField.getText());
        } else {
            desde = random.nextInt(1000);
            desdeTextField.setText(String.valueOf(desde));
            hasta = desde + random.nextInt(99000);
            hastaTextField.setText(String.valueOf(hasta));
        }
        
        for (int i = 0; i < 8; i++) {
            int valor = desde + random.nextInt(hasta - desde);
            setMatIng(i,valor);
        }
        
    }//GEN-LAST:event_aleatorioButtonActionPerformed

    public void agregarPCL(PropertyChangeListener pcl) {
        pcs.addPropertyChangeListener(pcl);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public int[] getMatIngs() {
        int[] mIngs = new int[8];
        for (int i = 0; i < 8; i++) {
            mIngs[i] = getMatIng(i);
        }
        return mIngs;
    }

    public int getMatIng(int index) {
        int material = 0;
        switch (index) {
            case 0:
                material = Integer.parseInt(m1TextField.getText());
                break;
            case 1:
                material = Integer.parseInt(m2TextField.getText());
                break;
            case 2:
                material = Integer.parseInt(m3TextField.getText());
                break;
            case 3:
                material = Integer.parseInt(m4TextField.getText());
                break;
            case 4:
                material = Integer.parseInt(m5TextField.getText());
                break;
            case 5:
                material = Integer.parseInt(m6TextField.getText());
                break;
            case 6:
                material = Integer.parseInt(m7TextField.getText());
                break;
            case 7:
                material = Integer.parseInt(m8TextField.getText());
                break;
        }

        return material;
    }

    public void setMatIng(int index, int valor) {
        switch (index) {
            case 0:
                m1TextField.setText(String.valueOf(valor));
                break;
            case 1:
                m2TextField.setText(String.valueOf(valor));
                break;
            case 2:
                m3TextField.setText(String.valueOf(valor));
                break;
            case 3:
                m4TextField.setText(String.valueOf(valor));
                break;
            case 4:
                m5TextField.setText(String.valueOf(valor));
                break;
            case 5:
                m6TextField.setText(String.valueOf(valor));
                break;
            case 6:
                m7TextField.setText(String.valueOf(valor));
                break;
            case 7:
                m8TextField.setText(String.valueOf(valor));
                break;
        }
    }

    public boolean isEjecutandose() {
        return ejecutandose;
    }

    public void setEjecutandose(boolean ejecutandose) {
        boolean old = this.ejecutandose;
        this.ejecutandose = ejecutandose;
        pcs.firePropertyChange("ejecutandose", old, ejecutandose);
    }

    public boolean isParado() {
        return parado;
    }

    public void setParado(boolean parado) {
        boolean old = this.parado;
        this.parado = parado;
        pcs.firePropertyChange("parado", old, parado);
    }

    public PropertyChangeListener getPclModelo() {
        return pclModelo;
    }

    public JButton getEjecutarButton() {
        return ejecutarButton;
    }

    public JButton getConfigButton() {
        return configButton;
    }

    public JButton getGraficasButton() {
        return graficasButton;
    }

    public JButton getPararButton() {
        return pararButton;
    }

    public JButton getPausarButton() {
        return pausarButton;
    }

    public JTextField getM1TextField() {
        return m1TextField;
    }

    public JTextField getM2TextField() {
        return m2TextField;
    }

    public JTextField getM3TextField() {
        return m3TextField;
    }

    public JTextField getM4TextField() {
        return m4TextField;
    }

    public JTextField getM5TextField() {
        return m5TextField;
    }

    public JTextField getM6TextField() {
        return m6TextField;
    }

    public JTextField getM7TextField() {
        return m7TextField;
    }

    public JTextField getM8TextField() {
        return m8TextField;
    }
    private PropertyChangeListener pclBotones = new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            if (evt.getPropertyName().equals("ejecutandose")) {
                if (evt.getNewValue().equals(true)) {
                    ejecutarButton.setEnabled(false);
                    pausarButton.setEnabled(true);
                    pararButton.setEnabled(true);
                    limpiarButton.setEnabled(false);
                    graficasButton.setEnabled(false);
                    resultadosButton.setEnabled(false);
                } else {
                    ejecutarButton.setEnabled(true);
                    pausarButton.setEnabled(false);
                    graficasButton.setEnabled(true);

                }
            }
            if (evt.getPropertyName().equals("parado")) {

                if (evt.getNewValue().equals(true)) {
                    ejecutarButton.setEnabled(true);
                    pausarButton.setEnabled(false);
                    pararButton.setEnabled(false);
                    limpiarButton.setEnabled(true);
                    graficasButton.setEnabled(true);
                    resultadosButton.setEnabled(true);
                } else {
                    ejecutarButton.setEnabled(true);
                    pausarButton.setEnabled(false);
                    pararButton.setEnabled(true);
                    limpiarButton.setEnabled(false);
                    graficasButton.setEnabled(true);
                    resultadosButton.setEnabled(false);
                }
            }
        }
    };
    private PropertyChangeListener pclModelo = new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            if ("progress".equals(evt.getPropertyName())) {
                barraDeProgreso.setValue((int) evt.getNewValue());
            }
            if ("generacion".equals(evt.getPropertyName())) {
                System.out.println(isParado() + " " + isEjecutandose());
                consolaTextArea.removeAll();
                Poblacion pob = (Poblacion) evt.getOldValue();
                int cont = 0;
                for (Individuo individuo : pob.getPoblado()) {
                    consolaTextArea.append(cont + individuo.mostrarProductos() + "\n");
                    cont++;
                }
                consolaTextArea.append("-----------------------------------------------------------\n");
                pob = (Poblacion) evt.getOldValue();
                cont = 0;
                for (Individuo individuo : pob.getPoblado()) {
                    consolaTextArea.append(cont + individuo.mostrarProductos() + "\n");
                    cont++;
                }
                consolaTextArea.append("-----------------------------------------------------------\n");
            }
        }
    };
    private PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private boolean ejecutandose;
    private boolean parado;
    private Random random = new Random();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ApPromMenuItem;
    private javax.swing.JButton aleatorioButton;
    private javax.swing.JMenu archivo;
    private javax.swing.JPanel avanceEjecPanel;
    private javax.swing.JProgressBar barraDeProgreso;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton configButton;
    private javax.swing.JTextArea consolaTextArea;
    private javax.swing.JLabel desdeLabel;
    private javax.swing.JTextField desdeTextField;
    private javax.swing.JMenu edicion;
    private javax.swing.JPanel ejecucionPanel;
    private javax.swing.JButton ejecutarButton;
    private javax.swing.JPanel entMaterialesPanel;
    private javax.swing.JPanel genAleatoriaPanel;
    private javax.swing.JMenu graficas;
    private javax.swing.JButton graficasButton;
    private javax.swing.JLabel hastaLabel;
    private javax.swing.JTextField hastaTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox limitadoCheckBox;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JLabel m1Label;
    private javax.swing.JTextField m1TextField;
    private javax.swing.JLabel m2Label;
    private javax.swing.JTextField m2TextField;
    private javax.swing.JLabel m3Label;
    private javax.swing.JTextField m3TextField;
    private javax.swing.JLabel m4Label;
    private javax.swing.JTextField m4TextField;
    private javax.swing.JLabel m5Label;
    private javax.swing.JTextField m5TextField;
    private javax.swing.JLabel m6Label;
    private javax.swing.JTextField m6TextField;
    private javax.swing.JLabel m7Label;
    private javax.swing.JTextField m7TextField;
    private javax.swing.JLabel m8Label;
    private javax.swing.JTextField m8TextField;
    private javax.swing.JPanel material1;
    private javax.swing.JPanel material2;
    private javax.swing.JPanel material3;
    private javax.swing.JPanel material4;
    private javax.swing.JPanel material5;
    private javax.swing.JPanel material6;
    private javax.swing.JPanel material7;
    private javax.swing.JPanel material8;
    private javax.swing.JPanel materiales;
    private javax.swing.JMenuItem mejorIndivMenuItem;
    private javax.swing.JPanel opcionesPanel;
    private javax.swing.JButton pararButton;
    private javax.swing.JButton pausarButton;
    private javax.swing.JMenuItem peorIndivMenuItem;
    private javax.swing.JButton resultadosButton;
    // End of variables declaration//GEN-END:variables
}
