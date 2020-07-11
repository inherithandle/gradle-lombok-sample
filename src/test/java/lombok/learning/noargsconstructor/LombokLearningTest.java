package lombok.learning.noargsconstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.junit.Test;

public class LombokLearningTest {

    @Getter
    @Setter
    @NoArgsConstructor
    public class LombokPOJO {
        private Integer num;
        @NonNull
        private String str;


    }

    public class JustPOJO {

        private String str;

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

    @Test
    public void NoArgsConstructor에_의해_생성된_생성자는_Nonnull필드를_nullcheck안해준다() {
        LombokPOJO lombokPOJO = new LombokPOJO();
    }

    @Test(expected = NullPointerException.class)
    public void NonNull필드는_자동생성세터메서드에_널체크코드가_들어간다() {
        LombokPOJO lombokPOJO = new LombokPOJO();
        lombokPOJO.setStr(null);
    }
}
