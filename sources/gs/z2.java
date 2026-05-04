package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class z2 extends ViewDataBinding {

    @NonNull
    public final LinearLayout A;

    @NonNull
    public final RecyclerView B;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f57701a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f57702b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RadioGroup f57703c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RadioGroup f57704d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f57705e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f57706f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f57707g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f57708h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RadioButton f57709i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final RadioButton f57710j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f57711k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f57712l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final View f57713m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextView f57714n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextView f57715o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f57716p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f57717q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final View f57718r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final Barrier f57719s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final RadioButton f57720t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final RadioButton f57721u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final Group f57722v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final Group f57723w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f57724x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57725y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final TextView f57726z;

    public z2(Object _bindingComponent, View _root, int _localFieldCount, a actionBar, TextView addScore, RadioGroup bookRadioGroup, RadioGroup bookRadioGroupDisable, ImageView detailWordBookImg, ImageView editBookName, TextView export, TextView goStudy, RadioButton letterOrder, RadioButton letterReverse, ImageView noproguardAllCheck, TextView noproguardAllCheckText, View noproguardBottomMenuBg, TextView noproguardBtnCancelDelete, TextView noproguardBtnDoDelete, ImageView noproguardNoWordImg, TextView noproguardNoWordTip, View noproguardSafeArea, Barrier radioBarrier, RadioButton timeOrder, RadioButton timeReverse, Group wbGroupBottomDeleteOperate, Group wbGroupNoWordView, TextView wordBookContentCount, LinearLayout wordBookInfoRow, TextView wordBookName, LinearLayout wordBookTagsContainer, RecyclerView wordDataRecycler) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f57701a = actionBar;
        this.f57702b = addScore;
        this.f57703c = bookRadioGroup;
        this.f57704d = bookRadioGroupDisable;
        this.f57705e = detailWordBookImg;
        this.f57706f = editBookName;
        this.f57707g = export;
        this.f57708h = goStudy;
        this.f57709i = letterOrder;
        this.f57710j = letterReverse;
        this.f57711k = noproguardAllCheck;
        this.f57712l = noproguardAllCheckText;
        this.f57713m = noproguardBottomMenuBg;
        this.f57714n = noproguardBtnCancelDelete;
        this.f57715o = noproguardBtnDoDelete;
        this.f57716p = noproguardNoWordImg;
        this.f57717q = noproguardNoWordTip;
        this.f57718r = noproguardSafeArea;
        this.f57719s = radioBarrier;
        this.f57720t = timeOrder;
        this.f57721u = timeReverse;
        this.f57722v = wbGroupBottomDeleteOperate;
        this.f57723w = wbGroupNoWordView;
        this.f57724x = wordBookContentCount;
        this.f57725y = wordBookInfoRow;
        this.f57726z = wordBookName;
        this.A = wordBookTagsContainer;
        this.B = wordDataRecycler;
    }

    public static z2 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static z2 c(@NonNull View view, @Nullable Object component) {
        return (z2) ViewDataBinding.bind(component, view, R.layout.activity_word_book_detail);
    }

    @NonNull
    public static z2 d(@NonNull LayoutInflater inflater) {
        return h(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static z2 e(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return g(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static z2 g(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (z2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_book_detail, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static z2 h(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (z2) ViewDataBinding.inflateInternal(inflater, R.layout.activity_word_book_detail, null, false, component);
    }
}
