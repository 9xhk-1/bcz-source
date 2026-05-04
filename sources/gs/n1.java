package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n1 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55972a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55973b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f55974c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55975d;

    public n1(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout activityMain, @NonNull LottieAnimationView animationView, @NonNull TextView openBoxTitle) {
        this.f55972a = rootView;
        this.f55973b = activityMain;
        this.f55974c = animationView;
        this.f55975d = openBoxTitle;
    }

    @NonNull
    public static n1 a(@NonNull View rootView) {
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i11 = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(rootView, R.id.animation_view);
        if (lottieAnimationView != null) {
            i11 = R.id.open_box_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.open_box_title);
            if (textView != null) {
                return new n1(constraintLayout, constraintLayout, lottieAnimationView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static n1 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static n1 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_open_gold_box, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f55972a;
    }
}
