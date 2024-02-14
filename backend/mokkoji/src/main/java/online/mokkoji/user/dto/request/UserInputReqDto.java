package online.mokkoji.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserInputReqDto {

    @NotNull
    private String email;

    @NotBlank
    private String name;

    @NotBlank
    private String image;

    private String bank;
    private String accountNumber;
}
