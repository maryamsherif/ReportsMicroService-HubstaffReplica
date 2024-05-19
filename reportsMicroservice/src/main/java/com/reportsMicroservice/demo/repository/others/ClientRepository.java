package com.reportsMicroservice.demo.repository.others;

import com.reportsMicroservice.demo.model.others.Client;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.reportsMicroservice.demo.model.others.Client.BudgetType;
import com.reportsMicroservice.demo.model.others.Client.BudgetBasedOn;

@Repository
public class ClientRepository {

    private final List<Client> clients = new ArrayList<>();

    public ClientRepository() {

        clients.add(new Client(
                1, "Client A", "clientA@mail.com", "1234567890", "111 Main St",
                Collections.emptyList(), // Assuming no projects initially
                true, // billable
                BudgetType.TotalCost, // Assuming enum values
                BudgetBasedOn.BillRate,
                10000.0, // budgetCost
                7500.0, // budgetNotifyAt
                new Date(), // budgetStartDate
                false, // budgetIncludeNonBillabeTime
                101 // organizationId
        ));
        clients.add(new Client(
                2, "Client B", "clientB@mail.com", "1234567890", "222 Main St",
                Collections.emptyList(), // Assuming no projects initially
                false, // billable
                BudgetType.TotalCost, // Assuming enum values
                BudgetBasedOn.BillRate,
                20000.0, // budgetCost
                15000.0, // budgetNotifyAt
                new Date(), // budgetStartDate
                true, // budgetIncludeNonBillabeTime
                102 // organizationId
        ));
        clients.add(new Client(
                3, "Client C", "clientC@mail.com", "1234567890", "333 Main St",
                Collections.emptyList(), // Assuming no projects initially
                true, // billable
                BudgetType.TotalCost, // Assuming enum values
                BudgetBasedOn.BillRate,
                30000.0, // budgetCost
                22500.0, // budgetNotifyAt
                new Date(), // budgetStartDate
                false, // budgetIncludeNonBillabeTime
                103 // organizationId
        ));
    }

    public List<Client> findAll() {
        return clients;
    }

    public Optional<Client> findById(Integer clientId) {
        return clients.stream()
                .filter(client -> client.getClientId().equals(clientId))
                .findFirst();
    }

}
