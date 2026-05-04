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
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class zn implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57808a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f57809b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f57810c;

    public zn(@NonNull FrameLayout rootView, @NonNull View divider, @NonNull TextView text) {
        this.f57808a = rootView;
        this.f57809b = divider;
        this.f57810c = text;
    }

    @NonNull
    public static zn a(@NonNull View rootView) {
        int i11 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider);
        if (findChildViewById != null) {
            i11 = R.id.text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text);
            if (textView != null) {
                return new zn((FrameLayout) rootView, findChildViewById, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static zn c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static zn d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.tv_timeline_section, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f57808a;
    }
}
