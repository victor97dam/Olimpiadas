package com.example.controller;

        import com.example.repository.AtletaRepository;
        import com.example.domain.Atleta;
        import com.example.domain.Medalla;
        import com.example.domain.enumeracion;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.web.bind.annotation.*;

        import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.util.Collection;
        import java.util.List;
        import java.util.Map;
        import java.util.stream.Collectors;

        import static java.util.stream.Collectors.groupingBy;

/**
 * Created by DAM on 1/12/16.
 */
@RestController
@RequestMapping("/Olimpiadas")
public class OlimpiadasController {

    @Autowired
    private AtletaRepository atletaRepository;

    @ResponseStatus(HttpStatus.CREATED)
    //CRUD
    //
    //Crear
    @PostMapping
    public Atleta CreatAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    //Actualizar
    @PutMapping
    public Atleta ActualizarAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }

    //Borrar
    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        atletaRepository.delete(id);
    }

    //Leer
    @GetMapping("/{id}")
    public Atleta findById(@PathVariable Long id) {
        Atleta atleta = atletaRepository.findOne(id);
        return atleta;
    }

    //Devolver todos los Atletas de una nacionalidad determinada
    @GetMapping("/{nacionalidad}")
    public List<Atleta> getAtletasByNacionalidad(@PathVariable String nacionalidad){
        return atletaRepository.findAll().parallelStream().filter(atleta -> atleta.getNacionalidad().toLowerCase().equals(nacionalidad.toLowerCase())).collect(Collectors.toList());
    }

    //Devolver todos los atletas que hayan nacido en una fecha anterior a una fecha determinada.
    @GetMapping("/nacimiento-antes/{nacimientoStr}")
    public List<Atleta> getAtletasNacimientoAntesDe(@PathVariable String nacimientoStr){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate nacimiento = LocalDate.parse(nacimientoStr, formatter);
        return atletaRepository
                .findAll().parallelStream().filter(atleta -> atleta.getFechanacimiento().isBefore(nacimiento)).collect(Collectors.toList());
    }

    //Retornar todos los atletas agrupados por nacionalidad mediante un Map <<String>>, List <<Atleta>>;
    @GetMapping("/Groupbynation")
    public  Map<String,List<Atleta>> Atletagroupbynation () {
        return   atletaRepository.findAll().parallelStream().collect(groupingBy(Atleta::getNacionalidad));

    }
    //Retornar todos los atletas agrupados por tipo de medalla mediante un Map
    @GetMapping("/Tipomedalla")
    public  Map<enumeracion,List<Atleta>> Tipomedalla () {
        //RETORNAR TODOS LOS ATLETAS AGRUPADOS POR TIPO DE MEDALLA MEDIANTE UN MAP
        return null;

    }






}