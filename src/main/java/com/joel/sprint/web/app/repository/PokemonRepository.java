package com.joel.sprint.web.app.repository;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.joel.sprint.web.app.models.PokemonModel;
@Repository
public interface PokemonRepository{
	ArrayList<PokemonModel> getByNombre(String nombre);
	
}
