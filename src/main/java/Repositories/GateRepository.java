package Repositories;

import Exceptions.GateNotFoundException;
import models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    //This class should be able to do CRUD Operations

    private Map<Long, Gate> gates = new HashMap<>();

    public Map<Long, Gate> getGates() {
        return gates;
    }

    public void setGates(Map<Long, Gate> gates) {
        this.gates = gates;
    }

    public Gate findGateById(Long id) throws GateNotFoundException {
        if (gates.containsKey(id)) {
            return gates.get(id);
        }
        throw new GateNotFoundException();
    }


}
