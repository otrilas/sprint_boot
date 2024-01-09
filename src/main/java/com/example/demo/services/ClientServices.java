package com.example.demo.services;

import com.example.demo.model.ClientModel;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {

    @Autowired
    ClientRepository clientRepository;

    public ClientModel saveClient(ClientModel clientModel){
        // --------  return clientRepository.save(clientModel);
        try {
            // Tu lógica aquí
            return clientRepository.save(clientModel);
        } catch (Exception e) {
            // Manejar la excepción y proporcionar mensajes de error adecuados
            throw new RuntimeException("Error al guardar el cliente", e);
        }
    }

    public Optional <ClientModel> getClientId(Long id){
        return clientRepository.findById(id);
    }

    public List<ClientModel> getAllClients(){
        return clientRepository.findAll();
    }
}
