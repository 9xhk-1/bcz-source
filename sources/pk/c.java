package pk;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c implements ik.a<ByteBuffer> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f80670a = "ByteBufferEncoder";

    @Override // ik.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull ik.e eVar) {
        try {
            fl.a.f(byteBuffer, file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable(f80670a, 3)) {
                return false;
            }
            Log.d(f80670a, "Failed to write data", e11);
            return false;
        }
    }
}
