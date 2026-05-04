package kotlin.jvm.internal;

import h10.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class PropertyReference2 extends PropertyReference implements h10.q {
    public PropertyReference2() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public h10.c computeReflected() {
        return o0.v(this);
    }

    @Override // h10.q
    @yz.y0(version = "1.1")
    public Object getDelegate(Object obj, Object obj2) {
        return ((h10.q) getReflected()).getDelegate(obj, obj2);
    }

    @Override // x00.p
    public Object invoke(Object obj, Object obj2) {
        return get(obj, obj2);
    }

    @yz.y0(version = "1.4")
    public PropertyReference2(Class cls, String str, String str2, int i11) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    @Override // h10.n
    /* renamed from: getGetter */
    public q.a l0() {
        return ((h10.q) getReflected()).l0();
    }
}
