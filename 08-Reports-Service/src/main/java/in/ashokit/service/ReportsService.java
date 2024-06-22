
package in.ashokit.service;

import java.time.LocalDate;
import java.util.List;

import in.ashokit.dto.OrderDto;
import in.ashokit.entity.Order;
import in.ashokit.entity.OrderStatus;

public interface ReportsService {

	public List<OrderDto> getAllOrders();
	
	public List<OrderDto> orderByStatus(OrderStatus status);
	public List<OrderDto> getOrdersBetweenDate(LocalDate startDate , LocalDate endDate);
}
