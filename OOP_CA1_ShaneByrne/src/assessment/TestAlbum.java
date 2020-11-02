package assessment;

import javax.swing.*;

public class TestAlbum {
        public void song(String sugar_baby_love, String rubettes, String pop, int i1) {
        }


        public static <Song> void main(String[] args){

            Song song1 = (Song) new assessment.song("Sugar Baby Love", "Rubettes", "Pop", 136, 1977
            );
            Song song2 = (Song) new assessment.song("Living on a Prayer", "Bon Jovi", "Rock", 184, 1985
            );
            Song song3 = (Song) new assessment.song("Someone Like You", "Adele", "Pop", 223, 2013
            );
            Song song4 = (Song) new assessment.song("House of Fun", "Madness", "Pop", 178, 1984 );

Song allSongs[]= (Song[]) new song[4];

 class gui{
     public void main (String args[]){
         JFrame frame = new JFrame("Input");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(300,300);
         System.out.println ("Which Track number would you like to play");
         JButton button = new JButton("ok");
         JButton button1 = new JButton("cancel");
         frame.getContentPane().add(button);
         frame.setVisible(true);
     }
 }

        }

    }
