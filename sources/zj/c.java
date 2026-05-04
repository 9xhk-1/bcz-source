package zj;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Guide.kt\ncom/baicizhan/platform/base/guide/Guide\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,21:1\n85#2:22\n113#2,2:23\n*S KotlinDebug\n*F\n+ 1 Guide.kt\ncom/baicizhan/platform/base/guide/Guide\n*L\n13#1:22\n13#1:23,2\n*E\n"})
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f102710b = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableState f102711a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(b.f102703a.b(), null, 2, null);

    @m80.k
    public final x00.p<Composer, Integer, g2> a() {
        return (x00.p) this.f102711a.getValue();
    }

    public final void b(@m80.k x00.p<? super Composer, ? super Integer, g2> pVar) {
        g0.p(pVar, "<set-?>");
        this.f102711a.setValue(pVar);
    }
}
