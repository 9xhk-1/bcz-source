package c1;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7465b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final LruCache<String, k> f7466a = new LruCache<>(20);

    @VisibleForTesting
    public f() {
    }

    public static f c() {
        return f7465b;
    }

    public void a() {
        this.f7466a.evictAll();
    }

    @Nullable
    public k b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f7466a.get(str);
    }

    public void d(@Nullable String str, k kVar) {
        if (str == null) {
            return;
        }
        this.f7466a.put(str, kVar);
    }

    public void e(int i11) {
        this.f7466a.resize(i11);
    }
}
