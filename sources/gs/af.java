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
public final class af implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f54177a;

    public af(@NonNull TextView rootView) {
        this.f54177a = rootView;
    }

    @NonNull
    public static af a(@NonNull View rootView) {
        if (rootView != null) {
            return new af((TextView) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static af c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static af d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_spelling_key_btn, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextView getRoot() {
        return this.f54177a;
    }
}
