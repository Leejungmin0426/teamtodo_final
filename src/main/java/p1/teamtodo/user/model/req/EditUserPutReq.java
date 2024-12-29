package p1.teamtodo.user.model.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Schema(name = "유저 정보 수정 PUT 요청", description = "수정 버튼 클릭시 PUT 요청")
public class EditUserPutReq {

    @NotNull
    @Schema(title = "수정하려는 대상 번호", type = "long", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private long targetUserNo;

    @NotBlank
    @Schema(title = "유저 닉네임", type= "string", example = "닉네임입니다", requiredMode = Schema.RequiredMode.REQUIRED)
    private String nickname;

    @NotBlank
    @Schema(title = "유저 상태메세지", type= "string", example = "상태메세지 입니다")
    private String statusMessage;
}
