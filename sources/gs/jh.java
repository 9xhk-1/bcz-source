package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.customview.SwipeMenuLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class jh extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final View f55501a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55502b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImageView f55503c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f55504d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f55505e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55506f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final SwipeMenuLayout f55507g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f55508h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55509i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f55510j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f55511k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final View f55512l;

    public jh(Object _bindingComponent, View _root, int _localFieldCount, View hideMeanView, ConstraintLayout itemContent, ImageView ivCollect, ImageView ivMore, ImageView ivProgress, ImageView selectCheck, SwipeMenuLayout swipeLayout, TextView tvMean, TextView tvOperate, TextView tvReviewInfo, TextView tvWord, View vWikiArea) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55501a = hideMeanView;
        this.f55502b = itemContent;
        this.f55503c = ivCollect;
        this.f55504d = ivMore;
        this.f55505e = ivProgress;
        this.f55506f = selectCheck;
        this.f55507g = swipeLayout;
        this.f55508h = tvMean;
        this.f55509i = tvOperate;
        this.f55510j = tvReviewInfo;
        this.f55511k = tvWord;
        this.f55512l = vWikiArea;
    }

    public static jh b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static jh c(@NonNull View view, @Nullable Object component) {
        return (jh) ViewDataBinding.bind(component, view, R.layout.item_word_list_v2_info);
    }

    @NonNull
    public static jh d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static jh e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static jh g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (jh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_list_v2_info, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static jh h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (jh) ViewDataBinding.inflateInternal(inflater, R.layout.item_word_list_v2_info, null, false, component);
    }
}
