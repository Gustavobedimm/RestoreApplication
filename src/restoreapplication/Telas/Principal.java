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
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        jTextFieldProduto.requestFocus();
        //[44,84,156]cor azul eco

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLateral = new javax.swing.JPanel();
        jPanelProduto = new javax.swing.JPanel();
        jTextFieldEmbalagem = new javax.swing.JTextField();
        jTextFieldQtdeEmbalagem = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldProduto = new javax.swing.JTextField();
        jCheckBoxAtivo = new javax.swing.JCheckBox();
        jCheckBoxControlaLote = new javax.swing.JCheckBox();
        jCheckBoxProdGenerico = new javax.swing.JCheckBox();
        jCheckBoxEstFracionado = new javax.swing.JCheckBox();
        jCheckBoxContSerie = new javax.swing.JCheckBox();
        jCheckBoxDispVenda = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jComboBoxEmpresa = new javax.swing.JComboBox<>();
        jComboBoxAlmox = new javax.swing.JComboBox<>();
        jPanelCores = new javax.swing.JPanel();
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
        jPanelProgresso = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanelAreaDeTrabalho = new javax.swing.JPanel();
        jPanelExtrato = new javax.swing.JPanel();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableSaldo = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEstoques = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoquesProduto = new javax.swing.JTable();
        Testlotevalidade = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableLoteValidade = new javax.swing.JTable();
        jCheckBoxLotes = new javax.swing.JCheckBox();
        EstoqueReservado = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableReserdados = new javax.swing.JTable();
        Tgerlicenca = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableLicenca = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem5 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extrato do Produto v3.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1344, 850));

        jPanelLateral.setBackground(new java.awt.Color(71, 79, 86));
        jPanelLateral.setForeground(new java.awt.Color(255, 255, 255));
        jPanelLateral.setMinimumSize(new java.awt.Dimension(328, 920));

        jPanelProduto.setBackground(new java.awt.Color(95, 105, 112));
        jPanelProduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));

        jTextFieldEmbalagem.setEditable(false);
        jTextFieldEmbalagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmbalagem.setText("Embalagem");
        jTextFieldEmbalagem.setBorder(null);
        jTextFieldEmbalagem.setMinimumSize(new java.awt.Dimension(1, 22));

        jTextFieldQtdeEmbalagem.setEditable(false);
        jTextFieldQtdeEmbalagem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldQtdeEmbalagem.setText("Quantidade da Embalagem");
        jTextFieldQtdeEmbalagem.setBorder(null);
        jTextFieldQtdeEmbalagem.setMinimumSize(new java.awt.Dimension(1, 22));
        jTextFieldQtdeEmbalagem.setPreferredSize(new java.awt.Dimension(1, 22));

        jTextFieldDescricao.setEditable(false);
        jTextFieldDescricao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDescricao.setText("Descrição do Produto");
        jTextFieldDescricao.setBorder(null);
        jTextFieldDescricao.setMinimumSize(new java.awt.Dimension(1, 22));
        jTextFieldDescricao.setPreferredSize(new java.awt.Dimension(1, 22));

        jTextFieldProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldProduto.setToolTipText("Código do produto");
        jTextFieldProduto.setBorder(null);
        jTextFieldProduto.setCaretColor(new java.awt.Color(44, 84, 156));
        jTextFieldProduto.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldProduto.setMinimumSize(new java.awt.Dimension(1, 22));
        jTextFieldProduto.setPreferredSize(new java.awt.Dimension(7, 22));
        jTextFieldProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldProdutoFocusLost(evt);
            }
        });
        jTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoActionPerformed(evt);
            }
        });
        jTextFieldProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldProdutoKeyPressed(evt);
            }
        });

        jCheckBoxAtivo.setBackground(new java.awt.Color(44, 84, 160));
        jCheckBoxAtivo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxAtivo.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxAtivo.setText("Produto Ativo ");
        jCheckBoxAtivo.setFocusable(false);
        jCheckBoxAtivo.setOpaque(false);

        jCheckBoxControlaLote.setBackground(new java.awt.Color(44, 84, 160));
        jCheckBoxControlaLote.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxControlaLote.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxControlaLote.setText("Controla Lote de Validade ");
        jCheckBoxControlaLote.setFocusable(false);
        jCheckBoxControlaLote.setOpaque(false);
        jCheckBoxControlaLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxControlaLoteActionPerformed(evt);
            }
        });

        jCheckBoxProdGenerico.setBackground(new java.awt.Color(44, 84, 160));
        jCheckBoxProdGenerico.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxProdGenerico.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxProdGenerico.setText("Produto generico");
        jCheckBoxProdGenerico.setFocusable(false);
        jCheckBoxProdGenerico.setOpaque(false);

        jCheckBoxEstFracionado.setBackground(new java.awt.Color(44, 84, 160));
        jCheckBoxEstFracionado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxEstFracionado.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxEstFracionado.setText("Estoque fracionado");
        jCheckBoxEstFracionado.setFocusable(false);
        jCheckBoxEstFracionado.setOpaque(false);

        jCheckBoxContSerie.setBackground(new java.awt.Color(44, 84, 160));
        jCheckBoxContSerie.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxContSerie.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxContSerie.setText("Controla numero de serie");
        jCheckBoxContSerie.setFocusable(false);
        jCheckBoxContSerie.setOpaque(false);

        jCheckBoxDispVenda.setBackground(new java.awt.Color(44, 84, 160));
        jCheckBoxDispVenda.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jCheckBoxDispVenda.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxDispVenda.setText("Disponivel p/ Venda");
        jCheckBoxDispVenda.setFocusable(false);
        jCheckBoxDispVenda.setOpaque(false);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Produto ");
        jTextField2.setEnabled(false);
        jTextField2.setFocusable(false);

        jComboBoxEmpresa.setLightWeightPopupEnabled(false);
        jComboBoxEmpresa.setOpaque(false);
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

        javax.swing.GroupLayout jPanelProdutoLayout = new javax.swing.GroupLayout(jPanelProduto);
        jPanelProduto.setLayout(jPanelProdutoLayout);
        jPanelProdutoLayout.setHorizontalGroup(
            jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                        .addComponent(jTextFieldEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextFieldQtdeEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jCheckBoxControlaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxEstFracionado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jCheckBoxProdGenerico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                                        .addComponent(jCheckBoxContSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jCheckBoxDispVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelProdutoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxAlmox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelProdutoLayout.setVerticalGroup(
            jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProdutoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQtdeEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jComboBoxEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxAlmox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxAtivo)
                    .addComponent(jCheckBoxControlaLote))
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxEstFracionado)
                    .addComponent(jCheckBoxProdGenerico))
                .addGroup(jPanelProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxContSerie)
                    .addComponent(jCheckBoxDispVenda))
                .addContainerGap())
        );

        jCheckBoxControlaLote.getAccessibleContext().setAccessibleDescription("");

        jPanelCores.setBackground(new java.awt.Color(95, 105, 112));
        jPanelCores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 100, 100)));
        jPanelCores.setMaximumSize(new java.awt.Dimension(272, 271));
        jPanelCores.setMinimumSize(new java.awt.Dimension(272, 271));

        jCheckBox01.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox01.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox01.setText("01 - Venda");
        jCheckBox01.setOpaque(false);

        jCheckBox02.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox02.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox02.setText("02 - Compra");
        jCheckBox02.setOpaque(false);

        jCheckBox07.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox07.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox07.setText("07 - Devolução de Venda");
        jCheckBox07.setOpaque(false);

        jCheckBox09.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox09.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox09.setText("09 - Devolução de Compra");
        jCheckBox09.setOpaque(false);

        jCheckBox05.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox05.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox05.setText("05 - Inventário");
        jCheckBox05.setOpaque(false);

        jCheckBox08.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox08.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox08.setText("08 - Transferência filiais");
        jCheckBox08.setOpaque(false);

        jCheckBox10.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox10.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox10.setText("10 - PCP");
        jCheckBox10.setOpaque(false);

        jCheckBox06.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox06.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox06.setText("06 - Retirada");
        jCheckBox06.setOpaque(false);

        jCheckBox11.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox11.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox11.setSelected(true);
        jCheckBox11.setText("Mostrar erros [ F8 ]");
        jCheckBox11.setOpaque(false);
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox12.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox12.setText("Mostrar cores [ F9 ]");
        jCheckBox12.setOpaque(false);
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(95, 105, 112));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel01.setForeground(new java.awt.Color(255, 255, 255));
        jLabel01.setText("0");

        jLabel02.setForeground(new java.awt.Color(255, 255, 255));
        jLabel02.setText("0");

        jLabel07.setForeground(new java.awt.Color(255, 255, 255));
        jLabel07.setText("0");

        jLabel09.setForeground(new java.awt.Color(255, 255, 255));
        jLabel09.setText("0");

        jCheckBox03.setBackground(new java.awt.Color(44, 84, 156));
        jCheckBox03.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox03.setText("03 - Transferência Almox");
        jCheckBox03.setOpaque(false);

        jLabel05.setForeground(new java.awt.Color(255, 255, 255));
        jLabel05.setText("0");

        jLabel08.setForeground(new java.awt.Color(255, 255, 255));
        jLabel08.setText("0");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("0");

        jLabel06.setForeground(new java.awt.Color(255, 255, 255));
        jLabel06.setText("0");

        jLabel03.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout jPanelCoresLayout = new javax.swing.GroupLayout(jPanelCores);
        jPanelCores.setLayout(jPanelCoresLayout);
        jPanelCoresLayout.setHorizontalGroup(
            jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCoresLayout.createSequentialGroup()
                        .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox08)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel08))
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox02)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel02))
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel01))
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox05)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel05))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox03)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel03))
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox06)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel06))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox09)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel09))
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(jPanelCoresLayout.createSequentialGroup()
                                .addComponent(jCheckBox07)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel07)))
                        .addContainerGap())
                    .addGroup(jPanelCoresLayout.createSequentialGroup()
                        .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelCoresLayout.setVerticalGroup(
            jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCoresLayout.createSequentialGroup()
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox01)
                    .addComponent(jLabel01)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox02)
                    .addComponent(jLabel02)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox03)
                    .addComponent(jLabel03)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox05)
                    .addComponent(jLabel05)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox06)
                    .addComponent(jLabel06)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox07)
                    .addComponent(jLabel07)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox08)
                    .addComponent(jLabel08)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox09)
                    .addComponent(jLabel09)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox10)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProgresso.setBackground(new java.awt.Color(71, 79, 86));

        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setString("...");
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanelProgressoLayout = new javax.swing.GroupLayout(jPanelProgresso);
        jPanelProgresso.setLayout(jPanelProgressoLayout);
        jPanelProgressoLayout.setHorizontalGroup(
            jPanelProgressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgressoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProgressoLayout.setVerticalGroup(
            jPanelProgressoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgressoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout jPanelLateralLayout = new javax.swing.GroupLayout(jPanelLateral);
        jPanelLateral.setLayout(jPanelLateralLayout);
        jPanelLateralLayout.setHorizontalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelProgresso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLateralLayout.setVerticalGroup(
            jPanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelProgresso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAreaDeTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAreaDeTrabalho.setAlignmentX(0.0F);
        jPanelAreaDeTrabalho.setAlignmentY(0.0F);

        jPanelExtrato.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Saldo Esp."));
        jTextFieldSaldo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jTextFieldEntrada.setForeground(new java.awt.Color(0, 153, 0));
        jTextFieldEntrada.setBorder(javax.swing.BorderFactory.createTitledBorder("Entrada (+)"));
        jTextFieldEntrada.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEntradaActionPerformed(evt);
            }
        });

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

        jTextFieldEstMinimo.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque minimo"));
        jTextFieldEstMinimo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEstMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstMinimoActionPerformed(evt);
            }
        });

        jTextFieldEstMaximo.setBorder(javax.swing.BorderFactory.createTitledBorder("Estoque maximo"));
        jTextFieldEstMaximo.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldEstMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstMaximoActionPerformed(evt);
            }
        });

        jTextFieldUltEntQtde.setBorder(javax.swing.BorderFactory.createTitledBorder("Ult. Entrada Qtde"));
        jTextFieldUltEntQtde.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldUltEntQtde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltEntQtdeActionPerformed(evt);
            }
        });

        jTextFieldUltEntData.setBorder(javax.swing.BorderFactory.createTitledBorder("Ult. Entrada Data"));
        jTextFieldUltEntData.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldUltEntData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltEntDataActionPerformed(evt);
            }
        });

        jTextFieldUltSaidaData.setBorder(javax.swing.BorderFactory.createTitledBorder("Ult. Saida Data"));
        jTextFieldUltSaidaData.setMaximumSize(new java.awt.Dimension(64, 22));
        jTextFieldUltSaidaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUltSaidaDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelExtratoLayout = new javax.swing.GroupLayout(jPanelExtrato);
        jPanelExtrato.setLayout(jPanelExtratoLayout);
        jPanelExtratoLayout.setHorizontalGroup(
            jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldEstMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                        .addComponent(jTextFieldEstMaximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldUltEntQtde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldUltEntData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldUltSaidaData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldErros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanelExtratoLayout.setVerticalGroup(
            jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelExtratoLayout.createSequentialGroup()
                        .addComponent(jTextFieldErros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jTextFieldEstMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltEntQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltEntData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldUltSaidaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

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
        jTableSaldo.setShowHorizontalLines(false);
        jTableSaldo.setShowVerticalLines(false);
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

        Testlotevalidade.setBackground(new java.awt.Color(255, 255, 255));

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

        jCheckBoxLotes.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxLotes.setText("MOSTRAR TODOS OS LOTES DE VALIDADE DO PRODUTO");
        jCheckBoxLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TestlotevalidadeLayout = new javax.swing.GroupLayout(Testlotevalidade);
        Testlotevalidade.setLayout(TestlotevalidadeLayout);
        TestlotevalidadeLayout.setHorizontalGroup(
            TestlotevalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestlotevalidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBoxLotes)
                .addContainerGap(732, Short.MAX_VALUE))
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        TestlotevalidadeLayout.setVerticalGroup(
            TestlotevalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestlotevalidadeLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxLotes))
        );

        jTabbedPane1.addTab("TESTLOTEVALIDADE", Testlotevalidade);

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

        javax.swing.GroupLayout EstoqueReservadoLayout = new javax.swing.GroupLayout(EstoqueReservado);
        EstoqueReservado.setLayout(EstoqueReservadoLayout);
        EstoqueReservadoLayout.setHorizontalGroup(
            EstoqueReservadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstoqueReservadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE))
        );
        EstoqueReservadoLayout.setVerticalGroup(
            EstoqueReservadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("ESTOQUE RESERVADO", EstoqueReservado);

        Tgerlicenca.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout TgerlicencaLayout = new javax.swing.GroupLayout(Tgerlicenca);
        Tgerlicenca.setLayout(TgerlicencaLayout);
        TgerlicencaLayout.setHorizontalGroup(
            TgerlicencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TgerlicencaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        TgerlicencaLayout.setVerticalGroup(
            TgerlicencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TgerlicencaLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TgerlicencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("TGERLICENCA", Tgerlicenca);

        javax.swing.GroupLayout jPanelAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jPanelAreaDeTrabalho);
        jPanelAreaDeTrabalho.setLayout(jPanelAreaDeTrabalhoLayout);
        jPanelAreaDeTrabalhoLayout.setHorizontalGroup(
            jPanelAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAreaDeTrabalhoLayout.createSequentialGroup()
                .addGroup(jPanelAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAreaDeTrabalhoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAreaDeTrabalhoLayout.setVerticalGroup(
            jPanelAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAreaDeTrabalhoLayout.createSequentialGroup()
                .addComponent(jPanelExtrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Verificações");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

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

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/285651_search_icon.png"))); // NOI18N
        jMenuItem7.setText("VERIFICA ESTOQUE RESERVADO NEGATIVO");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

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
        jCheckBoxMenuItem3.setSelected(true);
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
                .addComponent(jPanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                } else {
                    TransfEmpresasTela transfEmpresas = new TransfEmpresasTela(numeroDOC);
                    transfEmpresas.setVisible(true);
                }

            }
            if (movimentoID.equals("09")) {
            }
            if (movimentoID.equals("10")) {
                JOptionPane.showMessageDialog(null, "Ainda não consigo abrir ordens de produção.");
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
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_SPACE) {
            jTextFieldEntrada.setText("0");
            jTextFieldSaida.setText("0");
            jTextFieldSaldo.setText("0");
            jTextFieldEstMinimo.setText("");
            jTextFieldEstMaximo.setText("");
            jTextFieldUltEntQtde.setText("");
            jTextFieldUltEntData.setText("");
            jTextFieldUltSaidaData.setText("");
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

    private void jTableReserdadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReserdadosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int linha = jTableReserdados.getSelectedRow();
            String tipo = (String) jTableReserdados.getValueAt(linha, 9);
            if (tipo.equals("PEDIDO")) {
                String doc = (String) jTableReserdados.getValueAt(linha, 8);
                TelaPedidos telaPedidos = new TelaPedidos(codEmpresa, doc, true);
                telaPedidos.setVisible(true);
            }
            if (tipo.equals("FORMULAÇÃO PCP")) {
                String doc = (String) jTableReserdados.getValueAt(linha, 4);
                FormulacaoPCP telaformulacao = new FormulacaoPCP(codEmpresa, doc);
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

    private void jTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdutoActionPerformed

    private void jTextFieldProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldProdutoFocusLost
        //jTextFieldEntrada.setText("0");
        //jTextFieldSaida.setText("0");
        //jTextFieldSaldo.setText("0");
        //jTextFieldEstMinimo.setText("");
        //jTextFieldEstMaximo.setText("");
        //jTextFieldUltEntQtde.setText("");
        //jTextFieldUltEntData.setText("");
        //jTextFieldUltSaidaData.setText("");
        //botaoCarregar();
    }//GEN-LAST:event_jTextFieldProdutoFocusLost

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        EstoqueReservado estoqueReservado = new EstoqueReservado();
        estoqueReservado.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
    private javax.swing.JPanel EstoqueReservado;
    private javax.swing.JPanel Testlotevalidade;
    private javax.swing.JPanel Tgerlicenca;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanelAreaDeTrabalho;
    private javax.swing.JPanel jPanelCores;
    private javax.swing.JPanel jPanelExtrato;
    private javax.swing.JPanel jPanelLateral;
    private javax.swing.JPanel jPanelProduto;
    private javax.swing.JPanel jPanelProgresso;
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
    private javax.swing.JTextField jTextField2;
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
                jProgressBar1.setString("Carregando estoques reservados...");
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
                jProgressBar1.setString("Carregando estoques reservados - Ordens de produção.");
                try {
                    listapcps = reservadoDAO.getReservadoPCP(codEmpresa, codAlmox, codProduto);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                //PEDIDO DE VENDA
                jProgressBar1.setValue(50);
                jProgressBar1.setString("Carregando estoques reservados - Pedidos de venda.");
                try {
                    listaPedidos = reservadoDAO.getReservadoPEDIDO(codEmpresa, codAlmox, codProduto);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
                //DEVOLUCAO PENDENTES
                jProgressBar1.setString("Carregando estoques reservados - Devoluções de compra.");
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
                jProgressBar1.setString("Concluido");
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
            jComboBoxAlmox.addItem( a.getCodigo() + " - " + a.getDescricao());
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
            JOptionPane.showMessageDialog(null, "O Código " + codProduto + " não foi encontrado.");
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
            model.addRow(new Object[]{"TODOS", produto.getESTDISPONIVEL(), produto.getESTARETIRAR(), produto.getESTCONDICIONAL(), produto.getESTRESERVADO(), produto.getESTTRANSITO(), produto.getESTVENDAEXTERNA()});
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
