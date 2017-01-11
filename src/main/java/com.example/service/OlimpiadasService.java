package com.example.service;

import com.example.domain.Atleta;
import com.example.domain.Medalla;
import com.example.domain.enumeracion;
import com.example.repository.AtletaRepository;
import com.example.repository.MedallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by DAM on 20/10/16.
 */
@Service
public class OlimpiadasService {


    @Autowired
    private AtletaRepository atletaRepository;
    @Autowired
    private MedallaRepository medallaRepository;

    public void crearCosas() {

        Atleta a1 = new Atleta("Pepito", "Jiménez", "España",LocalDate.of(1997,2,2));
        Atleta a2 = new Atleta("Aaron", "Baguette", "Francia",LocalDate.of(1987,1,20));
        Atleta a3 = new Atleta("Oriol", "Men", "Italia",LocalDate.of(1976,10,5));
        Atleta a4 = new Atleta("Dimitry", "Vegas", "Rusia",LocalDate.of(1994,12,25));
        Atleta a5 = new Atleta("Alicia", "Ross", "Alemania",LocalDate.of(1991,3,14));
        Atleta a6 = new Atleta("Paco", "González", "España",LocalDate.of(1997,7,12));
        Atleta a7 = new Atleta("Carloine", "Fagot", "Francia",LocalDate.of(1992,9,18));
        Atleta a8 = new Atleta("Oscar", "Rivaldo", "Italia",LocalDate.of(1993,6,28));
        Atleta a9 = new Atleta("Irina", "Karin", "Rusia",LocalDate.of(1994,8,8));

        atletaRepository.save(a1);
        atletaRepository.save(a2);
        atletaRepository.save(a3);
        atletaRepository.save(a4);
        atletaRepository.save(a5);
        atletaRepository.save(a6);
        atletaRepository.save(a7);
        atletaRepository.save(a8);
        atletaRepository.save(a9);


        Medalla m1 = new Medalla(enumeracion.Bronce, "mariposa", "natacion", a1);
        Medalla m2 = new Medalla(enumeracion.Plata, "mariposa", "natacion", a2);
        Medalla m3 = new Medalla(enumeracion.Oro, "mariposa", "natacion", a3);

        Medalla m4 = new Medalla(enumeracion.Bronce, "braza", "natacion", a4);
        Medalla m5 = new Medalla(enumeracion.Plata, "braza", "natacion", a5);
        Medalla m6 = new Medalla(enumeracion.Oro, "braza", "natacion", a6);


        Medalla m7 = new Medalla(enumeracion.Bronce, "100m", "atletismo", a7);
        Medalla m8= new Medalla(enumeracion.Plata, "100m", "atletismo", a8);
        Medalla m9 = new Medalla(enumeracion.Oro, "100m", "atletismo", a9);

       // Medalla m13 = new Medalla(enumeracion.Bronce, "400m", "atletismo");
      //  Medalla m14 = new Medalla(enumeracion.Plata, "400m", "atletismo");
       // Medalla m15 = new Medalla(enumeracion.Oro, "400m", "atletismo");

      //  Medalla m16 = new Medalla(enumeracion.Bronce, "salto de longitud", "atletismo");
      //  Medalla m17 = new Medalla(enumeracion.Plata, "salto de longitud", "atletismo");
      // Medalla m18 = new Medalla(enumeracion.Oro, "salto de longitud", "atletismo");

        medallaRepository.save(m1);
        medallaRepository.save(m2);
        medallaRepository.save(m3);
        medallaRepository.save(m4);
        medallaRepository.save(m5);
        medallaRepository.save(m6);
        medallaRepository.save(m7);
        medallaRepository.save(m8);
        medallaRepository.save(m9);



    }







}
