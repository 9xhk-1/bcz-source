package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class gj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ImageView f55078a;

    public gj(@NonNull ImageView rootView) {
        this.f55078a = rootView;
    }

    @NonNull
    public static gj a(@NonNull View rootView) {
        if (rootView != null) {
            return new gj((ImageView) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static gj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static gj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_word_wiki_divider, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.f55078a;
    }
}
