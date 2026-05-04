package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xl implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57488a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57489b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57490c;

    public xl(@NonNull LinearLayout rootView, @NonNull TextView plusreviewMatchCnexam, @NonNull TextView plusreviewMatchExam) {
        this.f57488a = rootView;
        this.f57489b = plusreviewMatchCnexam;
        this.f57490c = plusreviewMatchExam;
    }

    @NonNull
    public static xl a(@NonNull View rootView) {
        int i11 = R.id.plusreview_match_cnexam;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_cnexam);
        if (textView != null) {
            i11 = R.id.plusreview_match_exam;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.plusreview_match_exam);
            if (textView2 != null) {
                return new xl((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static xl c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xl d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.plusreview_match_example_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57488a;
    }
}
