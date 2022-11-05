/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 * 
 * @author Nicolas Herrera <herrera.nicolas@correounivalle.edu.co>
 * @author Samuel Galindo Cuevas <samuel.galindo@correounivalle.edu.co>
 * @author Yenny Rivas Tello <yenny.rivas@correounivalle.edu.co>
 */
public class Ficha 
{
    
    private String forma;
    private String color;
    private String dirImagen;
    private boolean adivinada;
    
    public Ficha()
    {
        
    }
    public void SetColor(String color)
    {
        this.color = color;
    }
    public String getColor()
    {
        return color;
    }
    public void SetForma(String forma)
    {
        this.forma = forma;
    }
    public String getForma()
    {
        return forma;
    }
    public String getDirImagen()
    {
        return dirImagen;
    }
    public void adivinaFicha()
    {
         this.adivinada = true;
    }
}