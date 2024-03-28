package restoreapplication.Telas;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restoreapplication.DAO.PedidoCompraDAO;
import restoreapplication.Model.Bloqueio;
import restoreapplication.Model.NfePedidos;
import restoreapplication.Model.PedCompraProd;

public class ManutencaoPedCompra extends javax.swing.JFrame {

    public ManutencaoPedCompra() {
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

        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção de pedidos de compra");

        jButton1.setText("Iniciar verificação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jProgressBar1.setStringPainted(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empesa", "Produto", "Pedido", "Pedida", "Recebida", "Restante", "Cancelada", "Receb. NF", "ERRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(60);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(1).setMinWidth(60);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(2).setMinWidth(60);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(3).setMinWidth(60);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(4).setMinWidth(60);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(5).setMinWidth(60);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(6).setMinWidth(60);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(60);
            jTable1.getColumnModel().getColumn(7).setMinWidth(60);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(60);
        }

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ERROS NOS PEDIDOS DE COMPRA : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("CORREÇÕES NOS PEDIDOS DE COMPRA : ");

        jCheckBox1.setText("Corrigir erros ");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("ERROS CORRIGIDOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniciaProcesso();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Ao marcar essa opção as correções serão feitas autimaticamente!");
            jButton1.setText("Iniciar correção");
        } else {
            jButton1.setText("Iniciar verificação");
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManutencaoPedCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPedCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPedCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManutencaoPedCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManutencaoPedCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
public void iniciaProcesso() {
        jButton1.setEnabled(false);
        Thread thread = new Thread() {
            @Override
            public void run() {
                jCheckBox1.setEnabled(false);
                jTextArea1.setText("");
                PedidoCompraDAO pedidoCompraDAO = new PedidoCompraDAO();
                ArrayList<PedCompraProd> listaPedCompraProd = new ArrayList<>();
                jLabel2.setText("Buscando informações...");
                try {
                    listaPedCompraProd = pedidoCompraDAO.consultaRegistrosTESTPEDCOMPRAPROD();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                }
                jLabel2.setText("Limpando Tabela...");
                DefaultTableModel modelBlock = (DefaultTableModel) jTable1.getModel();
                while (jTable1.getRowCount() > 0) {
                    modelBlock.removeRow(0);
                }
                int tamanho = listaPedCompraProd.size();
                jProgressBar1.setMaximum(tamanho);
                int i = 0;
                jLabel2.setText("Verificando e corrigindo pedidos de compras...");
                int erros = 0;
                for (PedCompraProd prod : listaPedCompraProd) {
                    String mensagemERRO = "";
                    boolean erro = false;
                    double recebida = 0.000;
                    double restante = 0.000;
                    double pedida = 0.000;
                    double cancelada = 0.000;
                    pedida = Double.parseDouble(prod.getQtdepedida());
                    recebida = Double.parseDouble(prod.getQtderecebida());
                    restante = Double.parseDouble(prod.getQtderestante());
                    //ARRUMANDO A QUANTIDADE CANCELADA
                    if (prod.getQtdecancelada() == null) {
                        cancelada = 0.000;
                    } else {
                        cancelada = Double.parseDouble(prod.getQtdecancelada());
                    }

                    //AJUSTANDO QUANTIDADE RECEBIDA
                    if (recebida > pedida) {
                        mensagemERRO = mensagemERRO + " +ERRO: Quantidade recebida maior que quantidade pedida";
                        recebida = pedida;
                        try {
                            if (jCheckBox1.isSelected()) {
                                pedidoCompraDAO.updatePedido(prod.getEmpresa(), prod.getPedido(), prod.getProduto(), recebida, restante, cancelada);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        jTextArea1.append("************************************************************************************************" + "\n");
                        jTextArea1.append("ERRO: Quantidade recebida maior que quantidade pedida." + "\n");
                        jTextArea1.append("EMPRESA:" + prod.getEmpresa() + " PEDIDO:" + prod.getPedido() + " PRODUTO:" + prod.getProduto() + " " + "\n");
                        jTextArea1.append("ANTES:  QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + prod.getQtderecebida() + " QTDERESTANTE: " + prod.getQtderestante() + " QTDECANCELADA: " + prod.getQtdecancelada() + "\n");
                        jTextArea1.append("DEPOIS: QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + recebida + " QTDERESTANTE: " + restante + " QTDECANCELADA: " + cancelada + "\n");
                        erro = true;
                        erros++;

                    }
                    //AJUSTANDO QUANTIDADE RECEBIDA
                    if (cancelada > pedida) {
                        restante = 0.000;
                        cancelada = pedida;
                        try {
                            if (jCheckBox1.isSelected()) {
                                pedidoCompraDAO.updatePedido(prod.getEmpresa(), prod.getPedido(), prod.getProduto(), recebida, restante, cancelada);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        jTextArea1.append("************************************************************************************************" + "\n");
                        jTextArea1.append("ERRO: Quantidade cancelada maior que quantidade pedida." + "\n");
                        jTextArea1.append("EMPRESA:" + prod.getEmpresa() + " PEDIDO:" + prod.getPedido() + " PRODUTO:" + prod.getProduto() + " " + "\n");
                        jTextArea1.append("ANTES:  QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + prod.getQtderecebida() + " QTDERESTANTE: " + prod.getQtderestante() + " QTDECANCELADA: " + prod.getQtdecancelada() + "\n");
                        jTextArea1.append("DEPOIS: QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + recebida + " QTDERESTANTE: " + restante + " QTDECANCELADA: " + cancelada + "\n");
                        mensagemERRO = mensagemERRO + " +ERRO: Cancelada maior que pedida";
                        erro = true;
                        erros++;
                    }
                    //AJUSTANDO QUANTIDADE RESTANTE
                    if (cancelada == pedida && restante > 0) {
                        restante = 0.000;
                        try {
                            if (jCheckBox1.isSelected()) {
                                pedidoCompraDAO.updatePedido(prod.getEmpresa(), prod.getPedido(), prod.getProduto(), recebida, restante, cancelada);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        jTextArea1.append("************************************************************************************************" + "\n");
                        jTextArea1.append("ERRO: Não pode ter quantidade restante se o pedido foi cancelado." + "\n");
                        jTextArea1.append("EMPRESA:" + prod.getEmpresa() + " PEDIDO:" + prod.getPedido() + " PRODUTO:" + prod.getProduto() + " " + "\n");
                        jTextArea1.append("ANTES:  QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + prod.getQtderecebida() + " QTDERESTANTE: " + prod.getQtderestante() + " QTDECANCELADA: " + prod.getQtdecancelada() + "\n");
                        jTextArea1.append("DEPOIS: QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + recebida + " QTDERESTANTE: " + restante + " QTDECANCELADA: " + cancelada + "\n");
                        mensagemERRO = mensagemERRO + " +ERRO: O pedido foi cancelado porem ainda possui valores pendentes.";
                        erro = true;
                        erros++;
                    }
                    //AJUSTANDO A QUANTIDADE RESTANTE
                    double soma = 0.0;
                    soma = recebida + restante + cancelada;
                    if (soma > pedida && recebida == 0.00 && cancelada < pedida) {
                        restante = pedida - cancelada;
                        try {
                            if (jCheckBox1.isSelected()) {
                                pedidoCompraDAO.updatePedido(prod.getEmpresa(), prod.getPedido(), prod.getProduto(), recebida, restante, cancelada);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        erro = true;
                        erros++;
                        mensagemERRO = mensagemERRO + " +ERRO: A soma ultrapassa a quantidade pedida";
                        jTextArea1.append("************************************************************************************************" + "\n");
                        jTextArea1.append("ERRO: A soma ultrapassa a quantidade pedida." + "\n");
                        jTextArea1.append("EMPRESA:" + prod.getEmpresa() + " PEDIDO:" + prod.getPedido() + " PRODUTO:" + prod.getProduto() + " " + "\n");
                        jTextArea1.append("ANTES:  QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + prod.getQtderecebida() + " QTDERESTANTE: " + prod.getQtderestante() + " QTDECANCELADA: " + prod.getQtdecancelada() + "\n");
                        jTextArea1.append("DEPOIS: QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + recebida + " QTDERESTANTE:" + restante + " QTDECANCELADA: " + cancelada + "\n");
                    }
                    //AJUSTANDO QUANTIDADE RECEBIDA QUANDO É NEGATIVA
                    if (recebida < 0.000) {
                        recebida = 0.000;
                        try {
                            if (jCheckBox1.isSelected()) {
                                pedidoCompraDAO.updatePedido(prod.getEmpresa(), prod.getPedido(), prod.getProduto(), recebida, restante, cancelada);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        jTextArea1.append("************************************************************************************************" + "\n");
                        jTextArea1.append("ERRO: A quantidade recebida não pode ser negativa." + "\n");
                        jTextArea1.append("EMPRESA:" + prod.getEmpresa() + " PEDIDO:" + prod.getPedido() + " PRODUTO:" + prod.getProduto() + " " + "\n");
                        jTextArea1.append("ANTES:  QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + prod.getQtderecebida() + " QTDERESTANTE: " + prod.getQtderestante() + " QTDECANCELADA: " + prod.getQtdecancelada() + "\n");
                        jTextArea1.append("DEPOIS: QTDEPEDIDO: " + prod.getQtdepedida() + " QTDERECEBIDA: " + recebida + " QTDERESTANTE: " + restante + " QTDECANCELADA: " + cancelada + "\n");
                        mensagemERRO = mensagemERRO + " +ERRO: A quantidade recebida não pode ser negativa.";
                        erro = true;
                        erros++;
                    }

                    if (erro) {
                        modelBlock.addRow(new Object[]{prod.getEmpresa(), prod.getProduto(), prod.getPedido(), prod.getQtdepedida(), prod.getQtderecebida(), prod.getQtderestante(), prod.getQtdecancelada(), "Não disp.", mensagemERRO});
                    }

                    i++;
                    jProgressBar1.setValue(i);
                }
                if (erros > 0) {
                    jLabel2.setText("Ajustando ESTPEDIDO da TESTPRODUTO.");
                    jTextArea1.append("************************************************************************************************" + "\n");
                    jTextArea1.append("AJUSTANDO ESTPEDIDO DA TESTPRODUTO." + "\n");
                    jTextArea1.append("************************************************************************************************" + "\n");
                    ArrayList<PedCompraProd> listaAUX = new ArrayList<>();
                    try {
                        listaAUX = pedidoCompraDAO.selecionaProdutos();
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    int tamanhoAux = listaAUX.size();
                    jProgressBar1.setMaximum(tamanhoAux);
                    jProgressBar1.setValue(0);
                    int ii = 0;
                    for (PedCompraProd aux : listaAUX) {
                        ii++;
                        Double valor = Double.valueOf(aux.getQtderestante());
                        try {
                            if (jCheckBox1.isSelected()) {
                                pedidoCompraDAO.updateProduto(aux.getEmpresa(), aux.getProduto(), valor);
                            }
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        jTextArea1.append("EMPRESA:" + aux.getEmpresa() + " PRODUTO:" + aux.getProduto() + " ESTOQUE ANTIGO:" + aux.getAux() + " ESTOQUE NOVO:" + aux.getQtderestante() + " " + "\n");
                        jTextArea1.setCaretPosition(jTextArea1.getText().length());
                        jProgressBar1.setValue(ii);
                    }
                } else {
                    jTextArea1.append("************************************************************************************************" + "\n");
                    jTextArea1.append("Não foram encontrados erros nos pedidos de compra." + "\n");
                    jTextArea1.append("************************************************************************************************" + "\n");
                }
                jButton1.setText("Iniciar verificação");
                jLabel2.setText("Processo concluido.");
                jCheckBox1.setSelected(false);
                jButton1.setEnabled(true);
                jCheckBox1.setEnabled(true);
                jLabel4.setText(erros + " ERROS CORRIGIDOS!");
            }
        };
        thread.start();
    }

    public Double consultaNota(String empresa, String pedido, String produto) {
        double recebidaNF = 0.0;
        PedidoCompraDAO pedidoCompraDAO = new PedidoCompraDAO();
        try {
            ArrayList<NfePedidos> listaNF = new ArrayList<>();
            listaNF = pedidoCompraDAO.consultaRegistroNF(empresa, pedido, produto);
            for (NfePedidos nf : listaNF) {
                if (nf.getQtderecebida() == null) {
                    recebidaNF = recebidaNF;
                } else {
                    recebidaNF = recebidaNF + Double.parseDouble(nf.getQtderecebida());
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManutencaoPedCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return recebidaNF;
    }
}
