package o1;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.media3.common.C;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f75508a;

        public a(final View val$view) {
            this.f75508a = val$view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f75508a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f75508a.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) floatValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f75508a.requestLayout();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o1.b$b, reason: collision with other inner class name */
    public class C0919b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f75509a;

        public C0919b(final View val$view) {
            this.f75509a = val$view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f75509a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f75509a.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) floatValue);
                this.f75509a.requestLayout();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f75510a;

        public c(final View val$view) {
            this.f75510a = val$view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.f75510a.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f75510a.getLayoutParams();
                marginLayoutParams.setMargins((int) floatValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.f75510a.requestLayout();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f75511a;

        public d(final TextView val$textView) {
            this.f75511a = val$textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f75511a.setTextSize(0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f75512a;

        public e(final View val$view) {
            this.f75512a = val$view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f75512a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f75513a;

        public f(final TextView val$textView) {
            this.f75513a = val$textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            this.f75513a.setTextColor(((Integer) animator.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f75514a;

        public g(final View val$view) {
            this.f75514a = val$view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            this.f75514a.setBackgroundColor(((Integer) animator.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f75515a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Drawable f75516b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f75517c;

        public h(final ImageView val$imageView, final Drawable val$drawable, final boolean val$forceTint) {
            this.f75515a = val$imageView;
            this.f75516b = val$drawable;
            this.f75517c = val$forceTint;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            this.f75515a.setImageDrawable(b.b(this.f75516b, ((Integer) animator.getAnimatedValue()).intValue(), this.f75517c));
            this.f75515a.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f75518a;

        public i(final View val$view) {
            this.f75518a = val$view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animator) {
            ViewGroup.LayoutParams layoutParams = this.f75518a.getLayoutParams();
            layoutParams.width = Math.round(((Float) animator.getAnimatedValue()).floatValue());
            this.f75518a.setLayoutParams(layoutParams);
        }
    }

    public static int a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Window window = d(context).getWindow();
        window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i11 = displayMetrics.heightPixels;
        window.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        int i12 = displayMetrics.heightPixels;
        if (i12 > i11) {
            return i12 - i11;
        }
        return 0;
    }

    public static Drawable b(Drawable drawable, @ColorInt int color, boolean forceTint) {
        if (drawable == null) {
            return null;
        }
        if (!forceTint) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTint(mutate, color);
            return mutate;
        }
        drawable.clearColorFilter();
        drawable.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        drawable.invalidateSelf();
        return drawable;
    }

    public static boolean c(Context context) {
        return (d(context).getWindow().getAttributes().flags & C.BUFFER_FLAG_FIRST_SAMPLE) == 134217728;
    }

    public static Activity d(Context context) {
        while (!(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Activity) context;
    }

    public static void e(final View view, float fromValue, float toValue) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromValue, toValue);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e(view));
        ofFloat.start();
    }

    public static void f(final View view, int fromMargin, int toMargin, int duration) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromMargin, toMargin);
        ofFloat.setDuration(duration);
        ofFloat.addUpdateListener(new C0919b(view));
        ofFloat.start();
    }

    public static void g(final Context context, final Drawable drawable, final ImageView imageView, @ColorInt int fromColor, @ColorInt int toColor, final boolean forceTint) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new h(imageView, drawable, forceTint));
        ofObject.start();
    }

    public static void h(final View view, int fromMargin, int toMargin) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromMargin, toMargin);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new c(view));
        ofFloat.start();
    }

    public static void i(final TextView textView, @ColorInt int fromColor, @ColorInt int toColor) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new f(textView));
        ofObject.start();
    }

    public static void j(final TextView textView, float fromSize, float toSize) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromSize, toSize);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new d(textView));
        ofFloat.start();
    }

    public static void k(final View view, int fromMargin, int toMargin) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromMargin, toMargin);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new a(view));
        ofFloat.start();
    }

    public static void l(final View view, @ColorInt int fromColor, @ColorInt int toColor) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(fromColor), Integer.valueOf(toColor));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new g(view));
        ofObject.start();
    }

    public static void m(final View view, float fromWidth, float toWidth) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fromWidth, toWidth);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i(view));
        ofFloat.start();
    }
}
