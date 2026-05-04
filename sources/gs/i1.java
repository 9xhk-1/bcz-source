package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class i1 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f55247a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Barrier f55248b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f55249c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f55250d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55251e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f55252f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f55253g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final f7 f55254h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f55255i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55256j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f55257k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55258l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f55259m;

    /* renamed from: n, reason: collision with root package name */
    @Bindable
    public com.baicizhan.main.examassistant.t1 f55260n;

    public i1(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, Barrier bottomBarrier, TextView cancelCollectBtn, TextView checkText, LinearLayout collectPanel, TextView currentWordText, TextView doCollectBtn, f7 retryLayout, TextView studyBtn, LinearLayout studyPanel, ImageView wordAllCheck, RecyclerView wordList, TextView wordNumText) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55247a = actionBar;
        this.f55248b = bottomBarrier;
        this.f55249c = cancelCollectBtn;
        this.f55250d = checkText;
        this.f55251e = collectPanel;
        this.f55252f = currentWordText;
        this.f55253g = doCollectBtn;
        this.f55254h = retryLayout;
        this.f55255i = studyBtn;
        this.f55256j = studyPanel;
        this.f55257k = wordAllCheck;
        this.f55258l = wordList;
        this.f55259m = wordNumText;
    }

    public static i1 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static i1 c(@NonNull View view, @Nullable Object component) {
        return (i1) ViewDataBinding.bind(component, view, R.layout.activity_marked_word);
    }

    @NonNull
    public static i1 e(@NonNull LayoutInflater inflater) {
        return i(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static i1 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return h(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static i1 h(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (i1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_marked_word, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static i1 i(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (i1) ViewDataBinding.inflateInternal(inflater, R.layout.activity_marked_word, null, false, component);
    }

    @Nullable
    public com.baicizhan.main.examassistant.t1 d() {
        return this.f55260n;
    }

    public abstract void j(@Nullable com.baicizhan.main.examassistant.t1 model);
}
