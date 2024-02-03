package fontys.sem3.chess.controller.dto.chessdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndMatchRequest {
    private @NotNull Long matchId;
    private @NotBlank String matchResult;
}
