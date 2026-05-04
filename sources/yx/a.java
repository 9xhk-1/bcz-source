package yx;

import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C1373a f100366c = new C1373a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f100367d = new a("1.6.0", 0);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f100368a;

    /* renamed from: b, reason: collision with root package name */
    public final int f100369b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: yx.a$a, reason: collision with other inner class name */
    public static final class C1373a {
        public /* synthetic */ C1373a(v vVar) {
            this();
        }

        @k
        public final a a(@k String rawVersion) {
            g0.p(rawVersion, "rawVersion");
            try {
                List n52 = k0.n5(rawVersion, new char[]{'-', '_'}, false, 0, 6, null);
                return n52.size() == 2 ? new a((String) n52.get(0), Integer.parseInt((String) n52.get(1))) : new a(rawVersion, -1);
            } catch (Throwable unused) {
                return a.f100367d;
            }
        }

        public C1373a() {
        }
    }

    public a(@k String major, int i11) {
        g0.p(major, "major");
        this.f100368a = major;
        this.f100369b = i11;
    }

    @k
    public final String b() {
        return this.f100368a;
    }

    public final int c() {
        return this.f100369b;
    }
}
