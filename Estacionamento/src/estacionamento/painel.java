package estacionamento;

import java.awt.Dimension;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class painel extends javax.swing.JFrame {

    Set<String> vagaCarro = new HashSet<>();
    Set<String> vagaMoto = new HashSet<>();
    Set<String> vagaEspecial = new HashSet<>();
    int QtdVagaCarro = 0;
    int QtdVagaMoto = 0;
    int QtdVagaEspecial = 0;

    public painel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dEntradaCarro = new javax.swing.JDialog();
        jEntradaCarro = new javax.swing.JPanel();
        lbEntradaCarro = new javax.swing.JLabel();
        lbPlacaCarro = new javax.swing.JLabel();
        txEntradaPlacaCarro = new javax.swing.JTextField();
        btnEntradaCancelar = new javax.swing.JButton();
        btnEntradaConfirmar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        dEntradaMoto = new javax.swing.JDialog();
        jEntradaMoto = new javax.swing.JPanel();
        lbEntradaMoto = new javax.swing.JLabel();
        lbPlaca1 = new javax.swing.JLabel();
        txEntradaPlacaMoto = new javax.swing.JTextField();
        btnEntradaCancelar1 = new javax.swing.JButton();
        btnEntradaConfirmarMoto = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        dEntradaEspecial = new javax.swing.JDialog();
        jEntradaEspecial = new javax.swing.JPanel();
        lbEntradaEspecial = new javax.swing.JLabel();
        lbPlaca2 = new javax.swing.JLabel();
        txEntradaPlacaEspecial = new javax.swing.JTextField();
        btnEntradaCancelarEspecial = new javax.swing.JButton();
        btnEntradaConfirmarEspecial = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        dSaidaCarro = new javax.swing.JDialog();
        jSaida = new javax.swing.JPanel();
        lbSaidaCarro = new javax.swing.JLabel();
        lbPlacaSaida = new javax.swing.JLabel();
        txSaidaPlacaCarro = new javax.swing.JTextField();
        btnSaidaCancelar = new javax.swing.JButton();
        btnSaidaVeiculo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        dSaidaMoto = new javax.swing.JDialog();
        jSaida1 = new javax.swing.JPanel();
        lbSaidaCarro1 = new javax.swing.JLabel();
        lbPlacaSaida1 = new javax.swing.JLabel();
        txSaidaPlacaMoto = new javax.swing.JTextField();
        btnSaidaCancelarMoto = new javax.swing.JButton();
        btnSaidaVeiculoMoto = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        dSaidaEspecial = new javax.swing.JDialog();
        jSaida2 = new javax.swing.JPanel();
        lbSaidaCarro2 = new javax.swing.JLabel();
        lbPlacaSaida2 = new javax.swing.JLabel();
        txSaidaPlacaEspecial = new javax.swing.JTextField();
        btnSaidaCancelarEspecial = new javax.swing.JButton();
        btnSaidaVeiculo2 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        dMapa = new javax.swing.JDialog();
        jMapa = new javax.swing.JPanel();
        lbEscolherAndar = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        opPavimento1 = new javax.swing.JRadioButton();
        opPavimento2 = new javax.swing.JRadioButton();
        opPavimento3 = new javax.swing.JRadioButton();
        btnConfirmarPavimento = new javax.swing.JButton();
        btnCancelarPavimento = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        dPavimento1 = new javax.swing.JDialog();
        jPavimento1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jImagem2 = new javax.swing.JLabel();
        btnVoltarPavimento1 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        dPavimento2 = new javax.swing.JDialog();
        jPavimento2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jImagem3 = new javax.swing.JLabel();
        btnVoltarPavimento2 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JSeparator();
        dPavimento3 = new javax.swing.JDialog();
        jPavimento3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jImagem4 = new javax.swing.JLabel();
        btnVoltarPavimento3 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInicial = new javax.swing.JPanel();
        btnMapa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jImagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnEntradaCarro = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnSaidaCarro = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEntradaEspecial = new javax.swing.JButton();
        btnEntradaMoto = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnSaidaEspecial = new javax.swing.JButton();
        btnSaidaMoto = new javax.swing.JButton();

        dEntradaCarro.setTitle("Entrada de novo veiculo");
        dEntradaCarro.setResizable(false);

        lbEntradaCarro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEntradaCarro.setText("ENTRADA DE CARRO");

        lbPlacaCarro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPlacaCarro.setText("Placa:");

        txEntradaPlacaCarro.setText("ABC-1234");

        btnEntradaCancelar.setText("CANCELAR");
        btnEntradaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaCancelarActionPerformed(evt);
            }
        });

        btnEntradaConfirmar.setText("CONFIRMAR");
        btnEntradaConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEntradaCarroLayout = new javax.swing.GroupLayout(jEntradaCarro);
        jEntradaCarro.setLayout(jEntradaCarroLayout);
        jEntradaCarroLayout.setHorizontalGroup(
            jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEntradaCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEntradaCarroLayout.createSequentialGroup()
                        .addGroup(jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEntradaCarroLayout.createSequentialGroup()
                                .addComponent(lbPlacaCarro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txEntradaPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jEntradaCarroLayout.createSequentialGroup()
                                .addComponent(btnEntradaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEntradaConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jEntradaCarroLayout.createSequentialGroup()
                        .addGroup(jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEntradaCarro)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jEntradaCarroLayout.setVerticalGroup(
            jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEntradaCarroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEntradaCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlacaCarro)
                    .addComponent(txEntradaPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntradaConfirmar)
                    .addComponent(btnEntradaCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dEntradaCarroLayout = new javax.swing.GroupLayout(dEntradaCarro.getContentPane());
        dEntradaCarro.getContentPane().setLayout(dEntradaCarroLayout);
        dEntradaCarroLayout.setHorizontalGroup(
            dEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEntradaCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        dEntradaCarroLayout.setVerticalGroup(
            dEntradaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaCarroLayout.createSequentialGroup()
                .addComponent(jEntradaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        dEntradaMoto.setTitle("Entrada de novo veiculo");
        dEntradaMoto.setResizable(false);

        lbEntradaMoto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEntradaMoto.setText("ENTRADA DE MOTO");

        lbPlaca1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPlaca1.setText("Placa:");

        txEntradaPlacaMoto.setText("ABC-1234");

        btnEntradaCancelar1.setText("CANCELAR");
        btnEntradaCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaCancelar1ActionPerformed(evt);
            }
        });

        btnEntradaConfirmarMoto.setText("CONFIRMAR");
        btnEntradaConfirmarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaConfirmarMotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEntradaMotoLayout = new javax.swing.GroupLayout(jEntradaMoto);
        jEntradaMoto.setLayout(jEntradaMotoLayout);
        jEntradaMotoLayout.setHorizontalGroup(
            jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEntradaMotoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEntradaMotoLayout.createSequentialGroup()
                        .addGroup(jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEntradaMotoLayout.createSequentialGroup()
                                .addComponent(lbPlaca1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txEntradaPlacaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jEntradaMotoLayout.createSequentialGroup()
                                .addComponent(btnEntradaCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEntradaConfirmarMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jEntradaMotoLayout.createSequentialGroup()
                        .addGroup(jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEntradaMoto)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jEntradaMotoLayout.setVerticalGroup(
            jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEntradaMotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEntradaMoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaca1)
                    .addComponent(txEntradaPlacaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntradaConfirmarMoto)
                    .addComponent(btnEntradaCancelar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dEntradaMotoLayout = new javax.swing.GroupLayout(dEntradaMoto.getContentPane());
        dEntradaMoto.getContentPane().setLayout(dEntradaMotoLayout);
        dEntradaMotoLayout.setHorizontalGroup(
            dEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaMotoLayout.createSequentialGroup()
                .addComponent(jEntradaMoto, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        dEntradaMotoLayout.setVerticalGroup(
            dEntradaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaMotoLayout.createSequentialGroup()
                .addComponent(jEntradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        dEntradaEspecial.setTitle("Entrada de novo veiculo");
        dEntradaEspecial.setResizable(false);

        lbEntradaEspecial.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEntradaEspecial.setText("ENTRADA DE CARROS ESPECIAIS");

        lbPlaca2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPlaca2.setText("Placa:");

        txEntradaPlacaEspecial.setText("ABC-1234");

        btnEntradaCancelarEspecial.setText("CANCELAR");
        btnEntradaCancelarEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaCancelarEspecialActionPerformed(evt);
            }
        });

        btnEntradaConfirmarEspecial.setText("CONFIRMAR");
        btnEntradaConfirmarEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaConfirmarEspecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEntradaEspecialLayout = new javax.swing.GroupLayout(jEntradaEspecial);
        jEntradaEspecial.setLayout(jEntradaEspecialLayout);
        jEntradaEspecialLayout.setHorizontalGroup(
            jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEntradaEspecialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEntradaEspecialLayout.createSequentialGroup()
                        .addGroup(jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jEntradaEspecialLayout.createSequentialGroup()
                                .addComponent(lbPlaca2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txEntradaPlacaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jEntradaEspecialLayout.createSequentialGroup()
                                .addComponent(btnEntradaCancelarEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEntradaConfirmarEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jEntradaEspecialLayout.createSequentialGroup()
                        .addGroup(jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEntradaEspecial)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jEntradaEspecialLayout.setVerticalGroup(
            jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEntradaEspecialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEntradaEspecial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaca2)
                    .addComponent(txEntradaPlacaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntradaConfirmarEspecial)
                    .addComponent(btnEntradaCancelarEspecial))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dEntradaEspecialLayout = new javax.swing.GroupLayout(dEntradaEspecial.getContentPane());
        dEntradaEspecial.getContentPane().setLayout(dEntradaEspecialLayout);
        dEntradaEspecialLayout.setHorizontalGroup(
            dEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaEspecialLayout.createSequentialGroup()
                .addComponent(jEntradaEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );
        dEntradaEspecialLayout.setVerticalGroup(
            dEntradaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaEspecialLayout.createSequentialGroup()
                .addComponent(jEntradaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        dSaidaCarro.setResizable(false);

        lbSaidaCarro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSaidaCarro.setText("SAIDA DE CARRO");

        lbPlacaSaida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPlacaSaida.setText("Placa:");

        txSaidaPlacaCarro.setText("ABC-1234");

        btnSaidaCancelar.setText("CANCELAR");
        btnSaidaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaCancelarActionPerformed(evt);
            }
        });

        btnSaidaVeiculo.setText("CONFIRMAR");
        btnSaidaVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSaidaLayout = new javax.swing.GroupLayout(jSaida);
        jSaida.setLayout(jSaidaLayout);
        jSaidaLayout.setHorizontalGroup(
            jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSaidaLayout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())
                    .addGroup(jSaidaLayout.createSequentialGroup()
                        .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSaidaCarro)
                            .addGroup(jSaidaLayout.createSequentialGroup()
                                .addComponent(lbPlacaSaida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txSaidaPlacaCarro)))
                        .addGap(67, 67, 67))
                    .addGroup(jSaidaLayout.createSequentialGroup()
                        .addComponent(btnSaidaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaidaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jSaidaLayout.setVerticalGroup(
            jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaidaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbSaidaCarro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlacaSaida)
                    .addComponent(txSaidaPlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaidaCancelar)
                    .addComponent(btnSaidaVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dSaidaCarroLayout = new javax.swing.GroupLayout(dSaidaCarro.getContentPane());
        dSaidaCarro.getContentPane().setLayout(dSaidaCarroLayout);
        dSaidaCarroLayout.setHorizontalGroup(
            dSaidaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dSaidaCarroLayout.setVerticalGroup(
            dSaidaCarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        dSaidaMoto.setResizable(false);

        lbSaidaCarro1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSaidaCarro1.setText("SAIDA DE MOTO");

        lbPlacaSaida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPlacaSaida1.setText("Placa:");

        txSaidaPlacaMoto.setText("ABC-1234");
        txSaidaPlacaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSaidaPlacaMotoActionPerformed(evt);
            }
        });

        btnSaidaCancelarMoto.setText("CANCELAR");
        btnSaidaCancelarMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaCancelarMotoActionPerformed(evt);
            }
        });

        btnSaidaVeiculoMoto.setText("CONFIRMAR");
        btnSaidaVeiculoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaVeiculoMotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSaida1Layout = new javax.swing.GroupLayout(jSaida1);
        jSaida1.setLayout(jSaida1Layout);
        jSaida1Layout.setHorizontalGroup(
            jSaida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaida1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSaida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSaida1Layout.createSequentialGroup()
                        .addComponent(jSeparator9)
                        .addContainerGap())
                    .addGroup(jSaida1Layout.createSequentialGroup()
                        .addGroup(jSaida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSaidaCarro1)
                            .addGroup(jSaida1Layout.createSequentialGroup()
                                .addComponent(lbPlacaSaida1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txSaidaPlacaMoto)))
                        .addGap(67, 67, 67))
                    .addGroup(jSaida1Layout.createSequentialGroup()
                        .addComponent(btnSaidaCancelarMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaidaVeiculoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE))))
        );
        jSaida1Layout.setVerticalGroup(
            jSaida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaida1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbSaidaCarro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jSaida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlacaSaida1)
                    .addComponent(txSaidaPlacaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jSaida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaidaCancelarMoto)
                    .addComponent(btnSaidaVeiculoMoto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dSaidaMotoLayout = new javax.swing.GroupLayout(dSaidaMoto.getContentPane());
        dSaidaMoto.getContentPane().setLayout(dSaidaMotoLayout);
        dSaidaMotoLayout.setHorizontalGroup(
            dSaidaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dSaidaMotoLayout.createSequentialGroup()
                .addComponent(jSaida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        dSaidaMotoLayout.setVerticalGroup(
            dSaidaMotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dSaidaMotoLayout.createSequentialGroup()
                .addComponent(jSaida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        dSaidaEspecial.setResizable(false);

        lbSaidaCarro2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSaidaCarro2.setText("SAIDA DE CARRO ESPECIAL");

        lbPlacaSaida2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbPlacaSaida2.setText("Placa:");

        txSaidaPlacaEspecial.setText("ABC-1234");

        btnSaidaCancelarEspecial.setText("CANCELAR");
        btnSaidaCancelarEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaCancelarEspecialActionPerformed(evt);
            }
        });

        btnSaidaVeiculo2.setText("CONFIRMAR");
        btnSaidaVeiculo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaVeiculo2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSaida2Layout = new javax.swing.GroupLayout(jSaida2);
        jSaida2.setLayout(jSaida2Layout);
        jSaida2Layout.setHorizontalGroup(
            jSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaida2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSaida2Layout.createSequentialGroup()
                        .addComponent(jSeparator10)
                        .addContainerGap())
                    .addGroup(jSaida2Layout.createSequentialGroup()
                        .addGroup(jSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSaidaCarro2)
                            .addGroup(jSaida2Layout.createSequentialGroup()
                                .addComponent(lbPlacaSaida2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txSaidaPlacaEspecial)))
                        .addGap(67, 67, 67))
                    .addGroup(jSaida2Layout.createSequentialGroup()
                        .addComponent(btnSaidaCancelarEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSaidaVeiculo2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jSaida2Layout.setVerticalGroup(
            jSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaida2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbSaidaCarro2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPlacaSaida2)
                    .addComponent(txSaidaPlacaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jSaida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaidaCancelarEspecial)
                    .addComponent(btnSaidaVeiculo2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dSaidaEspecialLayout = new javax.swing.GroupLayout(dSaidaEspecial.getContentPane());
        dSaidaEspecial.getContentPane().setLayout(dSaidaEspecialLayout);
        dSaidaEspecialLayout.setHorizontalGroup(
            dSaidaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dSaidaEspecialLayout.createSequentialGroup()
                .addComponent(jSaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        dSaidaEspecialLayout.setVerticalGroup(
            dSaidaEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dSaidaEspecialLayout.createSequentialGroup()
                .addComponent(jSaida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        dMapa.setTitle("Escolha o pavimento");
        dMapa.setResizable(false);

        lbEscolherAndar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEscolherAndar.setText("ESCOLHA O ANDAR PARA VISUALIZAR O MAPA:");

        buttonGroup1.add(opPavimento1);
        opPavimento1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPavimento1.setSelected(true);
        opPavimento1.setText("1º Pavimento");
        opPavimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPavimento1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opPavimento2);
        opPavimento2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPavimento2.setText("2º Pavimento");
        opPavimento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPavimento2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opPavimento3);
        opPavimento3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPavimento3.setText("3º Pavimento");
        opPavimento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPavimento3ActionPerformed(evt);
            }
        });

        btnConfirmarPavimento.setText("CONFIRMAR");
        btnConfirmarPavimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarPavimentoActionPerformed(evt);
            }
        });

        btnCancelarPavimento.setText("CANCELAR");
        btnCancelarPavimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPavimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jMapaLayout = new javax.swing.GroupLayout(jMapa);
        jMapa.setLayout(jMapaLayout);
        jMapaLayout.setHorizontalGroup(
            jMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMapaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator5)
                    .addComponent(lbEscolherAndar)
                    .addGroup(jMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jMapaLayout.createSequentialGroup()
                            .addComponent(btnCancelarPavimento)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnConfirmarPavimento))
                        .addGroup(jMapaLayout.createSequentialGroup()
                            .addComponent(opPavimento1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(opPavimento2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(opPavimento3))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jMapaLayout.setVerticalGroup(
            jMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMapaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEscolherAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opPavimento1)
                    .addComponent(opPavimento2)
                    .addComponent(opPavimento3))
                .addGap(18, 18, 18)
                .addGroup(jMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarPavimento)
                    .addComponent(btnCancelarPavimento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dMapaLayout = new javax.swing.GroupLayout(dMapa.getContentPane());
        dMapa.getContentPane().setLayout(dMapaLayout);
        dMapaLayout.setHorizontalGroup(
            dMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dMapaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dMapaLayout.setVerticalGroup(
            dMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dMapaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dPavimento1.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dPavimento1.setTitle("Escolha o pavimento");
        dPavimento1.setResizable(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("EstácioNEY - Controle de ENTRADAS e SAIDAS de VEÍCULOS");

        jImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/icon-estacionamento-infra.png"))); // NOI18N
        jImagem2.setText("jImagem");
        jImagem2.setToolTipText("");
        jImagem2.setMaximumSize(new java.awt.Dimension(245, 300));
        jImagem2.setMinimumSize(new java.awt.Dimension(245, 10));

        btnVoltarPavimento1.setText("Voltar");
        btnVoltarPavimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPavimento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPavimento1Layout = new javax.swing.GroupLayout(jPavimento1);
        jPavimento1.setLayout(jPavimento1Layout);
        jPavimento1Layout.setHorizontalGroup(
            jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPavimento1Layout.createSequentialGroup()
                        .addGroup(jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 361, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPavimento1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVoltarPavimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPavimento1Layout.setVerticalGroup(
            jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 313, Short.MAX_VALUE)
                .addComponent(btnVoltarPavimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dPavimento1Layout = new javax.swing.GroupLayout(dPavimento1.getContentPane());
        dPavimento1.getContentPane().setLayout(dPavimento1Layout);
        dPavimento1Layout.setHorizontalGroup(
            dPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dPavimento1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPavimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dPavimento1Layout.setVerticalGroup(
            dPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dPavimento1Layout.createSequentialGroup()
                .addGap(0, 63, Short.MAX_VALUE)
                .addComponent(jPavimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        dPavimento2.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dPavimento2.setTitle("Escolha o pavimento");
        dPavimento2.setResizable(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("EstácioNEY - Controle de ENTRADAS e SAIDAS de VEÍCULOS");

        jImagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/icon-estacionamento-infra.png"))); // NOI18N
        jImagem3.setText("jImagem");
        jImagem3.setToolTipText("");
        jImagem3.setMaximumSize(new java.awt.Dimension(245, 300));
        jImagem3.setMinimumSize(new java.awt.Dimension(245, 10));

        btnVoltarPavimento2.setText("Voltar");
        btnVoltarPavimento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPavimento2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPavimento2Layout = new javax.swing.GroupLayout(jPavimento2);
        jPavimento2.setLayout(jPavimento2Layout);
        jPavimento2Layout.setHorizontalGroup(
            jPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPavimento2Layout.createSequentialGroup()
                        .addGap(0, 561, Short.MAX_VALUE)
                        .addComponent(btnVoltarPavimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPavimento2Layout.createSequentialGroup()
                        .addGroup(jPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPavimento2Layout.setVerticalGroup(
            jPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(btnVoltarPavimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dPavimento2Layout = new javax.swing.GroupLayout(dPavimento2.getContentPane());
        dPavimento2.getContentPane().setLayout(dPavimento2Layout);
        dPavimento2Layout.setHorizontalGroup(
            dPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dPavimento2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPavimento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dPavimento2Layout.setVerticalGroup(
            dPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dPavimento2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dPavimento2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPavimento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dPavimento3.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dPavimento3.setTitle("Escolha o pavimento");
        dPavimento3.setResizable(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("EstácioNEY - Controle de ENTRADAS e SAIDAS de VEÍCULOS");

        jImagem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/icon-estacionamento-infra.png"))); // NOI18N
        jImagem4.setText("jImagem");
        jImagem4.setToolTipText("");
        jImagem4.setMaximumSize(new java.awt.Dimension(245, 300));
        jImagem4.setMinimumSize(new java.awt.Dimension(245, 10));

        btnVoltarPavimento3.setText("Voltar");
        btnVoltarPavimento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPavimento3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPavimento3Layout = new javax.swing.GroupLayout(jPavimento3);
        jPavimento3.setLayout(jPavimento3Layout);
        jPavimento3Layout.setHorizontalGroup(
            jPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPavimento3Layout.createSequentialGroup()
                        .addGap(0, 561, Short.MAX_VALUE)
                        .addComponent(btnVoltarPavimento3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPavimento3Layout.createSequentialGroup()
                        .addGroup(jPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPavimento3Layout.setVerticalGroup(
            jPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(btnVoltarPavimento3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dPavimento3Layout = new javax.swing.GroupLayout(dPavimento3.getContentPane());
        dPavimento3.getContentPane().setLayout(dPavimento3Layout);
        dPavimento3Layout.setHorizontalGroup(
            dPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dPavimento3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPavimento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dPavimento3Layout.setVerticalGroup(
            dPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dPavimento3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dPavimento3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPavimento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto EstacioNEY - v0.001");
        setUndecorated(true);
        setResizable(false);

        jInternalFrame1.setVisible(true);

        btnMapa.setText("ABRIR MAPA");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EstácioNEY - Controle de ENTRADAS e SAIDAS de VEÍCULOS");

        jImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/icon-estacionamento-infra.png"))); // NOI18N
        jImagem.setText("jImagem");
        jImagem.setToolTipText("");
        jImagem.setMaximumSize(new java.awt.Dimension(245, 300));
        jImagem.setMinimumSize(new java.awt.Dimension(245, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Carros estacionados:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Motos estacionadas:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Vagas especiais disponíveis:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Vagas disponíveis:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("0");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("0");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("129");

        btnEntradaCarro.setText("CARRO");
        btnEntradaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaCarroActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Realizar Entrada:");

        btnSaidaCarro.setText("CARRO");
        btnSaidaCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaCarroActionPerformed(evt);
            }
        });

        btnSair.setText("Encerrar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEntradaEspecial.setText("VAGA ESPECIAL");
        btnEntradaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaEspecialActionPerformed(evt);
            }
        });

        btnEntradaMoto.setText("MOTO");
        btnEntradaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaMotoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Realizar Saida:");

        btnSaidaEspecial.setText("VAGA ESPECIAL");
        btnSaidaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaEspecialActionPerformed(evt);
            }
        });

        btnSaidaMoto.setText("MOTO");
        btnSaidaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaMotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInicialLayout = new javax.swing.GroupLayout(jInicial);
        jInicial.setLayout(jInicialLayout);
        jInicialLayout.setHorizontalGroup(
            jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicialLayout.createSequentialGroup()
                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInicialLayout.createSequentialGroup()
                        .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInicialLayout.createSequentialGroup()
                                .addGap(261, 261, 261)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInicialLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(0, 105, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicialLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicialLayout.createSequentialGroup()
                                .addComponent(jImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicialLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jInicialLayout.createSequentialGroup()
                                        .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jInicialLayout.createSequentialGroup()
                                                .addComponent(btnSaidaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSaidaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jInicialLayout.createSequentialGroup()
                                                .addComponent(btnEntradaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnEntradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(25, 25, 25)
                                        .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnEntradaEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSaidaEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel14))))))
                .addContainerGap())
            .addGroup(jInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInicialLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1)
                        .addGroup(jInicialLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel2)
                            .addGap(0, 426, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jInicialLayout.setVerticalGroup(
            jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInicialLayout.createSequentialGroup()
                        .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEntradaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntradaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEntradaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSaidaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaidaMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSaidaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicialLayout.createSequentialGroup()
                        .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190)))
                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addContainerGap())
            .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInicialLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                    .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)
                        .addComponent(jLabel2))
                    .addContainerGap()))
        );

        jImagem.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        if ((QtdVagaMoto == 0) && (QtdVagaCarro == 0) && (QtdVagaEspecial) == 0) {
            JOptionPane.showMessageDialog(null, "É necessário ao menos um veículo estacionado para inicializar o mapa.");
        } else {
            dMapa.setLocationRelativeTo(null);
            dMapa.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(400, 200);
            dMapa.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnSaidaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaCarroActionPerformed
        if (QtdVagaCarro == 0) {
            JOptionPane.showMessageDialog(null, "Para realizar a saida é preciso estar estacionado ao menos um carro.");
        } else {
            dSaidaCarro.setLocationRelativeTo(null);
            dSaidaCarro.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(350, 200);
            dSaidaCarro.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnSaidaCarroActionPerformed

    private void btnEntradaCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaCarroActionPerformed

        if (QtdVagaCarro >= 90) {
            JOptionPane.showMessageDialog(null, "Estacionamento Lotado, não é possível estacionar um novo carro.");
        } else {
            dEntradaCarro.setLocationRelativeTo(null);
            dEntradaCarro.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(350, 200);
            dEntradaCarro.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnEntradaCarroActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if ((QtdVagaMoto > 0) || (QtdVagaCarro > 0) || (QtdVagaEspecial) > 0) {
            JOptionPane.showMessageDialog(null, "Dados apagados da memória.");
        }
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntradaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaCancelarActionPerformed
        dEntradaCarro.setVisible(false);
    }//GEN-LAST:event_btnEntradaCancelarActionPerformed

    private void btnCancelarPavimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPavimentoActionPerformed
        dMapa.setVisible(false);
    }//GEN-LAST:event_btnCancelarPavimentoActionPerformed

    private void btnSaidaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaCancelarActionPerformed
        dSaidaCarro.setVisible(false);
    }//GEN-LAST:event_btnSaidaCancelarActionPerformed

    private void btnEntradaConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaConfirmarActionPerformed
        String placa = txEntradaPlacaCarro.getText();
        vagaCarro.add(placa);
        JOptionPane.showMessageDialog(null, "Vaga de carro reservada com sucesso!");
        QtdVagaCarro++;
        dEntradaCarro.setVisible(false);
        txEntradaPlacaCarro.setText(null);
    }//GEN-LAST:event_btnEntradaConfirmarActionPerformed

    private void btnEntradaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaEspecialActionPerformed
        if (QtdVagaEspecial >= 9) {
            JOptionPane.showMessageDialog(null, "Estacionamento Lotado, não é possível estacionar um novo veiculo especial");
        } else {
            dEntradaEspecial.setLocationRelativeTo(null);
            dEntradaEspecial.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(350, 200);
            dEntradaEspecial.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnEntradaEspecialActionPerformed

    private void btnEntradaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaMotoActionPerformed
        if (QtdVagaMoto >= 30) {
            JOptionPane.showMessageDialog(null, "Estacionamento Lotado, não é possível estacionar uma nova moto");
        } else {
            dEntradaMoto.setLocationRelativeTo(null);
            dEntradaMoto.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(350, 200);
            dEntradaMoto.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnEntradaMotoActionPerformed

    private void btnSaidaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaEspecialActionPerformed
        if (QtdVagaEspecial == 0) {
            JOptionPane.showMessageDialog(null, "Para realizar a saida é preciso estar estacionado ao menos um carro especial.");
        } else {
            dSaidaEspecial.setLocationRelativeTo(null);
            dSaidaEspecial.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(350, 200);
            dSaidaEspecial.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnSaidaEspecialActionPerformed

    private void btnSaidaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaMotoActionPerformed
        if (QtdVagaMoto == 0) {
            JOptionPane.showMessageDialog(null, "Para realizar a saida é preciso estar estacionado ao menos uma Moto.");
        } else {
            dSaidaMoto.setLocationRelativeTo(null);
            dSaidaMoto.setVisible(true);
            Dimension d = new Dimension();
            d.setSize(350, 200);
            dSaidaMoto.setMinimumSize(d);
        }
    }//GEN-LAST:event_btnSaidaMotoActionPerformed

    private void btnEntradaCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaCancelar1ActionPerformed
        dEntradaMoto.setVisible(false);
    }//GEN-LAST:event_btnEntradaCancelar1ActionPerformed

    private void btnEntradaConfirmarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaConfirmarMotoActionPerformed
        String placa = txEntradaPlacaMoto.getText();
        vagaMoto.add(placa);
        JOptionPane.showMessageDialog(null, "Vaga de moto reservada com sucesso!");
        QtdVagaMoto++;
        dEntradaMoto.setVisible(false);
        txEntradaPlacaMoto.setText(null);
    }//GEN-LAST:event_btnEntradaConfirmarMotoActionPerformed

    private void btnEntradaCancelarEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaCancelarEspecialActionPerformed
        dEntradaEspecial.setVisible(false);
    }//GEN-LAST:event_btnEntradaCancelarEspecialActionPerformed

    private void btnEntradaConfirmarEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaConfirmarEspecialActionPerformed
        String placa = txEntradaPlacaEspecial.getText();
        vagaEspecial.add(placa);
        JOptionPane.showMessageDialog(null, "Vaga especial reservada com sucesso!");
        QtdVagaEspecial++;
        dEntradaEspecial.setVisible(false);
        txEntradaPlacaEspecial.setText(null);
    }//GEN-LAST:event_btnEntradaConfirmarEspecialActionPerformed

    private void btnSaidaCancelarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaCancelarMotoActionPerformed
        dSaidaMoto.setVisible(false);
    }//GEN-LAST:event_btnSaidaCancelarMotoActionPerformed

    private void btnSaidaCancelarEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaCancelarEspecialActionPerformed
        dSaidaEspecial.setVisible(false);
    }//GEN-LAST:event_btnSaidaCancelarEspecialActionPerformed

    private void btnSaidaVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaVeiculoActionPerformed
        String placa = txSaidaPlacaCarro.getText();
        boolean remover = false;
        for (String busca : vagaCarro) {
            if (busca.matches(placa)) {
                remover = true;
            }
        }
        if (remover == true) {
            JOptionPane.showMessageDialog(null, "Saida realizada com sucesso do veículo placa " + placa);
            vagaCarro.remove(placa);
            QtdVagaCarro--;
            txSaidaPlacaCarro.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Não encontramos o carro da placa " + placa + " estacionado!");
        }
        if (QtdVagaCarro == 0) {
            dSaidaCarro.setVisible(false);
        }
    }//GEN-LAST:event_btnSaidaVeiculoActionPerformed

    private void txSaidaPlacaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSaidaPlacaMotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSaidaPlacaMotoActionPerformed

    private void btnSaidaVeiculoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaVeiculoMotoActionPerformed
        String placa = txSaidaPlacaMoto.getText();
        boolean remover = false;
        for (String busca : vagaMoto) {
            if (busca.matches(placa)) {
                remover = true;
            }
        }
        if (remover == true) {
            JOptionPane.showMessageDialog(null, "Saida realizada com sucesso da moto placa " + placa);
            vagaMoto.remove(placa);
            QtdVagaMoto--;
            txSaidaPlacaMoto.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Não encontramos a moto da placa " + placa + " estacionado!");
        }
        if (QtdVagaMoto == 0) {
            dSaidaMoto.setVisible(false);
        }
    }//GEN-LAST:event_btnSaidaVeiculoMotoActionPerformed

    private void btnSaidaVeiculo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaVeiculo2ActionPerformed
        String placa = txSaidaPlacaEspecial.getText();
        boolean remover = false;
        for (String busca : vagaEspecial) {
            if (busca.matches(placa)) {
                remover = true;
            }
        }
        if (remover == true) {
            JOptionPane.showMessageDialog(null, "Saida realizada com sucesso do veículo especial placa " + placa);
            vagaEspecial.remove(placa);
            QtdVagaEspecial--;
            txSaidaPlacaEspecial.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "Não encontramos o carro especial da placa " + placa + " estacionado!");
        }
        if (QtdVagaEspecial == 0) {
            dSaidaEspecial.setVisible(false);
        }
    }//GEN-LAST:event_btnSaidaVeiculo2ActionPerformed

    private void opPavimento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPavimento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opPavimento3ActionPerformed

    private void opPavimento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPavimento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opPavimento2ActionPerformed

    private void opPavimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPavimento1ActionPerformed

    }//GEN-LAST:event_opPavimento1ActionPerformed

    private void btnVoltarPavimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPavimento1ActionPerformed
        dPavimento1.setVisible(false);
    }//GEN-LAST:event_btnVoltarPavimento1ActionPerformed

    private void btnConfirmarPavimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarPavimentoActionPerformed
       if(opPavimento1.isSelected()){
        dMapa.setVisible(false);
        dPavimento1.setLocationRelativeTo(null);
        dPavimento1.setVisible(true);
        Dimension d = new Dimension();
        d.setSize(800, 600);
        dPavimento1.setMinimumSize(d);
       }
       if(opPavimento2.isSelected()){
        dMapa.setVisible(false);
        dPavimento1.setLocationRelativeTo(null);
        dPavimento1.setVisible(true);
        Dimension d = new Dimension();
        d.setSize(800, 600);
        dPavimento1.setMinimumSize(d);
       }
       if(opPavimento3.isSelected()){
        dMapa.setVisible(false);
        dPavimento1.setLocationRelativeTo(null);
        dPavimento1.setVisible(true);
        Dimension d = new Dimension();
        d.setSize(800, 600);
        dPavimento1.setMinimumSize(d);
       }
    }//GEN-LAST:event_btnConfirmarPavimentoActionPerformed

    private void btnVoltarPavimento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPavimento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarPavimento2ActionPerformed

    private void btnVoltarPavimento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPavimento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarPavimento3ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Estilo das Janelas - Windowns">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new painel().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPavimento;
    private javax.swing.JButton btnConfirmarPavimento;
    private javax.swing.JButton btnEntradaCancelar;
    private javax.swing.JButton btnEntradaCancelar1;
    private javax.swing.JButton btnEntradaCancelarEspecial;
    private javax.swing.JButton btnEntradaCarro;
    private javax.swing.JButton btnEntradaConfirmar;
    private javax.swing.JButton btnEntradaConfirmarEspecial;
    private javax.swing.JButton btnEntradaConfirmarMoto;
    private javax.swing.JButton btnEntradaEspecial;
    private javax.swing.JButton btnEntradaMoto;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnSaidaCancelar;
    private javax.swing.JButton btnSaidaCancelarEspecial;
    private javax.swing.JButton btnSaidaCancelarMoto;
    private javax.swing.JButton btnSaidaCarro;
    private javax.swing.JButton btnSaidaEspecial;
    private javax.swing.JButton btnSaidaMoto;
    private javax.swing.JButton btnSaidaVeiculo;
    private javax.swing.JButton btnSaidaVeiculo2;
    private javax.swing.JButton btnSaidaVeiculoMoto;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltarPavimento1;
    private javax.swing.JButton btnVoltarPavimento2;
    private javax.swing.JButton btnVoltarPavimento3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dEntradaCarro;
    private javax.swing.JDialog dEntradaEspecial;
    private javax.swing.JDialog dEntradaMoto;
    private javax.swing.JDialog dMapa;
    private javax.swing.JDialog dPavimento1;
    private javax.swing.JDialog dPavimento2;
    private javax.swing.JDialog dPavimento3;
    private javax.swing.JDialog dSaidaCarro;
    private javax.swing.JDialog dSaidaEspecial;
    private javax.swing.JDialog dSaidaMoto;
    private javax.swing.JPanel jEntradaCarro;
    private javax.swing.JPanel jEntradaEspecial;
    private javax.swing.JPanel jEntradaMoto;
    private javax.swing.JLabel jImagem;
    private javax.swing.JLabel jImagem2;
    private javax.swing.JLabel jImagem3;
    private javax.swing.JLabel jImagem4;
    private javax.swing.JPanel jInicial;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jMapa;
    private javax.swing.JPanel jPavimento1;
    private javax.swing.JPanel jPavimento2;
    private javax.swing.JPanel jPavimento3;
    private javax.swing.JPanel jSaida;
    private javax.swing.JPanel jSaida1;
    private javax.swing.JPanel jSaida2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbEntradaCarro;
    private javax.swing.JLabel lbEntradaEspecial;
    private javax.swing.JLabel lbEntradaMoto;
    private javax.swing.JLabel lbEscolherAndar;
    private javax.swing.JLabel lbPlaca1;
    private javax.swing.JLabel lbPlaca2;
    private javax.swing.JLabel lbPlacaCarro;
    private javax.swing.JLabel lbPlacaSaida;
    private javax.swing.JLabel lbPlacaSaida1;
    private javax.swing.JLabel lbPlacaSaida2;
    private javax.swing.JLabel lbSaidaCarro;
    private javax.swing.JLabel lbSaidaCarro1;
    private javax.swing.JLabel lbSaidaCarro2;
    private javax.swing.JRadioButton opPavimento1;
    private javax.swing.JRadioButton opPavimento2;
    private javax.swing.JRadioButton opPavimento3;
    private javax.swing.JTextField txEntradaPlacaCarro;
    private javax.swing.JTextField txEntradaPlacaEspecial;
    private javax.swing.JTextField txEntradaPlacaMoto;
    private javax.swing.JTextField txSaidaPlacaCarro;
    private javax.swing.JTextField txSaidaPlacaEspecial;
    private javax.swing.JTextField txSaidaPlacaMoto;
    // End of variables declaration//GEN-END:variables
}
