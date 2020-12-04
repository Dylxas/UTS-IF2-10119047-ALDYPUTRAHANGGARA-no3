/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10119047.aldyputrahanggara.no3;

import data.BlackMetal;
import data.DeathCoreKepiting;
import data.DeathMetal;
import data.Rnb;
import data.HardRock;
import data.Folk;
import data.Metal;
import data.NewSkul;
import data.Rockabilly;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO IF-2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MUSISI DAN GENRENYA
*/

public class UTSIF210119047ALDYPUTRAHANGGARANo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rnb blues = new Rnb();
        blues.setArtistName("Jimmy Hendrik");
        blues.genreBlues(blues.getArtistName());

        Rnb jazz = new Rnb();
        jazz.setArtistName("Chad Baker");
        jazz.genreJazz(jazz.getArtistName());

        Folk folk = new Folk();
        folk.setArtistName("Bob Dylan");
        folk.genreFolk(folk.getArtistName());

        Rockabilly rockabilly = new Rockabilly();
        rockabilly.setArtistName("Elvis Presley");
        rockabilly.genreRockabilly(rockabilly.getArtistName());

        HardRock ProgressiveRock = new HardRock();
        ProgressiveRock.setArtistName("DreamTheater");
        ProgressiveRock.genreProgressiveRock(ProgressiveRock.getArtistName());

        HardRock psychedelicRock = new HardRock();
        psychedelicRock.setArtistName("The Doors");
        psychedelicRock.genrePsychedelicRock(psychedelicRock.getArtistName());

        HardRock popRock = new HardRock();
        popRock.setArtistName("Kiss");
        popRock.genrePopRock(popRock.getArtistName());
        
        Metal punk = new Metal();
        punk.setArtistName("MXPX");
        punk.genrePunk(punk.getArtistName());

        Metal heavyMetal = new Metal();
        heavyMetal.setArtistName("METALLICA");
        heavyMetal.genreHeavyMetal(heavyMetal.getArtistName());

        Metal grindCore = new Metal();
        grindCore.setArtistName("MesinTempur");
        grindCore.genreGrindCore(heavyMetal.getArtistName());
        
        DeathMetal deathMetal = new DeathMetal();
        deathMetal.setArtistName("JASAD");
        deathMetal.genreDeathMetal(deathMetal.getArtistName());

        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.setArtistName("Revenge The Fate");
        deathCoreKepiting.genreDeathCoreKepiting(deathCoreKepiting.getArtistName());

        BlackMetal blackMetal = new BlackMetal();
        blackMetal.setArtistName("Behemoth");
        blackMetal.genreBlackMetal(blackMetal.getArtistName());

        NewSkul newskul = new NewSkul();
        newskul.setArtistName("HATEBREED");
        newskul.genreNewSkul(newskul.getArtistName());

    }
    
}
