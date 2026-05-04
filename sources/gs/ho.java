package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class ho implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f55237a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55238b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55239c;

    public ho(@NonNull View rootView, @NonNull RecyclerView shareList, @NonNull TextView text) {
        this.f55237a = rootView;
        this.f55238b = shareList;
        this.f55239c = text;
    }

    @NonNull
    public static ho a(@NonNull View rootView) {
        int i11 = R.id.share_list;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.share_list);
        if (recyclerView != null) {
            i11 = R.id.text;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.text);
            if (textView != null) {
                return new ho(rootView, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ho b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.view_share_panel, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f55237a;
    }
}
