package s40;

import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k3 f87706a = new k3();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final u40.q<j3, Integer> f87707b = new u40.q<>(new u40.x(new MutablePropertyReference1Impl() { // from class: s40.k3.b
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
        public Object get(Object obj) {
            return ((j3) obj).getYear();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
        public void set(Object obj, Object obj2) {
            ((j3) obj).F((Integer) obj2);
        }
    }, null, 2, null), null, null, null, 14, null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final u40.d0<j3> f87708c = new u40.d0<>(new u40.x(new MutablePropertyReference1Impl() { // from class: s40.k3.a
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.p
        public Object get(Object obj) {
            return ((j3) obj).m();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, h10.l
        public void set(Object obj, Object obj2) {
            ((j3) obj).x((Integer) obj2);
        }
    }, null, 2, null), 1, 12, null, null, null, 56, null);

    @m80.k
    public final u40.d0<j3> a() {
        return f87708c;
    }

    @m80.k
    public final u40.q<j3, Integer> b() {
        return f87707b;
    }
}
