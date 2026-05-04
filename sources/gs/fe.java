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
public final class fe implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f54922a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54923b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54924c;

    public fe(@NonNull LinearLayout rootView, @NonNull TextView similarWordLeft, @NonNull TextView similarWordRight) {
        this.f54922a = rootView;
        this.f54923b = similarWordLeft;
        this.f54924c = similarWordRight;
    }

    @NonNull
    public static fe a(@NonNull View rootView) {
        int i11 = R.id.similar_word_left;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.similar_word_left);
        if (textView != null) {
            i11 = R.id.similar_word_right;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.similar_word_right);
            if (textView2 != null) {
                return new fe((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static fe c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static fe d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lookup_other_similar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f54922a;
    }
}
