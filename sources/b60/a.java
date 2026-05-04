package b60;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import l60.m;
import m80.k;
import okhttp3.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0108a f6151c = new C0108a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f6152d = 262144;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f6153a;

    /* renamed from: b, reason: collision with root package name */
    public long f6154b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: b60.a$a, reason: collision with other inner class name */
    public static final class C0108a {
        public /* synthetic */ C0108a(v vVar) {
            this();
        }

        public C0108a() {
        }
    }

    public a(@k m source) {
        g0.p(source, "source");
        this.f6153a = source;
        this.f6154b = PlaybackStateCompat.E;
    }

    @k
    public final m a() {
        return this.f6153a;
    }

    @k
    public final h b() {
        h.a aVar = new h.a();
        while (true) {
            String c11 = c();
            if (c11.length() == 0) {
                return aVar.i();
            }
            aVar.f(c11);
        }
    }

    @k
    public final String c() {
        String b52 = this.f6153a.b5(this.f6154b);
        this.f6154b -= b52.length();
        return b52;
    }
}
