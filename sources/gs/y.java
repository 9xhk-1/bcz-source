package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class y implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57519a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final EditText f57520b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f57521c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Button f57522d;

    public y(@NonNull LinearLayout rootView, @NonNull EditText inbox, @NonNull Button modifyRoadmap, @NonNull Button showWiki) {
        this.f57519a = rootView;
        this.f57520b = inbox;
        this.f57521c = modifyRoadmap;
        this.f57522d = showWiki;
    }

    @NonNull
    public static y a(@NonNull View rootView) {
        int i11 = R.id.inbox;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.inbox);
        if (editText != null) {
            i11 = R.id.modify_roadmap;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.modify_roadmap);
            if (button != null) {
                i11 = R.id.show_wiki;
                Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.show_wiki);
                if (button2 != null) {
                    return new y((LinearLayout) rootView, editText, button, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static y c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static y d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.activity_debug, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f57519a;
    }
}
