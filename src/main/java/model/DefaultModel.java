package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;



@Data
@MappedSuperclass
public class DefaultModel {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 protected Integer id;
}
