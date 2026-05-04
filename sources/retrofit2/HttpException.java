package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import lb0.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient y<?> response;

    public HttpException(y<?> yVar) {
        super(getMessage(yVar));
        this.code = yVar.b();
        this.message = yVar.h();
        this.response = yVar;
    }

    private static String getMessage(y<?> yVar) {
        Objects.requireNonNull(yVar, "response == null");
        return "HTTP " + yVar.b() + " " + yVar.h();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public y<?> response() {
        return this.response;
    }
}
