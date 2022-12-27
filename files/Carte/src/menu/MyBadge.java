/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.googlecode.javacv.cpp.opencv_highgui;
import static com.googlecode.javacv.cpp.opencv_core.cvLoad;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage; 
import com.googlecode.javacv.cpp.opencv_highgui;
import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;

import com.googlecode.javacv.CanvasFrame;
import com.googlecode.javacv.OpenCVFrameGrabber;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvSaveImage; 

import java.io.File;
import javax.swing.JFileChooser;


import com.mysql.jdbc.Connection;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author BOUCH
 */
public class MyBadge extends javax.swing.JFrame {

    /**
     * Creates new form MyBadge
     */
    public MyBadge() {
        initComponents();
        tb_load();
    }

    ConnectionClient con = new ConnectionClient();
   
   String path = null;
   byte []userimage = null;
   
  
    
  
   java.sql.Connection Con ;
   PreparedStatement Pst ;
   ResultSet Rs ;
   Statement St;

   
   
   java.util.Date fdate,edate;
   java.sql.Date myfabdate,myexpdate;
   
   JFileChooser fchooser = new JFileChooser();
  // fchooser.showOpenDialog(null);
   
   File f = fchooser.getSelectedFile();
   //imgpath.setText(f.getAbsolutePath());
   
   
    public void tb_load(){
  
  
      try {
          
          DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
          dt.setRowCount(0);
          
          Statement St = db.mycon().createStatement();
          ResultSet Rs = St.executeQuery(" SELECT * FROM badgy");
          
          while (Rs.next()) {              
              
              Vector v = new Vector();
              
              v.add(Rs.getString(1));
              v.add(Rs.getString(2));
              v.add(Rs.getString(3));
              v.add(Rs.getString(4));
              v.add(Rs.getString(5));
              v.add(Rs.getString(6));
              v.add(Rs.getString(7));
              v.add(Rs.getString(8));
              v.add(Rs.getString(9));
              dt.addRow(v);
                          
           
          }
          
      } catch (SQLException e) {
          System.out.println(e);
      }
  
  }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtnom = new javax.swing.JTextField();
        txtposte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtmatricule = new javax.swing.JTextField();
        txtadresse = new javax.swing.JTextField();
        txttelephone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dateau = new com.toedter.calendar.JDateChooser();
        datedu = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label0 = new javax.swing.JLabel();
        date12 = new javax.swing.JLabel();
        date11 = new javax.swing.JLabel();
        jtxtbarcode = new javax.swing.JTextField();
        image1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Enregistrer = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        image2 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        takecamera = new javax.swing.JButton();
        takeimage = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        recherche = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtnom.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtnom.setPreferredSize(new java.awt.Dimension(6, 30));

        txtposte.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtposte.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setText("Poste :");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setText("ID :");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setText("Adresse :");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setText("Nom&Prenom :");

        txtmatricule.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtmatricule.setPreferredSize(new java.awt.Dimension(6, 30));

        txtadresse.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txtadresse.setPreferredSize(new java.awt.Dimension(6, 30));

        txttelephone.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        txttelephone.setPreferredSize(new java.awt.Dimension(6, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel10.setText("Telephone :");

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel11.setText("Date au :");

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel12.setText("Date du :");

        jButton2.setBackground(new java.awt.Color(0, 102, 204));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setText("Générer Codebarre");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtnom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(149, 149, 149))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtposte, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(datedu, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(dateau, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtposte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datedu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IBsoft Packaging Badge Print");

        label1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        label1.setText("Nom&Prenom");

        label2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        label2.setText("Poste");

        label3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        label3.setText("Adresse");

        label5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        label5.setText("Telephone");

        label0.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        label0.setText("Matricule");

        date12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        date12.setText("Date au");

        date11.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        date11.setText("Date du");

        jtxtbarcode.setFont(new java.awt.Font("C39HrP24DlTt", 0, 24)); // NOI18N
        jtxtbarcode.setPreferredSize(new java.awt.Dimension(6, 30));

        image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(date11)
                                .addGap(77, 77, 77)
                                .addComponent(date12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(label0, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                                .addGap(63, 63, 63))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtbarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))))))))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(321, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtbarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date11)
                    .addComponent(date12))
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );

        jButton6.setBackground(new java.awt.Color(0, 102, 204));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton6.setText("open image");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 204, 204));
        jButton10.setText("Quitter");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Enregistrer.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        Enregistrer.setForeground(new java.awt.Color(0, 204, 204));
        Enregistrer.setText("Enregistrer");
        Enregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnregistrerMouseClicked(evt);
            }
        });
        Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 204, 204));
        jButton9.setText("Imprimer");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 204, 204));
        Add.setText("Suprimer");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        image2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jButton12.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 204, 204));
        jButton12.setText("Reset");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        takecamera.setBackground(new java.awt.Color(0, 102, 204));
        takecamera.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        takecamera.setText("Open cam");
        takecamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takecameraActionPerformed(evt);
            }
        });

        takeimage.setBackground(new java.awt.Color(0, 102, 204));
        takeimage.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        takeimage.setText("Take image");
        takeimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeimageActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("**photo Badge**");

        recherche.setBackground(new java.awt.Color(0, 102, 204));
        recherche.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        recherche.setText("Recherche");
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        jTable2.setForeground(new java.awt.Color(0, 0, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom complet", "Poste", "Adresse", "Telephone", "Datedu", "Dateau", "photo", "Code barre"
            }
        ));
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setRowHeight(25);
        jTable2.setSelectionBackground(new java.awt.Color(0, 0, 153));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(takecamera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(takeimage, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addGap(211, 211, 211))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton6)
                                    .addComponent(Enregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(takecamera)
                                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9)
                                    .addComponent(takeimage))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton12)
                                    .addComponent(jButton10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recherche)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(76, 76, 76))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(918, 918, 918))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1034, 714));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String barcode = String.format("Barecode is");
        jtxtbarcode.setText(barcode);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        JFileChooser pic = new JFileChooser();
        pic.showOpenDialog(null);

        File picture = pic.getSelectedFile();

        path = picture.getAbsolutePath();
        BufferedImage img;
        try {
            img = ImageIO.read(pic.getSelectedFile());
            ImageIcon imageic = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(135, 127, Image.SCALE_DEFAULT));
            image1.setIcon(imageic);
            image2.setIcon(imageic);
            File image = new File(path);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buff = new byte[1024];

            for (int i; (i = fis.read(buff)) != -1;) {
                bos.write(buff, 0, i);
            }

            userimage = bos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton6ActionPerformed
    private JFrame frame;
    
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
               frame = new JFrame();

        if (JOptionPane.showConfirmDialog(frame,"confirm if you want to exit ","Badgy System",
            JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION )
    {

        System.exit(0);
        }
                                           


    }//GEN-LAST:event_jButton10ActionPerformed

    private void EnregistrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnregistrerMouseClicked

    }//GEN-LAST:event_EnregistrerMouseClicked

    private void EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnregistrerActionPerformed
        String id,nom, post,adresse, telephone,code;

        id = txtmatricule.getText();
        nom = txtnom.getText();
        post = txtposte.getText();
        adresse = txtadresse.getText();
        telephone =  txttelephone.getText();
        code    =  jtxtbarcode.getText();
        //date1 =  dateau.getText();
        //date2 =  dateau.getText();
        fdate  = datedu.getDate();
        myfabdate = new java.sql.Date(fdate.getTime());

        edate  = dateau.getDate();
        myexpdate = new java.sql.Date(edate.getTime());

        String rq ="INSERT INTO badgy (id, fullname, poste, adresse, telephone, datedu, dateau, image, code) VALUES (?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement Pst = con.maConnection().prepareStatement(rq);
            Pst.setString(1, id);
            Pst.setString(2, nom);
            Pst.setString(3, post);
            Pst.setString(4, adresse);
            Pst.setString(5, telephone);
            Pst.setDate(6, myfabdate);
            Pst.setDate(7, myexpdate);
            Pst.setBytes(8, userimage);
            Pst.setString(9, code);
            Pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "eleves  bien enregistré   ");

        } catch (Exception e) {
            System.out.println(e);

        }
        
        tb_load();
    }//GEN-LAST:event_EnregistrerActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("print data");

        job.setPrintable(new Printable() {
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) {
                pageFormat.setOrientation(PageFormat.LANDSCAPE);
                if (pageIndex > 0) {
                    return Printable.NO_SUCH_PAGE;
                }
                Graphics2D g2 = (Graphics2D) graphics;
                g2.translate(pageFormat.getImageableX() * 2, pageFormat.getImageableY() * 2);
                g2.scale(0.80, 0.70);

                jPanel4.paint(g2);

                return Printable.PAGE_EXISTS;
            }
        });

        boolean retur = job.printDialog();
        if (retur) {
            try {
                job.print();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        
         String id = txtmatricule.getText();
        try {

            Statement s = db.mycon().createStatement();
            s.executeUpdate("DELETE FROM badgy WHERE id  = '"+id+"'");
            JOptionPane.showMessageDialog(null, "les information sont suprimé");

        } catch (SQLException e) {
            System.out.println(e);
        }

        tb_load();        
        //String mat = txtmatricule.getText();
        //String nom = txtnom.getText();
        //String post = txtposte.getText();
        //String adresse = txtadresse.getText();
        //String telephone =  txttelephone.getText();
        //String Sdate =   datedu.getText();
        //String Edate =   dateau.getText();
       // Date Sdate =  (Date) datedu.getDate();
        //Date Edate =  (Date) datedu.getDate();

        //label0.setText(""+mat);

        //label1.setText(""+nom);

        //label2.setText(""+post);
        //label3.setText(""+adresse);
        //label5.setText(""+telephone);
        //date1.setText(""+Sdate);
        //date2.setText(""+Edate);

        //String date1 =  txtdu.getText();
        //String date2 =  txtau.getText();

    }//GEN-LAST:event_AddActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jtxtbarcode.setText("");
        txtmatricule.setText("");
        txtnom.setText("");
        txtposte.setText("");
        txtadresse.setText("");
        txttelephone.setText("");
        //datedu.setText("");
        //dateau.setText("");
        datedu.setDate(null);
        dateau.setDate(null);
        label0.setText("");
        label1.setText("");
        label2.setText("");
        label3.setText("");
        label5.setText("");
        date11.setText("");
        date12.setText("");

        image2.setIcon(null);
        image1.setIcon(null);

    }//GEN-LAST:event_jButton12ActionPerformed

    private void takecameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takecameraActionPerformed

        Thread wcam = new Thread()
        {
            public void run()
            {

                CvCapture cap = opencv_highgui.cvCreateCameraCapture(0);

                opencv_highgui.cvSetCaptureProperty(cap,opencv_highgui.CV_CAP_PROP_FRAME_HEIGHT,20);
                opencv_highgui.cvSetCaptureProperty(cap,opencv_highgui.CV_CAP_PROP_FRAME_WIDTH,20);

                IplImage gimg = opencv_highgui.cvQueryFrame(cap);
                CanvasFrame can = new CanvasFrame("title");

                while (can.isVisible()&& (gimg = opencv_highgui.cvQueryFrame(cap))  != null)

                {
                    can.showImage(gimg);

                }

            }
        };
        wcam.start();
    }//GEN-LAST:event_takecameraActionPerformed

    private void takeimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeimageActionPerformed

        OpenCVFrameGrabber oGrap = new OpenCVFrameGrabber(0);

        try {

            oGrap.start();
            IplImage img = oGrap.grab();
            if (img != null) {

                cvSaveImage("img1.jpg", img);

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_takeimageActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        String n;
        n = txtmatricule.getText();

        try {

            String rq ="Select * from  badgy where id=?";
            PreparedStatement Pst = con.maConnection().prepareStatement(rq);
            Pst.setString(1, n);
            Rs = Pst.executeQuery();
            if(Rs.next() == false){

                JOptionPane.showMessageDialog(null, "Matricule n'existe pas ");
                txtmatricule.setText("");
            } else  {

                txtnom.setText(Rs.getString(2).trim());
                txtposte.setText(Rs.getString(3).trim());
                txtadresse.setText(Rs.getString(4).trim());
                txttelephone.setText(Rs.getString(5).trim());

                try {
                    Blob blob1 = Rs.getBlob("image");
                    byte[] imagebyte = blob1.getBytes(1, (int) blob1.length());

                    ImageIcon imag = new ImageIcon(new ImageIcon(imagebyte).getImage().getScaledInstance(135, 127, Image.SCALE_DEFAULT));
                    image1.setIcon(imag);
                    image2.setIcon(imag);

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Erreur" );
                }

            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_rechercheActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();

        int r = jTable2.getSelectedRow();

        String Q1  = jTable2.getValueAt(r, 0).toString();
        String Q2  = jTable2.getValueAt(r, 1).toString();
        String Q3  = jTable2.getValueAt(r, 2).toString();
        String Q4  = jTable2.getValueAt(r, 3).toString();
        String Q5  = jTable2.getValueAt(r, 4).toString();
        String Q6 = jTable2.getValueAt(r, 5).toString();
        String Q7  = jTable2.getValueAt(r, 6).toString();
        String Q8  = jTable2.getValueAt(r, 7).toString();
        String Q9  = jTable2.getValueAt(r, 8).toString();

        txtmatricule.setText(Q1);
        label0.setText(Q1);
        txtnom.setText(Q2);
        label1.setText(Q2);
        txtposte.setText(Q3);
        label2.setText(Q3);
        txtadresse.setText(Q4);
        label3.setText(Q4);
        txttelephone.setText(Q5);
        label5.setText(Q5);
        date11.setText(Q6);
        date12.setText(Q7);
        jtxtbarcode.setText(Q9);
        // datedu.setDate(Q7);
        //image1.setDisabledIcon(Q8);
        

        try {
            int srow = jTable2.getSelectedRow();
            java.util.Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(r, 5));
            datedu.setDate(date1);

        } catch (Exception e) {
        }

        try {
            java.util.Date date2 =  new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(r, 6));
            dateau.setDate(date2);
        } catch (Exception e) {
        }

        
        
        
        
        String n;
        n = txtmatricule.getText();

        try {

            String rq ="Select * from  badgy where id=?";
            PreparedStatement Pst = con.maConnection().prepareStatement(rq);
            Pst.setString(1, n);
            Rs = Pst.executeQuery();
            if(Rs.next() == false){

                JOptionPane.showMessageDialog(null, "Matricule n'existe pas ");
                txtmatricule.setText("");
            } else  {

                txtnom.setText(Rs.getString(2).trim());
                txtposte.setText(Rs.getString(3).trim());
                txtadresse.setText(Rs.getString(4).trim());
                txttelephone.setText(Rs.getString(5).trim());

                try {
                    Blob blob1 = Rs.getBlob("image");
                    byte[] imagebyte = blob1.getBytes(1, (int) blob1.length());

                    ImageIcon imag = new ImageIcon(new ImageIcon(imagebyte).getImage().getScaledInstance(135, 127, Image.SCALE_DEFAULT));
                    image1.setIcon(imag);
                    image2.setIcon(imag);

                } catch (Exception e) {

                    JOptionPane.showMessageDialog(null, "Erreur" );
                }

            }

        } catch (Exception e) {
        }
        
        
        
        
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(MyBadge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyBadge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyBadge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyBadge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyBadge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Enregistrer;
    private javax.swing.JLabel date11;
    private javax.swing.JLabel date12;
    private com.toedter.calendar.JDateChooser dateau;
    private com.toedter.calendar.JDateChooser datedu;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jtxtbarcode;
    private javax.swing.JLabel label0;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label5;
    private javax.swing.JButton recherche;
    private javax.swing.JButton takecamera;
    private javax.swing.JButton takeimage;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextField txtmatricule;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtposte;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
