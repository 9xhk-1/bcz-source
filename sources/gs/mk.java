package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.baicizhan.client.business.widget.CircleProgressView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class mk implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f55924a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55925b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircleProgressView f55926c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55927d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55928e;

    public mk(@NonNull View rootView, @NonNull FrameLayout indicator, @NonNull CircleProgressView progress, @NonNull ImageView stateImage, @NonNull TextView text) {
        this.f55924a = rootView;
        this.f55925b = indicator;
        this.f55926c = progress;
        this.f55927d = stateImage;
        this.f55928e = text;
    }

    @NonNull
    public static mk a(@NonNull View rootView) {
        int i11 = R.id.indicator;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.indicator);
        if (frameLayout != null) {
            i11 = R.id.progress;
            CircleProgressView circleProgressView = (CircleProgressView) ViewBindings.findChildViewById(rootView, R.id.progress);
            if (circleProgressView != null) {
                i11 = R.id.state_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.state_image);
                if (imageView != null) {
                    i11 = R.id.text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text);
                    if (textView != null) {
                        return new mk(rootView, frameLayout, circleProgressView, imageView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static mk b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.offline_download_view, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f55924a;
    }
}
