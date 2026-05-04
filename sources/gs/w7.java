package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.webview.ui.BczWebView;
import com.baicizhan.client.business.widget.DisguiseProgressBar;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class w7 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57288a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57289b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ViewStub f57290c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final DisguiseProgressBar f57291d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57292e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final BczWebView f57293f;

    public w7(@NonNull LinearLayout rootView, @NonNull FrameLayout content, @NonNull ViewStub errorViewStub, @NonNull DisguiseProgressBar progressBar, @NonNull LinearLayout root, @NonNull BczWebView webView) {
        this.f57288a = rootView;
        this.f57289b = content;
        this.f57290c = errorViewStub;
        this.f57291d = progressBar;
        this.f57292e = root;
        this.f57293f = webView;
    }

    @NonNull
    public static w7 a(@NonNull View rootView) {
        int i11 = R.id.content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.content);
        if (frameLayout != null) {
            i11 = R.id.error_view_stub;
            ViewStub viewStub = (ViewStub) ViewBindings.findChildViewById(rootView, R.id.error_view_stub);
            if (viewStub != null) {
                i11 = R.id.progress_bar;
                DisguiseProgressBar disguiseProgressBar = (DisguiseProgressBar) ViewBindings.findChildViewById(rootView, R.id.progress_bar);
                if (disguiseProgressBar != null) {
                    LinearLayout linearLayout = (LinearLayout) rootView;
                    i11 = R.id.web_view;
                    BczWebView bczWebView = (BczWebView) ViewBindings.findChildViewById(rootView, R.id.web_view);
                    if (bczWebView != null) {
                        return new w7(linearLayout, frameLayout, viewStub, disguiseProgressBar, linearLayout, bczWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static w7 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static w7 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_bcz_web, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57288a;
    }
}
