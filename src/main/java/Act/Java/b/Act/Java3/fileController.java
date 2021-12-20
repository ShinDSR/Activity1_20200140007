/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Act.Java.b.Act.Java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author ASUS
 */

@Controller

public class fileController {
    @RequestMapping("/dataktp")
    public String InputData(Model No){
        
        ArrayList<List<String>> data = new ArrayList<>();
        data.add(0,Arrays.asList("ID","Nomer KTP","Nama","Alamat"));
        data.add(1,Arrays.asList("001","7600123408060001","Arga","Jakarta"));
        data.add(2,Arrays.asList("002","7600123408060002","David","Bandung"));
        data.add(3,Arrays.asList("003","7600123408060003","Agus","Jakarta"));
        data.add(4,Arrays.asList("004","7600123408060004","Alam","Surabaya"));
        data.add(5,Arrays.asList("005","7600123408060005","Dicky","Cilacap"));
        data.add(6,Arrays.asList("006","7600123408060006","Desi","Makassar"));
        data.add(7,Arrays.asList("007","7600123408060007","Dandi","Palu"));
        data.add(8,Arrays.asList("008","7600123408060008","Denis","Purwokero"));
        data.add(9,Arrays.asList("009","7600123408060009","Arif","Palembang"));
        data.add(10,Arrays.asList("010","7600123408060010","Nunung","Tangerang"));
        data.add(11,Arrays.asList("011","7600123408060011","Bima","Pontianak"));
        data.add(12,Arrays.asList("012","7600123408060012","Ahmad","Yokyakarta"));
        data.add(13,Arrays.asList("013","7600123408060013","Dian","Bekasi"));
        data.add(14,Arrays.asList("014","7600123408060014","Dina","Tangerang"));
        data.add(15,Arrays.asList("015","7600123408060015","Diva","Bengkulu"));
        data.add(16,Arrays.asList("016","7600123408060016","Lisa","Medan"));
        data.add(17,Arrays.asList("017","7600123408060017","Ayu","Wonosobo"));
        data.add(18,Arrays.asList("018","7600123408060018","Rizky","Wonogiri"));
        data.add(19,Arrays.asList("019","7600123408060019","Refa","Magelang"));
        data.add(20,Arrays.asList("020","7600123408060020","Hendra","Jakarta"));

        No.addAttribute("table",data);
           
        return "viewData";
    
    }
}
