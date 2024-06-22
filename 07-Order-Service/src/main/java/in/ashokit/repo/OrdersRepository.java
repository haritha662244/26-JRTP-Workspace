
package in.ashokit.repo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Orders;

public interface OrdersRepository  extends JpaRepository<Orders,Integer>{

	public List<Orders> findByUserId(Integer userId);
	public List<Orders> findByOrderDateAndOrderStatus(LocalDate orderDate,String orderStatus);
}
