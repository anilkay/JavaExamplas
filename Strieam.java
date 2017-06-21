/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strieam;

import com.sun.media.jfxmedia.events.PlayerEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import sun.audio.AudioDataStream;
import sun.audio.AudioPlayer;
import com.sun.media.codec.audio.mp3.*;
import codecLib.mp3.*;
import java.util.Scanner;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
/**
 *
 * @author anilkaynar
 */
public class Strieam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream str=null;
        System.out.println("1-Start playback");
        System.out.println("2-Stop playback");
        byte []buf=new byte[10];
      //  while((be=str.read())>=0){
        //System.out.print((char)be);
        System.out.println(AudioSystem.getAudioFileTypes());
        for (Object o :AudioSystem.getAudioFileTypes()) {
            System.out.println(o.toString());
        }
        AudioInputStream s2; 
        File f=new File("/Users/anilkaynar/Downloads/eastwickdaproblem.mp3");
        Scanner s=new Scanner(System.in);
        try {       
            s2=AudioSystem.getAudioInputStream(f);
            AudioInputStream din=null;
           System.out.println("Feveran etmek şarttır "+s2.getFormat());
           if(s2.markSupported()){
              System.out.println("Mp3 playback is  supported");
              
           }
           AudioFormat baseFormat=s2.getFormat();
           AudioFormat decodedFormat = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, 
                                            baseFormat.getSampleRate(),
                                            16,
                                            baseFormat.getChannels(),
                                            baseFormat.getChannels() * 2,
                                            baseFormat.getSampleRate(),
                                            false);
             din = AudioSystem.getAudioInputStream(decodedFormat,s2);
          Clip clip=AudioSystem.getClip();
          clip.open(din);
         DataLine.Info info = new DataLine.Info(Clip.class, din.getFormat());
         AudioSystem.getLine(info);
          
         clip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if(event.getType()==LineEvent.Type.CLOSE){
                       event.getLine().close();
                       clip.close();
                    }
                      int k=0;
        
              int choose=s.nextInt();
              if(1==choose){
                   clip.start();
              }
              if(2==choose){
                 clip.stop();
              }
          }
                
            });
          InputStream a=new FileInputStream("/Users/anilkaynar/Downloads/HTMLornekler.txt");
          //AudioPlayer.player.start(din);
          //AudioPlayer play2=new Player(din);
          
          System.out.println("Frame Length "+clip.getFrameLength());
         
      
          int k=0;
          while(true){
              int choose=s.nextInt();
              if(1==choose){
                   clip.start();
              }
              else if(2==choose){
                 clip.stop();
              }
              
          }
             
        } catch (Exception ex) {
            System.err.println(" "+ex.toString());
        }
        }
    }
    

