package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class so implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f56797a;

    public so(@NonNull View rootView) {
        this.f56797a = rootView;
    }

    @NonNull
    public static so a(@NonNull View rootView) {
        if (rootView != null) {
            return new so(rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static so b(@NonNull LayoutInflater inflater) {
        return c(inflater, null, false);
    }

    @NonNull
    public static so c(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.word_error_feedback_selection_divider, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f56797a;
    }
}
