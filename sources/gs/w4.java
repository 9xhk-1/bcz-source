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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class w4 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57275a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57276b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57277c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f57278d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f57279e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f57280f;

    public w4(@NonNull RelativeLayout rootView, @NonNull ImageView image, @NonNull FrameLayout imageContainer, @NonNull TextView level, @NonNull TextView name, @NonNull TextView playTime) {
        this.f57275a = rootView;
        this.f57276b = image;
        this.f57277c = imageContainer;
        this.f57278d = level;
        this.f57279e = name;
        this.f57280f = playTime;
    }

    @NonNull
    public static w4 a(@NonNull View rootView) {
        int i11 = R.id.image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (imageView != null) {
            i11 = R.id.image_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.image_container);
            if (frameLayout != null) {
                i11 = R.id.level;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.level);
                if (textView != null) {
                    i11 = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.name);
                    if (textView2 != null) {
                        i11 = R.id.play_time;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.play_time);
                        if (textView3 != null) {
                            return new w4((RelativeLayout) rootView, imageView, frameLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static w4 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static w4 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.book_view, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57275a;
    }
}
