package qk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import pk.o;
import pk.p;
import pk.s;
import sk.d1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f82349a;

    public e(Context context) {
        this.f82349a = context.getApplicationContext();
    }

    @Override // pk.o
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        if (jk.b.f(i11, i12) && c(eVar)) {
            return new o.a<>(new el.e(uri), jk.c.c(this.f82349a, uri));
        }
        return null;
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return jk.b.e(uri);
    }

    public final boolean c(ik.e eVar) {
        Long l11 = (Long) eVar.c(d1.f88743g);
        return l11 != null && l11.longValue() == -1;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f82350a;

        public a(Context context) {
            this.f82350a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Uri, InputStream> build(s sVar) {
            return new e(this.f82350a);
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
