package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CircleProgressView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class n5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55987a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f55988b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55989c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55990d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55991e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final CircleProgressView f55992f;

    public n5(@NonNull RelativeLayout rootView, @NonNull ImageView download, @NonNull FrameLayout downloadContainer, @NonNull TextView duration, @NonNull TextView name, @NonNull CircleProgressView progress) {
        this.f55987a = rootView;
        this.f55988b = download;
        this.f55989c = downloadContainer;
        this.f55990d = duration;
        this.f55991e = name;
        this.f55992f = progress;
    }

    @NonNull
    public static n5 a(@NonNull View rootView) {
        int i11 = R.id.download;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.download);
        if (imageView != null) {
            i11 = R.id.download_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.download_container);
            if (frameLayout != null) {
                i11 = R.id.duration;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.duration);
                if (textView != null) {
                    i11 = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                    if (textView2 != null) {
                        i11 = R.id.progress;
                        CircleProgressView circleProgressView = (CircleProgressView) ViewBindings.findChildViewById(rootView, R.id.progress);
                        if (circleProgressView != null) {
                            return new n5((RelativeLayout) rootView, imageView, frameLayout, textView, textView2, circleProgressView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static n5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static n5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.chapter_item_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55987a;
    }
}
