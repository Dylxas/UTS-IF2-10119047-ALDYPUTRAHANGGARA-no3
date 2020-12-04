/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO IF-2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MUSISI DAN GENRENYA
*/

public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock{

    public void genreHardrock (String artistName){
    }
    
    @Override
    public void genrePopRock (String artistName){
    }
    
    @Override
    public void PsychedelicRock (String artistName){
    }

    @Override
    public void genreProgressiveRock(String artistName) {
    }

    public void genrePsychedelicRock(String artistName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
