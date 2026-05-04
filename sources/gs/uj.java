package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.baicizhan.client.business.webview.ui.SimpleWebView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class uj implements ViewBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final SimpleWebView f57045a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final SimpleWebView f57046b;

    public uj(@NonNull SimpleWebView rootView, @NonNull SimpleWebView lookupWeb) {
        this.f57045a = rootView;
        this.f57046b = lookupWeb;
    }

    @NonNull
    public static uj a(@NonNull View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        SimpleWebView simpleWebView = (SimpleWebView) rootView;
        return new uj(simpleWebView, simpleWebView);
    }

    @NonNull
    public static uj c(@NonNull LayoutInflater inflater) {
        return d(inflater, null, false);
    }

    @NonNull
    public static uj d(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.lookup_result_list_item_web, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return a(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SimpleWebView getRoot() {
        return this.f57045a;
    }
}
