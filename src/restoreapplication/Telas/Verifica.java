package restoreapplication.Telas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import restoreapplication.Model.ExtratoProduto;
import restoreapplication.DAO.ExtratoProdutoDAO;
import restoreapplication.DAO.ProdutoDAO;
import restoreapplication.Model.Produto;

public class Verifica extends javax.swing.JFrame {

    String empresa;
    String almox;
    int cont1 = 0, cont2 = 0, cont3 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0;

    public Verifica() {
        initComponents();
    }

    public Verifica(String empresaP, String almoxP) {
        initComponents();
        empresa = empresaP;
        almox = almoxP;
        jTextField3.setText(empresa);
        jTextField4.setText(almox);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelCont01 = new javax.swing.JLabel();
        jLabelCont02 = new javax.swing.JLabel();
        jLabelCont03 = new javax.swing.JLabel();
        jLabelCont05 = new javax.swing.JLabel();
        jLabelCont06 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabelCont07 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabelCont08 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabelCont09 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabelCont10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificando extrato de produtos com erro");
        setResizable(false);

        jProgressBar1.setStringPainted(true);

        jButton1.setText("Verificar extrato dos produtos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Saldo", "Saldo Esperado", "Descrição", "Documento", "Data"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jTextField3.setEditable(false);
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder("Empresa"));

        jTextField4.setEditable(false);
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder("Almoxarifado"));

        jLabel1.setText("ERROS : ");

        jLabel2.setText("01 - VENDA DE MERCADORIA");

        jLabel3.setText("02 - COMPRA DE MERCADORIA");

        jLabel4.setText("03 - TRANSFERENCIA ENTRE ALMOXARIFADO");

        jLabel5.setText("05 - INVENTARIO");

        jLabel6.setText("06 - RETIRADA");

        jLabelCont01.setText("0");

        jLabelCont02.setText("0");

        jLabelCont03.setText("0");

        jLabelCont05.setText("0");

        jLabelCont06.setText("0");

        jLabel22.setText("07 - DEVOLUÇÃO DE VENDA");

        jLabelCont07.setText("0");

        jLabel24.setText("08 - TRANSFERENCIA ENTRE FILIAIS");

        jLabelCont08.setText("0");

        jLabel26.setText("09 - DEVOLUÇÃO DE COMPRA");

        jLabelCont09.setText("0");

        jLabel28.setText("10 - ORDEM DE PRODUÇÃO");

        jLabelCont10.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24)
                            .addComponent(jLabel26)
                            .addComponent(jLabel28))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCont10)
                            .addComponent(jLabelCont09)
                            .addComponent(jLabelCont08)
                            .addComponent(jLabelCont07)
                            .addComponent(jLabelCont01)
                            .addComponent(jLabelCont06)
                            .addComponent(jLabelCont05)
                            .addComponent(jLabelCont03)
                            .addComponent(jLabelCont02))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCont01))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelCont02))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelCont03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelCont05))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelCont06))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabelCont07))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabelCont08))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabelCont09))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabelCont10))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTextField5.setEditable(false);
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder("Qtde Produtos"));

        jTextField6.setEditable(false);
        jTextField6.setForeground(new java.awt.Color(255, 0, 0));
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros Encontrados"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregaProdutos();
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
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verifica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verifica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCont01;
    private javax.swing.JLabel jLabelCont02;
    private javax.swing.JLabel jLabelCont03;
    private javax.swing.JLabel jLabelCont05;
    private javax.swing.JLabel jLabelCont06;
    private javax.swing.JLabel jLabelCont07;
    private javax.swing.JLabel jLabelCont08;
    private javax.swing.JLabel jLabelCont09;
    private javax.swing.JLabel jLabelCont10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
public void carregaProdutos() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                ProdutoDAO produtoDAO = new ProdutoDAO();
                ArrayList<Produto> listaProdutos = new ArrayList();
                try {
                    listaProdutos = produtoDAO.buscaCodigos(empresa);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                }
                int tamanho = 0;
                tamanho = listaProdutos.size();
                jTextField5.setText(Integer.toString(tamanho));
                jProgressBar1.setMaximum(tamanho);
                jProgressBar1.setMinimum(0);
                int indice = 0;
                int erros = 0;
                //ArrayList<ExtratoProduto> extratoDoProdutoERROS = new ArrayList();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while (jTable1.getRowCount() > 0) {
                    model.removeRow(0);
                }

                for (Produto prod : listaProdutos) {

                    String codString = prod.getCODIGO();
                    ExtratoProdutoDAO extratoProdutoDAO = new ExtratoProdutoDAO();
                    ArrayList<ExtratoProduto> extratoDoProduto = new ArrayList();

                    try {
                        extratoDoProduto = extratoProdutoDAO.extratoProduto(empresa, almox, codString);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    BigDecimal saldoAnterior = new BigDecimal("0");

                    for (ExtratoProduto produto : extratoDoProduto) {

                        BigDecimal qtd = new BigDecimal(produto.getQTDE());
                        BigDecimal saldoAtual = new BigDecimal(produto.getSALDO());
                        BigDecimal saldoEsperado = new BigDecimal("0");

                        if (produto.getENTRADASAIDA().equals("E")) {
                            saldoEsperado = saldoAnterior.add(qtd);
                            saldoAnterior = saldoAnterior.add(qtd);
                        } else {
                            saldoEsperado = saldoAnterior.subtract(qtd);
                            saldoAnterior = saldoAnterior.subtract(qtd);
                        }
                        String saldoEsperadoString = saldoEsperado.toString();
                        String saldoAtualString = saldoAtual.toString();

                        if (!saldoEsperadoString.equals(saldoAtualString)) {
                            String descricao = MontaDescricao(produto.getMOVIMENTOID(), produto.getENTRADASAIDA());

                            model.addRow(new Object[]{produto.getPRODUTO(), saldoAtual.toPlainString(), saldoEsperado.toPlainString(), descricao, produto.getCODIGOID(), produto.getDATAHORA()});
                            erros++;
                            jTextField6.setText(Integer.toString(erros));
                            int conta = cont1 * 100 / erros;
                            jLabelCont01.setText(Integer.toString(cont1) + " - " + conta + "%");
                            conta = cont2 * 100 / erros;
                            jLabelCont02.setText(Integer.toString(cont2) + " - " + conta + "%");
                            conta = cont3 * 100 / erros;
                            jLabelCont03.setText(Integer.toString(cont3) + " - " + conta + "%");
                            conta = cont5 * 100 / erros;
                            jLabelCont05.setText(Integer.toString(cont5) + " - " + conta + "%");
                            conta = cont6 * 100 / erros;
                            jLabelCont06.setText(Integer.toString(cont6) + " - " + conta + "%");
                            conta = cont7 * 100 / erros;
                            jLabelCont07.setText(Integer.toString(cont7) + " - " + conta + "%");
                            conta = cont8 * 100 / erros;
                            jLabelCont08.setText(Integer.toString(cont8) + " - " + conta + "%");
                            conta = cont9 * 100 / erros;
                            jLabelCont09.setText(Integer.toString(cont9) + " - " + conta + "%");
                            conta = cont10 * 100 / erros;
                            jLabelCont10.setText(Integer.toString(cont10) + " - " + conta + "%");
                            break;
                        }
                        saldoAnterior = saldoAtual;
                    }
                    indice++;
                    jProgressBar1.setValue(indice);

                }
                jProgressBar1.setValue(0);
            }
        };

        thread.start();

    }

    public String MontaDescricao(String id, String es) {
        String descricaoOperacao = "";
        if (id.equals("01")) {
            descricaoOperacao = "01 - VENDA DE MERCADORIA";
            cont1++;
        }
        if (id.equals("02")) {
            descricaoOperacao = "02 - COMPRA DE MERCADORIA";
            cont2++;
        }
        if (id.equals("03")) {
            descricaoOperacao = "03 - S - TRANSFERENCIA ENTRE ALMOXARIFADO";
            cont3++;
        }
        if (id.equals("05")) {
            descricaoOperacao = "05 - E - INVENTARIO";
            cont5++;
        }
        if (id.equals("06")) {
            descricaoOperacao = "06 - S - RETIRADA";
            cont6++;
        }
        if (id.equals("07")) {
            descricaoOperacao = "07 - DEVOLUÇÃO DE VENDA";
            cont7++;
        }

        if (id.equals("08")) {
            descricaoOperacao = "08 - TRANSFERENCIA ENTRE FILIAIS";
            cont8++;
        }
        if (id.equals("09")) {
            descricaoOperacao = "09 - DEVOLUÇÃO DE COMPRA";
            cont9++;
        }

        if (id.equals("10")) {
            descricaoOperacao = "10 - ORDEM DE PRODUÇAO";
            cont10++;
        }
        return descricaoOperacao;
    }
}
