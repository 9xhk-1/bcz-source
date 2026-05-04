package kotlin.jvm.internal;

import h10.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class PropertyReference1 extends PropertyReference implements h10.p {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public h10.c computeReflected() {
        return o0.u(this);
    }

    @Override // h10.p
    @yz.y0(version = "1.1")
    public Object getDelegate(Object obj) {
        return ((h10.p) getReflected()).getDelegate(obj);
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @yz.y0(version = "1.1")
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // h10.n
    /* renamed from: getGetter */
    public p.a l0() {
        return ((h10.p) getReflected()).l0();
    }

    @yz.y0(version = "1.4")
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}
