package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f71078a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f71079b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f71080c;

    public h(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f71078a = frameLayout;
        this.f71079b = imageView;
        this.f71080c = textView;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i11 = R.id.checked;
        ImageView imageView = (ImageView) view.findViewById(i11);
        if (imageView != null) {
            i11 = R.id.option;
            TextView textView = (TextView) view.findViewById(i11);
            if (textView != null) {
                return new h((FrameLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static h d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.item_dialog_check_option, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f71078a;
    }
}
