package sm;

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
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,175:1\n81#2:176\n107#2,2:177\n81#2:179\n107#2,2:180\n245#3:182\n47#4,7:183\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/google/accompanist/drawablepainter/DrawablePainter\n*L\n58#1:176\n58#1:177,2\n59#1:179\n59#1:180,2\n126#1:182\n133#1:183,7\n*E\n"})
/* loaded from: classes6.dex */
public final class a extends Painter implements RememberObserver {

    /* renamed from: e, reason: collision with root package name */
    public static final int f88833e = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Drawable f88834a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final MutableState f88835b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MutableState f88836c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c0 f88837d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: sm.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C1161a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88838a;

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
            f88838a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<C1162a> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: sm.a$b$a, reason: collision with other inner class name */
        public static final class C1162a implements Drawable.Callback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f88840a;

            public C1162a(a aVar) {
                this.f88840a = aVar;
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(@k Drawable d11) {
                long c11;
                g0.p(d11, "d");
                a aVar = this.f88840a;
                aVar.h(aVar.e() + 1);
                a aVar2 = this.f88840a;
                c11 = sm.b.c(aVar2.f());
                aVar2.i(c11);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(@k Drawable d11, @k Runnable what, long j11) {
                Handler d12;
                g0.p(d11, "d");
                g0.p(what, "what");
                d12 = sm.b.d();
                d12.postAtTime(what, j11);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(@k Drawable d11, @k Runnable what) {
                Handler d12;
                g0.p(d11, "d");
                g0.p(what, "what");
                d12 = sm.b.d();
                d12.removeCallbacks(what);
            }
        }

        public b() {
            super(0);
        }

        @Override // x00.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1162a invoke() {
            return new C1162a(a.this);
        }
    }

    public a(@k Drawable drawable) {
        long c11;
        g0.p(drawable, "drawable");
        this.f88834a = drawable;
        this.f88835b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        c11 = sm.b.c(drawable);
        this.f88836c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m2325boximpl(c11), null, 2, null);
        this.f88837d = e0.c(new b());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback d() {
        return (Drawable.Callback) this.f88837d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final int e() {
        return ((Number) this.f88835b.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long g() {
        return ((Size) this.f88836c.getValue()).m2342unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(int i11) {
        this.f88835b.setValue(Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j11) {
        this.f88836c.setValue(Size.m2325boximpl(j11));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f11) {
        this.f88834a.setAlpha(u.I(c10.d.L0(f11 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@l ColorFilter colorFilter) {
        this.f88834a.setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(@k LayoutDirection layoutDirection) {
        g0.p(layoutDirection, "layoutDirection");
        Drawable drawable = this.f88834a;
        int i11 = C1161a.f88838a[layoutDirection.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i12);
    }

    @k
    public final Drawable f() {
        return this.f88834a;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo3180getIntrinsicSizeNHjbRc() {
        return g();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@k DrawScope drawScope) {
        g0.p(drawScope, "<this>");
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        e();
        this.f88834a.setBounds(0, 0, c10.d.L0(Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc())), c10.d.L0(Size.m2334getHeightimpl(drawScope.mo3060getSizeNHjbRc())));
        try {
            canvas.save();
            this.f88834a.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        } finally {
            canvas.restore();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Object obj = this.f88834a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.f88834a.setVisible(false, false);
        this.f88834a.setCallback(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.f88834a.setCallback(d());
        this.f88834a.setVisible(true, true);
        Object obj = this.f88834a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }
}
