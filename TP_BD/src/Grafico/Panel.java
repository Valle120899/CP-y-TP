/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafico;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author rodri
 */
public class Panel extends javax.swing.JFrame {

    //El contador se ocupara como medida general para mover/rotar/trasladar el cuadrado
    int Escalado = 0, Rotacion=0, Traslacion=0, UpAndDown=0, contador =15;
    int X=200,Y=130;
    int Size = 100;
    int Grados=72;
    
    int L1X1,L1X2,L1Y1,L1Y2; //Linea 1
    int L2X1,L2X2,L2Y1,L2Y2; //Linea 2
    int L3X1,L3X2,L3Y1,L3Y2; //Linea 3
    int L4X1,L4X2,L4Y1,L4Y2; //Linea 4
    
    public Panel() {
        initComponents();
        Panel1.setBackground(Color.white);
        
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        btnEscIzq = new javax.swing.JButton();
        btnRotIzq = new javax.swing.JButton();
        btnTrasIzq = new javax.swing.JButton();
        btnTrasDer = new javax.swing.JButton();
        btnEscDer = new javax.swing.JButton();
        btnRotDer = new javax.swing.JButton();
        lblEsc = new javax.swing.JLabel();
        lblTras = new javax.swing.JLabel();
        lblRot = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnEscDown = new javax.swing.JButton();
        btnEscUp = new javax.swing.JButton();
        lblY = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnEscIzq.setText("-");
        btnEscIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscIzqActionPerformed(evt);
            }
        });

        btnRotIzq.setText("-");
        btnRotIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotIzqActionPerformed(evt);
            }
        });

        btnTrasIzq.setText("-");
        btnTrasIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasIzqActionPerformed(evt);
            }
        });

        btnTrasDer.setText("+");
        btnTrasDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasDerActionPerformed(evt);
            }
        });

        btnEscDer.setText("+");
        btnEscDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscDerActionPerformed(evt);
            }
        });

        btnRotDer.setText("+");
        btnRotDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRotDerActionPerformed(evt);
            }
        });

        lblEsc.setText("0");

        lblTras.setText("0");

        lblRot.setText("0");

        jLabel1.setText("Escalado");

        jLabel2.setText("Traslación");

        jLabel3.setText("Rotación");

        btnCreate.setText("Crear/Reiniciar");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnEscDown.setText("Down");
        btnEscDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscDownActionPerformed(evt);
            }
        });

        btnEscUp.setText("Up");
        btnEscUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscUpActionPerformed(evt);
            }
        });

        lblY.setText("0");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(btnTrasIzq)
                                .addGap(18, 18, 18)
                                .addComponent(lblTras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(btnEscIzq)
                                .addGap(18, 18, 18)
                                .addComponent(lblEsc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(btnEscDown)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                            .addComponent(btnEscDer)
                            .addGap(41, 41, 41))
                        .addGroup(Panel2Layout.createSequentialGroup()
                            .addComponent(btnTrasDer)
                            .addContainerGap()))
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRotDer)
                        .addComponent(btnEscUp))))
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRotIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblRot, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnCreate)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEscIzq)
                    .addComponent(btnEscDer)
                    .addComponent(lblEsc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTrasIzq)
                    .addComponent(btnTrasDer)
                    .addComponent(lblTras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEscUp)
                    .addComponent(btnEscDown)
                    .addComponent(lblY))
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRotIzq)
                    .addComponent(lblRot)
                    .addComponent(btnRotDer))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscIzqActionPerformed
        //Para cambiar el label del escalado
        Escalado --;
        String Number = String.valueOf(Escalado);
        lblEsc.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 500, 500);
        
        L1Y1+=20;L1Y2+=20;L1X2-=20;
        L2Y1+=20;
        L3X2-=20;
        L4X1-=20;L4Y1+=20;L4X2-=20;
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
       
        
    }//GEN-LAST:event_btnEscIzqActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
            Graphics pen = Panel1.getGraphics();
            Graphics pencil = Panel1.getGraphics();
            //Se pone el color respectivo
            Graphics pen2 = Panel1.getGraphics();
            Graphics pen3 = Panel1.getGraphics();
            Graphics pen4 = Panel1.getGraphics();
            pencil.setColor(Color.WHITE);
            
            //Con esto se pinta el panel principal
            pencil.fillRect(0, 0, 500, 500);
            
            L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
            L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
            L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
            L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4
            
            //Con esto se crea el cuadrado en las cordenadas (200,130) para que se encuentre centrado
            pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
            pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
            pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
            pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha

            Escalado=0;
            Rotacion=0;
            Traslacion=0;
            UpAndDown=0;
            
            lblTras.setText(String.valueOf(Traslacion));
            lblEsc.setText(String.valueOf(Rotacion));
            lblRot.setText(String.valueOf(Escalado));
            lblY.setText(String.valueOf(UpAndDown));
            
           
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnTrasIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasIzqActionPerformed
        //Para cambiar el label del Traslacion
        Traslacion --;
        String Number = String.valueOf(Traslacion);
        lblTras.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 500, 500);
            
        //Con esto se mueve el cuadrado a la izq
        L1X1-=20;L1X2-=20;
        L2X1-=20;L2X2-=20;
        L3X1-=20;L3X2-=20;
        L4X1-=20;L4X2-=20;
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha

    }//GEN-LAST:event_btnTrasIzqActionPerformed

    private void btnTrasDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasDerActionPerformed
        //Para cambiar el label del Traslacion
        Traslacion ++;
        String Number = String.valueOf(Traslacion);
        lblTras.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 600, 600);
            
        //Con esto se mueve el cuadrado a la Derecha,
        //Con esto se mueve el cuadrado a la izq,
        
        //Con esto se mueve el cuadrado a la izq
        L1X1+=20;L1X2+=20;
        L2X1+=20;L2X2+=20;
        L3X1+=20;L3X2+=20;
        L4X1+=20;L4X2+=20;
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
    }//GEN-LAST:event_btnTrasDerActionPerformed

    private void btnEscDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscDerActionPerformed
        //Para cambiar el label del escalado
        Escalado ++;
        String Number = String.valueOf(Escalado);
        lblEsc.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 500, 500);
        
        L1Y1-=20;L1Y2-=20;L1X2+=20;
        L2Y1-=20;
        L3X2+=20;
        L4X1+=20;L4Y1-=20;L4X2+=20;
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
    }//GEN-LAST:event_btnEscDerActionPerformed

    private void btnEscDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscDownActionPerformed
        //Para cambiar el label del Traslacion
        UpAndDown --;
        String Number = String.valueOf(UpAndDown);
        lblY.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 500, 500);
            
        //Con esto se mueve el cuadrado hacia abajo,
        
        L1Y1+=20;L1Y2+=20;
        L2Y1+=20;L2Y2+=20;
        L3Y1+=20;L3Y2+=20;
        L4Y1+=20;L4Y2+=20;
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
    }//GEN-LAST:event_btnEscDownActionPerformed

    private void btnEscUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscUpActionPerformed
        //Para cambiar el label del Traslacion
        UpAndDown ++;
        String Number = String.valueOf(UpAndDown);
        lblY.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
        pencil.fillRect(0, 0, 500, 500);
           
            //Con esto se pinta el panel principal
        L1Y1-=20;L1Y2-=20;
        L2Y1-=20;L2Y2-=20;
        L3Y1-=20;L3Y2-=20;
        L4Y1-=20;L4Y2-=20;
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
    }//GEN-LAST:event_btnEscUpActionPerformed

    private void btnRotIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotIzqActionPerformed
        //Para cambiar el label del Rotacion
        Rotacion --;
        String Number = String.valueOf(Rotacion);
        lblRot.setText(Number);
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 500, 500);
        
        //Con esto se hace la rotacion a la izq
        switch(Rotacion){
            case 0:
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4    
                break;
            case -1: 
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4
                
                L1X1+=5;L1X2+=20;L1Y1-=15;L1Y2-=20; //Linea 1
                L2X2-=5;L2Y1-=15;L2Y2-=15; //Linea 2
                L3X2+=15;L3Y1-=15;L3Y2-=20; //Linea 3
                L4X1+=20;L4X2+=15;L4Y1-=15;L4Y2-=15; //Linea 4
                break;
            case -2: 
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4
                
                L1X1+=10;L1X2-=15;L1Y1-=30;L1Y2+=30; //Linea 1
                L2X1+=10;L2X2-=65;L2Y1-=30;L2Y2-=70; //Linea 2
                L3X1+=10;L3X2-=165;L3Y1+=0;L3Y2-=75; //Linea 3
                L4X1-=15;L4X2-=90;L4Y1+=30;L4Y2+=0; //Linea 4
                break;
            case -3:  
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4
                
                L1X1+=5;L1X2+=20;L1Y1-=20;L1Y2-=15; //Linea 1
                L2X2-=5;L2Y1-=20;L2Y2-=20; //Linea 2
                L3X2+=15;L3Y1-=20;L3Y2-=15; //Linea 3
                L4X1+=20;L4X2+=15;L4Y1-=15;L4Y2-=15; //Linea 4
                break;
            default:
                Rotacion=0;
                Number = String.valueOf(Rotacion);
                lblRot.setText(Number);
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4  
                break;
            
        }    
        
        System.out.println(L1X1);
        System.out.println(L1X2);
        System.out.println(L2X1);
        System.out.println(L2X2);
        System.out.println(L3X1);
        System.out.println(L3X2);
        System.out.println(L4X1);
        System.out.println(L4X2);
        System.out.println(L1Y1);
        System.out.println(L1Y2);
        System.out.println(L2Y1);
        System.out.println(L2Y2);
        System.out.println(L3Y1);
        System.out.println(L3Y1);
        System.out.println(L4Y1);
        System.out.println(L4Y2);
        
        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
        
            

    }//GEN-LAST:event_btnRotIzqActionPerformed

    private void btnRotDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRotDerActionPerformed
        Rotacion ++;
        String Number = String.valueOf(Rotacion);
        lblRot.setText(Number);        
//Para cambiar el label del Rotacion
        if(Rotacion<0){
            Rotacion=0;
            Number = String.valueOf(Rotacion);
            lblRot.setText(Number);
            L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
            L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
            L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
            L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4  
        }
        
        Graphics pen = Panel1.getGraphics();
        Graphics pen2 = Panel1.getGraphics();
        Graphics pen3 = Panel1.getGraphics();
        Graphics pen4 = Panel1.getGraphics();
        Graphics pencil = Panel1.getGraphics();
        //Se pone el color respectivo
        pencil.setColor(Color.WHITE);
           
            //Con esto se pinta el panel principal
        pencil.fillRect(0, 0, 500, 500);
        
        //Con esto se rota a la derecha
        
        switch(Rotacion){
            case 0:
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4    
                break;
            case 1: 
                L1X1+=5;L1X2+=20;L1Y1-=20;L1Y2-=15; //Linea 1
                L2X2-=5;L2Y1-=20;L2Y2-=20; //Linea 2
                L3X2+=15;L3Y1-=20;L3Y2-=15; //Linea 3
                L4X1+=20;L4X2+=15;L4Y1-=15;L4Y2-=15; //Linea 4
                break;
            case 2: 
                L1X1+=5;L1X2-=35;L1Y1-=10;L1Y2+=45; //Linea 1
                L2X1+=10;L2X2-=60;L2Y1-=10;L2Y2-=50; //Linea 2
                L3X1+=10;L3X2-=180;L3Y1+=20;L3Y2-=55; //Linea 3
                L4X1-=35;L4X2-=105;L4Y1+=45;L4Y2=230; //Linea 4
                break;
            case 3: 
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4
                
                L1X1+=5;L1X2+=20;L1Y1-=15;L1Y2-=20; //Linea 1
                L2X2-=5;L2Y1-=15;L2Y2-=15; //Linea 2
                L3X2+=15;L3Y1-=15;L3Y2-=20; //Linea 3
                L4X1+=20;L4X2+=15;L4Y1-=15;L4Y2-=15; //Linea 4
                break;
            default:
                Rotacion=0;
                Number = String.valueOf(Rotacion);
                lblRot.setText(Number);
                L1X1=200;L1X2=300;L1Y1=130;L1Y2=130; //Linea 1
                L2X1=200;L2X2=200;L2Y1=130;L2Y2=230; //Linea 2
                L3X1=200;L3X2=300;L3Y1=230;L3Y2=230; //Linea 3
                L4X1=300;L4X2=300;L4Y1=130;L4Y2=230; //Linea 4  
                break;
            
        }
        

        pen.drawLine(L1X1, L1Y1, L1X2, L1Y2); //Lado horizontal arriba
        pen2.drawLine(L2X1, L2Y1, L2X2, L2Y2); //Lado vertical izquierda
        pen3.drawLine(L3X1, L3Y1, L3X2, L3Y2); //Lado horizontal base
        pen4.drawLine(L4X1, L4Y1, L4X2, L4Y2); // Lado vertical derecha
        
        
        
        
    }//GEN-LAST:event_btnRotDerActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnEscDer;
    private javax.swing.JButton btnEscDown;
    private javax.swing.JButton btnEscIzq;
    private javax.swing.JButton btnEscUp;
    private javax.swing.JButton btnRotDer;
    private javax.swing.JButton btnRotIzq;
    private javax.swing.JButton btnTrasDer;
    private javax.swing.JButton btnTrasIzq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblEsc;
    private javax.swing.JLabel lblRot;
    private javax.swing.JLabel lblTras;
    private javax.swing.JLabel lblY;
    // End of variables declaration//GEN-END:variables
}
