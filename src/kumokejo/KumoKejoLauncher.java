/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kumokejo;

/**
 * KumoKejo1 
 * @author User
 */
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class KumoKejoLauncher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KumoKejo gameKu = new KumoKejo();
        LwjglApplication launcher = new LwjglApplication(gameKu);

    }
    
}
