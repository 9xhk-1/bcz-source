package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.baicizhan.client.business.view.RotatingImageView;
import com.jiongji.andriod.card.R;
import com.malmstein.fenster.view.FensterVideoView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class oo implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f56267a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56268b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RotatingImageView f56269c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56270d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56271e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56272f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f56273g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FensterVideoView f56274h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f56275i;

    public oo(@NonNull View rootView, @NonNull ImageView fullscreen, @NonNull RotatingImageView loadingView, @NonNull LinearLayout placeholder, @NonNull ImageView play, @NonNull RelativeLayout playController, @NonNull ImageView snapshot, @NonNull FensterVideoView textureView, @NonNull ImageView toggle) {
        this.f56267a = rootView;
        this.f56268b = fullscreen;
        this.f56269c = loadingView;
        this.f56270d = placeholder;
        this.f56271e = play;
        this.f56272f = playController;
        this.f56273g = snapshot;
        this.f56274h = textureView;
        this.f56275i = toggle;
    }

    @NonNull
    public static oo a(@NonNull View rootView) {
        int i11 = R.id.fullscreen;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.fullscreen);
        if (imageView != null) {
            i11 = R.id.loading_view;
            RotatingImageView rotatingImageView = (RotatingImageView) ViewBindings.findChildViewById(rootView, R.id.loading_view);
            if (rotatingImageView != null) {
                i11 = R.id.placeholder;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.placeholder);
                if (linearLayout != null) {
                    i11 = R.id.play;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.play);
                    if (imageView2 != null) {
                        i11 = R.id.play_controller;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.play_controller);
                        if (relativeLayout != null) {
                            i11 = R.id.snapshot;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.snapshot);
                            if (imageView3 != null) {
                                i11 = R.id.texture_view;
                                FensterVideoView fensterVideoView = (FensterVideoView) ViewBindings.findChildViewById(rootView, R.id.texture_view);
                                if (fensterVideoView != null) {
                                    i11 = R.id.toggle;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.toggle);
                                    if (imageView4 != null) {
                                        return new oo(rootView, imageView, rotatingImageView, linearLayout, imageView2, relativeLayout, imageView3, fensterVideoView, imageView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static oo b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.wiki_video_view, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f56267a;
    }
}
