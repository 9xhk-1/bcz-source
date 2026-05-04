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
public final class ee implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54783a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54784b;

    public ee(@NonNull LinearLayout rootView, @NonNull TextView enMeanText) {
        this.f54783a = rootView;
        this.f54784b = enMeanText;
    }

    @NonNull
    public static ee a(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.en_mean_text);
        if (textView != null) {
            return new ee((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.en_mean_text)));
    }

    @NonNull
    public static ee c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ee d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lookup_other_en_mean, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54783a;
    }
}
