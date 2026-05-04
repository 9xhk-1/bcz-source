package com.baicizhan.main.activity.schedule_v2.mutimode.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final b f19301b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f19302c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f19303a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a extends e {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final a f19304d = new a();

        /* renamed from: e, reason: collision with root package name */
        public static final int f19305e = 0;

        public a() {
            super(100, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final e a(int i11) {
            return i11 == 0 ? d.f19308d : i11 == 1 ? c.f19306d : i11 == 2 ? C0296e.f19310d : (3 > i11 || i11 >= 11) ? (14 > i11 || i11 >= 100) ? i11 == 100 ? a.f19304d : f.f19312d : new g(i11) : new g(i11);
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class c extends e {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final c f19306d = new c();

        /* renamed from: e, reason: collision with root package name */
        public static final int f19307e = 0;

        public c() {
            super(1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class d extends e {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final d f19308d = new d();

        /* renamed from: e, reason: collision with root package name */
        public static final int f19309e = 0;

        public d() {
            super(0, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    /* renamed from: com.baicizhan.main.activity.schedule_v2.mutimode.data.e$e, reason: collision with other inner class name */
    public static final class C0296e extends e {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C0296e f19310d = new C0296e();

        /* renamed from: e, reason: collision with root package name */
        public static final int f19311e = 0;

        public C0296e() {
            super(2, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class f extends e {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final f f19312d = new f();

        /* renamed from: e, reason: collision with root package name */
        public static final int f19313e = 0;

        public f() {
            super(-1, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class g extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final int f19314e = 0;

        /* renamed from: d, reason: collision with root package name */
        public final int f19315d;

        public g(int i11) {
            super(i11, null);
            this.f19315d = i11;
        }

        public static /* synthetic */ g d(g gVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = gVar.f19315d;
            }
            return gVar.c(i11);
        }

        @Override // com.baicizhan.main.activity.schedule_v2.mutimode.data.e
        public int a() {
            return this.f19315d;
        }

        public final int b() {
            return this.f19315d;
        }

        @k
        public final g c(int i11) {
            return new g(i11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f19315d == ((g) obj).f19315d;
        }

        public int hashCode() {
            return Integer.hashCode(this.f19315d);
        }

        @k
        public String toString() {
            return "XEXAM(id=" + this.f19315d + j.f81007d;
        }
    }

    public /* synthetic */ e(int i11, v vVar) {
        this(i11);
    }

    public int a() {
        return this.f19303a;
    }

    public e(int i11) {
        this.f19303a = i11;
    }
}
