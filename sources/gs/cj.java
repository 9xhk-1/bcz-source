package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.main.view.WordVariationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class cj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final WordVariationView f54477a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WordVariationView f54478b;

    public cj(@NonNull WordVariationView rootView, @NonNull WordVariationView wordVariation) {
        this.f54477a = rootView;
        this.f54478b = wordVariation;
    }

    @NonNull
    public static cj a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        WordVariationView wordVariationView = (WordVariationView) rootView;
        return new cj(wordVariationView, wordVariationView);
    }

    @NonNull
    public static cj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static cj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_word_variation, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WordVariationView getRoot() {
        return this.f54477a;
    }
}
