package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class qe extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f56495a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f56496b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56497c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56498d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56499e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f56500f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f56501g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f56502h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final LottieAnimationView f56503i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f56504j;

    public qe(Object _bindingComponent, View _root, int _localFieldCount, TextView applicableScopes, ImageView collect, TextView examInfo, LinearLayout meaningsContainer, LinearLayout phoneticContainer, TextView phoneticUk, TextView phoneticUs, LottieAnimationView voiceUk, LottieAnimationView voiceUs, AppCompatTextView word) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56495a = applicableScopes;
        this.f56496b = collect;
        this.f56497c = examInfo;
        this.f56498d = meaningsContainer;
        this.f56499e = phoneticContainer;
        this.f56500f = phoneticUk;
        this.f56501g = phoneticUs;
        this.f56502h = voiceUk;
        this.f56503i = voiceUs;
        this.f56504j = word;
    }

    public static qe b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static qe c(@NonNull View view, @Nullable Object component) {
        return (qe) ViewDataBinding.bind(component, view, R.layout.item_lookup_wiki_word_info);
    }

    @NonNull
    public static qe d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static qe e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static qe g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (qe) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_word_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static qe h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (qe) ViewDataBinding.inflateInternal(inflater, R.layout.item_lookup_wiki_word_info, null, false, component);
    }
}
