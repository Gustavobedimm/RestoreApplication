package restoreapplication.Telas;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restoreapplication.DAO.LoteValidadeDAO;
import restoreapplication.DAO.LoteValidadeMovDAO;
import restoreapplication.Model.LoteValidade;
import restoreapplication.Model.LoteValidadeMov;

/**
 *
 * @author gustavo.mazutti
 */
public final class ExtratoLote12 extends javax.swing.JFrame {

    ArrayList<LoteValidadeMov> listaMovLote = new ArrayList();
    String empresa;
    String idLote;

    /**
     * Creates new form ExtratoLote
     */
    public ExtratoLote12() {
        initComponents();
    }

    public ExtratoLote12(String empresaP, String idLoteP) {
        initComponents();
        empresa = empresaP;
        idLote = idLoteP;
        carregaIcone();
        carregar(empresaP, idLoteP);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLote = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldFabricacao = new javax.swing.JTextField();
        jTextFieldVencimento = new javax.swing.JTextField();
        jTextFieldIdLote = new javax.swing.JTextField();
        jTextFieldLote = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAlteracao = new javax.swing.JTextField();
        jTextFieldEstoque = new javax.swing.JTextField();
        jLabelErro1 = new javax.swing.JLabel();
        jLabelDescricao2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentações do Lote de Validade");
        setResizable(false);

        jTableLote.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp", "Qtde", "Saldo", "Orig", "Prod", "Doc", "Data", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLote);
        if (jTableLote.getColumnModel().getColumnCount() > 0) {
            jTableLote.getColumnModel().getColumn(0).setResizable(false);
            jTableLote.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTableLote.getColumnModel().getColumn(1).setResizable(false);
            jTableLote.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableLote.getColumnModel().getColumn(2).setResizable(false);
            jTableLote.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableLote.getColumnModel().getColumn(3).setResizable(false);
            jTableLote.getColumnModel().getColumn(3).setPreferredWidth(15);
            jTableLote.getColumnModel().getColumn(4).setResizable(false);
            jTableLote.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTableLote.getColumnModel().getColumn(5).setResizable(false);
            jTableLote.getColumnModel().getColumn(5).setPreferredWidth(30);
            jTableLote.getColumnModel().getColumn(7).setResizable(false);
            jTableLote.getColumnModel().getColumn(7).setPreferredWidth(15);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Lote de Validade"));

        jTextFieldFabricacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Fabricação"));

        jTextFieldVencimento.setBorder(javax.swing.BorderFactory.createTitledBorder("Vencimento"));

        jTextFieldIdLote.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Lote"));

        jTextFieldLote.setBorder(javax.swing.BorderFactory.createTitledBorder("Lote"));

        jTextFieldProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto Principal"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("V - Vendido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("R - Reservado");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("C - Cancelado");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("P - Pendente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldIdLote, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldAlteracao.setToolTipText("TESTLOTEVALIDADEESTOQUE");
        jTextFieldAlteracao.setBorder(javax.swing.BorderFactory.createTitledBorder("Ultima Alteração "));

        jTextFieldEstoque.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldEstoque.setToolTipText("TESTLOTEVALIDADEESTOQUE");
        jTextFieldEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque"));

        jLabelErro1.setText("As mov. do lote não batem com o estoque do lote.");

        jLabelDescricao2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelDescricao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDescricao2.setText("LOTE DE VALIDADE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelErro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabelDescricao2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDescricao2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAlteracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelErro1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ExtratoLote12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExtratoLote12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExtratoLote12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExtratoLote12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExtratoLote12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDescricao2;
    private javax.swing.JLabel jLabelErro1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLote;
    private javax.swing.JTextField jTextFieldAlteracao;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldFabricacao;
    private javax.swing.JTextField jTextFieldIdLote;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldVencimento;
    // End of variables declaration//GEN-END:variables
public void carregar(String empresa, String idLote) {
        jLabelErro1.setVisible(false);
        //carrega lote 
        LoteValidade lote = new LoteValidade();
        LoteValidadeDAO loteValidadeDAO = new LoteValidadeDAO();
        lote = loteValidadeDAO.getMovimentacaoLoteID(idLote);
        jTextFieldIdLote.setText(lote.getIdentificador());
        jTextFieldEstoque.setText(lote.getEstoqueatual());
        jTextFieldFabricacao.setText(lote.getFabricacao());
        jTextFieldVencimento.setText(lote.getVencimento());
        jTextFieldProduto.setText(lote.getProdutoprincipal());
        jTextFieldAlteracao.setText(lote.getAlteracao());
        jTextFieldLote.setText(lote.getLote());
        jLabelDescricao2.setText("LOTE DE VALIDADE " +lote.getLote());
        //carrega movimentos do lote
        LoteValidadeMovDAO loteDAO = new LoteValidadeMovDAO();
        ArrayList<LoteValidadeMov> listaMovLote = new ArrayList<>();
        listaMovLote = loteDAO.getMovimentacaoLote(empresa, idLote);
        DefaultTableModel model2 = (DefaultTableModel) jTableLote.getModel();
        
        while (jTableLote.getRowCount() > 0) {
            model2.removeRow(0);
        }
        
        BigDecimal saldo = new BigDecimal("0.0");
        for (LoteValidadeMov movLote : listaMovLote) {
            jTableLote.setDefaultRenderer(Object.class, new PintarTabela());
            if(movLote.getSTATUS().equals("C")){
                model2.addRow(new Object[]{movLote.getEMPRESA(), movLote.getQTDE(),"", movLote.getORIGEM(), movLote.getPRODUTO(), movLote.getIDVENDA(),movLote.getDATAHORA(),movLote.getSTATUS()});
            }else{
                BigDecimal qtd = new BigDecimal(movLote.getQTDE());
                saldo = saldo.add(qtd);
                model2.addRow(new Object[]{movLote.getEMPRESA(), movLote.getQTDE(),saldo, movLote.getORIGEM(), movLote.getPRODUTO(), movLote.getIDVENDA(),movLote.getDATAHORA(),movLote.getSTATUS()});
            }
        }
        
        BigDecimal estoque = new BigDecimal(lote.getEstoqueatual());
        if (!saldo.equals(estoque)){
            jLabelErro1.setVisible(true);
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
            
            
            Object objeto2 = table.getValueAt(row, 7);
            String status = objeto2.toString();
            if (status.equals("C")) {
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
public void carregaIcone(){
        URL iconURL = getClass().getResource("/icons/eco.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
    }

}
