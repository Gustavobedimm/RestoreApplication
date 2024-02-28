package restoreapplication.Telas;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restoreapplication.DAO.LoteValidadeMovDAO;
import restoreapplication.DAO.RetiradaDAO;
import restoreapplication.Model.LoteValidadeMov;
import restoreapplication.Model.Retirada;
import restoreapplication.Model.RetiradaItem;

public class TelaRetirada extends javax.swing.JFrame {
    String pedidoPricipal = "";
    String empresaPrincipal = "";

    public TelaRetirada() {
        initComponents();
    }

    public TelaRetirada(String empresa, String documento, boolean controlaLote) {
        initComponents();
        empresaPrincipal = empresa;
        //pedidoPricipal = documento;
        consultaRetirada(empresa, documento, controlaLote);
        
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
        jTextFieldEmpresa = new javax.swing.JTextField();
        jTextFieldCodRetirada = new javax.swing.JTextField();
        jTextFieldCodCliente = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldStatus = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldHora = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableItens = new javax.swing.JTable();
        jPanelLoteMovimento = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLoteMovimento = new javax.swing.JTable();
        jPanelLoteMovimento1 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableItensTodasRetiradas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDescricao1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Retirada");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));

        jTextFieldCodRetirada.setBorder(javax.swing.BorderFactory.createTitledBorder("Cod. Retirada"));

        jTextFieldCodCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cod. Cliente"));

        jTextFieldEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jTextFieldData.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jTextFieldStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        jTextFieldTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));

        jTextFieldHora.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEndereco)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelDescricao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao.setText("RETIRADA");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produtos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp.", "Retirada", "ID ", "Produto", "Pedido", "Qtde", "Almox"
            }
        ));
        jTableItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItensMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableItens);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLoteMovimento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimento Lote Validade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableLoteMovimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Lote", "Hora", "Usuario", "Qtde"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableLoteMovimento);

        javax.swing.GroupLayout jPanelLoteMovimentoLayout = new javax.swing.GroupLayout(jPanelLoteMovimento);
        jPanelLoteMovimento.setLayout(jPanelLoteMovimentoLayout);
        jPanelLoteMovimentoLayout.setHorizontalGroup(
            jPanelLoteMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoteMovimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanelLoteMovimentoLayout.setVerticalGroup(
            jPanelLoteMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoteMovimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelLoteMovimento1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retiradas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelLoteMovimento1.setForeground(new java.awt.Color(0, 0, 0));

        jTableItensTodasRetiradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Emp.", "Retirada", "Data", "Hora", "Status"
            }
        ));
        jTableItensTodasRetiradas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableItensTodasRetiradasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableItensTodasRetiradas);

        javax.swing.GroupLayout jPanelLoteMovimento1Layout = new javax.swing.GroupLayout(jPanelLoteMovimento1);
        jPanelLoteMovimento1.setLayout(jPanelLoteMovimento1Layout);
        jPanelLoteMovimento1Layout.setHorizontalGroup(
            jPanelLoteMovimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoteMovimento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanelLoteMovimento1Layout.setVerticalGroup(
            jPanelLoteMovimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoteMovimento1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Abrir Pedido Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelDescricao1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelDescricao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao1.setText("TODAS AS RETIRADAS DO MESMO PEDIDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelLoteMovimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelDescricao1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLoteMovimento1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelDescricao1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelLoteMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelLoteMovimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensMouseClicked
        //int linha = jTableItens.getSelectedRow();
        //String numeroDOC = (String) jTableItens.getValueAt(linha, 4);
        //String empresa = (String) jTableItens.getValueAt(linha, 0);
        //TelaPedidos telaPedidos = new TelaPedidos(empresa,numeroDOC,true);
        //telaPedidos.setVisible(true);
    }//GEN-LAST:event_jTableItensMouseClicked

    private void jTableItensTodasRetiradasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableItensTodasRetiradasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableItensTodasRetiradasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaPedidos telaPedidos = new TelaPedidos(empresaPrincipal,pedidoPricipal,true);
        telaPedidos.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRetirada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRetirada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelDescricao1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelLoteMovimento;
    private javax.swing.JPanel jPanelLoteMovimento1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableItens;
    private javax.swing.JTable jTableItensTodasRetiradas;
    private javax.swing.JTable jTableLoteMovimento;
    private javax.swing.JTextField jTextFieldCodCliente;
    private javax.swing.JTextField jTextFieldCodRetirada;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEmpresa;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldHora;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JTextField jTextFieldTipo;
    // End of variables declaration//GEN-END:variables
public void consultaRetirada(String empresa, String documento, boolean controlaLote) {
        RetiradaDAO retiradaDAO = new RetiradaDAO();
        Retirada retirada = new Retirada();
        try {
            retirada = retiradaDAO.consultaRetirada(empresa, documento);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaRetirada.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLabelDescricao.setText("RETIRADA " +documento);
        
        if(retirada.getStatus().equals("CA")){
            jTextFieldStatus.setForeground(Color.red);
            jLabelDescricao.setForeground(Color.red);
        }else{
            jTextFieldStatus.setForeground(Color.black);
            jLabelDescricao.setForeground(Color.black);
        }
        jTextFieldEmpresa.setText(retirada.getEmpresa());
        jTextFieldCodRetirada.setText(retirada.getIdcodigo());
        jTextFieldCodCliente.setText(retirada.getIdcliente());
        jTextFieldData.setText(retirada.getData());
        jTextFieldHora.setText(retirada.getHora());
        jTextFieldStatus.setText(retirada.getStatus());
        jTextFieldTipo.setText(retirada.getTipo());
        jTextFieldEndereco.setText(retirada.getEndereco());

        ArrayList<RetiradaItem> itens = new ArrayList();

        try {
            itens = retiradaDAO.consultaRetiradaItens(empresa, documento);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaRetirada.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) jTableItens.getModel();
        while (jTableItens.getRowCount() > 0) {
            model.removeRow(0);
        }
        for(RetiradaItem item: itens){
            model.addRow(new Object[]{item.getEmpresa(), item.getIdretirada(), item.getIdentificador(), item.getIdproduto(),item.getIdpedido(), item.getQtde(), item.getAlmox()});
            pedidoPricipal = item.getIdpedido();
        }
        //-----
        jButton1.setText("Abrir Pedido Principal " +pedidoPricipal);
         ArrayList<RetiradaItem> listaItens = new ArrayList();
        try {
            listaItens = retiradaDAO.consultaRetiradasDoPedido(empresa,pedidoPricipal);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaRetirada.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model2 = (DefaultTableModel) jTableItensTodasRetiradas.getModel();
        while (jTableItensTodasRetiradas.getRowCount() > 0) {
            model2.removeRow(0);
        }
        ArrayList<Retirada> listaRetiradas = new ArrayList<>();
        String retiradaAnterior = "0";
        for(RetiradaItem i: listaItens){
            if(!retiradaAnterior.equals(i.getIdretirada())){
                retiradaAnterior = i.getIdretirada();
            Retirada retirada2 =  new Retirada();
            try {
                retirada2 = retiradaDAO.consultaRetirada(empresa, i.getIdretirada());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TelaRetirada.class.getName()).log(Level.SEVERE, null, ex);
            }
            listaRetiradas.add(retirada2);
            }
        }
        for(Retirada ret: listaRetiradas){
            jTableItensTodasRetiradas.setDefaultRenderer(Object.class, new PintarTabela());
            model2.addRow(new Object[]{ret.getEmpresa(), ret.getIdcodigo(), ret.getData(), ret.getHora(),ret.getStatus()});
        }
        
        
    }
public void consultaMovimentoLote(String empresa, String numeroPedido){
    ArrayList<LoteValidadeMov> listaMovimentacoesLote = new ArrayList();
    LoteValidadeMovDAO loteValidadeDAO = new LoteValidadeMovDAO();
        try {
            listaMovimentacoesLote = loteValidadeDAO.getMovimentacaoLoteRetirada(numeroPedido);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) jTableLoteMovimento.getModel();
        while (jTableLoteMovimento.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (LoteValidadeMov loteMov : listaMovimentacoesLote) {
            model.addRow(new Object[]{loteMov.getPRODUTO(),loteMov.getIDLOTE(),loteMov.getDATAHORA(),loteMov.getUSUARIO(),loteMov.getQTDE()});
        }
    
}
public class PintarTabela extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            //INICIA AS CORES***************************************************
            Color background = Color.WHITE;
            Color foreground = Color.BLACK;

            Color VERMELHO = new Color(214, 40, 40);
            Color cinza = new Color(36, 142, 255);
            
            
            Object objeto2 = table.getValueAt(row, 4);
            String status = objeto2.toString();
            if (status.equals("CA")) {
                foreground = VERMELHO;
            }
            label.setBackground(background);
            label.setForeground(foreground);
            if (isSelected) {
                label.setBackground(cinza);
                label.setForeground(WHITE);
            }
            return label;
        }
    }
}
