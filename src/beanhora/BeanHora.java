/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanhora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author DAM-2
 */
public class BeanHora extends JLabel implements Serializable {
    public LocalDateTime fecha;
    public String texto;
    private DateTimeFormatter dtf;
    private Timer time;
    
    public BeanHora(){
        dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
        setHora();
        texto = fecha.format(dtf);
        time = new Timer();
        time.schedule(new Tiempo(), 0, 1000);
        super.setPreferredSize(new Dimension(200, 15));
    }
    

    private void setHora(){
        fecha = LocalDateTime.now();
        texto = fecha.format(dtf);
        repaint();
    }
    
    public String getHora(){
        return texto;
    }
    
    public void setColorText(Color c){
        this.setForeground(c);
        repaint();
    }
    
    public Color getColorText(){
        return this.getForeground();
    }
    
    
    public void setFuente(Font f){
        this.setFont(f);
        repaint();
    }
    
    public Font getFuente(){
        return this.getFont();
    }
    
    public void setFormato(String formato){
        dtf = DateTimeFormatter.ofPattern(formato);
        
        setText(fecha.format(dtf));
        repaint();
    }
    
    public DateTimeFormatter getFormato(){
        return dtf;
    }
    

    public void paint(Graphics g){
       g.setFont(this.getFont());
       g.setColor(getColorText());
       g.drawString(texto, 15, 15);
    }
    
    class Tiempo extends TimerTask{

        @Override
        public void run() {
            setHora();
        }
        
    }
    


    
    


    
}