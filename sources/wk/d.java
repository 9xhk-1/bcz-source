package wk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.IOException;
import kk.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements ik.g<c> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f96440a = "GifEncoder";

    @Override // ik.g
    @NonNull
    public EncodeStrategy a(@NonNull ik.e eVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // ik.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull u<c> uVar, @NonNull File file, @NonNull ik.e eVar) {
        try {
            fl.a.f(uVar.get().c(), file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable(f96440a, 5)) {
                return false;
            }
            Log.w(f96440a, "Failed to encode GIF drawable data", e11);
            return false;
        }
    }
}
