package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c8 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54411a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f54412b;

    public c8(@NonNull ConstraintLayout rootView, @NonNull RecyclerView categoryList) {
        this.f54411a = rootView;
        this.f54412b = categoryList;
    }

    @NonNull
    public static c8 a(@NonNull View rootView) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.category_list);
        if (recyclerView != null) {
            return new c8((ConstraintLayout) rootView, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.category_list)));
    }

    @NonNull
    public static c8 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static c8 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_clear_category, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f54411a;
    }
}
