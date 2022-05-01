package Entradas;

import Articulo.Articulo;
import Articulo.ControladorArticulo;
import com.mycompany.examenprogramacion2.FrmPrincipal;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmEntradas extends javax.swing.JFrame {

    //Articulos
    ArrayList<Articulo> articuloStore = ControladorArticulo.getInstance().getArticuloStore();

    //Entradas
    ArrayList<Entradas> store = new ArrayList<>();
    ControladorEntradas cp = ControladorEntradas.getInstance();
    //Tabla

    DefaultTableModel model = new DefaultTableModel();

    public FrmEntradas() {
        initComponents();
        setLocationRelativeTo(null);
        //Tabla

        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Departamento");
        model.addColumn("Categoria");
        tablaDatos.setModel(model);

    }

    

    private void setTableData(String departamentoFilt) {
        String[] datos = new String[4];

        for (int i = 0; i < articuloStore.size(); i++) {
            if (articuloStore.get(i).getDepartamento().equals(departamentoFilt)) {
                String Nombre = articuloStore.get(i).getNombre();
                String descripcion = articuloStore.get(i).getDescripcion();
                String departamento = articuloStore.get(i).getDepartamento();
                String categoria = articuloStore.get(i).getCategoria();

                datos[0] = Nombre;
                datos[1] = descripcion;
                datos[2] = departamento;
                datos[3] = categoria;
                model.addRow(datos);
            }

        }
        for (int i = 0; i < tablaDatos.getColumnCount(); i++) {
            Class<?> col_class = tablaDatos.getColumnClass(i);
            tablaDatos.setDefaultEditor(col_class, null);
                    
            

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtFieldCodigo = new javax.swing.JTextField();
        txtFieldDepartamento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDesc = new javax.swing.JTextArea();
        txtFieldNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFieldCategoria = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txtFieldCompra = new javax.swing.JTextField();
        txtFieldVenta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtFieldGanancia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtFieldPrecioTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtField2Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtField2Cantidad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtField2PrecioCompra = new javax.swing.JTextField();
        txtFieldPrecioVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtField2Ganancia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboBox2Departamento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblProducto = new javax.swing.JLabel();
        lblNombreProducto = new javax.swing.JLabel();
        Salir1 = new javax.swing.JButton();
        ScrollTabla = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btn2Filtrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("Codigo");

        txtFieldCodigo.setForeground(new java.awt.Color(150, 150, 150));
        txtFieldCodigo.setText("Ingrese un codigo");
        txtFieldCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFieldCodigoMouseClicked(evt);
            }
        });
        txtFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFieldCodigoKeyReleased(evt);
            }
        });

        txtFieldDepartamento.setEditable(false);
        txtFieldDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldDepartamentoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nombre");

        txtAreaDesc.setEditable(false);
        txtAreaDesc.setColumns(20);
        txtAreaDesc.setRows(5);
        jScrollPane1.setViewportView(txtAreaDesc);

        txtFieldNombre.setEditable(false);
        txtFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldNombreActionPerformed(evt);
            }
        });

        jLabel11.setText("Departamento");

        txtFieldCategoria.setEditable(false);
        txtFieldCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCategoriaActionPerformed(evt);
            }
        });

        jLabel12.setText("Categoria");

        jLabel1.setText("Cantidad");

        spinnerCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerCantidadStateChanged(evt);
            }
        });

        jLabel13.setText("Precio de Compra");

        txtFieldCompra.setText("0");
        txtFieldCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCompraActionPerformed(evt);
            }
        });
        txtFieldCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFieldCompraKeyReleased(evt);
            }
        });

        txtFieldVenta.setText("0");
        txtFieldVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFieldVentaKeyReleased(evt);
            }
        });

        jLabel14.setText("Precio de Venta");

        jLabel15.setText("Descripcion");

        txtFieldGanancia.setEditable(false);

        jLabel16.setText("Utilidad o Ganancia");

        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Salir.setForeground(new java.awt.Color(204, 0, 51));
        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel18.setText("Precio total");

        txtFieldPrecioTotal.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(5, 5, 5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 21, Short.MAX_VALUE)
                                        .addComponent(txtFieldGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(0, 21, Short.MAX_VALUE))
                                    .addComponent(txtFieldPrecioTotal)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(71, 71, 71)
                                            .addComponent(jLabel14)
                                            .addGap(40, 40, 40))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(spinnerCantidad, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtFieldCompra))))
                                    .addComponent(txtFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegistrar)
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFieldVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldGanancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar Entradas", jPanel1);

        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Buscar entrada por Codigo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 27, -1, -1));

        txtField2Codigo.setForeground(new java.awt.Color(150, 150, 150));
        txtField2Codigo.setText("Ingrese un Codigo...");
        txtField2Codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtField2CodigoMouseClicked(evt);
            }
        });
        txtField2Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2CodigoActionPerformed(evt);
            }
        });
        txtField2Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtField2CodigoKeyReleased(evt);
            }
        });
        jPanel2.add(txtField2Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 236, -1));

        jLabel3.setText("Cantidad");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 82, -1, -1));
        jPanel2.add(txtField2Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 107, 176, -1));

        jLabel4.setText("Precio de Compra");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 167, -1, -1));

        txtField2PrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2PrecioCompraActionPerformed(evt);
            }
        });
        txtField2PrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtField2PrecioCompraKeyReleased(evt);
            }
        });
        jPanel2.add(txtField2PrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 192, 176, -1));

        txtFieldPrecioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldPrecioVentaActionPerformed(evt);
            }
        });
        jPanel2.add(txtFieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 282, 176, -1));

        jLabel5.setText("Precio de Venta");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 252, -1, -1));

        txtField2Ganancia.setEditable(false);
        txtField2Ganancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2GananciaActionPerformed(evt);
            }
        });
        txtField2Ganancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtField2GananciaKeyReleased(evt);
            }
        });
        jPanel2.add(txtField2Ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 350, 107, -1));

        jLabel6.setText("Utilidad o ganancia");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 325, -1, -1));

        jLabel7.setText("Mostrar articulos por Departamento");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        comboBox2Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abarrotes", "Lacteos", "Bebidas", "Frutas y Verduras", "Electronica", "Linea Blanca", "Escolares", "Limpieza", "Ingiene", "Belleza", "Bebes", "Damas", "Caballeros" }));
        comboBox2Departamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBox2DepartamentoMouseClicked(evt);
            }
        });
        jPanel2.add(comboBox2Departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, 236, -1));

        jLabel8.setText("Listado de articulos");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 205, -1, -1));

        jButton2.setText("Modificar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 403, 115, -1));

        jButton3.setText("Eliminar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 446, 115, -1));

        lblProducto.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(150, 150, 150));
        lblProducto.setText("Producto");
        jPanel2.add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 0, 102, 28));

        lblNombreProducto.setFont(new java.awt.Font("Fira Code Medium", 0, 16)); // NOI18N
        lblNombreProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 250, 26));

        Salir1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        Salir1.setForeground(new java.awt.Color(204, 0, 51));
        Salir1.setText("Salir");
        Salir1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Salir1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salir1ActionPerformed(evt);
            }
        });
        jPanel2.add(Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 499, 67, -1));

        tablaDatos.setModel(model);
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        ScrollTabla.setViewportView(tablaDatos);

        jPanel2.add(ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 390, 390));

        btn2Filtrar.setText("Filtrar");
        btn2Filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2FiltrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn2Filtrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtField2PrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2PrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField2PrecioCompraActionPerformed

    private void txtFieldPrecioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldPrecioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldPrecioVentaActionPerformed

    private void txtField2GananciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2GananciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField2GananciaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String codigo = txtField2Codigo.getText();
        int index = 0;
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getCodigo().equals(codigo)) {
                index = i;
                int opt = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar este elemento? ", "Alerta!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opt == JOptionPane.OK_OPTION) {

                    store.remove(index);
                    cp.setEntradasStore(store);

                }
            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFieldDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldDepartamentoActionPerformed

    private void txtFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldNombreActionPerformed

    private void txtFieldCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCategoriaActionPerformed
    String codigo;
    String nombre;
    int ganancia;
    int precio;
    int venta;
    int cantidad;
    int precioTotal;

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (txtFieldCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo de codigo esta vacio", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            codigo = txtFieldCodigo.getText();
            nombre = txtFieldNombre.getText();

            Entradas entrada = new Entradas(codigo, nombre, cantidad, precio, venta, ganancia);

            //Add entrada object into the arraylist created at the start
            store.add(entrada);

            cp.setEntradasStore(store);

            //Clear Fields
            txtFieldCodigo.setText("");
            txtFieldNombre.setText("");
            txtAreaDesc.setText("");
            txtFieldDepartamento.setText("");
            txtFieldCategoria.setText("");
            spinnerCantidad.setValue(0);
            txtFieldCompra.setText("0");
            txtFieldVenta.setText("0");
            txtFieldGanancia.setText("0");
            JOptionPane.showMessageDialog(this, "Los datos han sido registrados correctamente!", "Atencion!", JOptionPane.INFORMATION_MESSAGE);

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtFieldCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCompraKeyReleased
        cantidad = (Integer) spinnerCantidad.getValue();
        precio = Integer.parseInt(txtFieldCompra.getText());
        venta = Integer.parseInt(txtFieldVenta.getText());

        ganancia = 0;

        ganancia = (venta - precio) * cantidad;
        precioTotal = precio * cantidad;

        txtFieldPrecioTotal.setText(precioTotal + "");
        txtFieldGanancia.setText(ganancia + "");
    }//GEN-LAST:event_txtFieldCompraKeyReleased

    private void txtFieldVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldVentaKeyReleased
        cantidad = (Integer) spinnerCantidad.getValue();
        precio = Integer.parseInt(txtFieldCompra.getText());
        venta = Integer.parseInt(txtFieldVenta.getText());

        ganancia = (venta - precio) * cantidad;
        precioTotal = precio * cantidad;

        txtFieldPrecioTotal.setText(precioTotal + "");
        txtFieldGanancia.setText(ganancia + "");

    }//GEN-LAST:event_txtFieldVentaKeyReleased

    private void spinnerCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerCantidadStateChanged
        cantidad = (Integer) spinnerCantidad.getValue();
        precio = Integer.parseInt(txtFieldCompra.getText());
        venta = Integer.parseInt(txtFieldVenta.getText());

        ganancia = (venta - precio) * cantidad;
        precioTotal = precio * cantidad;

        txtFieldPrecioTotal.setText(precioTotal + "");
        txtFieldGanancia.setText(ganancia + "");
    }//GEN-LAST:event_spinnerCantidadStateChanged

    private void txtFieldCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCompraActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        int Opcion = JOptionPane.showConfirmDialog(this, "Desea salir? ", "Registrar Entradas", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (Opcion == JOptionPane.OK_OPTION) {
            FrmPrincipal frm = new FrmPrincipal();
            frm.setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_SalirActionPerformed

    private void txtFieldCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCodigoKeyReleased

        String codigo = txtFieldCodigo.getText();
        String nombre = "";
        String desc = "";
        String departamento = "";
        String categoria = "";

        for (int i = 0; i < articuloStore.size(); i++) {

            if (articuloStore.get(i).getCodigo().equals(codigo)) {
                nombre = articuloStore.get(i).getNombre();
                desc = articuloStore.get(i).getDescripcion();
                departamento = articuloStore.get(i).getDepartamento();
                categoria = articuloStore.get(i).getCategoria();

            }

        }
        txtFieldNombre.setText(nombre);
        txtAreaDesc.setText(desc);
        txtFieldDepartamento.setText(departamento);
        txtFieldCategoria.setText(categoria);


    }//GEN-LAST:event_txtFieldCodigoKeyReleased


    private void txtField2CodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField2CodigoKeyReleased
        String codigo = txtField2Codigo.getText();
        int cantidad = 0;
        int compra = 0;
        int venta = 0;
        String nombre = "";
        int ganancia = 0;
        boolean found = false;

        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getCodigo().equals(codigo)) {
                cantidad = store.get(i).getCantidad();
                compra = store.get(i).getPrecio();
                venta = store.get(i).getVenta();
                nombre = store.get(i).getNombre();
                ganancia = store.get(i).getGanancia();
                found = true;
            }

        }
        if (found == true) {

            lblNombreProducto.setText(nombre);
            lblProducto.setForeground(Color.black);
            txtField2Cantidad.setValue(cantidad);
            txtField2PrecioCompra.setText(compra + "");
            txtFieldPrecioVenta.setText(venta + "");
            txtField2Ganancia.setText(ganancia + "");

        } else {
            txtField2Cantidad.setValue(0);
            txtField2PrecioCompra.setText("");
            txtFieldPrecioVenta.setText("");
            lblNombreProducto.setText("");
            txtField2Ganancia.setText("");
            lblProducto.setForeground(Color.GRAY);

        }


    }//GEN-LAST:event_txtField2CodigoKeyReleased

    private void txtField2CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2CodigoActionPerformed

    }//GEN-LAST:event_txtField2CodigoActionPerformed

    private void Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salir1ActionPerformed
        int Opcion = JOptionPane.showConfirmDialog(this, "Desea salir? ", "Registrar Entradas", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (Opcion == JOptionPane.OK_OPTION) {
            FrmPrincipal frm = new FrmPrincipal();
            frm.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_Salir1ActionPerformed
    int accum0 = 0;
    int accum1 = 0;
    private void txtFieldCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldCodigoMouseClicked
        accum1++;
        if (accum1 == 1) {
            txtFieldCodigo.setText("");
            txtFieldCodigo.setForeground(Color.black);
        } else {
            //
        }
    }//GEN-LAST:event_txtFieldCodigoMouseClicked

    private void txtField2CodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtField2CodigoMouseClicked
        accum0++;
        if (accum0 == 1) {
            txtField2Codigo.setText("");
            txtField2Codigo.setForeground(Color.black);
        } else {

        }    }//GEN-LAST:event_txtField2CodigoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String codigo = txtField2Codigo.getText();
        if (codigo.equals("") || codigo.equals("Ingrese un Codigo")) {
            JOptionPane.showMessageDialog(null, "El campo de codigo esta vacio", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {

            String nombre = txtField2Codigo.getText();
            int cantidad = (int) txtField2Cantidad.getValue();
            int precio = Integer.parseInt(txtField2PrecioCompra.getText());
            int venta = Integer.parseInt(txtFieldPrecioVenta.getText());
            int ganancia = Integer.parseInt(txtField2Ganancia.getText());
            int index = 0;

            for (int i = 0; i < store.size(); i++) {
                if (store.get(i).getCodigo().equals(codigo)) {
                    index = i;
                    store.remove(i);
                }
            }
            Entradas entrada = new Entradas(codigo, nombre, cantidad, precio, venta, ganancia);
            store.add(index, entrada);
            cp.setEntradasStore(store);

            txtField2Codigo.setText("");
            lblNombreProducto.setText("");
            txtField2Cantidad.setValue(0);
            txtField2PrecioCompra.setText("");
            txtFieldPrecioVenta.setText("");
            txtField2Ganancia.setText("");

            JOptionPane.showMessageDialog(this, "Los datos han sido modificados correctamente!", "Atencion!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtField2GananciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField2GananciaKeyReleased
        cantidad = (Integer) txtField2Cantidad.getValue();
        precio = Integer.parseInt(txtField2PrecioCompra.getText());
        venta = Integer.parseInt(txtFieldPrecioVenta.getText());

        ganancia = 0;

        ganancia = (venta - precio) * cantidad;

        txtField2Ganancia.setText(ganancia + "");
    }//GEN-LAST:event_txtField2GananciaKeyReleased

    private void txtField2PrecioCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField2PrecioCompraKeyReleased
        cantidad = (Integer) txtField2Cantidad.getValue();
        precio = Integer.parseInt(txtField2PrecioCompra.getText());
        venta = Integer.parseInt(txtFieldPrecioVenta.getText());

        ganancia = 0;

        ganancia = (venta - precio) * cantidad;

        txtField2Ganancia.setText(ganancia + "");
    }//GEN-LAST:event_txtField2PrecioCompraKeyReleased

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked


    }//GEN-LAST:event_tablaDatosMouseClicked

    private void btn2FiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2FiltrarActionPerformed
        model.setRowCount(0);
        String departamento = comboBox2Departamento.getSelectedItem() + "";
        System.out.println(departamento);
        setTableData(departamento);
    }//GEN-LAST:event_btn2FiltrarActionPerformed

    private void comboBox2DepartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBox2DepartamentoMouseClicked

    }//GEN-LAST:event_comboBox2DepartamentoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for (int i = 0; i < store.size(); i++) {
            String message = "[Index: " + i + "] " + "Nombre:  " + store.get(i).getNombre() + "\n";
            int count = message.length();

            //Imprimir separador al comienzo
            if (i == 0) {
                String ola = "";
                for (int j = 0; j <= count; j++) {
                    ola += "=";
                }
                System.out.println(ola);
            }
            System.out.println("[Index: " + i + "] " + "Codigo: " + store.get(i).getCodigo());
            System.out.println("[Index: " + i + "] " + "Nombre:  " + store.get(i).getNombre() + "\n");

            //Imprimir separador al final
            if (i == store.size() - 1) {
                String ola = "";
                for (int j = 0; j <= count; j++) {
                    ola += "=";
                }
                System.out.println("ArrayList Size: " + store.size() + "\n\n\n");

                System.out.println(ola);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEntradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEntradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton Salir1;
    private javax.swing.JScrollPane ScrollTabla;
    private javax.swing.JButton btn2Filtrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> comboBox2Departamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextArea txtAreaDesc;
    private javax.swing.JSpinner txtField2Cantidad;
    private javax.swing.JTextField txtField2Codigo;
    private javax.swing.JTextField txtField2Ganancia;
    private javax.swing.JTextField txtField2PrecioCompra;
    private javax.swing.JTextField txtFieldCategoria;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldCompra;
    private javax.swing.JTextField txtFieldDepartamento;
    private javax.swing.JTextField txtFieldGanancia;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldPrecioTotal;
    private javax.swing.JTextField txtFieldPrecioVenta;
    private javax.swing.JTextField txtFieldVenta;
    // End of variables declaration//GEN-END:variables
}
