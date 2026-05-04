package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class sg implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56755a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f56756b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56757c;

    public sg(@NonNull LinearLayout rootView, @NonNull TextView meaningStr, @NonNull TextView typeDesc) {
        this.f56755a = rootView;
        this.f56756b = meaningStr;
        this.f56757c = typeDesc;
    }

    @NonNull
    public static sg a(@NonNull View rootView) {
        int i11 = R.id.meaning_str;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.meaning_str);
        if (textView != null) {
            i11 = R.id.type_desc;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.type_desc);
            if (textView2 != null) {
                return new sg((LinearLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i11)));
    }

    @NonNull
    public static sg c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static sg d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_wiki_word_basic_meaning_item, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f56755a;
    }
}
