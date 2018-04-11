package pl.homecenter.japlace.dao;


import lombok.Getter;
import lombok.Setter;

/**
 * @author s.wieczorek
 */
@Setter
@Getter
public class Invoice {
    private String id;
    private Double value;
    private String number;
}
