package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CircleImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ic implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55302a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55303b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55304c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FrameLayout f55305d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55306e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55307f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CircleImageView f55308g;

    public ic(@NonNull FrameLayout rootView, @NonNull FrameLayout content, @NonNull TextView name, @NonNull FrameLayout operations, @NonNull TextView text1, @NonNull TextView text2, @NonNull CircleImageView thumb) {
        this.f55302a = rootView;
        this.f55303b = content;
        this.f55304c = name;
        this.f55305d = operations;
        this.f55306e = text1;
        this.f55307f = text2;
        this.f55308g = thumb;
    }

    @NonNull
    public static ic a(@NonNull View rootView) {
        int i11 = R.id.content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.content);
        if (frameLayout != null) {
            i11 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
            if (textView != null) {
                i11 = R.id.operations;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.operations);
                if (frameLayout2 != null) {
                    i11 = R.id.text1;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text1);
                    if (textView2 != null) {
                        i11 = R.id.text2;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text2);
                        if (textView3 != null) {
                            i11 = R.id.thumb;
                            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.thumb);
                            if (circleImageView != null) {
                                return new ic((FrameLayout) rootView, frameLayout, textView, frameLayout2, textView2, textView3, circleImageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ic c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static ic d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_list_friend_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f55302a;
    }
}
