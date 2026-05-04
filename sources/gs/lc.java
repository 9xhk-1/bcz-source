package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.baicizhan.client.business.widget.CircleImageView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class lc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55757a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f55758b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55759c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55760d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Button f55761e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55762f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final CircleImageView f55763g;

    public lc(@NonNull RelativeLayout rootView, @NonNull Button accept, @NonNull TextView name, @NonNull TextView placeholder, @NonNull Button refuse, @NonNull TextView text1, @NonNull CircleImageView thumb) {
        this.f55757a = rootView;
        this.f55758b = accept;
        this.f55759c = name;
        this.f55760d = placeholder;
        this.f55761e = refuse;
        this.f55762f = text1;
        this.f55763g = thumb;
    }

    @NonNull
    public static lc a(@NonNull View rootView) {
        int i11 = R.id.accept;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.accept);
        if (button != null) {
            i11 = R.id.name;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
            if (textView != null) {
                i11 = R.id.placeholder;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.placeholder);
                if (textView2 != null) {
                    i11 = R.id.refuse;
                    Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.refuse);
                    if (button2 != null) {
                        i11 = R.id.text1;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.text1);
                        if (textView3 != null) {
                            i11 = R.id.thumb;
                            CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.thumb);
                            if (circleImageView != null) {
                                return new lc((RelativeLayout) rootView, button, textView, textView2, button2, textView3, circleImageView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static lc c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static lc d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.friend_notification_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f55757a;
    }
}
