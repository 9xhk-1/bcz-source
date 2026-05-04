package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ao implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ProgressBar f54209a;

    public ao(@NonNull ProgressBar rootView) {
        this.f54209a = rootView;
    }

    @NonNull
    public static ao a(@NonNull View rootView) {
        if (rootView != null) {
            return new ao((ProgressBar) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static ao c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ao d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.video_progress_bar, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ProgressBar getRoot() {
        return this.f54209a;
    }
}
