package edu.wctc.databasedemo;

import edu.wctc.databasedemo.entity.Pets;
import edu.wctc.databasedemo.repo.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetsController {

    @Autowired
    private PetsRepository petsRepository;

    @GetMapping("/petlist")
    public String showPetList(Model model)
    {
        List<Pets> list = new ArrayList<>();
         petsRepository.findAll().forEach(list::add);

         model.addAttribute("petList", list);

        return "pet-list";

    }

}
