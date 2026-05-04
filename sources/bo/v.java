package bo;

import an.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.PathParser;
import androidx.transition.PathMotion;
import androidx.transition.PatternPathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7144a = -1;

    /* renamed from: b, reason: collision with root package name */
    @AttrRes
    public static final int f7145b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7146c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7147d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final RectF f7148e = new RectF();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RectF f7149a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RectF f7150b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f7151c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f7152d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f7153e;

        public a(RectF rectF, RectF rectF2, float f11, float f12, float f13) {
            this.f7149a = rectF;
            this.f7150b = rectF2;
            this.f7151c = f11;
            this.f7152d = f12;
            this.f7153e = f13;
        }

        @Override // bo.v.b
        @NonNull
        public vn.e a(@NonNull vn.e eVar, @NonNull vn.e eVar2) {
            return new vn.a(v.m(eVar.a(this.f7149a), eVar2.a(this.f7150b), this.f7151c, this.f7152d, this.f7153e));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        @NonNull
        vn.e a(@NonNull vn.e eVar, @NonNull vn.e eVar2);
    }

    public static float b(@NonNull RectF rectF) {
        return rectF.width() * rectF.height();
    }

    public static vn.p c(vn.p pVar, final RectF rectF) {
        return pVar.y(new p.c() { // from class: bo.u
            @Override // vn.p.c
            public final vn.e a(vn.e eVar) {
                vn.e b11;
                b11 = vn.n.b(rectF, eVar);
                return b11;
            }
        });
    }

    public static Shader d(@ColorInt int i11) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i11, i11, Shader.TileMode.CLAMP);
    }

    @NonNull
    public static <T> T e(@Nullable T t11, @NonNull T t12) {
        return t11 != null ? t11 : t12;
    }

    public static View f(View view, @IdRes int i11) {
        String resourceName = view.getResources().getResourceName(i11);
        while (view != null) {
            if (view.getId() != i11) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    public static View g(View view, @IdRes int i11) {
        View findViewById = view.findViewById(i11);
        return findViewById != null ? findViewById : f(view, i11);
    }

    public static RectF h(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    public static RectF i(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect j(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static boolean k(vn.p pVar, RectF rectF) {
        return (pVar.r().a(rectF) == 0.0f && pVar.t().a(rectF) == 0.0f && pVar.l().a(rectF) == 0.0f && pVar.j().a(rectF) == 0.0f) ? false : true;
    }

    public static float l(float f11, float f12, float f13) {
        return f11 + (f13 * (f12 - f11));
    }

    public static float m(float f11, float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14, @FloatRange(from = 0.0d, to = 1.0d) float f15) {
        return n(f11, f12, f13, f14, f15, false);
    }

    public static float n(float f11, float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13, @FloatRange(from = 0.0d, to = 1.0d) float f14, @FloatRange(from = 0.0d) float f15, boolean z11) {
        return (!z11 || (f15 >= 0.0f && f15 <= 1.0f)) ? f15 < f13 ? f11 : f15 > f14 ? f12 : l(f11, f12, (f15 - f13) / (f14 - f13)) : l(f11, f12, f15);
    }

    public static int o(int i11, int i12, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13) {
        return f13 < f11 ? i11 : f13 > f12 ? i12 : (int) l(i11, i12, (f13 - f11) / (f12 - f11));
    }

    public static vn.p p(vn.p pVar, vn.p pVar2, RectF rectF, RectF rectF2, @FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, @FloatRange(from = 0.0d, to = 1.0d) float f13) {
        return f13 < f11 ? pVar : f13 > f12 ? pVar2 : y(pVar, pVar2, rectF, new a(rectF, rectF2, f11, f12, f13));
    }

    public static void q(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
    }

    public static boolean r(Transition transition, Context context, @AttrRes int i11) {
        int f11;
        if (i11 == 0 || transition.getDuration() != -1 || (f11 = pn.j.f(context, i11, -1)) == -1) {
            return false;
        }
        transition.setDuration(f11);
        return true;
    }

    public static boolean s(Transition transition, Context context, @AttrRes int i11, TimeInterpolator timeInterpolator) {
        if (i11 == 0 || transition.getInterpolator() != null) {
            return false;
        }
        transition.setInterpolator(pn.j.g(context, i11, timeInterpolator));
        return true;
    }

    public static boolean t(Transition transition, Context context, @AttrRes int i11) {
        PathMotion v11;
        if (i11 == 0 || (v11 = v(context, i11)) == null) {
            return false;
        }
        transition.setPathMotion(v11);
        return true;
    }

    public static void u(TransitionSet transitionSet, @Nullable Transition transition) {
        if (transition != null) {
            transitionSet.removeTransition(transition);
        }
    }

    @Nullable
    public static PathMotion v(Context context, @AttrRes int i11) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i11, typedValue, true)) {
            return null;
        }
        int i12 = typedValue.type;
        if (i12 != 16) {
            if (i12 == 3) {
                return new PatternPathMotion(PathParser.createPathFromPathData(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i13 = typedValue.data;
        if (i13 == 0) {
            return null;
        }
        if (i13 == 1) {
            return new k();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i13);
    }

    public static int w(Canvas canvas, Rect rect, int i11) {
        RectF rectF = f7148e;
        rectF.set(rect);
        return canvas.saveLayerAlpha(rectF, i11);
    }

    public static void x(Canvas canvas, Rect rect, float f11, float f12, float f13, int i11, a.InterfaceC0022a interfaceC0022a) {
        if (i11 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f11, f12);
        canvas.scale(f13, f13);
        if (i11 < 255) {
            w(canvas, rect, i11);
        }
        interfaceC0022a.a(canvas);
        canvas.restoreToCount(save);
    }

    public static vn.p y(vn.p pVar, vn.p pVar2, RectF rectF, b bVar) {
        return (k(pVar, rectF) ? pVar : pVar2).v().L(bVar.a(pVar.r(), pVar2.r())).Q(bVar.a(pVar.t(), pVar2.t())).y(bVar.a(pVar.j(), pVar2.j())).D(bVar.a(pVar.l(), pVar2.l())).m();
    }
}
