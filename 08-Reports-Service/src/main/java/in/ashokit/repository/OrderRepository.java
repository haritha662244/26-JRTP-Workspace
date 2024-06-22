
package in.ashokit.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Order;
import in.ashokit.entity.OrderStatus;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	@Query("Select o From Order o Where o.status= :status")
	List<Order> findbyStatus(OrderStatus status);

	@Query("Select o From Order o Where 0.orderDate Between :startDate And :endDate")
	List<Order> findOrderBetweenDates(@Param("startDate") LocalDate startDate, @Param("endDate")LocalDate endDate);
}
