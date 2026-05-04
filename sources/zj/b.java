package zj;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final b f102703a = new b();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f102704b = ComposableLambdaKt.composableLambdaInstance(-915680917, false, new x00.p() { // from class: zj.a
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 c11;
            c11 = b.c((Composer) obj, ((Integer) obj2).intValue());
            return c11;
        }
    });

    @Composable
    public static final g2 c(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-915680917, i11, -1, "com.baicizhan.platform.base.guide.ComposableSingletons$GuideKt.lambda$-915680917.<anonymous> (Guide.kt:12)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> b() {
        return f102704b;
    }
}
