package com.example.docureader.controller;


import com.example.docureader.util.XfaUtil;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;

@RestController
public class DocuReaderController {

    private static final String SERVER_UP = "Server Up";
    private static final String SUCCESS = "Upload Successful";
    private static final String FAILURE = "Failed to Upload";

    @Autowired
    XfaUtil xfaUtil;

    @GetMapping("/ping")
    public String greeting() {
        return SERVER_UP;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file) {

        try {
            PdfDocument pdfDoc = new PdfDocument(new PdfReader(convertToFile(file)));
            xfaUtil.convertToI9Form(pdfDoc);
            return SUCCESS;
        } catch (Exception exception) {

        }


        return FAILURE;
    }

    private File convertToFile(MultipartFile file) throws Exception {
        File convFile = new File(file.getOriginalFilename());
        convFile.createNewFile();
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }


}
