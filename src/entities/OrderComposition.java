package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatusComposition;

public class OrderComposition {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatusComposition status;
	
	private ClientComposition client;
	private List<OrderItemComposition> items = new ArrayList<>();
	
	public OrderComposition(Date moment, OrderStatusComposition status, ClientComposition client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusComposition getStatus() {
		return status;
	}

	public void setStatus(OrderStatusComposition status) {
		this.status = status;
	}

	public ClientComposition getClient() {
		return client;
	}

	public void setClient(ClientComposition client) {
		this.client = client;
	}

	public List<OrderItemComposition> getItems() {
		return items;
	}
	
	public void addItem(OrderItemComposition item) {
		items.add(item);
	}

	public void removeItem(OrderItemComposition item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItemComposition item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItemComposition item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
