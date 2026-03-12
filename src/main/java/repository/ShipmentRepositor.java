package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.model.Shipment;

public interface ShipmentRepositor extends JpaRepository<Shipment, Integer>
{

}