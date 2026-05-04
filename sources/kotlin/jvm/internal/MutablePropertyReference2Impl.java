package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class MutablePropertyReference2Impl extends MutablePropertyReference2 {
    public MutablePropertyReference2Impl(h10.h hVar, String str, String str2) {
        super(((s) hVar).g(), str, str2, !(hVar instanceof h10.d) ? 1 : 0);
    }

    @Override // h10.q
    public Object get(Object obj, Object obj2) {
        return l0().call(obj, obj2);
    }

    @Override // h10.m
    public void set(Object obj, Object obj2, Object obj3) {
        getSetter().call(obj, obj2, obj3);
    }

    @yz.y0(version = "1.4")
    public MutablePropertyReference2Impl(Class cls, String str, String str2, int i11) {
        super(cls, str, str2, i11);
    }
}
