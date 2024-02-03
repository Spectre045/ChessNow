package fontys.sem3.chess.controller.dto.userdto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InvitationMessage {
    private long id;
    private String sender;
    private String reciever;
}
