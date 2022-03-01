/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_fly_sky;

import com.sun.xml.internal.fastinfoset.EncodingConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SHAFIN
 */
public class SrachForFlight extends javax.swing.JFrame {

    /**
     * Creates new form SrachForFlight
     */
    public SrachForFlight() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        way = new javax.swing.ButtonGroup();
        classs_ = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        oneWay = new javax.swing.JRadioButton();
        roundtrip_return = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        business = new javax.swing.JRadioButton();
        economy = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search For Flight");

        jPanel1.setPreferredSize(new java.awt.Dimension(662, 745));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Search For Flight");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(110, 50, 536, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Departure City");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(62, 179, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Departure Date");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(62, 228, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Arrival City");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(62, 283, 150, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Arrival Date");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(62, 387, 150, 30);

        way.add(oneWay);
        oneWay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        oneWay.setText("One-Way");
        oneWay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneWayActionPerformed(evt);
            }
        });
        jPanel1.add(oneWay);
        oneWay.setBounds(301, 336, 89, 25);

        way.add(roundtrip_return);
        roundtrip_return.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        roundtrip_return.setText("Return");
        roundtrip_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundtrip_returnActionPerformed(evt);
            }
        });
        jPanel1.add(roundtrip_return);
        roundtrip_return.setBounds(460, 336, 73, 25);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Total No Of Ticket");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(62, 476, 150, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Way");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(62, 331, 150, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Class");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(62, 435, 150, 30);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(301, 181, 280, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(301, 238, 280, 30);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(301, 279, 280, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(301, 389, 280, 30);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6);
        jTextField6.setBounds(301, 471, 280, 30);

        classs_.add(business);
        business.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        business.setText("Business");
        business.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessActionPerformed(evt);
            }
        });
        jPanel1.add(business);
        business.setBounds(301, 438, 85, 25);

        classs_.add(economy);
        economy.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        economy.setText("Economy");
        jPanel1.add(economy);
        economy.setBounds(460, 438, 89, 25);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(468, 542, 107, 34);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(11, 638, 410, 410);

        jButton2.setText("ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 550, 43, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(530, 630, 620, 402);

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(890, 550, 73, 23);

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(1010, 480, 73, 23);

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(800, 450, 73, 23);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(610, 240, 330, 70);

        jLabel9.setPreferredSize(new java.awt.Dimension(1212, 1156));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 1212, 1156);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneWayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneWayActionPerformed
        // TODO add your handling code here:
        if (oneWay.isSelected()) {
            jLabel5.setVisible(false);
            jTextField5.setVisible(false);
        }
    }//GEN-LAST:event_oneWayActionPerformed

    private void businessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_businessActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String DepartureCityName, DepartureDate, ArrivalCityName, ArrivalDate, WayType, ClassName;
            int TicketAmount;
            DepartureCityName = jTextField1.getText();
            SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd",Locale.getDefault());
             DepartureDate = sdf.format(jDateChooser1.getDate());
               System.out.println(DepartureDate);
            ArrivalCityName = jTextField3.getText();
            ArrivalDate = jTextField5.getText();
            TicketAmount = Integer.parseInt(jTextField6.getText());

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1971;databaseName=afly;selectMethod=cursor", "sa", "123456");
            System.out.println("DATABASE NAME IS:"
                    + connection.getMetaData().getDatabaseProductName());

//            
            if (business.isSelected()) {
                Statement statement = connection.createStatement();

                String query = "select businessclass.airlineid, Airline.AirLineName,businessclass.departurecity,businessclass.departuredate,businessclass.departuretime,businessclass.arrivalcity,businessclass.jtime,businessclass.transitcity,businessclass.transittime,businessclass.classbasefare*?\n"
                        + "from\n"
                        + "businessclass inner join Airline\n"
                        + "on businessclass.airlineid=Airline.AirLineId  where DepartureCity=? AND DepartureDate=? AND ArrivalCity=?";
//                        "SELECT DISTINCT BusinessClass.AirLineId,route.routeid,BusinessClass.ClassBaseFare,BusinessClass.DepartureCity,BusinessClass.DepartureTime,BusinessClass.DepartureDATE,BusinessClass.ArrivalCity FROM BusinessClass RIGHT JOIN ROUTE ON BusinessClass.RouteId=Route.ROUTEID \n "
//
//                        + " where ROUTE.DepartureCityName=? AND ROUTE.DepartureDate=? AND ROUTE.ArrivalCityName=? ";
/*"SELECT DISTINCT ROUTE.ROUTEID,ROUTE.AIRLINEID,ROUTE.DEPARTURECITYNAME,ROUTE.DEPARTUREDATE,ROUTE.DEPARTURETIME,ROUTE.ARRIVALCITYNAME,ROUTE.ARRIVALDATE,ROUTE.ARRIVALTIME,\n"
                        + "ROUTE.JTIME,ROUTE.TRANSITCITY,ROUTE.TRANSITTIME,BUSINESSCLASS.CLASSBASEFARE*? AS TOTAL_AMOUNT\n"
                        + "FROM ROUTE RIGHT JOIN BUSINESSCLASS \n"
                        + "ON ROUTE.ROUTEID=BUSINESSCLASS.ROUTEID \n"*/
                PreparedStatement st = connection.prepareStatement(query);

                st.setInt(1, TicketAmount);
                st.setString(2, DepartureCityName);
                st.setString(3, DepartureDate);
                st.setString(4, ArrivalCityName);

                ResultSet rs = null;
                rs = st.executeQuery();

                String DepartureCityName_,
                        DepartureDate_,
                        DepartureTime_,
                        ArrivalCityName_,
                        ArrivalDate_,
                        ArrivalTime_,
                        Jtime_,
                        TransitCity_,
                        RouteId_,
                        AirlineId_,
                        TransitTime_,
                        fare_;

                while (rs.next()) {

////                    RouteId_ = rs.getString(1);
////                    AirlineId_ = rs.getString(2);
////
////                    DepartureCityName_ = rs.getString(3);
////
////                    DepartureDate_ = rs.getString(4);
////                    DepartureTime_ = rs.getString(5);
////                    ArrivalCityName_ = rs.getString(6);
////                    ArrivalDate_ = rs.getString(7);
////                    ArrivalTime_ = rs.getString(8);
////                    Jtime_ = rs.getString(9);
////                    TransitCity_ = rs.getString(10);
////                    TransitTime_ = rs.getString(11);
////                    fare_ = rs.getString(12);
//
//                    System.out.println(DepartureDate_);
                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();//SHOWING IN JTABLE
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), DepartureDate, rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)});
                }
                if (roundtrip_return.isSelected()) {

                    query = "SELECT ROUTE.ROUTEID,ROUTE.AIRLINEID,ROUTE.DEPARTURECITYNAME,ROUTE.DEPARTUREDATE,ROUTE.DEPARTURETIME,ROUTE.ARRIVALCITYNAME,ROUTE.ARRIVALDATE,ROUTE.ARRIVALTIME,\n"
                            + "ROUTE.JTIME,ROUTE.TRANSITCITY,ROUTE.TRANSITTIME,BUSINESSCLASS.CLASSBASEFARE*? AS TOTAL_AMOUNT\n"
                            + "FROM ROUTE FULL JOIN BUSINESSCLASS \n"
                            + "ON ROUTE.ROUTEID=BUSINESSCLASS.ROUTEID \n"
                            + " where ROUTE.DepartureCityName=? AND ROUTE.DepartureDate=? AND ROUTE.ArrivalCityName=?";

                }
//                st.setInt(1, TicketAmount);
//                st.setString(2, ArrivalCityName);
//                st.setString(3, ArrivalDate);
//                st.setString(4, DepartureCityName);
//
//                rs = st.executeQuery();
//                while (rs.next()) {
//                    RouteId_ = rs.getString(1);
//                    AirlineId_ = rs.getString(2);
//
//                    DepartureCityName_ = rs.getString(3);
//
//                    DepartureDate_ = rs.getString(4);
//                    DepartureTime_ = rs.getString(5);
//                    ArrivalCityName_ = rs.getString(6);
//                    ArrivalDate_ = rs.getString(7);
//                    ArrivalTime_ = rs.getString(8);
//                    Jtime_ = rs.getString(9);
//                    TransitCity_ = rs.getString(10);
//                    TransitTime_ = rs.getString(11);
//                    fare_ = rs.getString(12);
//
//                    System.out.println(fare_);
//
//                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();//SHOWING IN JTABLE
//                    model.addRow(new Object[]{RouteId_, AirlineId_, DepartureCityName_, DepartureDate_, DepartureTime_, ArrivalCityName_, ArrivalDate_, ArrivalTime_, Jtime_, TransitCity_, TransitTime_, fare_});
//
//                }

            } else if (economy.isSelected()) {

                Statement statement = connection.createStatement();

                String query = "SELECT ROUTE.ROUTEID,ROUTE.AIRLINEID,ROUTE.DEPARTURECITYNAME,ROUTE.DEPARTUREDATE,ROUTE.DEPARTURETIME,ROUTE.ARRIVALCITYNAME,ROUTE.ARRIVALDATE,ROUTE.ARRIVALTIME,\n"
                        + "ROUTE.JTIME,ROUTE.TRANSITCITY,ROUTE.TRANSITTIME,ECONOMYCLASS.CLASSBASEFARE*? AS TOTAL_AMOUNT\n"
                        + "FROM ROUTE FULL JOIN ECONOMYCLASS \n"
                        + "ON ROUTE.ROUTEID=ECONOMYCLASS.ROUTEID \n"
                        + " where ROUTE.DepartureCityName=? AND ROUTE.DepartureDate=? AND ROUTE.ArrivalCityName=? ";

                PreparedStatement st = connection.prepareStatement(query);

                st.setInt(1, TicketAmount);
                st.setString(2, DepartureCityName);
                st.setString(3, DepartureDate);
                st.setString(4, ArrivalCityName);

                ResultSet rs = null;
                rs = st.executeQuery();

                String DepartureCityName_,
                        DepartureDate_,
                        DepartureTime_,
                        ArrivalCityName_,
                        ArrivalDate_,
                        ArrivalTime_,
                        Jtime_,
                        TransitCity_,
                        RouteId_,
                        AirlineId_,
                        TransitTime_,
                        fare_;

                while (rs.next()) {

                    RouteId_ = rs.getString(1);
                    AirlineId_ = rs.getString(2);

                    DepartureCityName_ = rs.getString(3);

                    DepartureDate_ = rs.getString(4);
                    DepartureTime_ = rs.getString(5);
                    ArrivalCityName_ = rs.getString(6);
                    ArrivalDate_ = rs.getString(7);
                    ArrivalTime_ = rs.getString(8);
                    Jtime_ = rs.getString(9);
                    TransitCity_ = rs.getString(10);
                    TransitTime_ = rs.getString(11);
                    fare_ = rs.getString(12);

                    System.out.println(DepartureDate_);

                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();//SHOWING IN JTABLE
                    model.addRow(new Object[]{RouteId_, AirlineId_, DepartureCityName_, DepartureDate_, DepartureTime_, ArrivalCityName_, ArrivalDate_, ArrivalTime_, Jtime_, TransitCity_, TransitTime_, fare_});
                }

                if (roundtrip_return.isSelected()) {

                    query = "SELECT ROUTE.ROUTEID,ROUTE.AIRLINEID,ROUTE.DEPARTURECITYNAME,ROUTE.DEPARTUREDATE,ROUTE.DEPARTURETIME,ROUTE.ARRIVALCITYNAME,ROUTE.ARRIVALDATE,ROUTE.ARRIVALTIME,\n"
                            + "ROUTE.JTIME,ROUTE.TRANSITCITY,ROUTE.TRANSITTIME,ECONOMYCLASS.CLASSBASEFARE*? AS TOTAL_AMOUNT\n"
                            + "FROM ROUTE FULL JOIN ECONOMYCLASS \n"
                            + "ON ROUTE.ROUTEID=ECONOMYCLASS.ROUTEID \n"
                            + " where ROUTE.DepartureCityName=? AND ROUTE.DepartureDate=? AND ROUTE.ArrivalCityName=?";

                }
                st.setInt(1, TicketAmount);
                st.setString(2, ArrivalCityName);
                st.setString(3, ArrivalDate);
                st.setString(4, DepartureCityName);

                rs = st.executeQuery();
                while (rs.next()) {
                    RouteId_ = rs.getString(1);
                    AirlineId_ = rs.getString(2);

                    DepartureCityName_ = rs.getString(3);

                    DepartureDate_ = rs.getString(4);
                    DepartureTime_ = rs.getString(5);
                    ArrivalCityName_ = rs.getString(6);
                    ArrivalDate_ = rs.getString(7);
                    ArrivalTime_ = rs.getString(8);
                    Jtime_ = rs.getString(9);
                    TransitCity_ = rs.getString(10);
                    TransitTime_ = rs.getString(11);
                    fare_ = rs.getString(12);

                    System.out.println(fare_);

                    DefaultTableModel model = (DefaultTableModel) jTable2.getModel();//SHOWING IN JTABLE
                    model.addRow(new Object[]{RouteId_, AirlineId_, DepartureCityName_, DepartureDate_, DepartureTime_, ArrivalCityName_, ArrivalDate_, ArrivalTime_, Jtime_, TransitCity_, TransitTime_, fare_});

                }

            }

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String DepartureCityName_,
                DepartureDate_,
                DepartureTime_,
                ArrivalCityName_,
                ArrivalDate_,
                ArrivalTime_,
                Jtime_, TransitCity_, TransitTime_,
                AirlineId_,
                RouteId_, Airlinename_, Fare_;

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int[] selection = jTable2.getSelectedRows();
        int a = selection.length;

        int b = jTable2.getRowCount();
        for (int i = 0; i < a; i++) {

            AirlineId_ = model.getValueAt(selection[i], 0).toString();
            int AirlineId_1 = Integer.parseInt(AirlineId_);
            Airlinename_ = model.getValueAt(selection[i], 1).toString();

            DepartureCityName_ = model.getValueAt(selection[i], 2).toString();
            DepartureDate_ = model.getValueAt(selection[i], 3).toString();
            DepartureTime_ = model.getValueAt(selection[i], 4).toString();
            ArrivalCityName_ = model.getValueAt(selection[i], 5).toString();
            TransitCity_ = model.getValueAt(selection[i], 7).toString();
            TransitTime_ = model.getValueAt(selection[i], 8).toString();
            Fare_ = model.getValueAt(selection[i], 9).toString();
//            ArrivalDate_ = model.getValueAt(selection[i], 6).toString();
//            ArrivalTime_ = model.getValueAt(selection[i], 7).toString();

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager
                        .getConnection(
                                "jdbc:sqlserver://localhost:1971;databaseName=afly;selectMethod=cursor", "sa", "123456");
                System.out.println("DATABASE NAME IS:"
                        + connection.getMetaData().getDatabaseProductName());
                Statement statement = connection.createStatement();

                //            int a = statement.executeUpdate("insert into Buyer values('" + BuyerId + "','" + FirstName + "','" + LastName + "' ,'" + Address + "','" + PassportNumber + "','" + PhoneNumber + "','" + Email + "','" + RequirementName + "')");//INSERT DATA
                //            String query = "insert into Buyer values(?,?,?,?,?,?,?,?)";
                String query = "select seatnumber from businessclass where airlineid= ? AND DEPARTURECITY=? AND DEPARTURETIME=? AND DEPARTUREDATE=? AND ARRIVALCITY=? ";
                PreparedStatement st = connection.prepareStatement(query);
                st.setInt(1, AirlineId_1);
                st.setString(2, DepartureCityName_);
                st.setString(4, DepartureDate_);
                st.setString(3, DepartureTime_);
                st.setString(5, ArrivalCityName_);
                 ResultSet rs=null;
                 rs=st.executeQuery();
                 while(rs.next()){
                
                
                
                  DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();//SHOWING IN JTABLE
                    model1.addRow(new Object[]{rs.getString(1) });
                 }
                
//                st.setString(6, ArrivalDate_);

                //            st.setString(8, RequirementName);
//                boolean ab;
//                ab = st.execute();//INSERT DATA
//                //            System.out.println(a);
//                if (ab == false) {
//                    JOptionPane.showMessageDialog(null, "Data Inserted");
//                } else {
//                    JOptionPane.showMessageDialog(null, "error in insertion");
//
//                }

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);

            }

//            System.out.println(AirlineId_1);
//            System.out.println(DepartureCityName_);
//            System.out.println(DepartureDate_);
//            System.out.println(DepartureTime_);
//            System.out.println(ArrivalCityName_);
//            System.out.println(ArrivalDate_);
//            System.out.println(ArrivalTime_);
//            System.out.println(Jtime_);
        }

//        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
//        int a = jTable2.getColumnCount();
//        int b = jTable2.getRowCount();
//        String jtval = model.getValueAt(jTable2.getSelectedRow(), 1).toString();
////        int jtval = jTable2.getSelectedRow();
//////
////        int as = (int) model.getValueAt(jtval, 0);
////        System.out.println(a);
//        System.out.println(jtval);
//
////        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void roundtrip_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundtrip_returnActionPerformed
        // TODO add your handling code here:
        if (roundtrip_return.isSelected()) {
            jLabel5.setVisible(true);
            jTextField5.setVisible(true);
        }


    }//GEN-LAST:event_roundtrip_returnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1971;databaseName=afly;selectMethod=cursor", "sa", "123456");

            Statement statement = connection.createStatement();

            String query = "select  businessclass.seatnumber,route.airlineid,Airline.AirLineName,\n"
                    + "route.departurecityname,route.departuredate,route.departuretime,\n"
                    + "route.arrivalcityname,\n"
                    + "route.arrivaltime from airline, businessclass left join route\n"
                    + "on BusinessClass.RouteId=route.routeid";

            PreparedStatement st = connection.prepareStatement(query);

            ResultSet rs = null;
            rs = st.executeQuery();

            while (rs.next()) {

                DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();//SHOWING IN JTABLE
                model1.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});

            }

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
           try {  
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager
                        .getConnection(
                                "jdbc:sqlserver://localhost:1971;databaseName=afly;selectMethod=cursor", "sa", "123456");
                System.out.println("DATABASE NAME IS:"
                        + connection.getMetaData().getDatabaseProductName());
                Statement statement = connection.createStatement();
                
        String DepartureCityName_ = null,
                DepartureDate_ = null,
                DepartureTime_ = null,
                ArrivalCityName_ = null,
                ArrivalDate_,
                ArrivalTime_,
                Jtime_, TransitCity_, TransitTime_,
                AirlineId_,
                RouteId_, Airlinename_, Fare_; int AirlineId_1 = 0;

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        int[] selection = jTable2.getSelectedRows();
        int a = selection.length;

        int b = jTable2.getRowCount();
    
        for (int i = 0; i < a; i++) {

            AirlineId_ = model.getValueAt(selection[i], 0).toString();
             AirlineId_1 = Integer.parseInt(AirlineId_);
            Airlinename_ = model.getValueAt(selection[i], 1).toString();

            DepartureCityName_ = model.getValueAt(selection[i], 2).toString();
            DepartureDate_ = model.getValueAt(selection[i], 3).toString();
            DepartureTime_ = model.getValueAt(selection[i], 4).toString();
            ArrivalCityName_ = model.getValueAt(selection[i], 5).toString();
            TransitCity_ = model.getValueAt(selection[i], 7).toString();
            TransitTime_ = model.getValueAt(selection[i], 8).toString();
            Fare_ = model.getValueAt(selection[i], 9).toString();
        }

           
               String query1="Insert into bn values(?,?,?,?,?)";
               PreparedStatement st = connection.prepareStatement(query1);
                st.setInt(1, AirlineId_1);
                st.setString(2, DepartureCityName_);
                st.setString(4, DepartureDate_);
                st.setString(3, DepartureTime_);
                st.setString(5, ArrivalCityName_);
                st.execute();
                       


//                PreparedStatement st = connection.prepareStatement(query1);
//                System.out.println(AirlineId_1);
//                st.setInt(1, AirlineId_1);
//                st.setString(2, DepartureCityName_);
//                st.setString(4, DepartureDate_);
//                st.setString(3, DepartureTime_);
//                st.setString(5, ArrivalCityName_);
//                st.execute();
//             ResultSet rs=null;
//                 rs=st.executeQuery();
//                 while(rs.next()){
//                
//                
//                
//                  DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();//SHOWING IN JTABLE
//                    model1.addRow(new Object[]{rs.getString(1) });
//                 }
                

            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);

            }
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager
                        .getConnection(
                                "jdbc:sqlserver://localhost:1971;databaseName=afly;selectMethod=cursor", "sa", "123456");
                System.out.println("DATABASE NAME IS:"
                        + connection.getMetaData().getDatabaseProductName());
                Statement statement = connection.createStatement();
            String query = " select seatnumber from businessclass where airlineid=(select bn.airlineid from bn,businessclass where bn.departuretime=businessclass.departuretime and bn.departuredate=businessclass.departuredate and bn.arrivalcity=businessclass.arrivalcity and bn.departurecity=businessclass.departurecity)";

                      PreparedStatement st = connection.prepareStatement(query);
//        System.out.println(AirlineId_1);
//        st.setInt(1, AirlineId_1);
//        st.setString(2, DepartureCityName_);
//        st.setString(4, DepartureDate_);
//        st.setString(3, DepartureTime_);
//        st.setString(5, ArrivalCityName_);
//        st.execute();
        ResultSet rs = null;
        rs = st.executeQuery();
        while (rs.next()) {

            DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();//SHOWING IN JTABLE
            model1.addRow(new Object[]{rs.getString(1)});
        }
        } catch (Exception e) {
        }
                        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(SrachForFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SrachForFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SrachForFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SrachForFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SrachForFlight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton business;
    private javax.swing.ButtonGroup classs_;
    private javax.swing.JRadioButton economy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton oneWay;
    private javax.swing.JRadioButton roundtrip_return;
    private javax.swing.ButtonGroup way;
    // End of variables declaration//GEN-END:variables
}