package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class dc implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f54615a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f54616b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f54617c;

    public dc(@NonNull View rootView, @NonNull TextView tabContent, @NonNull View tabIndicator) {
        this.f54615a = rootView;
        this.f54616b = tabContent;
        this.f54617c = tabIndicator;
    }

    @NonNull
    public static dc a(@NonNull View rootView) {
        int i11 = R.id.tab_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tab_content);
        if (textView != null) {
            i11 = R.id.tab_indicator;
            View findChildViewById = ViewBindings.findChildViewById(rootView, R.id.tab_indicator);
            if (findChildViewById != null) {
                return new dc(rootView, textView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static dc b(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        if (parent == null) {
            throw new NullPointerException(q.a.f13044u);
        }
        inflater.inflate(R.layout.friend_facet_tab, parent);
        return a(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f54615a;
    }
}
