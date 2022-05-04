package Articulo;

import Entradas.FrmEntradas;
import com.mycompany.examenprogramacion2.FrmPrincipal;
import java.awt.Color;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmArticulo extends javax.swing.JFrame {

    int tCounter = 0;

    public FrmArticulo() {
        initComponents();
        setLocationRelativeTo(null);

        //Tabla
        model.addColumn("Codigo");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Departamento");
        model.addColumn("Categoria");
        tablaDatos1.setModel(model); 
          store = cp.getArticuloStore();
         counter();
         InsertData();
         System.out.println("=============");

    }

    //Tabla
    DefaultTableModel model = new DefaultTableModel();

    private void InsertData() {
        String[] datos = new String[5];
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable;

        runnable = new Runnable() {
            int countdownStarter = 1;

            public void run() {

                
                countdownStarter--;

                if (countdownStarter < 0) {

                    model.setRowCount(0);
                    for (int i = 0; i < store.size(); i++) {
                        String codigo = store.get(i).getCodigo();
                        String nombre = store.get(i).getNombre();
                        String descripcion = store.get(i).getDescripcion();
                        String departamento = store.get(i).getDepartamento();
                        String categoria = store.get(i).getCategoria();

                        datos[0] = codigo;
                        datos[1] = nombre;
                        datos[2] = descripcion;
                        datos[3] = departamento;
                        datos[4] = categoria;
                        model.addRow(datos);
                        jComboBox1.setSelectedIndex(0);

                    }
                    for (int i = 0; i < tablaDatos1.getColumnCount(); i++) {
                        Class<?> col_class = tablaDatos1.getColumnClass(i);
                        tablaDatos1.setDefaultEditor(col_class, null);

                    }
                    scheduler.shutdown();

                }
            }

        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);

    }

    private void setTableData(String departamentoFilt) {
        String[] datos = new String[5];
        if (departamentoFilt.equals("Todos")) {
            for (int i = 0; i < store.size(); i++) {
                String codigo = store.get(i).getCodigo();
                String Nombre = store.get(i).getNombre();
                String descripcion = store.get(i).getDescripcion();
                String departamento = store.get(i).getDepartamento();
                String categoria = store.get(i).getCategoria();

                datos[0] = codigo;
                datos[1] = Nombre;
                datos[2] = descripcion;
                datos[3] = departamento;
                datos[4] = categoria;
                model.addRow(datos);

            }
        }

        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getDepartamento().equals(departamentoFilt)) {
                String codigo = store.get(i).getCodigo();
                String Nombre = store.get(i).getNombre();
                String descripcion = store.get(i).getDescripcion();
                String departamento = store.get(i).getDepartamento();
                String categoria = store.get(i).getCategoria();

                datos[0] = codigo;
                datos[1] = Nombre;
                datos[2] = descripcion;
                datos[3] = departamento;
                datos[4] = categoria;
                model.addRow(datos);
            }

        }
        for (int i = 0; i < tablaDatos1.getColumnCount(); i++) {
            Class<?> col_class = tablaDatos1.getColumnClass(i);
            tablaDatos1.setDefaultEditor(col_class, null);

        }
    }

    ArrayList<Articulo> store;
    ControladorArticulo cp = ControladorArticulo.getInstance();

    //Methods
    //Este metodo verifica si el codigo introducido ya esta en uso
    //Si el codigo esta en uso retorna true
    public boolean verify(String codigo) {
        boolean exists = false;
        try {
            for (int i = 0; i < store.size(); i++) {
                if (codigo.equals(store.get(i).getCodigo()) == true) {
                    exists = true;
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return exists;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ScrollTabla = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        comboBoxDepartamento = new javax.swing.JComboBox<>();
        comboBoxCategoria = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtField2Codigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ScrollTabla1 = new javax.swing.JScrollPane();
        tablaDatos1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtField2Nombre = new javax.swing.JTextField();
        txtField2Codigo2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea2Desc = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        comboBox2Categ = new javax.swing.JComboBox<>();
        comboBox2Depart = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable1);

        tablaDatos.setModel(model);
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        ScrollTabla.setViewportView(tablaDatos);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Codigo");

        txtFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        jLabel4.setText("Departamento");

        comboBoxDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abarrotes", "Lacteos", "Bebidas", "Frutas y Verduras", "Electronica", "Linea Blanca", "Escolares", "Limpieza", "Ingiene", "Belleza", "Bebes", "Damas", "Caballeros" }));
        comboBoxDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDepartamentoActionPerformed(evt);
            }
        });

        comboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza", "Paquete", "Kit", "Litro", "Mililitros", "Galon", "Kilo", "Gramos", "Costal" }));
        comboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCategoriaActionPerformed(evt);
            }
        });

        jLabel5.setText("Categoria");

        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnListar.setText("Listar en Terminal");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(txtFieldCodigo)
                                .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(comboBoxCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comboBoxDepartamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(122, 122, 122)))
                        .addGap(52, 52, 52)
                        .addComponent(btnListar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(comboBoxDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnListar)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnSalir))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrar", jPanel1);

        txtField2Codigo.setForeground(new java.awt.Color(150, 150, 150));
        txtField2Codigo.setText("Ingrese un Codigo...");
        txtField2Codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtField2CodigoMousePressed(evt);
            }
        });
        txtField2Codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtField2CodigoKeyReleased(evt);
            }
        });

        jLabel7.setText("Modificar por Codigo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Abarrotes", "Lacteos", "Bebidas", "Frutas y Verduras", "Electronica", "Linea Blanca", "Escolares", "Limpieza", "Ingiene", "Belleza", "Bebes", "Damas", "Caballeros" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel8.setText("Mostrar por Departamento");

        jLabel9.setText("Listado de Articulos");

        tablaDatos1.setModel(model);
        tablaDatos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatos1MouseClicked(evt);
            }
        });
        ScrollTabla1.setViewportView(tablaDatos1);

        jLabel13.setText("Departamento");

        txtField2Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2NombreActionPerformed(evt);
            }
        });

        txtField2Codigo2.setEditable(false);
        txtField2Codigo2.setBackground(new java.awt.Color(200, 200, 200));
        txtField2Codigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField2Codigo2ActionPerformed(evt);
            }
        });

        txtArea2Desc.setColumns(20);
        txtArea2Desc.setRows(5);
        jScrollPane2.setViewportView(txtArea2Desc);

        jLabel14.setText("Categoria");

        comboBox2Categ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pieza", "Paquete", "Kit", "Litro", "Mililitros", "Galon", "Kilo", "Gramos", "Costal" }));

        comboBox2Depart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abarrotes", "Lacteos", "Bebidas", "Frutas y Verduras", "Electronica", "Linea Blanca", "Escolares", "Limpieza", "Ingiene", "Belleza", "Bebes", "Damas", "Caballeros" }));

        jLabel10.setText("Codigo");

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Nombre");

        jLabel12.setText("Descripcion");

        jButton3.setText("Listar en terminal");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Filtrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField2Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(115, 115, 115)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox2Depart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField2Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(14, 14, 14)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel11)))
                                                .addComponent(comboBox2Categ, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(10, 10, 10)
                                                    .addComponent(jLabel13))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(15, 15, 15)
                                                    .addComponent(jLabel14)))
                                            .addGap(77, 77, 77))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(58, 58, 58)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButton1)
                                                .addComponent(jButton2))
                                            .addGap(103, 103, 103)))
                                    .addComponent(txtField2Codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton3))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtField2Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField2Codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtField2Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox2Depart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox2Categ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(ScrollTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldCodigoActionPerformed

    private void comboBoxDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxDepartamentoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String codigo = txtFieldCodigo.getText();
        String nombre = txtFieldNombre.getText();
        String descripcion = txtAreaDescripcion.getText();
        String departamento = comboBoxDepartamento.getSelectedItem().toString();
        String categoria = comboBoxCategoria.getSelectedItem().toString();
        store = cp.getArticuloStore();
        //Verificar codigo
        boolean isUsed = verify(codigo);
        if (isUsed == true) {
            //JOptionPane.showMessageDialog(null, "El codigo introducido ya esta en uso", "Alerta", JOptionPane.ERROR_MESSAGE);

            int opt = JOptionPane.showConfirmDialog(this, "El codigo ingresado se encuentra en uso. \n Desea sobreescribir los valores? ", "Alerta!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (opt == JOptionPane.OK_OPTION) {
                int index = 0;
                for (int i = 0; i < store.size(); i++) {
                    if (store.get(i).getCodigo().equals(codigo)) {
                        index = store.indexOf(store.get(i));
                        store.remove(index);
                    }
                }

                //Instancia
                Articulo articulo = new Articulo(codigo, nombre, descripcion, departamento, categoria);

                //
                store = ControladorArticulo.getInstance().getArticuloStore();

                //Guardar articulo
                store.add(index, articulo);
                cp.setArticuloStore(store);

                //Limpiar campos
                txtFieldCodigo.setText("");
                txtFieldNombre.setText("");
                txtAreaDescripcion.setText("");
                JOptionPane.showMessageDialog(this, "Los datos han sido registrados correctamente!", "Atencion!", JOptionPane.INFORMATION_MESSAGE);
                InsertData();
            } else {
                //
            }

        } else {
            //Instancia
            Articulo articulo = new Articulo(codigo, nombre, descripcion, departamento, categoria);

            //
            store = cp.getArticuloStore();

            //Guardar articulos
            store.add(articulo);
            cp.setArticuloStore(store);

            //Limpiar campos
            txtFieldCodigo.setText("");
            txtFieldNombre.setText("");
            txtAreaDescripcion.setText("");
            JOptionPane.showMessageDialog(this, "Los datos han sido registrados correctamente!", "Atencion!", JOptionPane.INFORMATION_MESSAGE);
            InsertData();
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int Opcion = JOptionPane.showConfirmDialog(this, "Desea salir? ", "Java Array Frames", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        FrmPrincipal.counter = 99;
        if (Opcion == JOptionPane.OK_OPTION) {
            FrmPrincipal frm = new FrmPrincipal();
            frm.setVisible(true);
            this.dispose();

        }
        tCounter = 0;
    }//GEN-LAST:event_btnSalirActionPerformed


    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
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
    }//GEN-LAST:event_btnListarActionPerformed

    private void comboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCategoriaActionPerformed

    private void txtField2Codigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2Codigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField2Codigo2ActionPerformed

    private void txtField2CodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtField2CodigoKeyReleased
        boolean found = false;
        int departIndex = 0;
        int categIndex = 0;

        String codigo = txtField2Codigo.getText();
        String nombre = "";
        String descripcion = "";
        String departamento = "";
        String categoria = "";
        store = cp.getArticuloStore();
        if (store.isEmpty() == true) {

            JOptionPane.showMessageDialog(null, "Aun no se han registrado datos.", "Alerta", JOptionPane.ERROR_MESSAGE);
            txtField2Codigo.setText("");
        } else {
            for (int i = 0; i < store.size(); i++) {
                if (store.get(i).getCodigo().equals(codigo)) {
                    nombre = store.get(i).getNombre();
                    descripcion = store.get(i).getDescripcion();
                    //OK
                    departamento = store.get(i).getDepartamento();
                    //
                    categoria = store.get(i).getCategoria();

                    found = true;
                }

            }
        }

        if (found == true) {

            for (int i = 0; i < comboBox2Depart.getItemCount(); i++) {
                if (departamento.equals(comboBox2Depart.getItemAt(i))) {
                    departIndex = i;

                }
            }
            for (int i = 0; i < comboBox2Categ.getItemCount(); i++) {
                if (categoria.equals(comboBox2Categ.getItemAt(i))) {
                    categIndex = i;
                }
            }

            txtField2Codigo2.setText(codigo);
            txtField2Nombre.setText(nombre);
            txtArea2Desc.setText(descripcion);
            //comboBox2Depart.getItemAt(departIndex);
            comboBox2Categ.setSelectedIndex(categIndex);
            comboBox2Depart.setSelectedIndex(departIndex);
        } else {
            txtField2Codigo2.setText("");
            txtField2Nombre.setText("");
            txtArea2Desc.setText("");
            comboBox2Depart.getItemAt(0);
            comboBox2Categ.getItemAt(0);
        }

    }//GEN-LAST:event_txtField2CodigoKeyReleased
    int accum = 0;
    private void txtField2CodigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtField2CodigoMousePressed
        accum++;
        if (accum == 1) {
            txtField2Codigo.setText("");
            txtField2Codigo.setForeground(Color.black);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtField2CodigoMousePressed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked

    }//GEN-LAST:event_tablaDatosMouseClicked

    private void txtField2NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField2NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField2NombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String codigo = txtField2Codigo.getText();
        boolean exists = false;
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getCodigo().equals(codigo)) {
                exists = true;
            }

        }
        if (exists) {

            if (codigo.equals("") || codigo.equals("Ingrese un Codigo")) {
                JOptionPane.showMessageDialog(null, "El campo de codigo esta vacio", "Alerta", JOptionPane.ERROR_MESSAGE);
            } else {
                int index = 0;
                int departIndex = 0;
                int categIndex = 0;

                String nombre = "";
                String descripcion = "";
                String departamento = "";
                String categoria = "";

                for (int i = 0; i < store.size(); i++) {
                    if (store.get(i).getCodigo().equals(codigo)) {
                        index = i;
                        nombre = txtField2Nombre.getText();
                        descripcion = txtArea2Desc.getText();
                        departIndex = comboBox2Depart.getSelectedIndex();
                        categIndex = comboBox2Categ.getSelectedIndex();

                        store.remove(i);
                    }
                }
                departamento = comboBox2Depart.getItemAt(departIndex);
                categoria = comboBox2Categ.getItemAt(categIndex);
                Articulo articulo = new Articulo(codigo, nombre, descripcion, departamento, categoria);
                store.add(index, articulo);
                cp.setArticuloStore(store);

                txtField2Codigo.setText("");
                txtField2Codigo2.setText("");
                txtField2Nombre.setText("");
                txtArea2Desc.setText("");
                comboBox2Depart.setSelectedIndex(0);
                comboBox2Categ.setSelectedIndex(0);

                JOptionPane.showMessageDialog(this, "Los datos han sido modificados correctamente!", "Atencion!", JOptionPane.INFORMATION_MESSAGE);
                InsertData();
            }
        } else if (exists == false) {
            JOptionPane.showMessageDialog(this, "El codigo ingresado no existe", "Atencion!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaDatos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatos1MouseClicked
        int departIndex = 0;
        int categIndex = 0;

        if (evt.getClickCount() == 2) {
            int Index = tablaDatos1.getSelectedRow();
            String codigo = store.get(Index).getCodigo();
            String nombre = store.get(Index).getNombre();
            String descripcion = store.get(Index).getDescripcion();
            String departamento = store.get(Index).getDepartamento();
            String categoria = store.get(Index).getCategoria();

            for (int i = 0; i < comboBox2Depart.getItemCount(); i++) {
                if (departamento.equals(comboBox2Depart.getItemAt(i))) {
                    departIndex = i;

                }
            }
            for (int i = 0; i < comboBox2Categ.getItemCount(); i++) {
                if (categoria.equals(comboBox2Categ.getItemAt(i))) {
                    categIndex = i;
                }
            }

            txtField2Nombre.setText(nombre);
            txtField2Codigo.setText(codigo);
            txtField2Codigo.setForeground(Color.black);
            txtField2Codigo2.setText(codigo);
            txtArea2Desc.setText(descripcion);
            comboBox2Categ.setSelectedIndex(categIndex);
            comboBox2Depart.setSelectedIndex(departIndex);

        }
    }//GEN-LAST:event_tablaDatos1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    }//GEN-LAST:event_jButton3ActionPerformed
    private void counter(){
        tCounter++;
        System.out.println("Ah " + tCounter);
        if(tCounter >= 2){
            tCounter = 0;
        }
        if (tCounter == 1) {
            InsertData();
        }
    }
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        counter();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String codigo = txtField2Codigo.getText();
        int index = 0;
        for (int i = 0; i < store.size(); i++) {
            if (store.get(i).getCodigo().equals(codigo)) {
                index = i;
                int opt = JOptionPane.showConfirmDialog(this, "Seguro que desea eliminar este elemento? ", "Alerta!", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

                if (opt == JOptionPane.OK_OPTION) {

                    store.remove(index);
                    cp.setArticuloStore(store);
                    InsertData();
                    txtField2Codigo.setText("");
                    txtField2Codigo2.setText("");
                    txtField2Nombre.setText("");
                    txtArea2Desc.setText("");

                }
            }

        }
        FrmEntradas.tCounter = 0;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        model.setRowCount(0);
        String departamento = jComboBox1.getSelectedItem() + "";

        setTableData(departamento);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        model.setRowCount(0);
        String departamento = jComboBox1.getSelectedItem() + "";

        setTableData(departamento);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmArticulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmArticulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTabla;
    private javax.swing.JScrollPane ScrollTabla1;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboBox2Categ;
    private javax.swing.JComboBox<String> comboBox2Depart;
    private javax.swing.JComboBox<String> comboBoxCategoria;
    private javax.swing.JComboBox<String> comboBoxDepartamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTable tablaDatos1;
    private javax.swing.JTextArea txtArea2Desc;
    private javax.swing.JTextArea txtAreaDescripcion;
    private javax.swing.JTextField txtField2Codigo;
    private javax.swing.JTextField txtField2Codigo2;
    private javax.swing.JTextField txtField2Nombre;
    private javax.swing.JTextField txtFieldCodigo;
    private javax.swing.JTextField txtFieldNombre;
    // End of variables declaration//GEN-END:variables
}
