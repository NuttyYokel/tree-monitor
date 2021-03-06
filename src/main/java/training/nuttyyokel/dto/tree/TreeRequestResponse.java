package training.nuttyyokel.dto.tree;

import com.fasterxml.jackson.annotation.JsonFormat;
import training.nuttyyokel.dto.GenericResponse;

import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

/**
 * @author DrMarcell
 */
public class TreeRequestResponse extends GenericResponse {

  @Id
  private int id;

  @NotNull
  @Size(min = 2, max = 300)
  private String name;

  @NotNull
  @Size(min = 2, max = 300)
  private String type;

  @NotNull
  @Past
  @JsonFormat(pattern = "yyyy-MM-dd")
  private Date datePlanted;

  @Min(1)
  @Max(100000)
  private double height;

  @Min(1)
  @Max(9)
  private int health;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Date getDatePlanted() {
    return datePlanted;
  }

  public void setDatePlanted(Date datePlanted) {
    this.datePlanted = datePlanted;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }
}
