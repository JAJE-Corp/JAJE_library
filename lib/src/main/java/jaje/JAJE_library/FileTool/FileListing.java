/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jaje.JAJE_library.FileTool;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author gattolfo
 */
public class FileListing {
    
    private String[] getAppList(String dir){
        Set <String> list = Stream.of(new File(dir).listFiles())
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .collect(Collectors.toSet());
        String [] appList = new String[list.size()];
        list.toArray(appList);
        return appList;
    }
    
    public String[] getAllSistemApp(){
        String app[] = getAppList("/usr/share/applications/");
        return app;
    }
}
