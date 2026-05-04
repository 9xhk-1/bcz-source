package gs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.baicizhan.main.activity.mytab.device.MyDevicesView;
import com.baicizhan.main.activity.mytab.task.AchievementView;
import com.baicizhan.main.activity.mytab.task.TaskVM;
import com.baicizhan.main.activity.mytab.task.TasksView;
import com.jiongji.andriod.card.R;
import com.makeramen.roundedimageview.RoundedImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class r9 extends ViewDataBinding {

    @NonNull
    public final View A;

    @NonNull
    public final TasksView B;

    @NonNull
    public final ConstraintLayout C;

    @Bindable
    public he.w D;

    @Bindable
    public TaskVM E;

    @Bindable
    public bh.c F;

    @Bindable
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56594a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final RoundedImageView f56595b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f56596c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56597d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f56598e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ek f56599f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f56600g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f56601h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f56602i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ek f56603j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56604k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f56605l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final ek f56606m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final ek f56607n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final MyDevicesView f56608o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final ek f56609p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final ek f56610q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    public final ek f56611r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    public final ek f56612s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    public final FrameLayout f56613t;

    /* renamed from: u, reason: collision with root package name */
    @NonNull
    public final ek f56614u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final TextView f56615v;

    /* renamed from: w, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56616w;

    /* renamed from: x, reason: collision with root package name */
    @NonNull
    public final ImageView f56617x;

    /* renamed from: y, reason: collision with root package name */
    @NonNull
    public final ImageView f56618y;

    /* renamed from: z, reason: collision with root package name */
    @NonNull
    public final AchievementView f56619z;

    public r9(Object _bindingComponent, View _root, int _localFieldCount, LinearLayout actionBar, RoundedImageView avatar, TextView bczId, ConstraintLayout collectLayout, NestedScrollView content, ek givePraise, View gradeRedDot, TextView gradle, ImageView headBg, ek helpAndFeedback, ConstraintLayout helpLayout, ImageView imgMeMore, ek myCalendar, ek myCollection, MyDevicesView myDevices, ek myExam, ek myMall, ek myMoney, ek myPlan, FrameLayout myTab, ek myWordTest, TextView name, LinearLayout planLayout, ImageView qrcode, ImageView setting, AchievementView studyLayout, View tabRedDot, TasksView taskLayout, ConstraintLayout userInfoLayout) {
        super(_bindingComponent, _root, _localFieldCount);
        this.f56594a = actionBar;
        this.f56595b = avatar;
        this.f56596c = bczId;
        this.f56597d = collectLayout;
        this.f56598e = content;
        this.f56599f = givePraise;
        this.f56600g = gradeRedDot;
        this.f56601h = gradle;
        this.f56602i = headBg;
        this.f56603j = helpAndFeedback;
        this.f56604k = helpLayout;
        this.f56605l = imgMeMore;
        this.f56606m = myCalendar;
        this.f56607n = myCollection;
        this.f56608o = myDevices;
        this.f56609p = myExam;
        this.f56610q = myMall;
        this.f56611r = myMoney;
        this.f56612s = myPlan;
        this.f56613t = myTab;
        this.f56614u = myWordTest;
        this.f56615v = name;
        this.f56616w = planLayout;
        this.f56617x = qrcode;
        this.f56618y = setting;
        this.f56619z = studyLayout;
        this.A = tabRedDot;
        this.B = taskLayout;
        this.C = userInfoLayout;
    }

    public static r9 b(@NonNull View view) {
        return c(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static r9 c(@NonNull View view, @Nullable Object component) {
        return (r9) ViewDataBinding.bind(component, view, R.layout.fragment_mytab);
    }

    @NonNull
    public static r9 i(@NonNull LayoutInflater inflater) {
        return l(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static r9 j(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return k(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static r9 k(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (r9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_mytab, root, attachToRoot, component);
    }

    @NonNull
    @Deprecated
    public static r9 l(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (r9) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_mytab, null, false, component);
    }

    public boolean d() {
        return this.G;
    }

    @Nullable
    public bh.c e() {
        return this.F;
    }

    @Nullable
    public TaskVM g() {
        return this.E;
    }

    @Nullable
    public he.w h() {
        return this.D;
    }

    public abstract void m(boolean dark);

    public abstract void n(@Nullable bh.c notificationsModel);

    public abstract void o(@Nullable TaskVM taskVm);

    public abstract void p(@Nullable he.w viewmodel);
}
