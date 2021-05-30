/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourpyramids;

import Pyramids.Pyramid;
import dao.PyramidCsvDao;
import java.util.List;

/**
 *
 * @author Omar Wael
 */
public class OurPyramids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PyramidCsvDao pDAO = new PyramidCsvDao();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("E:\\ITI -AI pro\\Java & UML\\slides\\HW\\OurPyramids\\OurPyramids\\src\\ourpyramids\\pyramids.csv");
        int i = 0;
        for(Pyramid p:pyramids)
        {
            System.out.println("#"+(i++)+p);
        }
    }
    
}
