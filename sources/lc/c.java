package lc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.framework.common.magicdialog.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f71050a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f71051b;

    public c(@NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2) {
        this.f71050a = recyclerView;
        this.f71051b = recyclerView2;
    }

    @NonNull
    public static c a(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) view;
        return new c(recyclerView, recyclerView);
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dialog_check_option, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f71050a;
    }
}
