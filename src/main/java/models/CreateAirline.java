package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateAirline {
    private String id;
    private String name;
    private String country;
    private String logo;
    private String slogan;
    private String head_quaters;
    private String website;
    private String established;


}
