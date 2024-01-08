package com.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class App 
{
    public static void main( String[] args ) throws StreamWriteException, DatabindException, IOException
    {
        Alunno a1 = new Alunno("Gioele", "Morali", new Date(2004,12,12));
        Alunno a2 = new Alunno("Yang", "Andrea", new Date(2003,8,12));
        Alunno a3 = new Alunno("Gabriele", "Lodde", new Date(2006,3,15));
        Alunno a4 = new Alunno("Lorenzo", "Scarpulla", new Date(2002,9,18));

        List<Alunno> alunno = new ArrayList();
        alunno.add(a1);
        alunno.add(a2);
        alunno.add(a3);
        alunno.add(a4);

        Classe c1 = new Classe(5, "BIA", "012-BW", alunno);

        System.out.println("------XML------");
        XmlMapper xmlMapper = new XmlMapper();

        String s1 = xmlMapper.writeValueAsString(c1);
        System.out.println(s1);

        xmlMapper.writeValue(new File("test.xml"), c1);

        Classe c2 = xmlMapper.readValue(new File("test.xml"), Classe.class);
        System.out.println(c2.aula);
        System.out.println(c2.numero);
    }
}