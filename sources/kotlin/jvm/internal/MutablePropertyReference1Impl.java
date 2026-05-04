package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class MutablePropertyReference1Impl extends MutablePropertyReference1 {
    public MutablePropertyReference1Impl(h10.h hVar, String str, String str2) {
        super(CallableReference.NO_RECEIVER, ((s) hVar).g(), str, str2, !(hVar instanceof h10.d) ? 1 : 0);
    }

    public Object get(Object obj) {
        return l0().call(obj);
    }

    public void set(Object obj, Object obj2) {
        getSetter().call(obj, obj2);
    }

    @yz.y0(version = "1.4")
    public MutablePropertyReference1Impl(Class cls, String str, String str2, int i11) {
        super(CallableReference.NO_RECEIVER, cls, str, str2, i11);
    }

    @yz.y0(version = "1.4")
    public MutablePropertyReference1Impl(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, i11);
    }
}
