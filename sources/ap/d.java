package ap;

import com.google.gson.t;
import java.sql.Timestamp;
import java.util.Date;
import xo.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f5400a;

    /* renamed from: b, reason: collision with root package name */
    public static final d.b<? extends Date> f5401b;

    /* renamed from: c, reason: collision with root package name */
    public static final d.b<? extends Date> f5402c;

    /* renamed from: d, reason: collision with root package name */
    public static final t f5403d;

    /* renamed from: e, reason: collision with root package name */
    public static final t f5404e;

    /* renamed from: f, reason: collision with root package name */
    public static final t f5405f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d.b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // xo.d.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public java.sql.Date f(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends d.b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // xo.d.b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Timestamp f(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z11;
        try {
            Class.forName("java.sql.Date");
            z11 = true;
        } catch (ClassNotFoundException unused) {
            z11 = false;
        }
        f5400a = z11;
        if (z11) {
            f5401b = new a(java.sql.Date.class);
            f5402c = new b(Timestamp.class);
            f5403d = ap.a.f5394b;
            f5404e = ap.b.f5396b;
            f5405f = c.f5398b;
            return;
        }
        f5401b = null;
        f5402c = null;
        f5403d = null;
        f5404e = null;
        f5405f = null;
    }
}
