package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class xi implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57470a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f57471b;

    public xi(@NonNull RecyclerView rootView, @NonNull RecyclerView recycler) {
        this.f57470a = rootView;
        this.f57471b = recycler;
    }

    @NonNull
    public static xi a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        RecyclerView recyclerView = (RecyclerView) rootView;
        return new xi(recyclerView, recyclerView);
    }

    @NonNull
    public static xi c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static xi d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.layout_wiki_item_common_list, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RecyclerView getRoot() {
        return this.f57470a;
    }
}
