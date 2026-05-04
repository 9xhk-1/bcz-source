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
public final class je implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55492a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55493b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55494c;

    public je(@NonNull LinearLayout rootView, @NonNull TextView derivationMean, @NonNull TextView derivationWord) {
        this.f55492a = rootView;
        this.f55493b = derivationMean;
        this.f55494c = derivationWord;
    }

    @NonNull
    public static je a(@NonNull View rootView) {
        int i11 = R.id.derivation_mean;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.derivation_mean);
        if (textView != null) {
            i11 = R.id.derivation_word;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.derivation_word);
            if (textView2 != null) {
                return new je((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static je c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static je d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lookup_wiki_derivation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f55492a;
    }
}
