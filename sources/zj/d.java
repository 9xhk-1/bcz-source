package zj;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nGuideAnchorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideAnchorState.kt\ncom/baicizhan/platform/base/guide/GuideAnchorState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,29:1\n85#2:30\n113#2,2:31\n85#2:33\n113#2,2:34\n85#2:36\n113#2,2:37\n*S KotlinDebug\n*F\n+ 1 GuideAnchorState.kt\ncom/baicizhan/platform/base/guide/GuideAnchorState\n*L\n19#1:30\n19#1:31,2\n20#1:33\n20#1:34,2\n21#1:36\n21#1:37,2\n*E\n"})
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public static final int f102713f = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c f102714a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Object f102715b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState f102716c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableState f102717d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableState f102718e;

    public d(@m80.k c guide, @m80.l Object obj) {
        g0.p(guide, "guide");
        this.f102714a = guide;
        this.f102715b = obj;
        this.f102716c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);
        this.f102717d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m2257boximpl(Offset.Companion.m2284getZeroF1C5BW0()), null, 2, null);
        this.f102718e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RectangleShapeKt.getRectangleShape(), null, 2, null);
    }

    @m80.k
    public final c a() {
        return this.f102714a;
    }

    @m80.l
    public final Object b() {
        return this.f102715b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        return ((Offset) this.f102717d.getValue()).m2278unboximpl();
    }

    @m80.k
    public final Shape d() {
        return (Shape) this.f102718e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e() {
        return ((IntSize) this.f102716c.getValue()).m5290unboximpl();
    }

    public final void f(long j11) {
        this.f102717d.setValue(Offset.m2257boximpl(j11));
    }

    public final void g(@m80.k Shape shape) {
        g0.p(shape, "<set-?>");
        this.f102718e.setValue(shape);
    }

    public final void h(long j11) {
        this.f102716c.setValue(IntSize.m5278boximpl(j11));
    }

    public /* synthetic */ d(c cVar, Object obj, int i11, kotlin.jvm.internal.v vVar) {
        this(cVar, (i11 & 2) != 0 ? null : obj);
    }
}
