package restoreapplication.Telas;

import java.awt.Color;
import static java.awt.Color.WHITE;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import restoreapplication.DAO.AlmoxDAO;
import restoreapplication.DAO.EmpresaDAO;
import restoreapplication.Model.Estoque;
import restoreapplication.DAO.EstoqueDAO;
import restoreapplication.Model.ExtratoProduto;
import restoreapplication.DAO.ExtratoProdutoDAO;
import restoreapplication.DAO.LoteValidadeDAO;
import restoreapplication.Model.Produto;
import restoreapplication.DAO.ProdutoDAO;
import restoreapplication.Model.Almox;
import restoreapplication.Model.Empresa;
import restoreapplication.Model.LoteValidade;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.math.BigDecimal;

public final class Principal extends javax.swing.JFrame {

    String codEmpresa = "00";
    String codAlmox = "00";
    String codProduto = "0";
    ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    ArrayList<Almox> listaAlmox = new ArrayList<>();

    public Principal() {
        initComponents();
        carregaComboBoxEmpresa();
        carregaComboAlmox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jTextFieldEntrada = new javax.swing.JTextField();
        jTextFieldSaida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNfe = new javax.swing.JTable();
        jTextFieldErros = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoquesProduto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxControlaLote = new javax.swing.JCheckBox();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxEstFracionado = new javax.swing.JCheckBox();
        jCheckBoxProdGenerico = new javax.swing.JCheckBox();
        jCheckBoxDispVenda = new javax.swing.JCheckBox();
        jCheckBoxContSerie = new javax.swing.JCheckBox();
        jTextFieldEmbalagem = new javax.swing.JTextField();
        jTextFieldQtdeEmbalagem = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jTextFieldProduto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextFieldDescricao = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstoques = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSaldo = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableLoteValidade = new javax.swing.JTable();
        jCheckBoxLotes = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jComboBoxEmpresa = new javax.swing.JComboBox<>();
        jComboBoxAlmox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extrato do Produto");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1344, 850));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extrato (TESTEXTRATO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo"));
        jTextFieldSaldo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jTextFieldEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada (+)"));
        jTextFieldEntrada.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaActionPerformed(evt);
            }
        });

        jTextFieldSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saida (-)"));
        jTextFieldSaida.setMaximumSize(new java.awt.Dimension(64, 22));

        jTableNfe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP", "ALM", "E/S", "QTDE", "SALD", "SALD ESP", "DATAHORA", "DOC.", "ID", "DESCRICAO", "CUSTOMEDIO", "CUSTOFINAL", "CUSTOREPMED", "CUSTOREP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNfe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableNfe.setMinimumSize(new java.awt.Dimension(0, 0));
        jTableNfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNfeMouseClicked(evt);
            }
        });
        jTableNfe.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jTableNfeCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jTableNfe.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableNfePropertyChange(evt);
            }
        });
        jTableNfe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableNfeKeyPressed(evt);
            }
        });
        jTableNfe.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jTableNfeVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNfe);
        if (jTableNfe.getColumnModel().getColumnCount() > 0) {
            jTableNfe.getColumnModel().getColumn(0).setMinWidth(50);
            jTableNfe.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableNfe.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setMinWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setMaxWidth(50);
            jTableNfe.getColumnModel().getColumn(2).setMinWidth(60);
            jTableNfe.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableNfe.getColumnModel().getColumn(2).setMaxWidth(60);
            jTableNfe.getColumnModel().getColumn(3).setMinWidth(110);
            jTableNfe.getColumnModel().getColumn(3).setPreferredWidth(110);
            jTableNfe.getColumnModel().getColumn(3).setMaxWidth(110);
            jTableNfe.getColumnModel().getColumn(4).setMinWidth(110);
            jTableNfe.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTableNfe.getColumnModel().getColumn(4).setMaxWidth(110);
            jTableNfe.getColumnModel().getColumn(5).setMinWidth(110);
            jTableNfe.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTableNfe.getColumnModel().getColumn(5).setMaxWidth(110);
            jTableNfe.getColumnModel().getColumn(6).setMinWidth(150);
            jTableNfe.getColumnModel().getColumn(6).setPreferredWidth(150);
            jTableNfe.getColumnModel().getColumn(6).setMaxWidth(150);
            jTableNfe.getColumnModel().getColumn(7).setMinWidth(100);
            jTableNfe.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTableNfe.getColumnModel().getColumn(7).setMaxWidth(100);
            jTableNfe.getColumnModel().getColumn(8).setMinWidth(40);
            jTableNfe.getColumnModel().getColumn(8).setPreferredWidth(40);
            jTableNfe.getColumnModel().getColumn(8).setMaxWidth(40);
            jTableNfe.getColumnModel().getColumn(9).setResizable(false);
            jTableNfe.getColumnModel().getColumn(9).setPreferredWidth(150);
        }

        jTextFieldErros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldErros.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros no Extrato"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTextFieldSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldErros))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldErros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque (TESTPRODUTO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setToolTipText("Toque duas vezes para esconder");
        jPanel3.setMinimumSize(new java.awt.Dimension(327, 103));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(327, 103));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jTableEstoquesProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALMOX", "DISPONIVEL", "RETIRAR", "CONDICIONAL", "RESERVADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableEstoquesProduto);
        if (jTableEstoquesProduto.getColumnModel().getColumnCount() > 0) {
            jTableEstoquesProduto.getColumnModel().getColumn(0).setMinWidth(50);
            jTableEstoquesProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableEstoquesProduto.getColumnModel().getColumn(0).setMaxWidth(999);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setMaxWidth(999);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setMaxWidth(999);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setMaxWidth(999);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setMinWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setMaxWidth(999);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel2.setEnabled(false);

        jCheckBoxControlaLote.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxControlaLote.setText("Constrola Lote de Validade ");
        jCheckBoxControlaLote.setDisabledSelectedIcon(null);
        jCheckBoxControlaLote.setFocusable(false);

        jCheckBoxAtivo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxAtivo.setText("Ativo ");
        jCheckBoxAtivo.setFocusable(false);

        jCheckBoxEstFracionado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxEstFracionado.setText("Estoque fracionado");
        jCheckBoxEstFracionado.setFocusable(false);

        jCheckBoxProdGenerico.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxProdGenerico.setText("Produto generico");
        jCheckBoxProdGenerico.setFocusable(false);

        jCheckBoxDispVenda.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxDispVenda.setText("Disponivel p/ Venda");
        jCheckBoxDispVenda.setFocusable(false);

        jCheckBoxContSerie.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxContSerie.setText("Controla numero de serie");
        jCheckBoxContSerie.setFocusable(false);

        jTextFieldEmbalagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Embalagem"));

        jTextFieldQtdeEmbalagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Qtde Embalagem"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldEmbalagem, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(jTextFieldQtdeEmbalagem))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxControlaLote)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jCheckBoxEstFracionado))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxContSerie)
                    .addComponent(jCheckBoxDispVenda)
                    .addComponent(jCheckBoxProdGenerico))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQtdeEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxControlaLote)
                            .addComponent(jCheckBoxProdGenerico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxAtivo)
                            .addComponent(jCheckBoxDispVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxEstFracionado)
                            .addComponent(jCheckBoxContSerie))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBoxControlaLote.getAccessibleContext().setAccessibleDescription("");

        jTextFieldProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        jTextFieldProduto.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProdutoKeyPressed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/magnifying-glass (1).png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(92, 30));
        jButton2.setMinimumSize(new java.awt.Dimension(92, 30));
        jButton2.setPreferredSize(new java.awt.Dimension(92, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldDescricao.setEditable(false);
        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));
        jTextFieldDescricao.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque (TESTESTOQUE)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel5.setToolTipText("Toque duas vezes para esconder");
        jPanel5.setMinimumSize(new java.awt.Dimension(327, 103));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jTableEstoques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALMOX", "DISPONIVEL", "RETIRAR", "CONDICIONAL", "RESERVADO", "SOMA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableEstoques);
        if (jTableEstoques.getColumnModel().getColumnCount() > 0) {
            jTableEstoques.getColumnModel().getColumn(0).setMinWidth(50);
            jTableEstoques.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableEstoques.getColumnModel().getColumn(0).setMaxWidth(999);
            jTableEstoques.getColumnModel().getColumn(1).setMinWidth(50);
            jTableEstoques.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableEstoques.getColumnModel().getColumn(1).setMaxWidth(999);
            jTableEstoques.getColumnModel().getColumn(2).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(2).setMaxWidth(999);
            jTableEstoques.getColumnModel().getColumn(3).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(3).setMaxWidth(999);
            jTableEstoques.getColumnModel().getColumn(4).setMinWidth(70);
            jTableEstoques.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(4).setMaxWidth(999);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saldo (TESTEXTRATOSALDOPRODUTO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel7.setMaximumSize(new java.awt.Dimension(9999, 999));

        jTableSaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP", "ALMOX", "ANOMES", "ANTERIOR", "ENTRADA", "SAIDA", "ATUAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableSaldo);
        if (jTableSaldo.getColumnModel().getColumnCount() > 0) {
            jTableSaldo.getColumnModel().getColumn(0).setMinWidth(30);
            jTableSaldo.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableSaldo.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableSaldo.getColumnModel().getColumn(1).setMinWidth(30);
            jTableSaldo.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableSaldo.getColumnModel().getColumn(1).setMaxWidth(30);
            jTableSaldo.getColumnModel().getColumn(2).setMinWidth(50);
            jTableSaldo.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableSaldo.getColumnModel().getColumn(3).setMinWidth(40);
            jTableSaldo.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableSaldo.getColumnModel().getColumn(4).setMinWidth(70);
            jTableSaldo.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableSaldo.getColumnModel().getColumn(5).setMinWidth(70);
            jTableSaldo.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTableSaldo.getColumnModel().getColumn(6).setMinWidth(70);
            jTableSaldo.getColumnModel().getColumn(6).setPreferredWidth(70);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque Lote(TESTLOTEVALIDADEESTOQUE)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTableLoteValidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp", "ID", "Lote", "Fab", "Val", "Est"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLoteValidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLoteValidadeMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableLoteValidade);

        jCheckBoxLotes.setText("Mostrar todos os Lotes do Produto");
        jCheckBoxLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxLotes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxLotes)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jComboBoxEmpresa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEmpresaItemStateChanged(evt);
            }
        });
        jComboBoxEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmpresaActionPerformed(evt);
            }
        });

        jComboBoxAlmox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAlmoxItemStateChanged(evt);
            }
        });
        jComboBoxAlmox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlmoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Empresa");

        jLabel2.setText("Almox");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxAlmox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAlmox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Verificações");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/identify.png"))); // NOI18N
        jMenuItem1.setText("VERIFICA INTEGRIDADE DO EXTRATO");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/identify.png"))); // NOI18N
        jMenuItem3.setText("VERIFICA ALMOX PADRAO NOS PRODUTOS");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configurações");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jCheckBoxMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jCheckBoxMenuItem5.setSelected(true);
        jCheckBoxMenuItem5.setText("Mostrar erros no extrato");
        jCheckBoxMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem5);

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Mostrar cores no extrato");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Mostrar telas secundarias");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem2);
        jMenu2.add(jSeparator1);

        jCheckBoxMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jCheckBoxMenuItem3.setText("Tela cheia");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableNfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNfeMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = jTableNfe.getSelectedRow();
            String numeroDOC = (String) jTableNfe.getValueAt(linha, 7);
            String movimentoID = (String) jTableNfe.getValueAt(linha, 8);
            String empresa = (String) jTableNfe.getValueAt(linha, 0);
            //01 = TVENPedido
            //02 = TEstNfe E e S S=Cancelamento
            //03 = TEstTransfAlmox
            //04 = TEstTransfProduto
            //05 = TEstInventario
            //06 = TVenRetirada
            //07 =  DEVOLUCAO DE VENDA
            //09 = TEstDevolucao
            boolean controlaLote = false;
            if (jCheckBoxControlaLote.isSelected()) {
                controlaLote = true;
            }
            if (movimentoID.equals("01")) {
                TelaPedidos telaPedidos = new TelaPedidos(empresa, numeroDOC, controlaLote);
                telaPedidos.setVisible(true);
            }
            if (movimentoID.equals("02")) {
                TelaNotas telaNotas = new TelaNotas(empresa, numeroDOC, controlaLote);
                telaNotas.setVisible(true);
            }
            if (movimentoID.equals("03")) {
                System.out.println(numeroDOC);
                TelaTransAlmox transfAlmox = new TelaTransAlmox(empresa,numeroDOC);
                transfAlmox.setVisible(true);
            }
            if (movimentoID.equals("04")) {
            }
            if (movimentoID.equals("05")) {
                TelaInventario telaInventario = new TelaInventario(empresa, numeroDOC);
                telaInventario.setVisible(true);
            }
            if (movimentoID.equals("06")) {
                TelaRetirada telaRetirada = new TelaRetirada(empresa, numeroDOC, controlaLote);
                telaRetirada.setVisible(true);
            }
            if (movimentoID.equals("07")) {
            }
            if (movimentoID.equals("09")) {
            }
        }

    }//GEN-LAST:event_jTableNfeMouseClicked

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        botaoCarregar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableNfeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableNfeKeyPressed

    }//GEN-LAST:event_jTableNfeKeyPressed

    private void jTableNfePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableNfePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNfePropertyChange

    private void jTableNfeVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jTableNfeVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableNfeVetoableChange

    private void jTableNfeCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTableNfeCaretPositionChanged

    }//GEN-LAST:event_jTableNfeCaretPositionChanged

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked

    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Verifica verifica = new Verifica(codEmpresa, codAlmox);
        verifica.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextFieldEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEntradaActionPerformed

    private void jComboBoxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaActionPerformed
        //carregaComboAlmox();
    }//GEN-LAST:event_jComboBoxEmpresaActionPerformed

    private void jComboBoxAlmoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlmoxActionPerformed

    }//GEN-LAST:event_jComboBoxAlmoxActionPerformed

    private void jComboBoxAlmoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAlmoxItemStateChanged
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
    }//GEN-LAST:event_jComboBoxAlmoxItemStateChanged

    private void jComboBoxEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaItemStateChanged
        codEmpresa = listaEmpresas.get(jComboBoxEmpresa.getSelectedIndex()).getCodigo();
        //DefaultComboBoxModel model = (DefaultComboBoxModel) jComboBoxAlmox.getModel();
        // model.removeAllElements();
    }//GEN-LAST:event_jComboBoxEmpresaItemStateChanged

    private void jCheckBoxLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLotesActionPerformed
        carregarTabelaLote();
    }//GEN-LAST:event_jCheckBoxLotesActionPerformed

    private void jTableLoteValidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLoteValidadeMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = jTableLoteValidade.getSelectedRow();
            String empresa = (String) jTableLoteValidade.getValueAt(linha, 0);
            String idLote = (String) jTableLoteValidade.getValueAt(linha, 1);

            if (!empresa.equals("SOMA")) {
                ExtratoLote extratoLote = new ExtratoLote(empresa, idLote);
                extratoLote.setVisible(true);
            }
        }


    }//GEN-LAST:event_jTableLoteValidadeMouseClicked

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaConferenciaAlmox tela = new TelaConferenciaAlmox(codEmpresa, codAlmox);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        jTableNfe.setDefaultRenderer(Object.class, new PintarTabela());
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        if (jCheckBoxMenuItem3.isSelected()) {
            this.setExtendedState(MAXIMIZED_BOTH);
        } else {
            this.setSize(1344, 850);
            this.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        if (!jCheckBoxMenuItem2.isSelected()) {
            jPanel5.setVisible(false);
            jPanel3.setVisible(false);
            jPanel7.setVisible(false);
            jPanel9.setVisible(false);
        } else {
            jPanel5.setVisible(true);
            jPanel3.setVisible(true);
            jPanel7.setVisible(true);
            jPanel9.setVisible(true);
        }
        
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jTextFieldProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botaoCarregar();
        }
    }//GEN-LAST:event_jTextFieldProdutoKeyPressed

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            if(jPanel5.isVisible())
            jPanel5.setVisible(false);
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            if(jPanel3.isVisible())
            jPanel3.setVisible(false);
        }
    }//GEN-LAST:event_jPanel3MouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxAtivo;
    private javax.swing.JCheckBox jCheckBoxContSerie;
    private javax.swing.JCheckBox jCheckBoxControlaLote;
    private javax.swing.JCheckBox jCheckBoxDispVenda;
    private javax.swing.JCheckBox jCheckBoxEstFracionado;
    private javax.swing.JCheckBox jCheckBoxLotes;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem5;
    private javax.swing.JCheckBox jCheckBoxProdGenerico;
    private javax.swing.JComboBox<String> jComboBoxAlmox;
    private javax.swing.JComboBox<String> jComboBoxEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTableEstoques;
    private javax.swing.JTable jTableEstoquesProduto;
    private javax.swing.JTable jTableLoteValidade;
    private javax.swing.JTable jTableNfe;
    private javax.swing.JTable jTableSaldo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEmbalagem;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldErros;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQtdeEmbalagem;
    private javax.swing.JTextField jTextFieldSaida;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
public void carregarTabela(ArrayList<ExtratoProduto> listaExtrato) {
        DefaultTableModel model = (DefaultTableModel) jTableNfe.getModel();

        while (jTableNfe.getRowCount() > 0) {
            model.removeRow(0);
        }
        BigDecimal entradas = new BigDecimal("0.0");
        BigDecimal saidas = new BigDecimal("0.0");
        BigDecimal saldo = new BigDecimal("0.0");

        var formatter = new DecimalFormat("#,###.##");
        var s = new DecimalFormatSymbols();
        s.setDecimalSeparator(',');
        s.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(s);

        BigDecimal saldoGravadoAnterior = new BigDecimal("0");
        Integer erro = 0;
        for (ExtratoProduto movimentacao : listaExtrato) {
            BigDecimal qtd = new BigDecimal(movimentacao.getQTDE());
            BigDecimal saldoAtual = new BigDecimal(movimentacao.getSALDO());
            BigDecimal saldoEsperado = new BigDecimal("0");
            if (movimentacao.getENTRADASAIDA().equals("E")) {
                saldoEsperado = saldoGravadoAnterior.add(qtd);
                saldoGravadoAnterior = saldoGravadoAnterior.add(qtd);
                entradas = entradas.add(qtd);
            } else {
                saldoEsperado = saldoGravadoAnterior.subtract(qtd);
                saldoGravadoAnterior = saldoGravadoAnterior.subtract(qtd);
                saidas = saidas.add(qtd);
            }
            if (!saldoAtual.toString().equals(saldoEsperado.toString())) {
                erro++;
            }
            saldo = entradas.subtract(saidas);
            String entradasString = formatter.format(entradas);
            String saidasString = formatter.format(saidas);
            String saldoString = formatter.format(saldo);

            jTextFieldEntrada.setText(entradasString);
            jTextFieldSaida.setText(saidasString);
            jTextFieldSaldo.setText(saldoString);
            jTableNfe.setDefaultRenderer(Object.class, new PintarTabela());
            String descricaoOperacao = "";
            if (movimentacao.getMOVIMENTOID().equals("01") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "VENDA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("01") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE VENDA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("02") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "COMPRA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("02") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "CANCELAMENTO COMPRA DE MERCADORIA";
            }
            if (movimentacao.getMOVIMENTOID().equals("03")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE ALMOXARIFADO";
            }
            if (movimentacao.getMOVIMENTOID().equals("04")) {
                descricaoOperacao = "TRANSFERENCIA PRODUTO";
            }
            if (movimentacao.getMOVIMENTOID().equals("05")) {
                descricaoOperacao = "INVENTARIO";
            }
            if (movimentacao.getMOVIMENTOID().equals("06") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "RETIRADA";
            }
            if (movimentacao.getMOVIMENTOID().equals("06") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE RETIRADA";
            }
            if (movimentacao.getMOVIMENTOID().equals("07") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "DEVOLUÇÃO DE VENDA";
            }
            if (movimentacao.getMOVIMENTOID().equals("07") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "CANCELAMENTO DE DEVOLUÇÃO DE VENDA";
            }
            if (movimentacao.getMOVIMENTOID().equals("08")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE FILIAIS";
            }
            if (movimentacao.getMOVIMENTOID().equals("09")) {
                descricaoOperacao = "DEVOLUÇÃO";
            }
            if (movimentacao.getMOVIMENTOID().equals("09") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "DEVOLUÇÃO DE COMPRA";
            }
            if (movimentacao.getMOVIMENTOID().equals("09") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE DEVOLUÇÃO DE COMPRA";
            }
            if (movimentacao.getMOVIMENTOID().equals("10")) {
                descricaoOperacao = "ORDEM DE PRODUÇAO";
            }

            if (movimentacao.getENTRADASAIDA().equals("S")) {
                model.addRow(new Object[]{movimentacao.getEMPRESA(), movimentacao.getALMOX(), "SAIDA", qtd, saldoAtual, saldoEsperado, movimentacao.getDATAHORA(), movimentacao.getCODIGOID(), movimentacao.getMOVIMENTOID(), descricaoOperacao,movimentacao.getCUSTOMEDIO(),movimentacao.getCUSTOFINAL(),movimentacao.getCUSTOMEDIOREPOSICAO(),movimentacao.getCUSTOREPOSICAO()});

            } else {
                model.addRow(new Object[]{movimentacao.getEMPRESA(), movimentacao.getALMOX(), "ENTRADA", qtd, saldoAtual, saldoEsperado, movimentacao.getDATAHORA(), movimentacao.getCODIGOID(), movimentacao.getMOVIMENTOID(), descricaoOperacao,movimentacao.getCUSTOMEDIO(),movimentacao.getCUSTOFINAL(),movimentacao.getCUSTOMEDIOREPOSICAO(),movimentacao.getCUSTOREPOSICAO()});
            }

        }
        if (erro > 0) {
            jTextFieldErros.setText(erro.toString());
            jTextFieldErros.setForeground(Color.red);
        } else {
            jTextFieldErros.setText(erro.toString());
            jTextFieldErros.setForeground(Color.black);

        }
    }

    public void carregarTabelaEstoque(ArrayList<Estoque> listaEstoque) {
        DefaultTableModel model = (DefaultTableModel) jTableEstoques.getModel();

        while (jTableEstoques.getRowCount() > 0) {
            model.removeRow(0);
        }
        float disponivel = 0;
        float retirar = 0;
        float condicional = 0;
        float reservado = 0;
        for (Estoque estoque : listaEstoque) {
            float total = 0;
            disponivel += Float.parseFloat(estoque.getESTDISPONIVEL());
            retirar += Float.parseFloat(estoque.getESTARETIRAR());
            condicional += Float.parseFloat(estoque.getESTCONDICIONAL());
            reservado += Float.parseFloat(estoque.getESTRESERVADO());
            total = Float.parseFloat(estoque.getESTDISPONIVEL()) + Float.parseFloat(estoque.getESTARETIRAR()) + Float.parseFloat(estoque.getESTCONDICIONAL()) + Float.parseFloat(estoque.getESTRESERVADO());
            model.addRow(new Object[]{estoque.getALMOX(), estoque.getESTDISPONIVEL(), estoque.getESTARETIRAR(), estoque.getESTCONDICIONAL(), estoque.getESTRESERVADO(), total});
        }
        if (!listaEstoque.isEmpty()) {
            model.addRow(new Object[]{"SOMA", disponivel, retirar, condicional, reservado, disponivel + retirar + condicional + reservado});
        }
    }

    public void carregarTabelaLote() {
        ArrayList<LoteValidade> listaLote = new ArrayList();
        LoteValidadeDAO loteValidadeDAO = new LoteValidadeDAO();
        try {
            listaLote = loteValidadeDAO.getMovimentacaoLote(codProduto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) jTableLoteValidade.getModel();
        while (jTableLoteValidade.getRowCount() > 0) {
            model.removeRow(0);
        }
        float soma = 0;
        if (jCheckBoxLotes.isSelected()) {
            for (LoteValidade loteValidade : listaLote) {
                soma = soma + Float.parseFloat(loteValidade.getEstoqueatual());
                model.addRow(new Object[]{loteValidade.getEmpresa(), loteValidade.getIdentificador(), loteValidade.getLote(), loteValidade.getFabricacao(), loteValidade.getVencimento(), loteValidade.getEstoqueatual()});
            }

        } else {
            for (LoteValidade loteValidade : listaLote) {
                soma = soma + Float.parseFloat(loteValidade.getEstoqueatual());
                Float estAtual = Float.parseFloat(loteValidade.getEstoqueatual());
                if (estAtual != 0) {
                    model.addRow(new Object[]{loteValidade.getEmpresa(), loteValidade.getIdentificador(), loteValidade.getLote(), loteValidade.getFabricacao(), loteValidade.getVencimento(), loteValidade.getEstoqueatual()});
                }

            }
        }

        if (!listaLote.isEmpty()) {
            model.addRow(new Object[]{"SOMA", "", "", "", "", soma});
        }
    }

    public void carregaComboBoxEmpresa() {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        try {
            listaEmpresas = empresaDAO.consultaEmpresa();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Empresa empresa : listaEmpresas) {
            
            
            
            
            jComboBoxEmpresa.addItem(empresa.getCodigo() + " - " + empresa.getNomefantasia());
        }
        codEmpresa = listaEmpresas.get(jComboBoxEmpresa.getSelectedIndex()).getCodigo();
    }

    public void carregaComboAlmox() {
        AlmoxDAO almoxDAO = new AlmoxDAO();
        try {
            listaAlmox = almoxDAO.consultaAlmox();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Almox a : listaAlmox) {
            jComboBoxAlmox.addItem("Emp : " + a.getEmpresa() + " Almox : " + a.getCodigo() + " - " + a.getDescricao());
        }
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
    }

    public void carregaTabelaSaldo(String produtoP) {
        var formatter = new DecimalFormat("#,###.##");
        var s = new DecimalFormatSymbols();
        s.setDecimalSeparator(',');
        s.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(s);

        DefaultTableModel model = (DefaultTableModel) jTableSaldo.getModel();
        ArrayList<Produto> listaSaldosProdutos = new ArrayList<>();
        while (jTableSaldo.getRowCount() > 0) {
            model.removeRow(0);
        }
        ProdutoDAO produtoDAO = new ProdutoDAO();
        try {
            listaSaldosProdutos = produtoDAO.buscaSaldo(codEmpresa, codAlmox, produtoP);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        BigDecimal entradasSoma = new BigDecimal("0.0");
        BigDecimal saidasSoma = new BigDecimal("0.0");
        BigDecimal soma = new BigDecimal("0.0");

        for (Produto produto : listaSaldosProdutos) {
            BigDecimal entradas = new BigDecimal(produto.getENTRADA());
            BigDecimal saidas = new BigDecimal(produto.getSAIDA());
            BigDecimal saldo = new BigDecimal(produto.getATUAL());

            entradasSoma = entradasSoma.add(entradas);
            saidasSoma = saidasSoma.add(saidas);
            model.addRow(new Object[]{produto.getEMPRESA(), produto.getALMOX(), produto.getANOSMES(), produto.getANTERIOR(), produto.getENTRADA(), produto.getSAIDA(), produto.getATUAL()});
        }
        if (!listaSaldosProdutos.isEmpty()) {
            soma = entradasSoma.subtract(saidasSoma);
            String aux1 = formatter.format(entradasSoma);
            String aux2 = formatter.format(saidasSoma);
            String aux3 = formatter.format(soma);

            model.addRow(new Object[]{"SOMA", "", "", "", aux1, aux2, aux3});
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

            //PINTA POR TIPO DE OPERACAO
            if (jCheckBoxMenuItem1.isSelected()) {
                Object objeto = table.getValueAt(row, 2);
                Object objeto1 = table.getValueAt(row, 8);
                Color Azul = new Color(0, 0, 255);
                Color Amarelo = new Color(218, 165, 32);
                Color roxoClaro = new Color(118, 120, 237);
                Color verdeAgua = new Color(42, 157, 143);
                Color transfAlmox = new Color(60, 9, 108);
                Color transfFiliais = new Color(117, 13, 55);
                Color pcp = new Color(56, 176, 0);
                String valor = objeto.toString();
                String valor2 = objeto1.toString();
                if (valor.equals("ENTRADA") && valor2.equals("02")) {
                    foreground = Azul;
                    label.setForeground(Azul);
                }
                if (valor.equals("SAIDA") && valor2.equals("02")) {
                    foreground = Amarelo;
                }
                if (valor.equals("ENTRADA") && valor2.equals("01")) {
                    foreground = Amarelo;
                }
                if (valor2.equals("05")) {
                    foreground = verdeAgua;
                }
                if (valor2.equals("03")) {
                    foreground = transfAlmox;
                }
                if (valor2.equals("06")) {
                    foreground = roxoClaro;
                }
                if (valor2.equals("10")) {
                    foreground = pcp;
                }
                if (valor2.equals("08")) {
                    foreground = transfFiliais;
                }
            }
            //FIM
            if(jCheckBoxMenuItem5.isSelected()){
            Object objeto2 = table.getValueAt(row, 4);
            Object objeto3 = table.getValueAt(row, 5);
            String saldo = objeto2.toString();
            String saldoEsperado = objeto3.toString();
            if (!saldo.equals(saldoEsperado)) {
                foreground = VERMELHO;
            }
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
    public void botaoCarregar(){
        String tmp = jTextFieldProduto.getText();
        while (tmp.length() < 6) {
            tmp = "0" + tmp;
        }
        jTextFieldProduto.setText(tmp);
        codProduto = tmp;

        ArrayList<Estoque> listaEstoque = new ArrayList();
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        String produtoString = jTextFieldProduto.getText();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        Produto produto = new Produto();
        jTextFieldErros.setText("");

        try {
            produto = produtoDAO.consultaProduto(codEmpresa, produtoString);
            if (!produtoString.equals(produto.getPRODUTOPRINCIPAL())) {
                jTextFieldProduto.setText(produto.getPRODUTOPRINCIPAL());
                produtoString = produto.getPRODUTOPRINCIPAL();
                produto = produtoDAO.consultaProduto(codEmpresa, produto.getPRODUTOPRINCIPAL());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (produto.getCODIGO() == null) {
            jTextFieldDescricao.setText("Produto não encontrado");
        } else {
            try {
                listaEstoque = estoqueDAO.estoqueProduto(produtoString, codEmpresa);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            String controlaLote = produto.getCONTROLALOTE();
            String ativo = produto.getATIVO();
            String estfracionado = produto.getESTFRACIONADO();
            String produtoGenerico = produto.getPRODUTOGENERICO();
            String dispVenda = produto.getDISPONIVELVENDA();
            String controlaNumSerie = produto.getCONTROLANUMEROSERIE();

            if (controlaLote.equals("S")) {
                jPanel9.setVisible(true);
                jCheckBoxControlaLote.setSelected(true);
                carregarTabelaLote();
            } else {
                jPanel9.setVisible(false);
                jCheckBoxControlaLote.setSelected(false);
            }
            if (ativo.equals("S")) {
                jCheckBoxAtivo.setSelected(true);
            } else {
                jCheckBoxAtivo.setSelected(false);
            }
            if (estfracionado.equals("S")) {
                jCheckBoxEstFracionado.setSelected(true);
            } else {
                jCheckBoxEstFracionado.setSelected(false);
            }
            if (produtoGenerico.equals("S")) {
                jCheckBoxProdGenerico.setSelected(true);
            } else {
                jCheckBoxProdGenerico.setSelected(false);
            }
            if (dispVenda.equals("S")) {
                jCheckBoxDispVenda.setSelected(true);
            } else {
                jCheckBoxDispVenda.setSelected(false);
            }
            if (controlaNumSerie.equals("S")) {
                jCheckBoxContSerie.setSelected(true);
            } else {
                jCheckBoxContSerie.setSelected(false);
            }
            jTextFieldDescricao.setText(produto.getDESCRICAO());
            jTextFieldEmbalagem.setText(produto.getEMBALEGEM());
            jTextFieldQtdeEmbalagem.setText(produto.getQTDE());
            DefaultTableModel model = (DefaultTableModel) jTableEstoquesProduto.getModel();
            while (jTableEstoquesProduto.getRowCount() > 0) {
                model.removeRow(0);
            }
            model.addRow(new Object[]{"TODOS", produto.getESTDISPONIVEL(), produto.getESTARETIRAR(), produto.getESTCONDICIONAL(), produto.getESTRESERVADO()});

            ExtratoProdutoDAO extratoDAO = new ExtratoProdutoDAO();
            ArrayList<ExtratoProduto> listaExtrato = new ArrayList();
            try {
                listaExtrato = extratoDAO.extratoProduto(codEmpresa, codAlmox, produtoString);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

            carregarTabela(listaExtrato);
            carregarTabelaEstoque(listaEstoque);
            carregaTabelaSaldo(produtoString);
        }
    }

}
