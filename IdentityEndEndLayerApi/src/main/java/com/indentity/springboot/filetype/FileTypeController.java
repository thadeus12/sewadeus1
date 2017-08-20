package com.indentity.springboot.filetype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by thadeus on 19/08/17.
 */
@RestController
public class FileTypeController {

    String filePath=System.getProperty("user.dir")+"/src/test/data";

    @Autowired
    private FileTypeService fileTypeService;

    @RequestMapping("/fileTypes")
    public List<FileType>getAllFileTypes(){
        return fileTypeService.getAllFileTypes();
    }

    @RequestMapping("/fileType2")
   public void getAllFileTypesInDirectory(String directory){
       List<String> results = new ArrayList<String>();
       File[] files = new File(System.getProperty("usr.dir")+"/src/main/resources/data").listFiles();
   for (File file :files){
       if (file.isFile()){
           System.out.println(results.add(file.getName()));
       }
   }


    }




}
