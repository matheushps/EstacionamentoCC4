package estacionamento;

import java.awt.Dimension;

public class painel extends javax.swing.JFrame {

    String vagasEstacionamentoCarro[][] = new String[90][2];
    String vagasEstacionamentoMoto[][] = new String[30][2];
    String vagasEstacionamentoEspecial[][] = new String[9][2];

    public painel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPavimento1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jImagem2 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        dEntrada = new javax.swing.JDialog();
        jEntrada = new javax.swing.JPanel();
        lbEntradaVeiculo = new javax.swing.JLabel();
        opCarro = new javax.swing.JRadioButton();
        opMoto = new javax.swing.JRadioButton();
        opEspecial = new javax.swing.JRadioButton();
        lbTipo = new javax.swing.JLabel();
        lbPlaca = new javax.swing.JLabel();
        txEntradaPlaca = new javax.swing.JTextField();
        btnEntradaCancelar = new javax.swing.JButton();
        btnEntradaConformar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        dSaida = new javax.swing.JDialog();
        jSaida = new javax.swing.JPanel();
        lbSaidaVeiculo = new javax.swing.JLabel();
        lbPlacaSaida = new javax.swing.JLabel();
        txSaidaPlaca = new javax.swing.JTextField();
        btnSaidaCancelar = new javax.swing.JButton();
        btnSaidaVeiculo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        dMapa = new javax.swing.JDialog();
        jMapa = new javax.swing.JPanel();
        lbEscolherAndar = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        opPavimento1 = new javax.swing.JRadioButton();
        opPavimento2 = new javax.swing.JRadioButton();
        opPavimento3 = new javax.swing.JRadioButton();
        btnConfirmarPavimento = new javax.swing.JButton();
        btnCancelarPavimento = new javax.swing.JButton();
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
        btnEntrada = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnSaida = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("EstácioNEY - Controle a entrada e saida de veículos em seu estacionamento");

        jImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/icon-estacionamento-infra.png"))); // NOI18N
        jImagem2.setText("jImagem");
        jImagem2.setToolTipText("");
        jImagem2.setMaximumSize(new java.awt.Dimension(245, 300));
        jImagem2.setMinimumSize(new java.awt.Dimension(245, 10));

        jButton18.setText("Voltar");

        javax.swing.GroupLayout jPavimento1Layout = new javax.swing.GroupLayout(jPavimento1);
        jPavimento1.setLayout(jPavimento1Layout);
        jPavimento1Layout.setHorizontalGroup(
            jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento1Layout.createSequentialGroup()
                .addContainerGap(571, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPavimento1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPavimento1Layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(jImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPavimento1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addComponent(jLabel29))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        jPavimento1Layout.setVerticalGroup(
            jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPavimento1Layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPavimento1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPavimento1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        dEntrada.setTitle("Entrada de novo veiculo");
        dEntrada.setResizable(false);

        lbEntradaVeiculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEntradaVeiculo.setText("ENTRADA DE VEÍCULO");

        opCarro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opCarro.setText("Carro");

        opMoto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opMoto.setText("Moto");

        opEspecial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opEspecial.setText("Especial");

        lbTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTipo.setText("Tipo:");

        lbPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPlaca.setText("Placa:");

        txEntradaPlaca.setText("ABC-1234");

        btnEntradaCancelar.setText("CANCELAR");
        btnEntradaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaCancelarActionPerformed(evt);
            }
        });

        btnEntradaConformar.setText("CONFIRMAR");

        javax.swing.GroupLayout jEntradaLayout = new javax.swing.GroupLayout(jEntrada);
        jEntrada.setLayout(jEntradaLayout);
        jEntradaLayout.setHorizontalGroup(
            jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEntradaLayout.createSequentialGroup()
                        .addComponent(lbTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opEspecial)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jEntradaLayout.createSequentialGroup()
                        .addGroup(jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEntradaLayout.createSequentialGroup()
                                .addComponent(btnEntradaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEntradaConformar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEntradaVeiculo)
                            .addGroup(jEntradaLayout.createSequentialGroup()
                                .addComponent(lbPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txEntradaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        jEntradaLayout.setVerticalGroup(
            jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEntradaVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipo)
                    .addComponent(opCarro)
                    .addComponent(opMoto)
                    .addComponent(opEspecial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaca)
                    .addComponent(txEntradaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntradaCancelar)
                    .addComponent(btnEntradaConformar))
                .addContainerGap())
        );

        javax.swing.GroupLayout dEntradaLayout = new javax.swing.GroupLayout(dEntrada.getContentPane());
        dEntrada.getContentPane().setLayout(dEntradaLayout);
        dEntradaLayout.setHorizontalGroup(
            dEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dEntradaLayout.setVerticalGroup(
            dEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dSaida.setResizable(false);

        lbSaidaVeiculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbSaidaVeiculo.setText("SAIDA DE VEÍCULO");

        lbPlacaSaida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPlacaSaida.setText("Informe a placa:");

        txSaidaPlaca.setText("ABC-1234");

        btnSaidaCancelar.setText("CANCELAR");
        btnSaidaCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaCancelarActionPerformed(evt);
            }
        });

        btnSaidaVeiculo.setText("CONFIRMAR");

        javax.swing.GroupLayout jSaidaLayout = new javax.swing.GroupLayout(jSaida);
        jSaida.setLayout(jSaidaLayout);
        jSaidaLayout.setHorizontalGroup(
            jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSaidaLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSaidaLayout.createSequentialGroup()
                                .addComponent(lbSaidaVeiculo)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSaidaLayout.createSequentialGroup()
                                .addComponent(btnSaidaCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSaidaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jSaidaLayout.createSequentialGroup()
                        .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(jSaidaLayout.createSequentialGroup()
                                .addComponent(lbPlacaSaida)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txSaidaPlaca)))
                        .addContainerGap())))
        );
        jSaidaLayout.setVerticalGroup(
            jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSaidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbSaidaVeiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlacaSaida)
                    .addComponent(txSaidaPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaidaVeiculo)
                    .addComponent(btnSaidaCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dSaidaLayout = new javax.swing.GroupLayout(dSaida.getContentPane());
        dSaida.getContentPane().setLayout(dSaidaLayout);
        dSaidaLayout.setHorizontalGroup(
            dSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dSaidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        dSaidaLayout.setVerticalGroup(
            dSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(dSaidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(dSaidaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dMapa.setResizable(false);

        lbEscolherAndar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEscolherAndar.setText("ESCOLHA O ANDAR PARA VISUALIZAR O MAPA:");

        opPavimento1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPavimento1.setText("1º Pavimento");

        opPavimento2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPavimento2.setText("2º Pavimento");
        opPavimento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPavimento2ActionPerformed(evt);
            }
        });

        opPavimento3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPavimento3.setText("3º Pavimento");
        opPavimento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPavimento3ActionPerformed(evt);
            }
        });

        btnConfirmarPavimento.setText("CONFIRMAR");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto EstacioNEY - v0.001");
        setUndecorated(true);
        setResizable(false);

        btnMapa.setText("ABRIR MAPA");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("EstácioNEY - Controle a entrada e saida de veículos em seu estacionamento");

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
        jLabel12.setText("90");

        btnEntrada.setText("REALIZAR ENTRADA");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Ações:");

        btnSaida.setText("REALIZAR SAIDA");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInicialLayout = new javax.swing.GroupLayout(jInicial);
        jInicial.setLayout(jInicialLayout);
        jInicialLayout.setHorizontalGroup(
            jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMapa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jInicialLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInicialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInicialLayout.createSequentialGroup()
                            .addGap(16, 16, Short.MAX_VALUE)
                            .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jInicialLayout.createSequentialGroup()
                            .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jInicialLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2))
                                .addGroup(jInicialLayout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(jImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jInicialLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel1))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 60, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jInicialLayout.setVerticalGroup(
            jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInicialLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addComponent(btnMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addContainerGap())
            .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jInicialLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel13)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                    .addGroup(jInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12)
                        .addComponent(jLabel2))
                    .addContainerGap()))
        );

        jImagem.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        dMapa.setVisible(true);
        Dimension d = new Dimension();
        d.setSize(400, 200);
        dMapa.setMinimumSize(d);
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed
        dSaida.setVisible(true);
        Dimension d = new Dimension();
        d.setSize(350, 200);
        dSaida.setMinimumSize(d);
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        dEntrada.setVisible(true);
        Dimension d = new Dimension();
        d.setSize(350, 200);
        dEntrada.setMinimumSize(d);
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void opPavimento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPavimento3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opPavimento3ActionPerformed

    private void opPavimento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPavimento2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opPavimento2ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntradaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaCancelarActionPerformed
       dEntrada.setVisible(false);
    }//GEN-LAST:event_btnEntradaCancelarActionPerformed

    private void btnCancelarPavimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPavimentoActionPerformed
        dMapa.setVisible(false);
    }//GEN-LAST:event_btnCancelarPavimentoActionPerformed

    private void btnSaidaCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaCancelarActionPerformed
        dSaida.setVisible(false);
    }//GEN-LAST:event_btnSaidaCancelarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPavimento;
    private javax.swing.JButton btnConfirmarPavimento;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnEntradaCancelar;
    private javax.swing.JButton btnEntradaConformar;
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnSaidaCancelar;
    private javax.swing.JButton btnSaidaVeiculo;
    private javax.swing.JButton btnSair;
    private javax.swing.JDialog dEntrada;
    private javax.swing.JDialog dMapa;
    private javax.swing.JDialog dSaida;
    private javax.swing.JButton jButton18;
    private javax.swing.JPanel jEntrada;
    private javax.swing.JLabel jImagem;
    private javax.swing.JLabel jImagem2;
    private javax.swing.JPanel jInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jMapa;
    private javax.swing.JPanel jPavimento1;
    private javax.swing.JPanel jSaida;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lbEntradaVeiculo;
    private javax.swing.JLabel lbEscolherAndar;
    private javax.swing.JLabel lbPlaca;
    private javax.swing.JLabel lbPlacaSaida;
    private javax.swing.JLabel lbSaidaVeiculo;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JRadioButton opCarro;
    private javax.swing.JRadioButton opEspecial;
    private javax.swing.JRadioButton opMoto;
    private javax.swing.JRadioButton opPavimento1;
    private javax.swing.JRadioButton opPavimento2;
    private javax.swing.JRadioButton opPavimento3;
    private javax.swing.JTextField txEntradaPlaca;
    private javax.swing.JTextField txSaidaPlaca;
    // End of variables declaration//GEN-END:variables
}
