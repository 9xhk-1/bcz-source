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
public final class kf implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55611a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f55612b;

    public kf(@NonNull TextView rootView, @NonNull TextView tabText) {
        this.f55611a = rootView;
        this.f55612b = tabText;
    }

    @NonNull
    public static kf a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new kf(textView, textView);
    }

    @NonNull
    public static kf c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static kf d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_wiki_custom_tab, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f55611a;
    }
}
