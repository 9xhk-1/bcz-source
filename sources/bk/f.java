package bk;

import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class f {
    @Composable
    @m80.k
    public static final e a(long j11, long j12, long j13, long j14, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            j11 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1600getPrimary0d7_KjU();
        }
        long j15 = j11;
        if ((i12 & 2) != 0) {
            j12 = MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1601getPrimaryVariant0d7_KjU();
        }
        long j16 = j12;
        long c02 = (i12 & 4) != 0 ? b.c0(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)) : j13;
        long G = (i12 & 8) != 0 ? b.G(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(837504885, i11, -1, "com.baicizhan.platform.base.theme.buttonBackgroundColors (StateColors.kt:19)");
        }
        c cVar = new c(j15, j16, c02, G, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cVar;
    }
}
