package online.mokkoji.api.response;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import online.mokkoji.db.entity.User.Provider;

@Getter
@ToString
@AllArgsConstructor
public class SignupPageDto {
    @NotBlank
    private String email;

    @NotBlank
    private String name;

    @NotBlank
    private String image;
}
