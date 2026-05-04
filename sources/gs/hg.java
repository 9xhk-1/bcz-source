package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class hg implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55195a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55196b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55197c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55198d;

    public hg(@NonNull RelativeLayout rootView, @NonNull RelativeLayout item, @NonNull TextView number, @NonNull TextView paraphraseEn) {
        this.f55195a = rootView;
        this.f55196b = item;
        this.f55197c = number;
        this.f55198d = paraphraseEn;
    }

    @NonNull
    public static hg a(@NonNull View rootView) {
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i11 = R.id.number;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.number);
        if (textView != null) {
            i11 = R.id.paraphrase_en;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.paraphrase_en);
            if (textView2 != null) {
                return new hg(relativeLayout, relativeLayout, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static hg c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static hg d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_wiki_paraphrase_en_meaning, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55195a;
    }
}
