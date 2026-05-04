package s40;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u1 f87786a = new u1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final c f87787b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final u40.d0<h2> f87788c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final u40.d0<h2> f87789d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final u40.d0<h2> f87790e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements u40.m<h2> {

        /* renamed from: a, reason: collision with root package name */
        public final u40.x<h2, Boolean> f87793a = new u40.x<>(new MutablePropertyReference1Impl() { // from class: s40.u1.c.a
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return ((h2) obj).I();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
            public void set(Object obj, Object obj2) {
                ((h2) obj).B((Boolean) obj2);
            }
        }, null, 2, null);

        @Override // u40.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u40.x<h2, Boolean> isNegative() {
            return this.f87793a;
        }

        @Override // u40.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean a(h2 obj) {
            kotlin.jvm.internal.g0.p(obj, "obj");
            Integer f11 = obj.f();
            if ((f11 != null ? f11.intValue() : 0) == 0) {
                Integer G = obj.G();
                if ((G != null ? G.intValue() : 0) == 0) {
                    Integer p11 = obj.p();
                    if ((p11 != null ? p11.intValue() : 0) == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static {
        c cVar = new c();
        f87787b = cVar;
        f87788c = new u40.d0<>(new u40.x(new MutablePropertyReference1Impl() { // from class: s40.u1.d
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return ((h2) obj).f();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
            public void set(Object obj, Object obj2) {
                ((h2) obj).r((Integer) obj2);
            }
        }, null, 2, null), 0, 18, null, 0, cVar, 8, null);
        f87789d = new u40.d0<>(new u40.x(new MutablePropertyReference1Impl() { // from class: s40.u1.a
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return ((h2) obj).G();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
            public void set(Object obj, Object obj2) {
                ((h2) obj).b((Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, cVar, 8, null);
        f87790e = new u40.d0<>(new u40.x(new MutablePropertyReference1Impl() { // from class: s40.u1.b
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
            public Object get(Object obj) {
                return ((h2) obj).p();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
            public void set(Object obj, Object obj2) {
                ((h2) obj).i((Integer) obj2);
            }
        }, null, 2, null), 0, 59, null, 0, cVar, 8, null);
    }

    @m80.k
    public final u40.d0<h2> a() {
        return f87789d;
    }

    @m80.k
    public final u40.d0<h2> b() {
        return f87790e;
    }

    @m80.k
    public final u40.d0<h2> c() {
        return f87788c;
    }
}
