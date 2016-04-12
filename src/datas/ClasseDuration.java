package datas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClasseDuration {
	
	public static void main(String[] args) {
		
		
		long qtdHorasDeMinutos = Duration.ofMinutes(120).toHours();
		System.out.println(qtdHorasDeMinutos);
		
		long qtdDias = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, 7, 10, 0, 0)).toDays();
		System.out.println(qtdDias);
		
		List<String> list = new ArrayList<>();
	}

}
