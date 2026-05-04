package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class q4 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f56448a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56449b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56450c;

    public q4(@NonNull RelativeLayout rootView, @NonNull ImageView share, @NonNull TextView title) {
        this.f56448a = rootView;
        this.f56449b = share;
        this.f56450c = title;
    }

    @NonNull
    public static q4 a(@NonNull View rootView) {
        int i11 = R.id.share;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share);
        if (imageView != null) {
            i11 = R.id.title;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
            if (textView != null) {
                return new q4((RelativeLayout) rootView, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static q4 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static q4 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.bcz_store_main_title, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f56448a;
    }
}
