package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.jiongji.andriod.card.R;
import com.tencent.rtmp.ui.TXCloudVideoView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class jo implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f55551a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55552b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TXCloudVideoView f55553c;

    public jo(@NonNull View rootView, @NonNull LinearLayout loading, @NonNull TXCloudVideoView txVideoView) {
        this.f55551a = rootView;
        this.f55552b = loading;
        this.f55553c = txVideoView;
    }

    @NonNull
    public static jo a(@NonNull View rootView) {
        int i11 = R.id.loading;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (linearLayout != null) {
            i11 = R.id.txVideoView;
            TXCloudVideoView tXCloudVideoView = (TXCloudVideoView) ViewBindings.findChildViewById(rootView, R.id.txVideoView);
            if (tXCloudVideoView != null) {
                return new jo(rootView, linearLayout, tXCloudVideoView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static jo b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.view_video_player, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f55551a;
    }
}
