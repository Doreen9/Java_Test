package io.turntabl.main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Register {
    private List<Client> clients;


    public Register(List<Client> clients) {
        this.clients = clients;
    }

    public List<String> clientsGold(){
        List<String> names = clients.stream().filter(s -> s.getLabel() == ServiceLabel.GOLD).map(Client::getClientName).collect(Collectors.toList());

        return names;
    }

     public Optional <String> clientName(Client client){
         Integer IdNumber = client.getClientID();
         List<String> clientNameById = clients.stream().filter(c -> c.getClientID() == IdNumber).map(Client::getClientName).collect(Collectors.toList());
         if(clientNameById.size() != 0) {
                return Optional.ofNullable(clientNameById.get(0));
         }
         else
             return null;

   }

    public Map<String, Long> count(){
        Map<String, Long> mapOfClients = new HashMap<>();
        Long gold = clients.stream().filter(c -> c.getLabel() == ServiceLabel.GOLD).count();
        Long premium = clients.stream().filter(c -> c.getLabel() == ServiceLabel.PREMIUM).count();
        Long platinum = clients.stream().filter(c -> c.getLabel() == ServiceLabel.PLATINUM).count();
        mapOfClients.put("Gold Clients", gold);
        mapOfClients.put("Premium Clients", premium);
        mapOfClients.put("Platinum Clients", platinum);

        return mapOfClients;
    }


}
