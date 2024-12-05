package intentoA.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import intentoA.demo.model.Recharge;

@Repository
public interface RechargeRepository extends JpaRepository <Recharge, Integer>  {
    
}
