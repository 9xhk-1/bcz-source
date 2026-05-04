package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57472a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57473b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57474c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57475d;

    public xj(@NonNull FrameLayout rootView, @NonNull TextView dailyNewCountTip, @NonNull FrameLayout newUserGuideLayout, @NonNull TextView startStudyTip) {
        this.f57472a = rootView;
        this.f57473b = dailyNewCountTip;
        this.f57474c = newUserGuideLayout;
        this.f57475d = startStudyTip;
    }

    @NonNull
    public static xj a(@NonNull View rootView) {
        int i11 = R.id.daily_new_count_tip;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.daily_new_count_tip);
        if (textView != null) {
            FrameLayout frameLayout = (FrameLayout) rootView;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.start_study_tip);
            if (textView2 != null) {
                return new xj(frameLayout, textView, frameLayout, textView2);
            }
            i11 = R.id.start_study_tip;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.main_newuser_guide_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57472a;
    }
}
