package in.satish;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Customer {
	private Integer cusId;
	private String cusName;
	private String cusEmail;
	private Long cusPhn;
}
