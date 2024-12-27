package tn.esprit.examen.ExamenTrain.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examen.ExamenTrain.entities.Train;
import tn.esprit.examen.ExamenTrain.services.ITrainService;

@Tag(name = "\uD83D\uDCDA Train Management")
@RestController
@RequestMapping("train")
@RequiredArgsConstructor
public class TrainRestController {
    private final ITrainService trainService;

    @PostMapping("/addTrain")
    public void ajouterTrain(@RequestBody Train train){
        trainService.ajouterTrain(train);
    }
@PutMapping("/affecterTrainAGare/{idTrain}/{idGareDepart}/{idGareArrivee}")
    public void affecterTrainAGare(@PathVariable("idTrain") Long idTrain,@PathVariable("idGareDepart") Long idGareDepart,@PathVariable("idGareArrivee") Long idGareArrivee){
        trainService.affecterTrainAGare(idTrain,idGareDepart,idGareArrivee);
    }
}
