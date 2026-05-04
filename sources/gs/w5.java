package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class w5 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f57281a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f57282b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f57283c;

    public w5(@NonNull RelativeLayout rootView, @NonNull ImageView btnCancel, @NonNull ImageView btnDone) {
        this.f57281a = rootView;
        this.f57282b = btnCancel;
        this.f57283c = btnDone;
    }

    @NonNull
    public static w5 a(@NonNull View rootView) {
        int i11 = R.id.btn_cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btn_cancel);
        if (imageView != null) {
            i11 = R.id.btn_done;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.btn_done);
            if (imageView2 != null) {
                return new w5((RelativeLayout) rootView, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static w5 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static w5 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.crop__layout_done_cancel, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f57281a;
    }
}
