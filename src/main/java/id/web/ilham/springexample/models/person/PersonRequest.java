package id.web.ilham.springexample.models.person;

import lombok.Data;
import lombok.NonNull;

@Data
public class PersonRequest {

    @NonNull
    String name;

    @NonNull
    Integer age;
}
