package bk;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f6881a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6882b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6883c;

    /* renamed from: d, reason: collision with root package name */
    public final long f6884d;

    public /* synthetic */ c(long j11, long j12, long j13, long j14, v vVar) {
        this(j11, j12, j13, j14);
    }

    @Override // bk.e
    @Composable
    @m80.k
    public State<Color> a(boolean z11, boolean z12, boolean z13, @l Composer composer, int i11) {
        composer.startReplaceGroup(-1168699197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1168699197, i11, -1, "com.baicizhan.platform.base.theme.DefaultStateColors.stateColor (StateColors.kt:45)");
        }
        State<Color> rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2499boximpl(z13 ? z12 ? z11 ? this.f6882b : this.f6881a : this.f6883c : this.f6884d), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rememberUpdatedState;
    }

    public c(long j11, long j12, long j13, long j14) {
        this.f6881a = j11;
        this.f6882b = j12;
        this.f6883c = j13;
        this.f6884d = j14;
    }
}
