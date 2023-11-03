package me.dio.kafkarest.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderData {

	private String code;
	private String productName;
	private BigDecimal value;

}
