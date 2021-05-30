/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Pyramids.Pyramid;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omar Wael
 */
public class PyramidCsvDao implements PyramidDao {

    @Override
    public List<Pyramid> readPyramidsFromCSV(String path) {
        List<Pyramid> allPyramids = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(path));
            if (sc.hasNextLine()) {
                sc.nextLine();
            }
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
              //  System.out.println(parts[0] + " "+parts[2] + " "+parts[5] + " "+parts[8] );
                double height = 0;
                if(parts[8] != null && parts[8].length()>0)
                {
                   height = Double.parseDouble(parts[8]);
                }
                Pyramid p = new Pyramid(parts[0], parts[2], parts[5], height  );
                allPyramids.add(p);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PyramidCsvDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allPyramids;
    }
    
//    public Pyramid createPyramid(String[] metadata){
//    
//        
//    }

}
