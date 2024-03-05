package application.movietheater.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class RequestAddMovie {

    private String name;

    private String actor;

    private Integer duration;
}
