package com.indentity.springboot.filetype;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


/**
 * Created by thadeus on 20/08/17.
 */

// create a service for spring
@Service
public class FileTypeService {

    private List<FileType> fileTypes= Arrays.asList(new FileType("dvla.csv","footy.jpg","goodDays.xml","MyTest.pdf","Photo.gif"),
            new FileType( "Smile.tif","talent.txt","testFile.ods","ThadeusTimesheet.xls","webPage.html2"));


    public List<FileType>getAllFileTypes(){
        return fileTypes;
    }
}






