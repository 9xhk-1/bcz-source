package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class wh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57331a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f57332b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f57333c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57334d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57335e;

    public wh(@NonNull ConstraintLayout rootView, @NonNull Guideline guideLeft, @NonNull Guideline guideRight, @NonNull TextView magicButtonNegative, @NonNull TextView magicButtonPositive) {
        this.f57331a = rootView;
        this.f57332b = guideLeft;
        this.f57333c = guideRight;
        this.f57334d = magicButtonNegative;
        this.f57335e = magicButtonPositive;
    }

    @NonNull
    public static wh a(@NonNull View rootView) {
        int i11 = R.id.guide_left;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guide_left);
        if (guideline != null) {
            i11 = R.id.guide_right;
            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guide_right);
            if (guideline2 != null) {
                i11 = R.id.magic_button_negative;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_button_negative);
                if (textView != null) {
                    i11 = R.id.magic_button_positive;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.magic_button_positive);
                    if (textView2 != null) {
                        return new wh((ConstraintLayout) rootView, guideline, guideline2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static wh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static wh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_dialog_prompt_buttons, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57331a;
    }
}
