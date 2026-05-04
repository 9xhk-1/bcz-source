package el;

import android.content.Context;
import androidx.annotation.NonNull;
import fl.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class a implements ik.b {

    /* renamed from: c, reason: collision with root package name */
    public final int f49871c;

    /* renamed from: d, reason: collision with root package name */
    public final ik.b f49872d;

    public a(int i11, ik.b bVar) {
        this.f49871c = i11;
        this.f49872d = bVar;
    }

    @NonNull
    public static ik.b c(@NonNull Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // ik.b
    public void a(@NonNull MessageDigest messageDigest) {
        this.f49872d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f49871c).array());
    }

    @Override // ik.b
    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f49871c == aVar.f49871c && this.f49872d.equals(aVar.f49872d)) {
                return true;
            }
        }
        return false;
    }

    @Override // ik.b
    public int hashCode() {
        return o.r(this.f49872d, this.f49871c);
    }
}
