package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d8 implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f54603a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f54604b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f54605c;

    public d8(@NonNull RelativeLayout rootView, @NonNull RecyclerView clearItemList, @NonNull TextView empty) {
        this.f54603a = rootView;
        this.f54604b = clearItemList;
        this.f54605c = empty;
    }

    @NonNull
    public static d8 a(@NonNull View rootView) {
        int i11 = R.id.clear_item_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.clear_item_list);
        if (recyclerView != null) {
            i11 = R.id.empty;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.empty);
            if (textView != null) {
                return new d8((RelativeLayout) rootView, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d8 c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static d8 d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.fragment_clear_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f54603a;
    }
}
