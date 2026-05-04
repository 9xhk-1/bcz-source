package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ci implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54471a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54472b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54473c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f54474d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f54475e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f54476f;

    public ci(@NonNull RelativeLayout rootView, @NonNull TextView done, @NonNull RelativeLayout newUserExperiencePlanAdjust, @NonNull ImageView pointer, @NonNull View positionStroke, @NonNull TextView tip) {
        this.f54471a = rootView;
        this.f54472b = done;
        this.f54473c = newUserExperiencePlanAdjust;
        this.f54474d = pointer;
        this.f54475e = positionStroke;
        this.f54476f = tip;
    }

    @NonNull
    public static ci a(@NonNull View rootView) {
        int i11 = R.id.done;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.done);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i11 = R.id.pointer;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pointer);
            if (imageView != null) {
                i11 = R.id.position_stroke;
                View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.position_stroke);
                if (findChildViewById != null) {
                    i11 = R.id.tip;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip);
                    if (textView2 != null) {
                        return new ci(relativeLayout, textView, relativeLayout, imageView, findChildViewById, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ci c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ci d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_guide_new_user_experience_plan_adjust, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54471a;
    }
}
