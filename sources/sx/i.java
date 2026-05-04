package sx;

import java.io.IOException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    public static final Void c() {
        throw new IOException("Selectable is already closed");
    }

    public static final Void d(int i11, int i12) {
        throw new IllegalStateException(("Selectable is invalid state: " + i11 + j2.O + i12).toString());
    }
}
