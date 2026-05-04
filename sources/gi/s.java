package gi;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import gi.s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDrablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrablePainter.kt\ncom/baicizhan/main/utils/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,158:1\n85#2:159\n113#2,2:160\n85#2:162\n113#2,2:163\n233#3:165\n57#4:166\n61#4:169\n60#5:167\n70#5:170\n22#6:168\n42#7,7:171\n*S KotlinDebug\n*F\n+ 1 DrablePainter.kt\ncom/baicizhan/main/utils/DrawablePainter\n*L\n42#1:159\n42#1:160,2\n43#1:162\n43#1:163,2\n110#1:165\n115#1:166\n115#1:169\n115#1:167\n115#1:170\n115#1:168\n117#1:171,7\n*E\n"})
/* loaded from: classes4.dex */
public final class s extends Painter implements RememberObserver {

    /* renamed from: e, reason: collision with root package name */
    public static final int f53838e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Drawable f53839a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableState f53840b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState f53841c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f53842d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53843a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f53843a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Drawable.Callback {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable d11) {
            long e11;
            kotlin.jvm.internal.g0.p(d11, "d");
            s.this.j(s.this.g() + 1);
            s sVar = s.this;
            e11 = q.e(sVar.h());
            sVar.k(e11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable d11, Runnable what, long j11) {
            Handler f11;
            kotlin.jvm.internal.g0.p(d11, "d");
            kotlin.jvm.internal.g0.p(what, "what");
            f11 = q.f();
            f11.postAtTime(what, j11);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable d11, Runnable what) {
            Handler f11;
            kotlin.jvm.internal.g0.p(d11, "d");
            kotlin.jvm.internal.g0.p(what, "what");
            f11 = q.f();
            f11.removeCallbacks(what);
        }
    }

    public s(@m80.k Drawable drawable) {
        long e11;
        kotlin.jvm.internal.g0.p(drawable, "drawable");
        this.f53839a = drawable;
        this.f53840b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        e11 = q.e(drawable);
        this.f53841c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(e11), null, 2, null);
        this.f53842d = yz.e0.c(new x00.a() { // from class: gi.r
            @Override // x00.a
            public final Object invoke() {
                s.b e12;
                e12 = s.e(s.this);
                return e12;
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static final b e(s sVar) {
        return sVar.new b();
    }

    private final Drawable.Callback f() {
        return (Drawable.Callback) this.f53842d.getValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        this.f53839a.setAlpha(g10.u.I(c10.d.L0(f11 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@m80.l ColorFilter colorFilter) {
        this.f53839a.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(@m80.k LayoutDirection layoutDirection) {
        kotlin.jvm.internal.g0.p(layoutDirection, "layoutDirection");
        Drawable drawable = this.f53839a;
        int i11 = a.f53843a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int g() {
        return ((Number) this.f53840b.getValue()).intValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return i();
    }

    @m80.k
    public final Drawable h() {
        return this.f53839a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i() {
        return ((Size) this.f53841c.getValue()).m2342unboximpl();
    }

    public final void j(int i11) {
        this.f53840b.setValue(Integer.valueOf(i11));
    }

    public final void k(long j11) {
        this.f53841c.setValue(Size.m2325boximpl(j11));
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@m80.k DrawScope drawScope) {
        kotlin.jvm.internal.g0.p(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        g();
        this.f53839a.setBounds(0, 0, c10.d.L0(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32))), c10.d.L0(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L))));
        try {
            canvas.save();
            this.f53839a.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Object obj = this.f53839a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f53839a.setVisible(false, false);
        this.f53839a.setCallback(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f53839a.setCallback(f());
        this.f53839a.setVisible(true, true);
        Object obj = this.f53839a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }
}
