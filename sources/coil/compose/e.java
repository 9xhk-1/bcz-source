package coil.compose;

import android.os.SystemClock;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import g10.u;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,129:1\n75#2:130\n108#2,2:131\n76#3:133\n109#3,2:134\n81#4:136\n107#4,2:137\n152#5:139\n152#5:140\n159#5:141\n159#5:147\n159#5:148\n105#6:142\n67#6,4:143\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil/compose/CrossfadePainter\n*L\n37#1:130\n37#1:131,2\n41#1:133\n41#1:134,2\n42#1:136\n42#1:137,2\n88#1:139\n89#1:140\n110#1:141\n124#1:147\n125#1:148\n113#1:142\n113#1:143,4\n*E\n"})
/* loaded from: classes3.dex */
public final class e extends Painter {

    /* renamed from: l, reason: collision with root package name */
    public static final int f9668l = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Painter f9669a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Painter f9670b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ContentScale f9671c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9672d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9673e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9674f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9677i;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableIntState f9675g = SnapshotIntStateKt.mutableIntStateOf(0);

    /* renamed from: h, reason: collision with root package name */
    public long f9676h = -1;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableFloatState f9678j = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutableState f9679k = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public e(@m80.l Painter painter, @m80.l Painter painter2, @m80.k ContentScale contentScale, int i11, boolean z11, boolean z12) {
        this.f9669a = painter;
        this.f9670b = painter2;
        this.f9671c = contentScale;
        this.f9672d = i11;
        this.f9673e = z11;
        this.f9674f = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ColorFilter d() {
        return (ColorFilter) this.f9679k.getValue();
    }

    private final void g(ColorFilter colorFilter) {
        this.f9679k.setValue(colorFilter);
    }

    public final long a(long j11, long j12) {
        Size.Companion companion = Size.Companion;
        if (j11 == companion.m2345getUnspecifiedNHjbRc()) {
            return j12;
        }
        if (!Size.m2339isEmptyimpl(j11)) {
            if (j12 == companion.m2345getUnspecifiedNHjbRc()) {
                return j12;
            }
            if (!Size.m2339isEmptyimpl(j12)) {
                return ScaleFactorKt.m3961timesUQTWf7w(j11, this.f9671c.mo3850computeScaleFactorH7hwNQA(j11, j12));
            }
        }
        return j12;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        i(f11);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@m80.l ColorFilter colorFilter) {
        g(colorFilter);
        return true;
    }

    public final long b() {
        Painter painter = this.f9669a;
        long mo3180getIntrinsicSizeNHjbRc = painter != null ? painter.mo3180getIntrinsicSizeNHjbRc() : Size.Companion.m2346getZeroNHjbRc();
        Painter painter2 = this.f9670b;
        long mo3180getIntrinsicSizeNHjbRc2 = painter2 != null ? painter2.mo3180getIntrinsicSizeNHjbRc() : Size.Companion.m2346getZeroNHjbRc();
        Size.Companion companion = Size.Companion;
        boolean z11 = mo3180getIntrinsicSizeNHjbRc != companion.m2345getUnspecifiedNHjbRc();
        boolean z12 = mo3180getIntrinsicSizeNHjbRc2 != companion.m2345getUnspecifiedNHjbRc();
        if (z11 && z12) {
            return SizeKt.Size(Math.max(Size.m2337getWidthimpl(mo3180getIntrinsicSizeNHjbRc), Size.m2337getWidthimpl(mo3180getIntrinsicSizeNHjbRc2)), Math.max(Size.m2334getHeightimpl(mo3180getIntrinsicSizeNHjbRc), Size.m2334getHeightimpl(mo3180getIntrinsicSizeNHjbRc2)));
        }
        if (this.f9674f) {
            if (z11) {
                return mo3180getIntrinsicSizeNHjbRc;
            }
            if (z12) {
                return mo3180getIntrinsicSizeNHjbRc2;
            }
        }
        return companion.m2345getUnspecifiedNHjbRc();
    }

    public final void c(DrawScope drawScope, Painter painter, float f11) {
        if (painter == null || f11 <= 0.0f) {
            return;
        }
        long mo3060getSizeNHjbRc = drawScope.mo3060getSizeNHjbRc();
        long a11 = a(painter.mo3180getIntrinsicSizeNHjbRc(), mo3060getSizeNHjbRc);
        if (mo3060getSizeNHjbRc == Size.Companion.m2345getUnspecifiedNHjbRc() || Size.m2339isEmptyimpl(mo3060getSizeNHjbRc)) {
            painter.m3186drawx_KDEd0(drawScope, a11, f11, d());
            return;
        }
        float f12 = 2;
        float m2337getWidthimpl = (Size.m2337getWidthimpl(mo3060getSizeNHjbRc) - Size.m2337getWidthimpl(a11)) / f12;
        float m2334getHeightimpl = (Size.m2334getHeightimpl(mo3060getSizeNHjbRc) - Size.m2334getHeightimpl(a11)) / f12;
        drawScope.getDrawContext().getTransform().inset(m2337getWidthimpl, m2334getHeightimpl, m2337getWidthimpl, m2334getHeightimpl);
        painter.m3186drawx_KDEd0(drawScope, a11, f11, d());
        DrawTransform transform = drawScope.getDrawContext().getTransform();
        float f13 = -m2337getWidthimpl;
        float f14 = -m2334getHeightimpl;
        transform.inset(f13, f14, f13, f14);
    }

    public final int e() {
        return this.f9675g.getIntValue();
    }

    public final float f() {
        return this.f9678j.getFloatValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return b();
    }

    public final void h(int i11) {
        this.f9675g.setIntValue(i11);
    }

    public final void i(float f11) {
        this.f9678j.setFloatValue(f11);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@m80.k DrawScope drawScope) {
        if (this.f9677i) {
            c(drawScope, this.f9670b, f());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f9676h == -1) {
            this.f9676h = uptimeMillis;
        }
        float f11 = (uptimeMillis - this.f9676h) / this.f9672d;
        float H = u.H(f11, 0.0f, 1.0f) * f();
        float f12 = this.f9673e ? f() - H : f();
        this.f9677i = f11 >= 1.0f;
        c(drawScope, this.f9669a, f12);
        c(drawScope, this.f9670b, H);
        if (this.f9677i) {
            this.f9669a = null;
        } else {
            h(e() + 1);
        }
    }
}
