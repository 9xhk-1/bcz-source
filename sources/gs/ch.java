package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class ch extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Guideline f54459a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f54460b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f54461c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f54462d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54463e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f54464f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final SwipeMenuLayout f54465g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f54466h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f54467i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f54468j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f54469k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f54470l;

    public ch(Object _bindingComponent, View _root, int _localFieldCount, Guideline endGuide, View hideChView, View hideEnView, View itemArea, ConstraintLayout itemContent, ImageView selectCheck, SwipeMenuLayout swipeLayout, TextView tvDelete, TextView wordCh, TextView wordEn, TextView wordMoreInfo, ImageView wordVoice) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f54459a = endGuide;
        this.f54460b = hideChView;
        this.f54461c = hideEnView;
        this.f54462d = itemArea;
        this.f54463e = itemContent;
        this.f54464f = selectCheck;
        this.f54465g = swipeLayout;
        this.f54466h = tvDelete;
        this.f54467i = wordCh;
        this.f54468j = wordEn;
        this.f54469k = wordMoreInfo;
        this.f54470l = wordVoice;
    }

    public static ch b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ch c(@NonNull View view, @Nullable Object component) {
        return (ch) ViewDataBinding.bind(component, view, R.layout.item_word_book_list_info);
    }

    @NonNull
    public static ch d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ch e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ch g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (ch) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_book_list_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static ch h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (ch) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_book_list_info, null, false, component);
    }
}
