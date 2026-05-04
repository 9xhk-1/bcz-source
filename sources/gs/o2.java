package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.FullscreenVideoLayout;
import com.baicizhan.client.business.widget.RoundedButton;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class o2 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56165a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final WebView f56166b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56167c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RoundedButton f56168d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56169e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56170f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FullscreenVideoLayout f56171g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56172h;

    public o2(@NonNull RelativeLayout rootView, @NonNull WebView boardWebView, @NonNull RelativeLayout content, @NonNull RoundedButton emptyView, @NonNull ImageView home, @NonNull RelativeLayout titleBar, @NonNull FullscreenVideoLayout videoView, @NonNull FrameLayout videoViewContainer) {
        this.f56165a = rootView;
        this.f56166b = boardWebView;
        this.f56167c = content;
        this.f56168d = emptyView;
        this.f56169e = home;
        this.f56170f = titleBar;
        this.f56171g = videoView;
        this.f56172h = videoViewContainer;
    }

    @NonNull
    public static o2 a(@NonNull View rootView) {
        int i11 = R.id.board_web_view;
        WebView webView = (WebView) ViewBindings.findChildViewById(rootView, R.id.board_web_view);
        if (webView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i11 = R.id.empty_view;
            RoundedButton roundedButton = (RoundedButton) ViewBindings.findChildViewById(rootView, R.id.empty_view);
            if (roundedButton != null) {
                i11 = R.id.home;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.home);
                if (imageView != null) {
                    i11 = R.id.title_bar;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                    if (relativeLayout2 != null) {
                        i11 = R.id.video_view;
                        FullscreenVideoLayout fullscreenVideoLayout = (FullscreenVideoLayout) ViewBindings.findChildViewById(rootView, R.id.video_view);
                        if (fullscreenVideoLayout != null) {
                            i11 = R.id.video_view_container;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.video_view_container);
                            if (frameLayout != null) {
                                return new o2(relativeLayout, webView, relativeLayout, roundedButton, imageView, relativeLayout2, fullscreenVideoLayout, frameLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static o2 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static o2 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_tv_play, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56165a;
    }
}
