package b5;

import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class z0 implements x0 {

    @m80.k
    public static final z0 INSTANCE = new z0();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ yz.c0<f50.i<Object>> f6101a = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: b5.y0
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = z0.b();
            return b11;
        }
    });

    public static final /* synthetic */ f50.i b() {
        return new j50.a2("com.baicizhan.app.biz.game.impl.unity.command.PayloadError", INSTANCE, new Annotation[0]);
    }

    public final /* synthetic */ f50.i c() {
        return f6101a.getValue();
    }

    public boolean equals(@m80.l Object obj) {
        return this == obj || (obj instanceof z0);
    }

    public int hashCode() {
        return -1500034592;
    }

    @m80.k
    public final f50.i<z0> serializer() {
        return c();
    }

    @m80.k
    public String toString() {
        return "PayloadError";
    }
}
