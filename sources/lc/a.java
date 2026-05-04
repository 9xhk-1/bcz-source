package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f71043a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f71044b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f71045c;

    public a(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.f71043a = constraintLayout;
        this.f71044b = frameLayout;
        this.f71045c = constraintLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = R.id.magic_content_container;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i11);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        return new a(constraintLayout, frameLayout, constraintLayout);
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_base_common, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f71043a;
    }
}
