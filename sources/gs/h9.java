package gs;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class h9 extends ViewDataBinding {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f55147a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55148b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final BottomSheetLayout f55149c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f55150d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f55151e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55152f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f55153g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final RecyclerView f55154h;

    /* renamed from: i, reason: collision with root package name */
    @Bindable
    public String f55155i;

    /* renamed from: j, reason: collision with root package name */
    @Bindable
    public TopicRecord f55156j;

    /* renamed from: k, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55157k;

    /* renamed from: l, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55158l;

    /* renamed from: m, reason: collision with root package name */
    @Bindable
    public View.OnClickListener f55159m;

    /* renamed from: n, reason: collision with root package name */
    @Bindable
    public boolean f55160n;

    /* renamed from: o, reason: collision with root package name */
    @Bindable
    public boolean f55161o;

    /* renamed from: p, reason: collision with root package name */
    @Bindable
    public Typeface f55162p;

    /* renamed from: q, reason: collision with root package name */
    @Bindable
    public boolean f55163q;

    /* renamed from: r, reason: collision with root package name */
    @Bindable
    public int f55164r;

    /* renamed from: s, reason: collision with root package name */
    @Bindable
    public Boolean f55165s;

    public h9(Object _bindingComponent, View _root, int _localFieldCount, TextView backToMain, LinearLayout bottomBar, BottomSheetLayout bottomsheet, RelativeLayout content, TextView continueLearn, ImageView kill, ProgressBar loadmore, RecyclerView wikiList) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f55147a = backToMain;
        this.f55148b = bottomBar;
        this.f55149c = bottomsheet;
        this.f55150d = content;
        this.f55151e = continueLearn;
        this.f55152f = kill;
        this.f55153g = loadmore;
        this.f55154h = wikiList;
    }

    public static h9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static h9 c(@NonNull View view, @Nullable Object component) {
        return (h9) ViewDataBinding.bind(component, view, R.layout.fragment_lookup_wiki_list);
    }

    @NonNull
    public static h9 p(@NonNull LayoutInflater inflater) {
        return t(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static h9 r(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return s(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static h9 s(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (h9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_lookup_wiki_list, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static h9 t(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (h9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_lookup_wiki_list, null, false, component);
    }

    public abstract void A(@Nullable View.OnClickListener loadClick);

    public abstract void B(boolean loadFailed);

    public abstract void C(boolean loading);

    public abstract void D(int studymode);

    public abstract void F(@Nullable String title);

    public abstract void G(@Nullable TopicRecord topic);

    @Nullable
    public Typeface d() {
        return this.f55162p;
    }

    @Nullable
    public View.OnClickListener e() {
        return this.f55159m;
    }

    @Nullable
    public Boolean g() {
        return this.f55165s;
    }

    @Nullable
    public View.OnClickListener h() {
        return this.f55158l;
    }

    public boolean i() {
        return this.f55163q;
    }

    @Nullable
    public View.OnClickListener j() {
        return this.f55157k;
    }

    public boolean k() {
        return this.f55160n;
    }

    public boolean l() {
        return this.f55161o;
    }

    public int m() {
        return this.f55164r;
    }

    @Nullable
    public String n() {
        return this.f55155i;
    }

    @Nullable
    public TopicRecord o() {
        return this.f55156j;
    }

    public abstract void u(@Nullable Typeface accentFont);

    public abstract void v(@Nullable View.OnClickListener backClick);

    public abstract void x(@Nullable Boolean hasKilled);

    public abstract void y(@Nullable View.OnClickListener killClick);

    public abstract void z(boolean killed);
}
