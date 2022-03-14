package com.sovos.main;
import java.text.DecimalFormat;
import com.sovos.salariocal.Chefe;
import com.sovos.salariocal.PorComissao;
import com.sovos.salariocal.PorHora;
import com.sovos.salariocal.PorItem;

public class Teste {

    public static void main(String[] args) {
        Chefe ch = new Chefe("Matheus","Brun", 1600.00);
        PorComissao pc = new PorComissao("Bernado", "Silva", 1700, 400, 2);
        PorItem pi = new PorItem("Gabriel", "Daniel",750, 3);
        PorHora ph = new PorHora("Ana", "Lima", 20, 120);
        DecimalFormat df = new DecimalFormat();
        System.out.println(ch.toString() + " ganha $" + df.format(ch.ganhar()));
        System.out.println(pc.toString() + " ganha $" + df.format(pc.ganhar()));
        System.out.println(pi.toString() + " ganha $" + df.format(pi.ganhar()));
        System.out.println(ph.toString() + " ganha $" + df.format(ph.ganhar()));

    }
}
