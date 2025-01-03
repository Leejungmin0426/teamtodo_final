package p1.teamtodo.user.model.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.beans.ConstructorProperties;

@Getter
@Setter
@Schema(title = "유저 정보 요청 GET 요청", description = "유저 상세 페이지와 수정 페이지에서도 사용가능.")
@ToString
public class UserInfoGetReq {

    @NotNull
    @Schema(title = "화면에 띄울 프로필 유저 번호", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private long targetUserNo;

    @NotNull
    @Schema(title = "로그인한 유저 번호", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    private long signedUserNo;

//    @NotBlank
//    @Schema(title = "무슨 요청 페이지", example = "my", requiredMode = Schema.RequiredMode.REQUIRED)
//    private String page;

    @ConstructorProperties({"targetUserNo","signedUserNo"})
    public UserInfoGetReq(long targetUserNo, long signedUserNo) {
        this.targetUserNo = targetUserNo;
        this.signedUserNo = signedUserNo;
    }
}
