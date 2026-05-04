package qk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import pk.o;
import pk.p;
import pk.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d implements o<Uri, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f82347a;

    public d(Context context) {
        this.f82347a = context.getApplicationContext();
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        if (jk.b.f(i11, i12)) {
            return new o.a<>(new el.e(uri), jk.c.b(this.f82347a, uri));
        }
        return null;
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return jk.b.b(uri);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f82348a;

        public a(Context context) {
            this.f82348a = context;
        }

        @Override // pk.p
        @NonNull
        public o<Uri, InputStream> build(s sVar) {
            return new d(this.f82348a);
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
