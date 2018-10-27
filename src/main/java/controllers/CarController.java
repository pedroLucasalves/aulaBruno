package controllers;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import interfaces.GenericOperations;
import model.Car;

@RestController
@RequestMapping(path = "/car")
public class CarController  implements GenericOperations<Car>{

	@Override
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
						MediaType.APPLICATION_XML_VALUE
				},
				 consumes = {MediaType.APPLICATION_JSON_VALUE,
						 MediaType.APPLICATION_XML_VALUE})
	public Car create(@RequestBody Car entity) {
		
		return null;
	}

	@Override
	public void update(Car entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Car read(Car entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> create(List<Car> entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(List<Car> entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> read(List<Car> entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(List<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

}
