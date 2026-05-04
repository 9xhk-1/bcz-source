package c60;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C0133a f8123d = new C0133a(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8124e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final String f8125f = ":status";

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f8126g = ":method";

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final String f8127h = ":path";

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final String f8128i = ":scheme";

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final String f8129j = ":authority";

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8130k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8131l;

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8132m;

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8133n;

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    @k
    public static final ByteString f8134o;

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final ByteString f8135a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final ByteString f8136b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f8137c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: c60.a$a, reason: collision with other inner class name */
    public static final class C0133a {
        public /* synthetic */ C0133a(v vVar) {
            this();
        }

        public C0133a() {
        }
    }

    static {
        ByteString.a aVar = ByteString.Companion;
        f8124e = aVar.l(":");
        f8130k = aVar.l(f8125f);
        f8131l = aVar.l(f8126g);
        f8132m = aVar.l(f8127h);
        f8133n = aVar.l(f8128i);
        f8134o = aVar.l(f8129j);
    }

    public a(@k ByteString name, @k ByteString value) {
        g0.p(name, "name");
        g0.p(value, "value");
        this.f8135a = name;
        this.f8136b = value;
        this.f8137c = name.size() + 32 + value.size();
    }

    public static /* synthetic */ a d(a aVar, ByteString byteString, ByteString byteString2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            byteString = aVar.f8135a;
        }
        if ((i11 & 2) != 0) {
            byteString2 = aVar.f8136b;
        }
        return aVar.c(byteString, byteString2);
    }

    @k
    public final ByteString a() {
        return this.f8135a;
    }

    @k
    public final ByteString b() {
        return this.f8136b;
    }

    @k
    public final a c(@k ByteString name, @k ByteString value) {
        g0.p(name, "name");
        g0.p(value, "value");
        return new a(name, value);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f8135a, aVar.f8135a) && g0.g(this.f8136b, aVar.f8136b);
    }

    public int hashCode() {
        return (this.f8135a.hashCode() * 31) + this.f8136b.hashCode();
    }

    @k
    public String toString() {
        return this.f8135a.utf8() + ": " + this.f8136b.utf8();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(@m80.k java.lang.String r2, @m80.k java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r3, r0)
            okio.ByteString$a r0 = okio.ByteString.Companion
            okio.ByteString r2 = r0.l(r2)
            okio.ByteString r3 = r0.l(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c60.a.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@k ByteString name, @k String value) {
        this(name, ByteString.Companion.l(value));
        g0.p(name, "name");
        g0.p(value, "value");
    }
}
