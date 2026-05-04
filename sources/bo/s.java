package bo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class s implements w {

    /* renamed from: c, reason: collision with root package name */
    public static final int f7136c = -1;

    /* renamed from: a, reason: collision with root package name */
    public int f7137a;

    /* renamed from: b, reason: collision with root package name */
    @Px
    public int f7138b = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7139a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7140b;

        public a(View view, float f11) {
            this.f7139a = view;
            this.f7140b = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7139a.setTranslationX(this.f7140b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7141a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7142b;

        public b(View view, float f11) {
            this.f7141a = view;
            this.f7142b = f11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7141a.setTranslationY(this.f7142b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    public s(int i11) {
        this.f7137a = i11;
    }

    public static Animator c(View view, View view2, int i11, @Px int i12) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i11 == 3) {
            return e(view2, i12 + translationX, translationX, translationX);
        }
        if (i11 == 5) {
            return e(view2, translationX - i12, translationX, translationX);
        }
        if (i11 == 48) {
            return f(view2, translationY - i12, translationY, translationY);
        }
        if (i11 == 80) {
            return f(view2, i12 + translationY, translationY, translationY);
        }
        if (i11 == 8388611) {
            return e(view2, j(view) ? i12 + translationX : translationX - i12, translationX, translationX);
        }
        if (i11 == 8388613) {
            return e(view2, j(view) ? translationX - i12 : i12 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i11);
    }

    public static Animator d(View view, View view2, int i11, @Px int i12) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i11 == 3) {
            return e(view2, translationX, translationX - i12, translationX);
        }
        if (i11 == 5) {
            return e(view2, translationX, i12 + translationX, translationX);
        }
        if (i11 == 48) {
            return f(view2, translationY, i12 + translationY, translationY);
        }
        if (i11 == 80) {
            return f(view2, translationY, translationY - i12, translationY);
        }
        if (i11 == 8388611) {
            return e(view2, translationX, j(view) ? translationX - i12 : i12 + translationX, translationX);
        }
        if (i11 == 8388613) {
            return e(view2, translationX, j(view) ? i12 + translationX : translationX - i12, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i11);
    }

    public static Animator e(View view, float f11, float f12, float f13) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f11, f12));
        ofPropertyValuesHolder.addListener(new a(view, f13));
        return ofPropertyValuesHolder;
    }

    public static Animator f(View view, float f11, float f12, float f13) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f12));
        ofPropertyValuesHolder.addListener(new b(view, f13));
        return ofPropertyValuesHolder;
    }

    public static boolean j(View view) {
        return ViewCompat.getLayoutDirection(view) == 1;
    }

    @Override // bo.w
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return d(viewGroup, view, this.f7137a, h(view.getContext()));
    }

    @Override // bo.w
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return c(viewGroup, view, this.f7137a, h(view.getContext()));
    }

    @Px
    public int g() {
        return this.f7138b;
    }

    public final int h(Context context) {
        int i11 = this.f7138b;
        return i11 != -1 ? i11 : context.getResources().getDimensionPixelSize(R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    public int i() {
        return this.f7137a;
    }

    public void k(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f7138b = i11;
    }

    public void l(int i11) {
        this.f7137a = i11;
    }
}
