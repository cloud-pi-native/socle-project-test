package fr.gouv.interieur.dso.service.jdbc;

import fr.gouv.interieur.dso.models.Demo;
import fr.gouv.interieur.dso.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public List<Demo> getListDemo(){
        return demoRepository.getAll();
    }
}
