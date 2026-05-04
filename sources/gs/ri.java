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
public final class ri implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final PlayerView f56656a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final PlayerView f56657b;

    public ri(@NonNull PlayerView rootView, @NonNull PlayerView player) {
        this.f56656a = rootView;
        this.f56657b = player;
    }

    @NonNull
    public static ri a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        PlayerView playerView = (PlayerView) rootView;
        return new ri(playerView, playerView);
    }

    @NonNull
    public static ri c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ri d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_multi_mode_desc_video, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PlayerView getRoot() {
        return this.f56656a;
    }
}
