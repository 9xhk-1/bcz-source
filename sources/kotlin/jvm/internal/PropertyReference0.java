package kotlin.jvm.internal;

import h10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class PropertyReference0 extends PropertyReference implements h10.o {
    public PropertyReference0() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public h10.c computeReflected() {
        return o0.t(this);
    }

    @Override // h10.o
    @yz.y0(version = "1.1")
    public Object getDelegate() {
        return ((h10.o) getReflected()).getDelegate();
    }

    @Override // x00.a
    public Object invoke() {
        return get();
    }

    @yz.y0(version = "1.1")
    public PropertyReference0(Object obj) {
        super(obj);
    }

    @Override // h10.n
    public o.a getGetter() {
        return ((h10.o) getReflected()).getGetter();
    }

    @yz.y0(version = "1.4")
    public PropertyReference0(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}
