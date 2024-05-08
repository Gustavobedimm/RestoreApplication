package restoreapplication.Telas;

import com.google.gson.Gson;
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
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import restoreapplication.Conexao.Conn;
import restoreapplication.DAO.LicencaDAO;
import restoreapplication.DAO.ReservadoDAO;
import restoreapplication.DAO.TransfEmpresasDAO;
import restoreapplication.Model.Config;
import restoreapplication.Model.Licenca;
import restoreapplication.Model.Reservado;
import restoreapplication.Model.TransfEmpresas;

public final class Principal extends javax.swing.JFrame {

    String codEmpresa = "00";
    String codAlmox = "00";
    String codProduto = "0";
    ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    ArrayList<Almox> listaAlmox = new ArrayList<>();

    public Principal() {
        initComponents();
        carregaComboBoxEmpresa();
        carregaIcone();
        carregaIcones();
        carregaTabelaLicenca();
        jTextFieldProduto.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jTextFieldEntrada = new javax.swing.JTextField();
        jTextFieldSaida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNfe = new javax.swing.JTable();
        jTextFieldErros = new javax.swing.JTextField();
        jTextFieldEstMinimo = new javax.swing.JTextField();
        jTextFieldEstMaximo = new javax.swing.JTextField();
        jTextFieldUltEntQtde = new javax.swing.JTextField();
        jTextFieldUltEntData = new javax.swing.JTextField();
        jTextFieldUltSaidaData = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBoxControlaLote = new javax.swing.JCheckBox();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxEstFracionado = new javax.swing.JCheckBox();
        jCheckBoxProdGenerico = new javax.swing.JCheckBox();
        jCheckBoxDispVenda = new javax.swing.JCheckBox();
        jCheckBoxContSerie = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jComboBoxEmpresa = new javax.swing.JComboBox<>();
        jComboBoxAlmox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextFieldEmbalagem = new javax.swing.JTextField();
        jTextFieldQtdeEmbalagem = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox01 = new javax.swing.JCheckBox();
        jCheckBox02 = new javax.swing.JCheckBox();
        jCheckBox07 = new javax.swing.JCheckBox();
        jCheckBox09 = new javax.swing.JCheckBox();
        jCheckBox05 = new javax.swing.JCheckBox();
        jCheckBox08 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox06 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel01 = new javax.swing.JLabel();
        jLabel02 = new javax.swing.JLabel();
        jLabel07 = new javax.swing.JLabel();
        jLabel09 = new javax.swing.JLabel();
        jCheckBox03 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel05 = new javax.swing.JLabel();
        jLabel08 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel06 = new javax.swing.JLabel();
        jLabel03 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabelMensagem = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSaldo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstoques = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoquesProduto = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableReserdados = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableLoteValidade = new javax.swing.JTable();
        jCheckBoxLotes = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableLicenca = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extrato do Produto v2.6");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1344, 850));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extrato (TESTEXTRATO)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldSaldo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldSaldo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo Esp."));
        jTextFieldSaldo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jTextFieldEntrada.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldEntrada.setForeground(new java.awt.Color(0, 153, 0));
        jTextFieldEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada (+)"));
        jTextFieldEntrada.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaActionPerformed(evt);
            }
        });

        jTextFieldSaida.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldSaida.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldSaida.setBorder(javax.swing.BorderFactory.createTitledBorder("Saida (-)"));
        jTextFieldSaida.setMaximumSize(new java.awt.Dimension(64, 22));

        jTableNfe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMP", "ALM", "E/S", "QTDE", "SALD", "SALD ESP", "DIFERENÇA", "DATAHORA", "DOC.", "ID", "DESCRICAO", "CUSTOMEDIO", "CUSTOFINAL", "CUSTOREPMED", "CUSTOREP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNfe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTableNfe.setMinimumSize(new java.awt.Dimension(0, 0));
        jTableNfe.getTableHeader().setReorderingAllowed(false);
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
            jTableNfe.getColumnModel().getColumn(0).setResizable(false);
            jTableNfe.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableNfe.getColumnModel().getColumn(1).setResizable(false);
            jTableNfe.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableNfe.getColumnModel().getColumn(2).setResizable(false);
            jTableNfe.getColumnModel().getColumn(2).setPreferredWidth(60);
            jTableNfe.getColumnModel().getColumn(3).setResizable(false);
            jTableNfe.getColumnModel().getColumn(3).setPreferredWidth(110);
            jTableNfe.getColumnModel().getColumn(4).setResizable(false);
            jTableNfe.getColumnModel().getColumn(4).setPreferredWidth(110);
            jTableNfe.getColumnModel().getColumn(5).setResizable(false);
            jTableNfe.getColumnModel().getColumn(5).setPreferredWidth(110);
            jTableNfe.getColumnModel().getColumn(6).setResizable(false);
            jTableNfe.getColumnModel().getColumn(7).setResizable(false);
            jTableNfe.getColumnModel().getColumn(7).setPreferredWidth(150);
            jTableNfe.getColumnModel().getColumn(8).setResizable(false);
            jTableNfe.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTableNfe.getColumnModel().getColumn(9).setResizable(false);
            jTableNfe.getColumnModel().getColumn(9).setPreferredWidth(40);
            jTableNfe.getColumnModel().getColumn(10).setResizable(false);
            jTableNfe.getColumnModel().getColumn(10).setPreferredWidth(150);
            jTableNfe.getColumnModel().getColumn(11).setResizable(false);
            jTableNfe.getColumnModel().getColumn(12).setResizable(false);
            jTableNfe.getColumnModel().getColumn(13).setResizable(false);
            jTableNfe.getColumnModel().getColumn(14).setResizable(false);
        }

        jTextFieldErros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextFieldErros.setBorder(javax.swing.BorderFactory.createTitledBorder("Erros no Extrato"));
        jTextFieldErros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldErrosActionPerformed(evt);
            }
        });

        jTextFieldEstMinimo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldEstMinimo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstMinimo.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque minimo"));
        jTextFieldEstMinimo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEstMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstMinimoActionPerformed(evt);
            }
        });

        jTextFieldEstMaximo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldEstMaximo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldEstMaximo.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque maximo"));
        jTextFieldEstMaximo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEstMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstMaximoActionPerformed(evt);
            }
        });

        jTextFieldUltEntQtde.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUltEntQtde.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUltEntQtde.setBorder(javax.swing.BorderFactory.createTitledBorder("Ult. Entrada Qtde"));
        jTextFieldUltEntQtde.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldUltEntQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltEntQtdeActionPerformed(evt);
            }
        });

        jTextFieldUltEntData.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUltEntData.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUltEntData.setBorder(javax.swing.BorderFactory.createTitledBorder("Ult. Entrada Data"));
        jTextFieldUltEntData.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldUltEntData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltEntDataActionPerformed(evt);
            }
        });

        jTextFieldUltSaidaData.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUltSaidaData.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldUltSaidaData.setBorder(javax.swing.BorderFactory.createTitledBorder("Ult. Saida Data"));
        jTextFieldUltSaidaData.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldUltSaidaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltSaidaDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldEstMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextFieldEstMaximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextFieldUltEntQtde, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextFieldUltEntData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextFieldUltSaidaData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldErros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldErros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jTextFieldEstMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltEntQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltEntData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltSaidaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configurações do produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCheckBoxControlaLote.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxControlaLote.setText("Controla Lote de Validade ");
        jCheckBoxControlaLote.setEnabled(false);
        jCheckBoxControlaLote.setFocusable(false);
        jCheckBoxControlaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxControlaLoteActionPerformed(evt);
            }
        });

        jCheckBoxAtivo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxAtivo.setText("Ativo ");
        jCheckBoxAtivo.setEnabled(false);
        jCheckBoxAtivo.setFocusable(false);

        jCheckBoxEstFracionado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxEstFracionado.setText("Estoque fracionado");
        jCheckBoxEstFracionado.setEnabled(false);
        jCheckBoxEstFracionado.setFocusable(false);

        jCheckBoxProdGenerico.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxProdGenerico.setText("Produto generico");
        jCheckBoxProdGenerico.setEnabled(false);
        jCheckBoxProdGenerico.setFocusable(false);

        jCheckBoxDispVenda.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxDispVenda.setText("Disponivel p/ Venda");
        jCheckBoxDispVenda.setEnabled(false);
        jCheckBoxDispVenda.setFocusable(false);

        jCheckBoxContSerie.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxContSerie.setText("Controla numero de serie");
        jCheckBoxContSerie.setEnabled(false);
        jCheckBoxContSerie.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBoxEstFracionado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxProdGenerico)
                            .addComponent(jCheckBoxContSerie)
                            .addComponent(jCheckBoxDispVenda)
                            .addComponent(jCheckBoxAtivo)
                            .addComponent(jCheckBoxControlaLote))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jCheckBoxAtivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxControlaLote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxEstFracionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxProdGenerico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxContSerie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDispVenda))
        );

        jCheckBoxControlaLote.getAccessibleContext().setAccessibleDescription("");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel6.setToolTipText("Empresa ");
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAlmox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextFieldEmbalagem.setEditable(false);
        jTextFieldEmbalagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Embalagem"));

        jTextFieldQtdeEmbalagem.setEditable(false);
        jTextFieldQtdeEmbalagem.setBorder(javax.swing.BorderFactory.createTitledBorder("Quantidade por embalagem"));

        jTextFieldDescricao.setEditable(false);
        jTextFieldDescricao.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        jTextFieldProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo"));
        jTextFieldProduto.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProdutoKeyPressed(evt);
            }
        });

        jButton1.setText("Carregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldQtdeEmbalagem)
                    .addComponent(jTextFieldEmbalagem)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldQtdeEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cores e Atalhos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCheckBox01.setText("01 - Venda");

        jCheckBox02.setText("02 - Compra");

        jCheckBox07.setText("07 - Devolução de Venda");

        jCheckBox09.setText("09 - Devolução de Compra");

        jCheckBox05.setText("05 - Inventário");

        jCheckBox08.setText("08 - Transferência filiais");

        jCheckBox10.setText("10 - PCP");

        jCheckBox06.setText("06 - Retirada");

        jCheckBox11.setSelected(true);
        jCheckBox11.setText("Mostrar erros no extrato [ F8 ]");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setText("Mostrar cores no extrato [ F9 ]");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jLabel01.setText("0");

        jLabel02.setText("0");

        jLabel07.setText("0");

        jLabel09.setText("0");

        jCheckBox03.setText("03 - Transferência Almox");

        jLabel7.setText("Maximizar/Diminuir [ F11 ]");

        jLabel8.setText("Minimizar Janelas secundarias [ F12 ]");

        jLabel05.setText("0");

        jLabel08.setText("0");

        jLabel10.setText("0");

        jLabel06.setText("0");

        jLabel03.setText("0");

        jLabel3.setForeground(new java.awt.Color(218, 165, 32));
        jLabel3.setText("■");

        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("■");

        jLabel5.setForeground(new java.awt.Color(139, 69, 19));
        jLabel5.setText("■");

        jLabel6.setForeground(new java.awt.Color(30, 144, 255));
        jLabel6.setText("■");

        jLabel9.setForeground(new java.awt.Color(42, 157, 143));
        jLabel9.setText("■");

        jLabel11.setForeground(new java.awt.Color(117, 13, 55));
        jLabel11.setText("■");

        jLabel12.setForeground(new java.awt.Color(56, 176, 0));
        jLabel12.setText("■");

        jLabel13.setForeground(new java.awt.Color(118, 120, 237));
        jLabel13.setText("■");

        jLabel14.setForeground(new java.awt.Color(131, 56, 236));
        jLabel14.setText("■");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox08)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel08))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox02)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel02))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel01))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox05)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel05))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox03)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel03))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox06)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel06))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox09)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(jLabel09))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jCheckBox07)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel07))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelMensagem)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox01)
                    .addComponent(jLabel01)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox02)
                    .addComponent(jLabel02)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox03)
                    .addComponent(jLabel03)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox05)
                    .addComponent(jLabel05)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox06)
                    .addComponent(jLabel06)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox07)
                    .addComponent(jLabel07)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox08)
                    .addComponent(jLabel08)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox09)
                    .addComponent(jLabel09)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabelMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(150, 150));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(300, 100));

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
            jTableSaldo.getColumnModel().getColumn(0).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTableSaldo.getColumnModel().getColumn(1).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(1).setPreferredWidth(30);
            jTableSaldo.getColumnModel().getColumn(2).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(2).setPreferredWidth(30);
            jTableSaldo.getColumnModel().getColumn(3).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableSaldo.getColumnModel().getColumn(4).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableSaldo.getColumnModel().getColumn(5).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(5).setPreferredWidth(70);
            jTableSaldo.getColumnModel().getColumn(6).setResizable(false);
            jTableSaldo.getColumnModel().getColumn(6).setPreferredWidth(70);
        }

        jTabbedPane1.addTab("  TESTSALDO    ", jScrollPane5);

        jTableEstoques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALMOX", "DISPONIVEL", "RETIRAR", "CONDICIONAL", "RESERVADO", "TRANSITO", "VENDA EXTERNA", "ENDEREÇO", "DATA/HORA ALTERAÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableEstoques);
        if (jTableEstoques.getColumnModel().getColumnCount() > 0) {
            jTableEstoques.getColumnModel().getColumn(0).setResizable(false);
            jTableEstoques.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableEstoques.getColumnModel().getColumn(1).setResizable(false);
            jTableEstoques.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableEstoques.getColumnModel().getColumn(2).setResizable(false);
            jTableEstoques.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(3).setResizable(false);
            jTableEstoques.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEstoques.getColumnModel().getColumn(4).setResizable(false);
            jTableEstoques.getColumnModel().getColumn(4).setPreferredWidth(70);
        }

        jTabbedPane1.addTab("  TESTESTOQUE    ", jScrollPane2);

        jTableEstoquesProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ALMOX", "DISPONIVEL", "RETIRAR", "CONDICIONAL", "RESERVADO", "TRANSITO", "VENDA EXTERNA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableEstoquesProduto);
        if (jTableEstoquesProduto.getColumnModel().getColumnCount() > 0) {
            jTableEstoquesProduto.getColumnModel().getColumn(0).setResizable(false);
            jTableEstoquesProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setResizable(false);
            jTableEstoquesProduto.getColumnModel().getColumn(1).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setResizable(false);
            jTableEstoquesProduto.getColumnModel().getColumn(2).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setResizable(false);
            jTableEstoquesProduto.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setResizable(false);
            jTableEstoquesProduto.getColumnModel().getColumn(4).setPreferredWidth(70);
            jTableEstoquesProduto.getColumnModel().getColumn(5).setResizable(false);
            jTableEstoquesProduto.getColumnModel().getColumn(6).setResizable(false);
        }

        jTabbedPane1.addTab("  TESTPRODUTO    ", jScrollPane3);

        jTableReserdados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empresa", "Almox", "Produto Principal", "Item Principal", "ID Formulação", "Formula", "Qtde", "Qtde Embalagem", "Documento", "Tipo", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReserdados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReserdadosMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableReserdados);
        if (jTableReserdados.getColumnModel().getColumnCount() > 0) {
            jTableReserdados.getColumnModel().getColumn(0).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(1).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(2).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(3).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(4).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(5).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(6).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(7).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(8).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(9).setResizable(false);
            jTableReserdados.getColumnModel().getColumn(10).setResizable(false);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ESTOQUE RESERVADO", jPanel7);

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

        jCheckBoxLotes.setText("MOSTRAR TODOS OS LOTES DE VALIDADE DO PRODUTO");
        jCheckBoxLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jCheckBoxLotes)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxLotes))
        );

        jTabbedPane1.addTab("LOTE DE VALIDADE", jPanel8);

        jTextField1.setEditable(false);
        jTextField1.setBorder(null);
        jTextField1.setEnabled(false);
        jTextField1.setRequestFocusEnabled(false);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299110_check_sign_icon.png"))); // NOI18N

        jTableLicenca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Empresa", "Versão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableLicenca);
        if (jTableLicenca.getColumnModel().getColumnCount() > 0) {
            jTableLicenca.getColumnModel().getColumn(0).setResizable(false);
            jTableLicenca.getColumnModel().getColumn(1).setResizable(false);
            jTableLicenca.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 597, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("TGERLICENCA", jPanel5);

        jMenu1.setText("Verificações");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/285651_search_icon.png"))); // NOI18N
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
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/285651_search_icon.png"))); // NOI18N
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

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299097_sync_cloud_icon.png"))); // NOI18N
        jMenuItem5.setText("MANUTENÇÃO DE PEDIDOS DE COMPRA");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

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

        jMenu3.setText("Pedidos");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png"))); // NOI18N
        jMenuItem6.setText("Pedidos pendentes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableNfeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNfeMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = jTableNfe.getSelectedRow();
            String numeroDOC = (String) jTableNfe.getValueAt(linha, 8);
            String movimentoID = (String) jTableNfe.getValueAt(linha, 9);
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
                TelaTransAlmox transfAlmox = new TelaTransAlmox(empresa, numeroDOC);
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
            if (movimentoID.equals("08")) {
                // se não encontrar na testtransempresa ele abre a tela de venda consulta o numeroDOC
                TransfEmpresas transf = new TransfEmpresas();
                TransfEmpresasDAO dao = new TransfEmpresasDAO();
                try {
                    transf = dao.getTransferencia(numeroDOC);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TransfEmpresasTela.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (transf.getId() == null) {
                    JOptionPane.showMessageDialog(null, "Registro " + numeroDOC + " não encontrado na tabela TESTTRANSFEMPRESA.");
                    TelaPedidos telaPedidos = new TelaPedidos(empresa, numeroDOC, controlaLote);
                    telaPedidos.setVisible(true);
                }else{
                    TransfEmpresasTela transfEmpresas = new TransfEmpresasTela(numeroDOC);
                    transfEmpresas.setVisible(true);
                }
                
            }
            if (movimentoID.equals("09")) {
            }
        }

    }//GEN-LAST:event_jTableNfeMouseClicked

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

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
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
        Verifica verifica = new Verifica(codEmpresa, codAlmox);
        verifica.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextFieldEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEntradaActionPerformed
        
    }//GEN-LAST:event_jTextFieldEntradaActionPerformed

    private void jComboBoxEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaActionPerformed
        
    }//GEN-LAST:event_jComboBoxEmpresaActionPerformed

    private void jComboBoxAlmoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlmoxActionPerformed
        
    }//GEN-LAST:event_jComboBoxAlmoxActionPerformed

    private void jComboBoxAlmoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAlmoxItemStateChanged
       
    }//GEN-LAST:event_jComboBoxAlmoxItemStateChanged

    private void jComboBoxEmpresaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEmpresaItemStateChanged
        codEmpresa = listaEmpresas.get(jComboBoxEmpresa.getSelectedIndex()).getCodigo();
        carregaComboAlmox(codEmpresa);
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
        
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
        TelaConferenciaAlmox tela = new TelaConferenciaAlmox(codEmpresa, codAlmox);
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        if (jCheckBoxMenuItem1.isSelected()) {
            jCheckBox12.setSelected(true);
        } else {
            jCheckBox12.setSelected(false);
        }
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
            jTabbedPane1.setVisible(false);
        } else {
            jTabbedPane1.setVisible(true);
        }

    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed


    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jTextFieldProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProdutoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botaoCarregar();
        }
    }//GEN-LAST:event_jTextFieldProdutoKeyPressed

    private void jCheckBoxMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem5ActionPerformed
        if (jCheckBoxMenuItem5.isSelected()) {
            jCheckBox11.setSelected(true);
        } else {
            jCheckBox11.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBoxMenuItem5ActionPerformed

    private void jCheckBoxControlaLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxControlaLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxControlaLoteActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        if (jCheckBox12.isSelected()) {
            jCheckBoxMenuItem1.setSelected(true);
        } else {
            jCheckBoxMenuItem1.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        if (jCheckBox11.isSelected()) {

            jCheckBoxMenuItem5.setSelected(true);
        } else {
            jCheckBoxMenuItem5.setSelected(false);
        }
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
        
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
        ManutencaoPedCompra telaManu = new ManutencaoPedCompra();
        telaManu.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldEntrada.setText("0");
        jTextFieldSaida.setText("0");
        jTextFieldSaldo.setText("0");
        jTextFieldEstMinimo.setText("");
        jTextFieldEstMaximo.setText("");
        jTextFieldUltEntQtde.setText("");
        jTextFieldUltEntData.setText("");
        jTextFieldUltSaidaData.setText("");
        botaoCarregar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        codEmpresa = listaEmpresas.get(jComboBoxEmpresa.getSelectedIndex()).getCodigo();
        PedidosPendentes pedidosPendentes = new PedidosPendentes(codEmpresa);
        pedidosPendentes.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jTableReserdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReserdadosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = jTableReserdados.getSelectedRow();
            String tipo = (String) jTableReserdados.getValueAt(linha, 9);
            String doc = (String) jTableReserdados.getValueAt(linha, 8);
            if (tipo.equals("PEDIDO")) {
                TelaPedidos telaPedidos = new TelaPedidos(codEmpresa, doc, true);
                telaPedidos.setVisible(true);
            }
            if (tipo.equals("FORMULAÇÃO PCP")) {
                FormulacaoPCP telaformulacao = new FormulacaoPCP();
                telaformulacao.setVisible(true);
            }
        }
    }//GEN-LAST:event_jTableReserdadosMouseClicked

    private void jTextFieldEstMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstMinimoActionPerformed

    private void jTextFieldEstMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstMaximoActionPerformed

    private void jTextFieldUltEntQtdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUltEntQtdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUltEntQtdeActionPerformed

    private void jTextFieldUltEntDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUltEntDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUltEntDataActionPerformed

    private void jTextFieldUltSaidaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUltSaidaDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUltSaidaDataActionPerformed

    private void jTextFieldErrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldErrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldErrosActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox01;
    private javax.swing.JCheckBox jCheckBox02;
    private javax.swing.JCheckBox jCheckBox03;
    private javax.swing.JCheckBox jCheckBox05;
    private javax.swing.JCheckBox jCheckBox06;
    private javax.swing.JCheckBox jCheckBox07;
    private javax.swing.JCheckBox jCheckBox08;
    private javax.swing.JCheckBox jCheckBox09;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
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
    private javax.swing.JLabel jLabel01;
    private javax.swing.JLabel jLabel02;
    private javax.swing.JLabel jLabel03;
    private javax.swing.JLabel jLabel05;
    private javax.swing.JLabel jLabel06;
    private javax.swing.JLabel jLabel07;
    private javax.swing.JLabel jLabel08;
    private javax.swing.JLabel jLabel09;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableEstoques;
    private javax.swing.JTable jTableEstoquesProduto;
    private javax.swing.JTable jTableLicenca;
    private javax.swing.JTable jTableLoteValidade;
    private javax.swing.JTable jTableNfe;
    private javax.swing.JTable jTableReserdados;
    private javax.swing.JTable jTableSaldo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldEmbalagem;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldErros;
    private javax.swing.JTextField jTextFieldEstMaximo;
    private javax.swing.JTextField jTextFieldEstMinimo;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQtdeEmbalagem;
    private javax.swing.JTextField jTextFieldSaida;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldUltEntData;
    private javax.swing.JTextField jTextFieldUltEntQtde;
    private javax.swing.JTextField jTextFieldUltSaidaData;
    // End of variables declaration//GEN-END:variables
public void carregarTabela(String produto) {
        ExtratoProdutoDAO extratoDAO = new ExtratoProdutoDAO();
        ArrayList<ExtratoProduto> listaExtrato = new ArrayList();
        try {
            listaExtrato = extratoDAO.extratoProduto(codEmpresa, codAlmox, produto);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) jTableNfe.getModel();
        jTableNfe.setShowHorizontalLines(false);
        jTableNfe.setShowVerticalLines(false);
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
        int cont01 = 0;
        int cont02 = 0;
        int cont03 = 0;
        int cont05 = 0;
        int cont06 = 0;
        int cont07 = 0;
        int cont08 = 0;
        int cont09 = 0;
        int cont10 = 0;
        int tamanhoTot = listaExtrato.size();
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
                cont01++;
            }
            if (movimentacao.getMOVIMENTOID().equals("01") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE VENDA DE MERCADORIA";
                cont01++;
            }
            if (movimentacao.getMOVIMENTOID().equals("02") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "COMPRA DE MERCADORIA";
                cont02++;
            }
            if (movimentacao.getMOVIMENTOID().equals("02") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "CANCELAMENTO COMPRA DE MERCADORIA";
                cont02++;
            }
            if (movimentacao.getMOVIMENTOID().equals("03")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE ALMOXARIFADO";
                cont03++;
            }
            if (movimentacao.getMOVIMENTOID().equals("04")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE PRODUTOS";
            }
            if (movimentacao.getMOVIMENTOID().equals("05")) {
                descricaoOperacao = "INVENTARIO";
                cont05++;
            }
            if (movimentacao.getMOVIMENTOID().equals("06") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "RETIRADA (ENTREGA FUTURA)";
                cont06++;
            }
            if (movimentacao.getMOVIMENTOID().equals("06") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE RETIRADA (ENTREGA FUTURA)";
                cont06++;
            }
            if (movimentacao.getMOVIMENTOID().equals("07") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "DEVOLUÇÃO DE VENDA";
                cont07++;
            }
            if (movimentacao.getMOVIMENTOID().equals("07") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "CANCELAMENTO DE DEVOLUÇÃO DE VENDA";
                cont07++;
            }
            if (movimentacao.getMOVIMENTOID().equals("08")) {
                descricaoOperacao = "TRANSFERENCIA ENTRE FILIAIS";
                cont08++;
            }

            if (movimentacao.getMOVIMENTOID().equals("09") && movimentacao.getENTRADASAIDA().equals("S")) {
                descricaoOperacao = "DEVOLUÇÃO DE COMPRA";
                cont09++;
            }
            if (movimentacao.getMOVIMENTOID().equals("09") && movimentacao.getENTRADASAIDA().equals("E")) {
                descricaoOperacao = "CANCELAMENTO DE DEVOLUÇÃO DE COMPRA";
                cont09++;
            }
            if (movimentacao.getMOVIMENTOID().equals("10")) {
                descricaoOperacao = "ORDEM DE PRODUÇAO";
                cont10++;
            }
            if (movimentacao.getMOVIMENTOID().equals("14")) {
                descricaoOperacao = "MOVIMENTAÇÃO INTERNA DE MERCADORIA";
            }
            String data = movimentacao.getDATAHORA();
            String dia = data.substring(8, 10);
            String mes = data.substring(5, 7);
            String ano = data.substring(0, 4);
            String hora = data.substring(11, 21);

            if (movimentacao.getENTRADASAIDA().equals("S")) {
                model.addRow(new Object[]{movimentacao.getEMPRESA(), movimentacao.getALMOX(), "SAIDA", qtd, saldoAtual.toPlainString(), saldoEsperado.toPlainString(), saldoAtual.subtract(saldoEsperado).toPlainString(), dia + "/" + mes + "/" + ano + " - " + hora, movimentacao.getCODIGOID(), movimentacao.getMOVIMENTOID(), descricaoOperacao, movimentacao.getCUSTOMEDIO(), movimentacao.getCUSTOFINAL(), movimentacao.getCUSTOMEDIOREPOSICAO(), movimentacao.getCUSTOREPOSICAO()});
            } else {
                model.addRow(new Object[]{movimentacao.getEMPRESA(), movimentacao.getALMOX(), "ENTRADA", qtd, saldoAtual.toPlainString(), saldoEsperado.toPlainString(), saldoAtual.subtract(saldoEsperado).toPlainString(), dia + "/" + mes + "/" + ano + " - " + hora, movimentacao.getCODIGOID(), movimentacao.getMOVIMENTOID(), descricaoOperacao, movimentacao.getCUSTOMEDIO(), movimentacao.getCUSTOFINAL(), movimentacao.getCUSTOMEDIOREPOSICAO(), movimentacao.getCUSTOREPOSICAO()});
            }
            jTableNfe.scrollRectToVisible(jTableNfe.getCellRect(jTableNfe.getRowCount() - 1, 0, true));
        }

        jLabel01.setText(Integer.toString(cont01) + " - " + calculaPercentual(cont01, tamanhoTot) + "%");
        jLabel02.setText(Integer.toString(cont02) + " - " + calculaPercentual(cont02, tamanhoTot) + "%");
        jLabel03.setText(Integer.toString(cont03) + " - " + calculaPercentual(cont03, tamanhoTot) + "%");
        jLabel05.setText(Integer.toString(cont05) + " - " + calculaPercentual(cont05, tamanhoTot) + "%");
        jLabel06.setText(Integer.toString(cont06) + " - " + calculaPercentual(cont06, tamanhoTot) + "%");
        jLabel07.setText(Integer.toString(cont07) + " - " + calculaPercentual(cont07, tamanhoTot) + "%");
        jLabel08.setText(Integer.toString(cont08) + " - " + calculaPercentual(cont08, tamanhoTot) + "%");
        jLabel09.setText(Integer.toString(cont09) + " - " + calculaPercentual(cont09, tamanhoTot) + "%");
        jLabel10.setText(Integer.toString(cont10) + " - " + calculaPercentual(cont10, tamanhoTot) + "%");
        jTextFieldErros.setText("");
        if (erro > 0) {
            jTextFieldErros.setText(erro.toString());
            jTextFieldErros.setForeground(Color.red);
        } else {
            jTextFieldErros.setText(erro.toString());
            jTextFieldErros.setForeground(Color.black);

        }
    }

    public void carregarTabelaEstoque(String produto) {
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        ArrayList<Estoque> listaEstoque = new ArrayList();
        try {
            listaEstoque = estoqueDAO.estoqueProduto(produto, codEmpresa);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultTableModel model = (DefaultTableModel) jTableEstoques.getModel();
        jTableEstoques.setShowHorizontalLines(false);
        jTableEstoques.setShowVerticalLines(false);

        while (jTableEstoques.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Estoque estoque : listaEstoque) {
            model.addRow(new Object[]{estoque.getALMOX(), estoque.getESTDISPONIVEL(), estoque.getESTARETIRAR(), estoque.getESTCONDICIONAL(), estoque.getESTRESERVADO(), estoque.getESTTRANSITO(), estoque.getESTVENDAEXTERNA(), estoque.getENDERECO(), estoque.getDATAHORAALTERACAO()});
        }
        jTableEstoques.setDefaultRenderer(Object.class, new PintarTabelaEstoque());
    }

    public void carregarTabelaReservados() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                jLabelMensagem.setText("Carregando estoques reservados...");
                jProgressBar1.setMaximum(100);
                DefaultTableModel model = (DefaultTableModel) jTableReserdados.getModel();
                jTableReserdados.setShowHorizontalLines(false);
                jTableReserdados.setShowVerticalLines(false);

                while (jTableReserdados.getRowCount() > 0) {
                    model.removeRow(0);
                }

                ReservadoDAO reservadoDAO = new ReservadoDAO();
                ArrayList<Reservado> listapcps = new ArrayList();
                ArrayList<Reservado> listaPedidos = new ArrayList();
                ArrayList<Reservado> listaDevolucoes = new ArrayList();
                //ArrayList<Reservado> listaOrdensServico = new ArrayList();
                //PCP
                jProgressBar1.setValue(25);
                jLabelMensagem.setText("Carregando estoques reservados - Ordens de produção.");
                try {
                    listapcps = reservadoDAO.getReservadoPCP(codEmpresa, codAlmox, codProduto);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                //PEDIDO DE VENDA
                jProgressBar1.setValue(50);
                jLabelMensagem.setText("Carregando estoques reservados - Pedidos de venda.");
                try {
                    listaPedidos = reservadoDAO.getReservadoPEDIDO(codEmpresa, codAlmox, codProduto);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                //DEVOLUCAO PENDENTES
                jLabelMensagem.setText("Carregando estoques reservados - Devoluções de compra.");
                jProgressBar1.setValue(75);
                try {
                    listaDevolucoes = reservadoDAO.getReservadoDEVOLUCAO(codEmpresa, codAlmox, codProduto);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                //ORDENS DE SERVICO
                jProgressBar1.setValue(100);
                //jLabelMensagem.setText("Ordens de serviço...");
                //try {
                //    listaOrdensServico = reservadoDAO.getReservadoORDEMSERVICO(codEmpresa, codAlmox, codProduto);
                //} catch (ClassNotFoundException ex) {
                //    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                //}

                for (Reservado reservado : listapcps) {
                    model.addRow(new Object[]{reservado.getEmpresa(), reservado.getAlmox(), reservado.getProduto_principal(), reservado.getItem_pricipal(), reservado.getIdformulacao(), reservado.getFormula(), reservado.getQtde(), reservado.getQtdeembalagem(), "", "FORMULAÇÃO PCP", "PEN"});
                }
                for (Reservado reservado : listaPedidos) {
                    model.addRow(new Object[]{reservado.getEmpresa(), reservado.getAlmox(), reservado.getProduto_principal(), reservado.getItem_pricipal(), reservado.getIdformulacao(), reservado.getFormula(), reservado.getQtde(), reservado.getQtdeembalagem(), reservado.getPedido(), "PEDIDO", reservado.getStatus()});
                }
                for (Reservado reservado : listaDevolucoes) {
                    model.addRow(new Object[]{reservado.getEmpresa(), reservado.getAlmox(), reservado.getProduto_principal(), reservado.getItem_pricipal(), reservado.getIdformulacao(), reservado.getFormula(), reservado.getQtde(), reservado.getQtdeembalagem(), reservado.getPedido(), "DEVOLUÇÃO ", reservado.getStatus()});
                }
                //for (Reservado reservado : listaOrdensServico) {
                //    model.addRow(new Object[]{reservado.getEmpresa(), reservado.getAlmox(), reservado.getProduto_principal(), reservado.getItem_pricipal(), reservado.getIdformulacao(), reservado.getFormula(), reservado.getQtde(), reservado.getQtdeembalagem(), reservado.getPedido(), "ORDEM DE SERVIÇO"});
                //}

                jLabelMensagem.setText("Concluido");
                jProgressBar1.setValue(0);
            }
        };

        thread.start();
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
        jTableLoteValidade.setShowHorizontalLines(false);
        jTableLoteValidade.setShowVerticalLines(false);
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
        Conn conexao = new Conn();
        String json = conexao.pegaCaminho();
        Config config = new Gson().fromJson(json, Config.class);
        jPanel6.setToolTipText(config.getPath());
        jTextField1.setText(config.getPath());
        try {
            listaEmpresas = empresaDAO.consultaEmpresa();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Empresa empresa : listaEmpresas) {
            jComboBoxEmpresa.addItem(empresa.getCodigo() + " - " + empresa.getNomefantasia());
        }
        codEmpresa = listaEmpresas.get(jComboBoxEmpresa.getSelectedIndex()).getCodigo();
        carregaComboAlmox(codEmpresa);
    }

    public void carregaComboAlmox(String empresa) {
        int tamanho = jComboBoxAlmox.getItemCount();
        if (tamanho > 0) {
            jComboBoxAlmox.removeAllItems();
        }

        AlmoxDAO almoxDAO = new AlmoxDAO();
        try {
            listaAlmox = almoxDAO.consultaAlmox(empresa);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Almox a : listaAlmox) {
            jComboBoxAlmox.addItem("Almoxarifado : " + a.getCodigo() + " - " + a.getDescricao());
        }
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
    }

    public void getAlmox() {
        codAlmox = listaAlmox.get(jComboBoxAlmox.getSelectedIndex()).getCodigo();
    }

    public void carregaTabelaSaldo(String produtoP) {
        var formatter = new DecimalFormat("#,###.##");
        var s = new DecimalFormatSymbols();
        s.setDecimalSeparator(',');
        s.setGroupingSeparator('.');
        formatter.setDecimalFormatSymbols(s);

        DefaultTableModel model = (DefaultTableModel) jTableSaldo.getModel();
        jTableSaldo.setShowHorizontalLines(false);
        jTableSaldo.setShowVerticalLines(false);
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
            BigDecimal anterior = new BigDecimal(produto.getANTERIOR());
            BigDecimal entrada = new BigDecimal(produto.getENTRADA());
            BigDecimal saida = new BigDecimal(produto.getSAIDA());
            BigDecimal atual = new BigDecimal(produto.getATUAL());

            entradasSoma = entradasSoma.add(entradas);
            saidasSoma = saidasSoma.add(saidas);
            model.addRow(new Object[]{produto.getEMPRESA(), produto.getALMOX(), produto.getANOSMES(), anterior.toPlainString(), entrada.toPlainString(), saida.toPlainString(), atual.toPlainString()});

        }
        if (!listaSaldosProdutos.isEmpty()) {
            soma = entradasSoma.subtract(saidasSoma);
            String aux1 = formatter.format(entradasSoma);
            String aux2 = formatter.format(saidasSoma);
            String aux3 = formatter.format(soma);

            model.addRow(new Object[]{"SOMA", "", "", "", "(+)" + aux1, "(-)" + aux2, "E + S = " + aux3});
            jTableSaldo.scrollRectToVisible(jTableSaldo.getCellRect(jTableSaldo.getRowCount() - 1, 0, true));
        }

    }

    public void carregaTabelaLicenca() {
        DefaultTableModel model = (DefaultTableModel) jTableLicenca.getModel();
        jTableEstoques.setShowHorizontalLines(false);
        jTableEstoques.setShowVerticalLines(false);
        LicencaDAO licencaDAO = new LicencaDAO();
        ArrayList<Licenca> listaLicencas = new ArrayList();
        try {
            listaLicencas = licencaDAO.getLicenca();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

        while (jTableLicenca.getRowCount() > 0) {
            model.removeRow(0);
        }
        for (Licenca licenca : listaLicencas) {
            model.addRow(new Object[]{licenca.getNumero(), licenca.getEmpresa(), licenca.getVersao()});
        }
    }

    public void carregaIcones() {
        jTabbedPane1.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png")));
        jTabbedPane1.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png")));
        jTabbedPane1.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png")));
        jTabbedPane1.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png")));
        jTabbedPane1.setIconAt(4, new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png")));
        jTabbedPane1.setIconAt(5, new javax.swing.ImageIcon(getClass().getResource("/icons/299086_info_sign_icon.png")));
    }

    public class PintarTabelaEstoque extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
            Color foreground = Color.BLACK;
            Color VERDE = new Color(32, 139, 58);
            Color Amarelo = new Color(218, 165, 32);
            Color roxoClaro = new Color(118, 120, 237);
            Color transfAlmox = new Color(131, 56, 236);
            Color transfFiliais = new Color(117, 13, 55);
            Color laranja = new Color(255, 165, 0);
            if (column == 1) {
                foreground = VERDE;
            }
            if (column == 2) {
                foreground = transfAlmox;
            }
            if (column == 3) {
                foreground = transfFiliais;
            }
            if (column == 4) {
                foreground = laranja;
            }
            if (column == 5) {
                foreground = roxoClaro;
            }
            if (column == 6) {
                foreground = Amarelo;
            }
            label.setForeground(foreground);
            if (isSelected) {
                label.setForeground(WHITE);
            }
            return label;
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
            Color VERDE = new Color(32, 139, 58);
            Color roxo = new Color(204, 51, 255);

            //PINTA POR TIPO DE OPERACAO
            if (jCheckBox12.isSelected()) {
                Object objeto1 = table.getValueAt(row, 9);
                Color Azul = new Color(0, 0, 255);
                Color Amarelo = new Color(218, 165, 32);
                Color roxoClaro = new Color(118, 120, 237);
                Color verdeAgua = new Color(42, 157, 143);
                Color transfAlmox = new Color(131, 56, 236);
                Color transfFiliais = new Color(117, 13, 55);
                Color devolucaoVenda = new Color(139, 69, 19);
                Color devolucaoCompra = new Color(30, 144, 255);
                Color pcp = new Color(56, 176, 0);

                String valor2 = objeto1.toString();

                if (jCheckBox01.isSelected()) {
                    if (valor2.equals("01")) {
                        foreground = Amarelo;
                    }
                }
                if (jCheckBox02.isSelected()) {
                    if (valor2.equals("02")) {
                        foreground = Azul;
                        label.setForeground(Azul);
                    }
                }
                if (jCheckBox03.isSelected()) {
                    if (valor2.equals("03")) {
                        foreground = transfAlmox;
                    }
                }
                if (jCheckBox05.isSelected()) {
                    if (valor2.equals("05")) {
                        foreground = verdeAgua;
                    }
                }
                if (jCheckBox06.isSelected()) {
                    if (valor2.equals("06")) {
                        foreground = roxoClaro;
                    }
                }
                if (jCheckBox07.isSelected()) {
                    if (valor2.equals("07")) {
                        foreground = devolucaoVenda;
                    }
                }
                if (jCheckBox08.isSelected()) {
                    if (valor2.equals("08")) {
                        foreground = transfFiliais;
                    }
                }
                if (jCheckBox09.isSelected()) {
                    if (valor2.equals("09")) {
                        foreground = devolucaoCompra;
                    }
                }
                if (jCheckBox10.isSelected()) {
                    if (valor2.equals("10")) {
                        foreground = pcp;
                    }
                }

            }
            if (jCheckBoxMenuItem5.isSelected()) {
                Object objeto2 = table.getValueAt(row, 4);
                Object objeto3 = table.getValueAt(row, 5);
                String saldo = objeto2.toString();
                String saldoEsperado = objeto3.toString();
                if (!saldo.equals(saldoEsperado)) {
                    foreground = VERMELHO;
                    if (column == 5) {
                        foreground = VERDE;
                    }
                    if (column == 6) {
                        foreground = roxo;
                    }
                }
            }
            label.setForeground(foreground);
            if (isSelected) {
                label.setForeground(WHITE);
            }
            return label;
        }
    }

    public void botaoCarregar() {
        getAlmox();
        String tmp = jTextFieldProduto.getText();
        while (tmp.length() < 6) {
            tmp = "0" + tmp;
        }
        jTextFieldProduto.setText(tmp);
        codProduto = tmp;
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
            JOptionPane.showMessageDialog(null, "O Código "+codProduto+" não foi encontrado.");
            jTextFieldProduto.setText("");
            jTextFieldProduto.requestFocus();
        } else {

            String controlaLote = produto.getCONTROLALOTE();
            String ativo = produto.getATIVO();
            String estfracionado = produto.getESTFRACIONADO();
            String produtoGenerico = produto.getPRODUTOGENERICO();
            String dispVenda = produto.getDISPONIVELVENDA();
            String controlaNumSerie = produto.getCONTROLANUMEROSERIE();

            if (controlaLote.equals("S")) {
                jCheckBoxControlaLote.setSelected(true);
                carregarTabelaLote();
            } else {
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
            jTextFieldEstMinimo.setText(produto.getESTOQUEMINIMO());
            jTextFieldEstMaximo.setText(produto.getESTOQUEMAXIMO());
            jTextFieldUltEntQtde.setText(produto.getULTENTRADAQTDE());
            jTextFieldUltEntData.setText(produto.getULTENTRADADATA());
            jTextFieldUltSaidaData.setText(produto.getULTENTRADASAIDA());
            
            DefaultTableModel model = (DefaultTableModel) jTableEstoquesProduto.getModel();
            jTableEstoquesProduto.setShowHorizontalLines(false);
            jTableEstoquesProduto.setShowVerticalLines(false);
            while (jTableEstoquesProduto.getRowCount() > 0) {
                model.removeRow(0);
            }
            model.addRow(new Object[]{"TODOS", produto.getESTDISPONIVEL(), produto.getESTARETIRAR(), produto.getESTCONDICIONAL(), produto.getESTRESERVADO(),produto.getESTTRANSITO(),produto.getESTVENDAEXTERNA()});
            //PINTA TABELA
            jTableEstoquesProduto.setDefaultRenderer(Object.class, new PintarTabelaEstoque());
            
            //tabela extrato
            carregarTabela(produtoString);
            //tabela da testestoque
            carregarTabelaEstoque(produtoString);
            //carrega tabela da testsaldo
            carregaTabelaSaldo(produtoString);
            //procura os estoques reservados
            carregarTabelaReservados();
            

        }
    }

    public String calculaPercentual(int cont, int tamanhoTot) {
        String aux = "0.0";
        if (tamanhoTot > 0 && cont > 0) {
            double result = cont * 100 / tamanhoTot;
            aux = Double.toString(result);
        }
        return aux;
    }

    public void carregaIcone() {
        URL iconURL = getClass().getResource("/icons/eco.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
    }

}
