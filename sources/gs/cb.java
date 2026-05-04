package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.DisguiseProgressBar;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class cb implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f54437a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final DisguiseProgressBar f54438b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final WebView f54439c;

    public cb(@NonNull FrameLayout rootView, @NonNull DisguiseProgressBar subjectProgress, @NonNull WebView subjectWebView) {
        this.f54437a = rootView;
        this.f54438b = subjectProgress;
        this.f54439c = subjectWebView;
    }

    @NonNull
    public static cb a(@NonNull View rootView) {
        int i11 = R.id.subject_progress;
        DisguiseProgressBar disguiseProgressBar = (DisguiseProgressBar) ViewBindings.findChildViewById(rootView, R.id.subject_progress);
        if (disguiseProgressBar != null) {
            i11 = R.id.subject_web_view;
            WebView webView = (WebView) ViewBindings.findChildViewById(rootView, R.id.subject_web_view);
            if (webView != null) {
                return new cb((FrameLayout) rootView, disguiseProgressBar, webView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static cb c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static cb d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_tv_subject, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f54437a;
    }
}
