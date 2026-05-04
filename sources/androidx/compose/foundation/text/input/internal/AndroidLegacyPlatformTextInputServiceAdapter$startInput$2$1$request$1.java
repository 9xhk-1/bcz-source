package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.graphics.Matrix;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements x00.l<Matrix, g2> {
    final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        super(1, g0.a.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = legacyPlatformTextInputNode;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(Matrix matrix) {
        m1214invoke58bKbWc(matrix.m2762unboximpl());
        return g2.f100423a;
    }

    /* renamed from: invoke-58bKbWc, reason: not valid java name */
    public final void m1214invoke58bKbWc(float[] fArr) {
        AndroidLegacyPlatformTextInputServiceAdapter.startInput$localToScreen(this.$node, fArr);
    }
}
