package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class jg implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55499a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55500b;

    public jg(@NonNull TextView rootView, @NonNull TextView type) {
        this.f55499a = rootView;
        this.f55500b = type;
    }

    @NonNull
    public static jg a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new jg(textView, textView);
    }

    @NonNull
    public static jg c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static jg d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_wiki_paraphrase_type, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f55499a;
    }
}
