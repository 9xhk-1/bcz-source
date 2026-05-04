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
public final class ge implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55062a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55063b;

    public ge(@NonNull LinearLayout rootView, @NonNull TextView synonymWord) {
        this.f55062a = rootView;
        this.f55063b = synonymWord;
    }

    @NonNull
    public static ge a(@NonNull View rootView) {
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.synonym_word);
        if (textView != null) {
            return new ge((LinearLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.synonym_word)));
    }

    @NonNull
    public static ge c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ge d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_lookup_other_synonym, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f55062a;
    }
}
