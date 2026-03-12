package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Shipment;

@Service
public class ShipmentService {

    @Autowired
    ShipmentRepository repo;

    // Add Shipment
    public Shipment addShipment(Shipment s)
    {
        return repo.save(s);
    }

    // Update Shipment
    public Shipment updateShipment(int id, Shipment s)
    {
        Optional<Shipment> obj = repo.findById(id);

        if(obj.isPresent())
        {
            Shipment ship = obj.get();
            ship.setName(s.getName());
            ship.setDate(s.getDate());
            ship.setStatus(s.getStatus());

            return repo.save(ship);
        }

        return null;
    }
}