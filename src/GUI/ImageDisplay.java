package GUI;

import java.util.List;
import modelo.CurrencyExchange;
import persistencia.CurrencyLoader;

public class ImageDisplay extends javax.swing.JPanel {

    public ImageDisplay() {
        initComponents();
        List<String> divisas = CurrencyLoader.loadCurrencies();
        for (String d : divisas){
            listaBase.addItem(d);
            listaDestino.addItem(d);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        divisaBase = new javax.swing.JLabel();
        divisaDestino = new javax.swing.JLabel();
        listaBase = new javax.swing.JComboBox<>();
        listaDestino = new javax.swing.JComboBox<>();
        cantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        insercionCantidad = new javax.swing.JTextPane();
        cambio = new javax.swing.JButton();
        resultadoCambio = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        divisaBase.setText("Base currency:");

        divisaDestino.setText("Destination Currency:");

        listaBase.setModel(new javax.swing.DefaultComboBoxModel<>());
        listaBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaBaseActionPerformed(evt);
            }
        });

        listaDestino.setModel(new javax.swing.DefaultComboBoxModel<>());

        cantidad.setText("Amount:");

        jScrollPane1.setViewportView(insercionCantidad);

        cambio.setText("Exchange");
        cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divisaDestino)
                    .addComponent(divisaBase)
                    .addComponent(cantidad)
                    .addComponent(cambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(listaBase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resultadoCambio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaBase)
                    .addComponent(listaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(divisaDestino)
                    .addComponent(listaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cambio)
                    .addComponent(resultadoCambio))
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaBaseActionPerformed
        
    }//GEN-LAST:event_listaBaseActionPerformed

    private void cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambioActionPerformed
        CurrencyExchange cE = new CurrencyExchange((String) listaBase.getSelectedItem(), (String) listaDestino.getSelectedItem());
        try{
            resultadoCambio.setText(Float.toString(cE.getCambio() * Float.parseFloat(insercionCantidad.getText())));
        }catch (Exception e) {
            System.out.println("Se debe introducir una cantidad válida");
            insercionCantidad.setText("1");
            resultadoCambio.setText(Float.toString(cE.getCambio()));
        }
    }//GEN-LAST:event_cambioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambio;
    private javax.swing.JLabel cantidad;
    private javax.swing.JLabel divisaBase;
    private javax.swing.JLabel divisaDestino;
    private javax.swing.JTextPane insercionCantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaBase;
    private javax.swing.JComboBox<String> listaDestino;
    private javax.swing.JLabel resultadoCambio;
    // End of variables declaration//GEN-END:variables
}
