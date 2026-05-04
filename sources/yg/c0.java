package yg;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f99962a = new c0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<Object, Composer, Integer, yz.g2> f99963b = ComposableLambdaKt.composableLambdaInstance(-1979224684, false, new x00.q() { // from class: yg.b0
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 c11;
            c11 = c0.c(obj, (Composer) obj2, ((Integer) obj3).intValue());
            return c11;
        }
    });

    @Composable
    public static final yz.g2 c(Object obj, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1979224684, i11, -1, "com.baicizhan.main.model.ComposableSingletons$UtilsKt.lambda$-1979224684.<anonymous> (Utils.kt:138)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.q<Object, Composer, Integer, yz.g2> b() {
        return f99963b;
    }
}
