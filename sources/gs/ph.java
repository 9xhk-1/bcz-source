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
import com.baicizhan.client.business.widget.RedDotImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ph implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56381a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RedDotImageView f56382b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56383c;

    public ph(@NonNull LinearLayout rootView, @NonNull RedDotImageView searchIcon, @NonNull TextView searchKey) {
        this.f56381a = rootView;
        this.f56382b = searchIcon;
        this.f56383c = searchKey;
    }

    @NonNull
    public static ph a(@NonNull View rootView) {
        int i11 = R.id.search_icon;
        RedDotImageView redDotImageView = (RedDotImageView) ViewBindings.findChildViewById(rootView, R.id.search_icon);
        if (redDotImageView != null) {
            i11 = R.id.search_key;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.search_key);
            if (textView != null) {
                return new ph((LinearLayout) rootView, redDotImageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ph c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ph d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_word_plan_search_word, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56381a;
    }
}
