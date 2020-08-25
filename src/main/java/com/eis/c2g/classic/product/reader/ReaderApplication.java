package com.eis.c2g.classic.product.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@SpringBootApplication
public class ReaderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ReaderApplication.class, args);
        //ExcelController.createExcel();
        //ExcelController.readExcel();
    }

}
