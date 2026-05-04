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
public final class zh implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57788a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57789b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f57790c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57791d;

    public zh(@NonNull ConstraintLayout rootView, @NonNull TextView errorTip, @NonNull Guideline guidelineCenter, @NonNull TextView refresh) {
        this.f57788a = rootView;
        this.f57789b = errorTip;
        this.f57790c = guidelineCenter;
        this.f57791d = refresh;
    }

    @NonNull
    public static zh a(@NonNull View rootView) {
        int i11 = R.id.error_tip;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.error_tip);
        if (textView != null) {
            i11 = R.id.guideline_center;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.guideline_center);
            if (guideline != null) {
                i11 = R.id.refresh;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.refresh);
                if (textView2 != null) {
                    return new zh((ConstraintLayout) rootView, textView, guideline, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static zh c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static zh d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_error_refresh, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f57788a;
    }
}
