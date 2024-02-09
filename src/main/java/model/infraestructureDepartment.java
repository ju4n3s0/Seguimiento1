package model;

import ui.Executable;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class infraestructureDepartment {
    public static final String BILLBOARD_FILE_NAME = "BillboardDataExported.csv";
    private ArrayList<Billboard> billboards;

    public infraestructureDepartment() throws Exception{
        billboards = new ArrayList<>();
        loadBillboard();

    }

    public void loadBillboard() throws Exception{
        String resource = Executable.class.getClassLoader().getResource(BILLBOARD_FILE_NAME).getFile();
        File file = new File(resource);
        FileReader fr =  new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line!=null){
            importData(line);
            line = br.readLine();
        }

        br.close();
        fr.close();

    }

    public void importData(String fn){
        String[] columns = fn.split("\\|");
        //System.out.println(Arrays.toString(columns));
        Billboard billboard = new Billboard(Double.parseDouble(columns[0]),Double.parseDouble(columns[1]),Boolean.parseBoolean(columns[2]),columns[3]);
        billboards.add(billboard);
    }


}
