/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package copy;

import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author Mahesh Rathnayaka
 */
public class FTPRunner {
    public static void main(String[] args) throws IOException {
        String watchingPath = "D:/jpg/";
        String copingPath = "C:/wamp/www/dental_project/tempImg/";
        Watcher w = new Watcher(Paths.get(watchingPath), true, watchingPath, copingPath);
        w.processEvents();
    }
}
