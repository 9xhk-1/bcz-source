package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ei implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54791a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f54792b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54793c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54794d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f54795e;

    public ei(@NonNull ConstraintLayout rootView, @NonNull View anchor, @NonNull ConstraintLayout guideRoot, @NonNull ImageView line, @NonNull TextView tip) {
        this.f54791a = rootView;
        this.f54792b = anchor;
        this.f54793c = guideRoot;
        this.f54794d = line;
        this.f54795e = tip;
    }

    @NonNull
    public static ei a(@NonNull View rootView) {
        int i11 = R.id.anchor;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.anchor);
        if (findChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
            i11 = R.id.line;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.line);
            if (imageView != null) {
                i11 = R.id.tip;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                if (textView != null) {
                    return new ei(constraintLayout, findChildViewById, constraintLayout, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ei c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ei d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_guide_switch_mode, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54791a;
    }
}
