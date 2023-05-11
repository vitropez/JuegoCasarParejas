/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laclave;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author yagoa
 */
public class JuegoEntornarCartas extends javax.swing.JFrame {

    String option = ClasePrincipal.eleccion;
    int total;
    ClasePrincipal cls = new ClasePrincipal();
    Integer resultado = 0;
    List<String> imgs;
    List<String> notas;
    List<String> letras;
    String[] imagenes = new String[8];
    String[] notasMusic = new String[8];
    String[] letters = new String[8];
    boolean caraArriba = false;
    boolean carta = false;
    ImageIcon img1;
    ImageIcon img2;
    JButton[] misBotones = new JButton[2];

    String name = ClasePrincipal.nombreUsu;

    /**
     * Creates new form JuegoEntornarCartas
     */
    public JuegoEntornarCartas() {
        initComponents();

        System.out.println(option);
        imgs = Arrays.asList("imagen1.png", "imagen2.png", "imagen3.png", "imagen4.png", "imagen1.png", "imagen2.png", "imagen3.png", "imagen4.png");
        Collections.shuffle(imgs);
        imagenes = imgs.toArray(imagenes);

        letras = Arrays.asList("letra1.png", "letra2.png", "letra3.png", "letra4.png", "letra1.png", "letra2.png", "letra3.png", "letra4.png");
        Collections.shuffle(letras);
        letters = letras.toArray(letters);

        notas = Arrays.asList("nota1.png", "nota2.png", "nota3.png", "nota4.png", "nota1.png", "nota2.png", "nota3.png", "nota4.png");
        Collections.shuffle(notas);
        notasMusic = notas.toArray(notasMusic);
        NombreUsuario.setText(name);
       new JuegoFrame().dispose();
        campeones.setText("");
       
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void cartasVolteadas(JButton btn) {
        if (!caraArriba) {
            btn.setEnabled(false);
            img1 = (ImageIcon) btn.getDisabledIcon();

            misBotones[0] = btn;
            caraArriba = true;
            carta = false;

        } else {
            btn.setEnabled(false);
            img2 = (ImageIcon) btn.getDisabledIcon();

            misBotones[1] = btn;
            carta = true;
            resultado++;
            System.out.println(resultado);
        }
    }

    public void comparar() {
        if (caraArriba && carta) {
            if (img1.getDescription().compareTo(img2.getDescription()) != 0) {

                misBotones[0].setEnabled(true);
                misBotones[1].setEnabled(true);

            }
            caraArriba = false;

        }

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carta5 = new javax.swing.JButton();
        carta6 = new javax.swing.JButton();
        carta7 = new javax.swing.JButton();
        carta8 = new javax.swing.JButton();
        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campeones = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        NombreUsuario = new javax.swing.JTextField();
        cambioPref = new javax.swing.JComboBox<>();
        Modificar = new javax.swing.JButton();
        clasificacion = new javax.swing.JButton();
        Resultado = new javax.swing.JTextField();
        reiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encuentra la pareja");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("FramePrincipal"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        carta5.setBackground(new java.awt.Color(0, 51, 255));
        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta5MouseExited(evt);
            }
        });
        carta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta5ActionPerformed(evt);
            }
        });

        carta6.setBackground(new java.awt.Color(0, 51, 255));
        carta6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta6MouseExited(evt);
            }
        });
        carta6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta6ActionPerformed(evt);
            }
        });

        carta7.setBackground(new java.awt.Color(0, 51, 255));
        carta7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta7MouseExited(evt);
            }
        });
        carta7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta7ActionPerformed(evt);
            }
        });

        carta8.setBackground(new java.awt.Color(0, 51, 255));
        carta8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta8MouseExited(evt);
            }
        });
        carta8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta8ActionPerformed(evt);
            }
        });

        carta1.setBackground(new java.awt.Color(0, 51, 255));
        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta1MouseExited(evt);
            }
        });
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });

        carta2.setBackground(new java.awt.Color(0, 51, 255));
        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta2MouseExited(evt);
            }
        });
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });

        carta3.setBackground(new java.awt.Color(0, 51, 255));
        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta3MouseExited(evt);
            }
        });
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });

        carta4.setBackground(new java.awt.Color(0, 51, 255));
        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen5.png"))); // NOI18N
        carta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta4MouseExited(evt);
            }
        });
        carta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carta5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(carta6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta4)
                    .addComponent(carta8))
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carta4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carta3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(carta6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(carta7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carta8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        campeones.setBackground(new java.awt.Color(255, 255, 153));
        campeones.setColumns(20);
        campeones.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        campeones.setRows(5);
        campeones.setAutoscrolls(false);
        jScrollPane1.setViewportView(campeones);

        jPanel2.setBackground(new java.awt.Color(255, 51, 255));

        cambioPref.setBackground(new java.awt.Color(0, 204, 204));
        cambioPref.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        cambioPref.setForeground(new java.awt.Color(255, 255, 255));
        cambioPref.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "imagenes", "letras", "notas", " " }));

        Modificar.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.setActionCommand("");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cambioPref, 0, 112, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Modificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cambioPref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Modificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        clasificacion.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        clasificacion.setText("Puntuacion");
        clasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasificacionActionPerformed(evt);
            }
        });

        reiniciar.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 14)); // NOI18N
        jLabel1.setText("CAMPEONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1011, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Resultado)
                        .addComponent(reiniciar)))
                .addContainerGap(779, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed

        if (option.equals("imagenes")) {
            carta1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[0])));
        }
        if (option.equals("notas")) {

            carta1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[0])));
        }
        if (option.equals("letras")) {
            carta1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[0])));
        }
         total++;
        cartasVolteadas(carta1);


    }//GEN-LAST:event_carta1ActionPerformed

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed

        if (option.equals("imagenes")) {
            carta2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[1])));
        }
        if (option.equals("notas")) {
            carta2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[1])));
        }
        if (option.equals("letras")) {
            carta2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[1])));
        }
        total++;
        cartasVolteadas(carta2);

    }//GEN-LAST:event_carta2ActionPerformed

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed

        if (option.equals("imagenes")) {
            carta3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[2])));
        }
        if (option.equals("notas")) {
            carta3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[2])));
        }
        if (option.equals("letras")) {
            carta3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[2])));
        }
        total++;
        cartasVolteadas(carta3);

    }//GEN-LAST:event_carta3ActionPerformed

    private void carta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta4ActionPerformed

        if (option.equals("imagenes")) {
            carta4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[3])));
        }
        if (option.equals("notas")) {
            carta4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[3])));
        }
        if (option.equals("letras")) {
            carta4.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[3])));
        }
        total++;
        cartasVolteadas(carta4);

    }//GEN-LAST:event_carta4ActionPerformed

    private void carta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta5ActionPerformed

        if (option.equals("imagenes")) {
            carta5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[4])));
        }
        if (option.equals("notas")) {
            carta5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[4])));
        }
        if (option.equals("letras")) {
            carta5.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[4])));
        }
        total++;
        cartasVolteadas(carta5);

    }//GEN-LAST:event_carta5ActionPerformed

    private void carta6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta6ActionPerformed

        if (option.equals("imagenes")) {
            carta6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[5])));
        }
        if (option.equals("notas")) {
            carta6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[5])));
        }
        if (option.equals("letras")) {
            carta6.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[5])));
        }
        total++;
        
        cartasVolteadas(carta6);

    }//GEN-LAST:event_carta6ActionPerformed

    private void carta7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta7ActionPerformed

        if (option.equals("imagenes")) {
            carta7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[6])));
        }
        if (option.equals("notas")) {
            carta7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[6])));
        }
        if (option.equals("letras")) {
            carta7.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[6])));
        }
        total++;
        cartasVolteadas(carta7);

    }//GEN-LAST:event_carta7ActionPerformed

    private void carta8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta8ActionPerformed
        if (option.equals("imagenes")) {
            carta8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/" + imagenes[7])));
        }
        if (option.equals("notas")) {
            carta8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/notas/" + notasMusic[7])));
        }
        if (option.equals("letras")) {
            carta8.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/letras/" + letters[7])));
        }
        
        cartasVolteadas(carta8);
        

    }//GEN-LAST:event_carta8ActionPerformed

    private void carta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseExited
        comparar();
       
    }//GEN-LAST:event_carta1MouseExited

    private void carta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseExited
        comparar();
        
    }//GEN-LAST:event_carta2MouseExited

    private void carta3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseExited
        comparar();
         total++;
    }//GEN-LAST:event_carta3MouseExited

    private void carta4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta4MouseExited
        comparar();
       
    }//GEN-LAST:event_carta4MouseExited

    private void carta5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta5MouseExited
        comparar();
        
    }//GEN-LAST:event_carta5MouseExited

    private void carta6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta6MouseExited
        comparar();
      
    }//GEN-LAST:event_carta6MouseExited

    private void carta7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta7MouseExited
        comparar();
         total++;
    }//GEN-LAST:event_carta7MouseExited

    private void carta8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta8MouseExited
        comparar();
         
    }//GEN-LAST:event_carta8MouseExited

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        String nuevaPreferencia = (String) cambioPref.getSelectedItem();

        cls.Modificar(nuevaPreferencia, name);
    }//GEN-LAST:event_ModificarActionPerformed

    private void clasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasificacionActionPerformed
  System.out.print(total);
        Resultado.setText(resultado.toString());
        if(total>=8){
        cls.InsertarResultado(resultado, name);
        }
        cls.ValoresMax();

        campeones.setText(ClasePrincipal.mejores.toString());
        clasificacion.setEnabled(false);


    }//GEN-LAST:event_clasificacionActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
     
        new JuegoFrame().setVisible(true);
      
    }//GEN-LAST:event_reiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoEntornarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoEntornarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoEntornarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoEntornarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoEntornarCartas().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JTextField Resultado;
    private javax.swing.JComboBox<String> cambioPref;
    private javax.swing.JTextArea campeones;
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JButton carta5;
    private javax.swing.JButton carta6;
    private javax.swing.JButton carta7;
    private javax.swing.JButton carta8;
    private javax.swing.JButton clasificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}
