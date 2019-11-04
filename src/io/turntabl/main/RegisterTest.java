package io.turntabl.main;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    List<Client> clients = Arrays.asList(new Corporate("MTN", 335, ServiceLabel.GOLD, "Daniel James"),
            new Corporate("Hans Bakery", 325, ServiceLabel.PREMIUM, "Mary Siaw"),
            new Corporate("Jennifer Catering", 135, ServiceLabel.GOLD, "Jessica Davids"),
            new Corporate("Ecobank Bank", 835, ServiceLabel.PLATINUM, "Robert Gordon"),
            new Corporate("Ama's Saloon", 224, ServiceLabel.PREMIUM, "Mabel Simons"),
            new Private("Nathaniel Wood", 56778, ServiceLabel.GOLD),
            new Private("Samuel Kwakye", 5578, ServiceLabel.GOLD),
            new Private("Christiana Asare", 3316, ServiceLabel.PREMIUM),
            new Private("David Green", 778, ServiceLabel.PLATINUM));

    Register register1 = new Register(clients);

    @Test
    void clientsGold() {

        List<String> clientNames = register1.clientsGold();
        List<String> expectedNames = Arrays.asList("Daniel James", "Jessica Davids", "Nathaniel Wood", "Samuel Kwakye");
        assertEquals(expectedNames, clientNames);

    }

    @Test
    void countGold() {
        Map<String, Long> mapOfClients = register1.count();
        Long gold = mapOfClients.get("Gold Clients");
        assertEquals(4, gold);
    }

    @Test
    void getClientNameById(){

        Private client1 =  new Private("David Green", 778, ServiceLabel.PLATINUM);
        Optional<String> clientName = register1.clientName(client1);
        System.out.println(clientName);
    }

    @Test
    void countPremium() {
        Map<String, Long> mapOfClients = register1.count();
        Long premium = mapOfClients.get("Premium Clients");
        assertEquals(3, premium);
    }

    @Test
    void countPlatinum() {
        Map<String, Long> mapOfClients = register1.count();
        Long platinum = mapOfClients.get("Platinum Clients");
        assertEquals(2, platinum);
    }
}