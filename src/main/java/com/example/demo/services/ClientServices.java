package com.example.demo.services;

import com.example.demo.model.ClientModel;
import com.example.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {

    @Autowired
    ClientRepository clientRepository;

    public ClientModel saveClient(ClientModel clientModel){
        return clientRepository.save(clientModel);
    }

    public Optional <ClientModel> getClientId(Long id){
        return clientRepository.findById(id);
    }

    public List<ClientModel> getAllClients(){
        return clientRepository.findAll();
    }

    public  ResponseEntity<Void> updateClient(ClientModel clientModel){
        if(clientModel.getId() != null){
            if(! clientRepository.findById(clientModel.getId()).isEmpty()){
                clientRepository.save(clientModel);
                return new ResponseEntity<Void>(HttpStatus.OK);
            }else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else{
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<Void> deleteClient(Long id) {
        if (id != null) {
            if (!clientRepository.findById(id).isEmpty()) {
                clientRepository.deleteById(id);
                return new ResponseEntity<Void>(HttpStatus.OK);
            } else {
                return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
            }
        }else {
            return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
        }
    }

}
