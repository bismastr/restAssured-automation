package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreatePassenger {
    private String name = "Automation Testing";
    private Integer trips = 200;
    private Integer airline = 5;
}
