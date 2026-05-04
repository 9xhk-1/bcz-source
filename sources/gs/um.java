package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class um implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SlidingMenu f57063a;

    public um(@NonNull SlidingMenu rootView) {
        this.f57063a = rootView;
    }

    @NonNull
    public static um a(@NonNull View rootView) {
        if (rootView != null) {
            return new um((SlidingMenu) rootView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static um c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static um d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.slidingmenumain, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SlidingMenu getRoot() {
        return this.f57063a;
    }
}
