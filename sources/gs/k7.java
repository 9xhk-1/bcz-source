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
import com.wefika.flowlayout.FlowLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55578a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55579b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FlowLayout f55580c;

    public k7(@NonNull LinearLayout rootView, @NonNull TextView fmLineReview, @NonNull FlowLayout words) {
        this.f55578a = rootView;
        this.f55579b = fmLineReview;
        this.f55580c = words;
    }

    @NonNull
    public static k7 a(@NonNull View rootView) {
        int i11 = R.id.fm_line_review;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.fm_line_review);
        if (textView != null) {
            i11 = R.id.words;
            FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(rootView, R.id.words);
            if (flowLayout != null) {
                return new k7((LinearLayout) rootView, textView, flowLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static k7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static k7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fm_line_item_mid, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f55578a;
    }
}
