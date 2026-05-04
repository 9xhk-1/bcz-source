package pk;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f80780b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final o<h, Data> f80781a;

    public z(o<h, Data> oVar) {
        this.f80781a = oVar;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<Data> buildLoadData(@NonNull Uri uri, int i11, int i12, @NonNull ik.e eVar) {
        return this.f80781a.buildLoadData(new h(uri.toString()), i11, i12, eVar);
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull Uri uri) {
        return f80780b.contains(uri.getScheme());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<Uri, InputStream> {
        @Override // pk.p
        @NonNull
        public o<Uri, InputStream> build(s sVar) {
            return new z(sVar.d(h.class, InputStream.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
