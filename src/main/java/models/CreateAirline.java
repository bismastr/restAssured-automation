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
    private String name = "Name Testing";
    private String country = "Country Testing";
    private String logo = "Logo Testing";
    private String slogan = "Slogan Testing";
    private String head_quaters = "Testing Quaters";
    private String website = "Testing Website";
    private String established = "Established Testing";

}
