package restoreapplication.Telas;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import restoreapplication.DAO.EstoqueDAO;
import restoreapplication.Model.ExtratoProduto;
import restoreapplication.DAO.ExtratoProdutoDAO;
import restoreapplication.DAO.ProdutoDAO;
import restoreapplication.DAO.ProdutoEmTransitoDAO;
import restoreapplication.Model.Estoque;
import restoreapplication.Model.Produto;
import restoreapplication.Model.ProdutoEmTransito;

public class Verifica extends javax.swing.JFrame {

    String empresa;
    String almox;
    int cont1 = 0, cont2 = 0, cont3 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, cont10 = 0;

    public Verifica() {
        initComponents();
    }

    public Verifica(String empresaP, String almoxP, String descricaoEmpresa, String descricaoAlmox) {
        initComponents();
        empresa = empresaP;
        almox = almoxP;
        jTextField3.setText(empresa);
        jTextField17.setText(empresa);
        jTextField33.setText(empresa);
        jTextField4.setText(almox);
        jTextField8.setText(almox);
        jTextField26.setText(almox);
        jTextField18.setText(descricaoEmpresa);
        jTextField22.setText(descricaoEmpresa);
        jTextField34.setText(descricaoEmpresa);
        jTextField19.setText(descricaoAlmox);
        jTextField23.setText(descricaoAlmox);
        jTextField35.setText(descricaoAlmox);
        carregaIcone();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanelPrincipal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelSaldoExtrato = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextFieldErros1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jPanelSaldoExtratoxSaldoEstoque = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jPanelEstoqueEmTransito = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jProgressBar3 = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Verificações");
        setResizable(false);

        jPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel8.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Saldo Atual", "Saldo Esperado", "Descrição", "Documento", "Data"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable1.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png"))); // NOI18N
        jLabel10.setText("Faz a comparação das transações do extrato e verifica se o saldo entre  elas esta correto.");

        jProgressBar1.setStringPainted(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299110_check_sign_icon.png"))); // NOI18N
        jButton1.setText("Iniciar verificação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("Almox.");
        jTextField7.setEnabled(false);
        jTextField7.setFocusable(false);

        jTextFieldErros1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldErros1.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldErros1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Erros");
        jTextField9.setEnabled(false);
        jTextField9.setFocusable(false);

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Produtos");
        jTextField11.setEnabled(false);
        jTextField11.setFocusable(false);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Empresa");
        jTextField2.setEnabled(false);
        jTextField2.setFocusable(false);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("PRODUTOS A SEREM PROCESSADOS");

        jTextField21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField21.setForeground(new java.awt.Color(255, 0, 0));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("ERROS ENCONTRADOS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField19))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextFieldErros1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField21))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField20)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldErros1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimentações com erro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setText("01 - VENDA DE MERCADORIA");

        jLabel3.setText("02 - COMPRA DE MERCADORIA");

        jLabel4.setText("03 - TRANSFERENCIA ENTRE ALMOXARIFADO");

        jLabel5.setText("05 - INVENTARIO");

        jLabel6.setText("06 - RETIRADA");

        jLabelCont01.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont01.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont01.setText("0");
        jLabelCont01.setOpaque(true);

        jLabelCont02.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont02.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont02.setText("0");
        jLabelCont02.setOpaque(true);

        jLabelCont03.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont03.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont03.setText("0");
        jLabelCont03.setOpaque(true);

        jLabelCont05.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont05.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont05.setText("0");
        jLabelCont05.setOpaque(true);

        jLabelCont06.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont06.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont06.setText("0");
        jLabelCont06.setOpaque(true);

        jLabel22.setText("07 - DEVOLUÇÃO DE VENDA");

        jLabelCont07.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont07.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont07.setText("0");
        jLabelCont07.setOpaque(true);

        jLabel24.setText("08 - TRANSFERENCIA ENTRE FILIAIS");

        jLabelCont08.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont08.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont08.setText("0");
        jLabelCont08.setOpaque(true);

        jLabel26.setText("09 - DEVOLUÇÃO DE COMPRA");

        jLabelCont09.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont09.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont09.setText("0");
        jLabelCont09.setOpaque(true);

        jLabel28.setText("10 - ORDEM DE PRODUÇÃO");

        jLabelCont10.setBackground(new java.awt.Color(0, 0, 0));
        jLabelCont10.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCont10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCont10.setText("0");
        jLabelCont10.setOpaque(true);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCont06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCont05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCont02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCont03, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabelCont01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCont08, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCont07, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelCont10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jLabelCont09, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jLabelCont05)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(jLabelCont10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelCont06))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSaldoExtratoLayout = new javax.swing.GroupLayout(jPanelSaldoExtrato);
        jPanelSaldoExtrato.setLayout(jPanelSaldoExtratoLayout);
        jPanelSaldoExtratoLayout.setHorizontalGroup(
            jPanelSaldoExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSaldoExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelSaldoExtratoLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelSaldoExtratoLayout.setVerticalGroup(
            jPanelSaldoExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSaldoExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SALDO EXTRATO", jPanelSaldoExtrato);

        jPanel9.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Saldo Estoque", "Saldo Extrato", "Descrição"
            }
        ));
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(1).setMinWidth(150);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(150);
            jTable2.getColumnModel().getColumn(2).setMinWidth(150);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png"))); // NOI18N
        jLabel11.setText("Faz a comparação do saldo do extrato com o saldo do estoque.");

        jProgressBar2.setStringPainted(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299110_check_sign_icon.png"))); // NOI18N
        jButton2.setText("Iniciar verificação");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png"))); // NOI18N
        jLabel12.setText("Saldo Estoque = EstDisponivel + EstReservado + EstCondicional + EstTransito");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Almox.");
        jTextField10.setEnabled(false);
        jTextField10.setFocusable(false);

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 0, 0));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Erros");
        jTextField14.setEnabled(false);
        jTextField14.setFocusable(false);

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Produtos");
        jTextField15.setEnabled(false);
        jTextField15.setFocusable(false);

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Empresa");
        jTextField16.setEnabled(false);
        jTextField16.setFocusable(false);

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("PRODUTOS A SEREM PROCESSADOS");

        jTextField25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField25.setForeground(new java.awt.Color(255, 0, 0));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("ERROS ENCONTRADOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField22, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField23))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField25))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField24)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelSaldoExtratoxSaldoEstoqueLayout = new javax.swing.GroupLayout(jPanelSaldoExtratoxSaldoEstoque);
        jPanelSaldoExtratoxSaldoEstoque.setLayout(jPanelSaldoExtratoxSaldoEstoqueLayout);
        jPanelSaldoExtratoxSaldoEstoqueLayout.setHorizontalGroup(
            jPanelSaldoExtratoxSaldoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoExtratoxSaldoEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSaldoExtratoxSaldoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelSaldoExtratoxSaldoEstoqueLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(582, 582, 582)))
                .addContainerGap())
        );
        jPanelSaldoExtratoxSaldoEstoqueLayout.setVerticalGroup(
            jPanelSaldoExtratoxSaldoEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSaldoExtratoxSaldoEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("SALDO EXTRATO X SALDO ESTOQUE", jPanelSaldoExtratoxSaldoEstoque);

        jPanel10.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa", "Almox", "Produto", "Qtde Trânsito NFs", "Qtde Trânsito Estoque", "Documento", "Mensagem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setMinWidth(100);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(1).setMinWidth(100);
            jTable4.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(2).setMinWidth(100);
            jTable4.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(3).setMinWidth(100);
            jTable4.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(4).setMinWidth(100);
            jTable4.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(4).setMaxWidth(100);
            jTable4.getColumnModel().getColumn(5).setMinWidth(100);
            jTable4.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable4.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jProgressBar3.setStringPainted(true);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299110_check_sign_icon.png"))); // NOI18N
        jButton3.setText("Iniciar verificação nos produtos em trânsito");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setText("Almox.");
        jTextField27.setEnabled(false);
        jTextField27.setFocusable(false);

        jTextField28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField28.setForeground(new java.awt.Color(255, 0, 0));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("Erros");
        jTextField30.setEnabled(false);
        jTextField30.setFocusable(false);

        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("Produtos");
        jTextField31.setEnabled(false);
        jTextField31.setFocusable(false);

        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("Empresa");
        jTextField32.setEnabled(false);
        jTextField32.setFocusable(false);

        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("PRODUTOS EM TRÂNSITO");

        jTextField37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 0, 0));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("ERROS ENCONTRADOS");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField35))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField37))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField36)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEstoqueEmTransitoLayout = new javax.swing.GroupLayout(jPanelEstoqueEmTransito);
        jPanelEstoqueEmTransito.setLayout(jPanelEstoqueEmTransitoLayout);
        jPanelEstoqueEmTransitoLayout.setHorizontalGroup(
            jPanelEstoqueEmTransitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueEmTransitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstoqueEmTransitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEstoqueEmTransitoLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(582, 582, 582)))
                .addContainerGap())
        );
        jPanelEstoqueEmTransitoLayout.setVerticalGroup(
            jPanelEstoqueEmTransitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstoqueEmTransitoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ESTOQUE EM TRÂNSITO", jPanelEstoqueEmTransito);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregaProdutos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SaldoxExtrato();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ProcessaProdutoEmTransito();
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEstoqueEmTransito;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelSaldoExtrato;
    private javax.swing.JPanel jPanelSaldoExtratoxSaldoEstoque;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldErros1;
    // End of variables declaration//GEN-END:variables
public void carregaProdutos() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);

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
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                while (jTable1.getRowCount() > 0) {
                    model.removeRow(0);
                }

                for (Produto prod : listaProdutos) {
                    ExtratoProdutoDAO extratoProdutoDAO = new ExtratoProdutoDAO();
                    ArrayList<ExtratoProduto> extratoDoProduto = new ArrayList();

                    try {
                        extratoDoProduto = extratoProdutoDAO.extratoProduto(empresa, almox, prod.getCODIGO());
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
                            erros++;
                            jTextFieldErros1.setText(Integer.toString(erros));
                            jLabelCont01.setText(Integer.toString(cont1));
                            jLabelCont02.setText(Integer.toString(cont2));
                            jLabelCont03.setText(Integer.toString(cont3));
                            jLabelCont05.setText(Integer.toString(cont5));
                            jLabelCont06.setText(Integer.toString(cont6));
                            jLabelCont07.setText(Integer.toString(cont7));
                            jLabelCont08.setText(Integer.toString(cont8));
                            jLabelCont09.setText(Integer.toString(cont9));
                            jLabelCont10.setText(Integer.toString(cont10));

                            model.addRow(new Object[]{produto.getPRODUTO(), saldoAtual.toPlainString(), saldoEsperado.toPlainString(), descricao, produto.getCODIGOID(), produto.getDATAHORA()});
                            break;
                        }
                        saldoAnterior = saldoAtual;
                    }

                    indice++;
                    jProgressBar1.setValue(indice);

                }
                jProgressBar1.setValue(0);
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);

            }
        };

        thread.start();

    }

    public void SaldoxExtrato() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                jButton2.setEnabled(false);
                jButton1.setEnabled(false);
                ProdutoDAO produtoDAO = new ProdutoDAO();
                ArrayList<Produto> listaProdutos = new ArrayList();
                try {
                    listaProdutos = produtoDAO.buscaCodigos(empresa);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                }
                int tamanho = 0;
                tamanho = listaProdutos.size();
                jTextField13.setText(Integer.toString(tamanho));
                jProgressBar2.setMaximum(tamanho);
                jProgressBar2.setMinimum(0);
                int indice = 0;
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                while (jTable2.getRowCount() > 0) {
                    model.removeRow(0);
                }
                ExtratoProdutoDAO extratoProdutoDAO = new ExtratoProdutoDAO();
                ExtratoProduto extratoProduto = new ExtratoProduto();
                int erros = 0;
                for (Produto prod : listaProdutos) {
                    try {
                        extratoProduto = extratoProdutoDAO.getLastLine(empresa, almox, prod.getCODIGO());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (extratoProduto.getSALDO() != null) { // se o produto não tem movimento o valor vem null
                        EstoqueDAO estoqueDAO = new EstoqueDAO();
                        String saldo = "";
                        try {
                            saldo = estoqueDAO.getSaldo(empresa, prod.getCODIGO(), almox);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if(extratoProduto.getSALDO() == null){
                            extratoProduto.setSALDO("0.0");
                        }
                        double saldoExtrato = Double.parseDouble(extratoProduto.getSALDO());
                        if(saldo == null && saldoExtrato > 0){
                            model.addRow(new Object[]{prod.getCODIGO(), saldo, extratoProduto.getSALDO(), "Produto tem saldo na TESTEXTRATO porem não tem registro na TESTESTOQUE para o almox selecionado."});
                            erros++;
                        }
                        if (saldo != null && !saldo.equals(extratoProduto.getSALDO())) {
                            erros++;
                            model.addRow(new Object[]{prod.getCODIGO(), saldo, extratoProduto.getSALDO(), "Saldo do extrato não bate com saldo da TESTESTOQUE"});
                        }
                    
                    }
                    indice++;
                    jProgressBar2.setValue(indice);
                    jTextField12.setText(Integer.toString(erros));
                }
                jProgressBar2.setValue(0);
                jButton2.setEnabled(true);
                jButton1.setEnabled(true);
            }
        };

        thread.start();

    }

    public void ProcessaProdutoEmTransito() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                //System.out.println("PRODUTOS EM TRANSITO -----------------");
                ProdutoEmTransitoDAO produtoEmTransitoDAO = new ProdutoEmTransitoDAO();
                ExtratoProdutoDAO extratoProdutoDAO = new ExtratoProdutoDAO();
                ArrayList<ProdutoEmTransito> listaProdutos = new ArrayList();
                
                //BUSCA TODOS OS PRODUTOS QUE ESTAO EM NOTAS EM TRANSITO
                try {
                    listaProdutos = produtoEmTransitoDAO.getProdutosEmTransito(empresa, almox);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                int qtdeProdutos = listaProdutos.size();
                jTextField29.setText(Integer.toString(qtdeProdutos));
                jProgressBar3.setMaximum(qtdeProdutos);
                EstoqueDAO estoqueDAO = new EstoqueDAO();
                int cont = 0;
                int erros = 0;
                DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                while (jTable4.getRowCount() > 0) {
                    model.removeRow(0);
                }
                for (ProdutoEmTransito prod : listaProdutos) {
                    Estoque estoque = new Estoque();
                    cont++;
                    jProgressBar3.setValue(cont);
                    //BUSCA O ESTOQUE DO PRODUTO
                    try {
                        estoque = estoqueDAO.estoqueProdutoAlmox(prod.getProduto(), empresa, almox);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ExtratoProduto extratoProduto = new ExtratoProduto();
                    //BUSCA A ULTIMA LINHA DO EXTRATO PARA PEGAR O SALDO
                    try {
                        extratoProduto = extratoProdutoDAO.getLastLine(empresa, almox, prod.getProduto());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    double saldo = 0;
                    // VERIFICA SE TEM REGISTRO NO EXTRATO DO PRODUTO
                    if(extratoProduto.getSALDO() == null){
                        saldo = 0;
                    }else{
                        saldo = Double.parseDouble(extratoProduto.getSALDO());
                        
                    }
                    
                    if(saldo > 0 && estoque.getPRODUTO() == null){
                        erros++;
                        model.addRow(new Object[]{empresa, almox, prod.getProduto(),prod.getQuantidade(),"Não enxiste",prod.getNumeronfe(), "Possui saldo no EXTRATO porem não tem registro na TESTESTOQUE. (Saldo Extrato : "+extratoProduto.getSALDO()+")"});
                        estoque.setESTTRANSITO("0.0");
                    }
                    // verificar se registro da test estoque exites e se existir verificar se o valor bate das notas em transito com testestoque
                    BigDecimal qtdNF = new BigDecimal(prod.getQuantidade());
                    BigDecimal qtdEST = new BigDecimal(estoque.getESTTRANSITO());
                    qtdNF = qtdNF.setScale(3);
                    qtdEST = qtdEST.setScale(3);
                    int comparacao = qtdNF.compareTo(qtdEST);
                    if (estoque.getPRODUTO() != null && comparacao != 0) {
                        erros++;
                        model.addRow(new Object[]{empresa, almox, prod.getProduto(),qtdNF.toPlainString(),qtdEST.toPlainString(),prod.getNumeronfe(), "Saldos não estão batendo."});
                    }
                    jTextField28.setText(Integer.toString(erros));
                }
                jProgressBar3.setValue(0);
                
            }
        };

        thread.start();

    }
    public void ProcessaTodosOsProdutos() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                //System.out.println("TODOS OS PRODUTOS -----------------");
                ProdutoDAO produtoDAO = new ProdutoDAO();
                
                ExtratoProdutoDAO extratoProdutoDAO = new ExtratoProdutoDAO();
                ArrayList<Produto> listaProdutos = new ArrayList();
                //BUSCA TODOS OS CODIGOS DE PRODUTOS ATIVOS DA BASE
                try {
                    listaProdutos = produtoDAO.buscaCodigos(empresa);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                }
                int qtdeProdutos = listaProdutos.size();
                jTextField29.setText(Integer.toString(qtdeProdutos));
                jProgressBar3.setMaximum(qtdeProdutos);
                EstoqueDAO estoqueDAO = new EstoqueDAO();
                int cont = 0;
                int erros = 0;
                
                DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                //while (jTable4.getRowCount() > 0) {
                //    model.removeRow(0);
                //}
                
                
                for (Produto prod : listaProdutos) {
                    cont++;
                    jProgressBar3.setValue(cont);
                    Estoque estoque = new Estoque();
                    //BUSCA A TESTESTOQUE DO PRODUTO
                    try {
                        estoque = estoqueDAO.estoqueProdutoAlmox(prod.getCODIGO(), empresa, almox);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    ExtratoProduto extratoProduto = new ExtratoProduto();
                    //BUSCA A ULTIMA LINHA DO EXTRATO DO PRODUTO PARA CONSEGUIR O SALDO DO EXTRATO
                    try {
                        extratoProduto = extratoProdutoDAO.getLastLine(empresa, almox, prod.getCODIGO());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Verifica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    float saldo = 0;
                    // VERIFICA SE TEM REGISTRO NO EXTRATO DO PRODUTO
                    if(extratoProduto.getSALDO() == null){
                        //produto sem movimentação na extrato
                        saldo = 0;
                    }else{
                        saldo = Float.parseFloat(extratoProduto.getSALDO());
                    }
                    //TEM SALDO POREM NAO TEM REGISTRO NA TESTESTOQUE
                    if(saldo > 0 && estoque.getPRODUTO() == null){
                        erros++;
                        jTextField28.setText(Integer.toString(erros));
                        model.addRow(new Object[]{empresa, almox, prod.getCODIGO(), "Possui saldo no EXTRATO porem não tem registro na TESTESTOQUE. ("+extratoProduto.getSALDO()+")"});
                        //System.out.println("Produto " + prod.getCODIGO() + " : Possui saldo no EXTRATO porem não tem registro na TESTESTOQUE. EMPRESA : " + empresa + " ALMOX : " + almox);
                    }
                }
                jProgressBar3.setValue(0);
                
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

    public void carregaIcone() {
        URL iconURL = getClass().getResource("/icons/eco.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
    }
}
