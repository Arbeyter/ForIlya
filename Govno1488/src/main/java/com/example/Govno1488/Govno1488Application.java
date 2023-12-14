package com.example.Govno1488;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
@SpringBootApplication
@RestController
public class Govno1488Application {

	public static void main(String[] args) {
		SpringApplication.run(Govno1488Application.class, args);
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/game/start")
	public String start(@RequestParam(value = "userId") String userId){
		return userId;
	}
	@GetMapping("/game/step")
	public String step(@RequestParam(value = "dropDice", defaultValue = "000000") String dropDice,
					   @RequestParam(value = "by", defaultValue = "player") Boolean by,
					   @RequestParam(value = "isEnd", defaultValue="no") Boolean isEnd,
					   @RequestParam(value = "id") Integer id){
		return String.format("%s", dropDice);
	}
	@GetMapping("/game/getSteps")
	public String getSteps(@RequestParam(value="id") Integer id){
		return "pizda";
	}
	@GetMapping("/game/end")
	public String end(@RequestParam(value = "idSession") Integer idSession){
		return "malafya";

	}
	//@PostMapping("/users")
	//public ResponseEntity<Void> createUser(@RequestBody User user) {
	//	// сохранение пользователя в базу данных
	//	return ResponseEntity.status(HttpStatus.CREATED).build();
	//}
}
