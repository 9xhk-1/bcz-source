package g1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface c extends Closeable {
    @NonNull
    InputStream C5() throws IOException;

    boolean S5();

    @Nullable
    String m5();

    @Nullable
    String v();
}
