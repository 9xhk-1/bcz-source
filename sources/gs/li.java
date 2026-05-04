package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.ui.PlayerView;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class li implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final PlayerView f55778a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PlayerView f55779b;

    public li(@NonNull PlayerView rootView, @NonNull PlayerView player) {
        this.f55778a = rootView;
        this.f55779b = player;
    }

    @NonNull
    public static li a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        PlayerView playerView = (PlayerView) rootView;
        return new li(playerView, playerView);
    }

    @NonNull
    public static li c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static li d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_home_video_background, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PlayerView getRoot() {
        return this.f55778a;
    }
}
