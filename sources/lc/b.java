package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f71046a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f71047b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f71048c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Space f71049d;

    public b(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull Space space) {
        this.f71046a = linearLayout;
        this.f71047b = frameLayout;
        this.f71048c = textView;
        this.f71049d = space;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = R.id.option_view;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i11);
        if (frameLayout != null) {
            i11 = R.id.title;
            TextView textView = (TextView) view.findViewById(i11);
            if (textView != null) {
                i11 = R.id.top_spacing;
                Space space = (Space) view.findViewById(i11);
                if (space != null) {
                    return new b((LinearLayout) view, frameLayout, textView, space);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_base_option, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f71046a;
    }
}
