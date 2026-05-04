package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class hb extends gb {

    /* renamed from: f0, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55173f0;

    /* renamed from: f1, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55174f1;

    @NonNull
    public final FrameLayout K;

    @Nullable
    public final o4 L;

    @NonNull
    public final RelativeLayout M;

    @NonNull
    public final View N;

    @NonNull
    public final RelativeLayout O;

    @NonNull
    public final RelativeLayout P;

    @NonNull
    public final TextView Q;

    @NonNull
    public final View R;

    @NonNull
    public final RelativeLayout S;

    @NonNull
    public final View T;

    @NonNull
    public final RelativeLayout U;

    @NonNull
    public final RelativeLayout V;

    @NonNull
    public final RelativeLayout W;

    @NonNull
    public final View X;
    public long Y;
    public long Z;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(42);
        f55173f0 = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{26}, new int[]{R.layout.bcz_loading_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55174f1 = sparseIntArray;
        sparseIntArray.put(R.id.current_image, 27);
        sparseIntArray.put(R.id.current_title, 28);
        sparseIntArray.put(R.id.current_content, 29);
        sparseIntArray.put(R.id.bind_phone_image, 30);
        sparseIntArray.put(R.id.bind_phone_title, 31);
        sparseIntArray.put(R.id.bind_wechat_image, 32);
        sparseIntArray.put(R.id.bind_wechat_title, 33);
        sparseIntArray.put(R.id.bind_qq_image, 34);
        sparseIntArray.put(R.id.bind_qq_title, 35);
        sparseIntArray.put(R.id.unbind_phone_image, 36);
        sparseIntArray.put(R.id.unbind_phone_title, 37);
        sparseIntArray.put(R.id.unbind_wechat_image, 38);
        sparseIntArray.put(R.id.unbind_wechat_title, 39);
        sparseIntArray.put(R.id.unbind_qq_image, 40);
        sparseIntArray.put(R.id.unbind_qq_title, 41);
    }

    public hb(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 42, f55173f0, f55174f1));
    }

    private boolean A(MutableLiveData<Boolean> LoadingVmShowContent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.Y |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0191  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.hb.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.Y == 0 && this.Z == 0) {
                return this.L.hasPendingBindings();
            }
            return true;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.Y = 512L;
            this.Z = 0L;
        }
        this.L.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return A((MutableLiveData) object, fieldId);
    }

    @Override // gs.gb
    public void r(@Nullable View.OnClickListener ClickListener) {
        this.E = ClickListener;
        synchronized (this) {
            this.Y |= 16;
        }
        notifyPropertyChanged(14);
        super.requestRebind();
    }

    @Override // gs.gb
    public void s(int CurrentType) {
        this.C = CurrentType;
        synchronized (this) {
            this.Y |= 64;
        }
        notifyPropertyChanged(18);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.L.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (75 == variableId) {
            y(((Boolean) variable).booleanValue());
            return true;
        }
        if (50 == variableId) {
            u((AccountBindingMgr.BindInfo) variable);
            return true;
        }
        if (42 == variableId) {
            t((ta.b) variable);
            return true;
        }
        if (14 == variableId) {
            r((View.OnClickListener) variable);
            return true;
        }
        if (91 == variableId) {
            z((AccountBindingMgr.BindInfo) variable);
            return true;
        }
        if (18 == variableId) {
            s(((Integer) variable).intValue());
            return true;
        }
        if (52 == variableId) {
            v((AccountBindingMgr.BindInfo) variable);
            return true;
        }
        if (73 != variableId) {
            return false;
        }
        x(((Boolean) variable).booleanValue());
        return true;
    }

    @Override // gs.gb
    public void t(@Nullable ta.b LoadingVm) {
        this.J = LoadingVm;
        synchronized (this) {
            this.Y |= 8;
        }
        notifyPropertyChanged(42);
        super.requestRebind();
    }

    @Override // gs.gb
    public void u(@Nullable AccountBindingMgr.BindInfo Phone) {
        this.I = Phone;
        synchronized (this) {
            this.Y |= 4;
        }
        notifyPropertyChanged(50);
        super.requestRebind();
    }

    @Override // gs.gb
    public void v(@Nullable AccountBindingMgr.BindInfo Qq) {
        this.G = Qq;
        synchronized (this) {
            this.Y |= 128;
        }
        notifyPropertyChanged(52);
        super.requestRebind();
    }

    @Override // gs.gb
    public void x(boolean ShowCurrent) {
        this.D = ShowCurrent;
        synchronized (this) {
            this.Y |= 256;
        }
        notifyPropertyChanged(73);
        super.requestRebind();
    }

    @Override // gs.gb
    public void y(boolean ShowQQ) {
        this.F = ShowQQ;
        synchronized (this) {
            this.Y |= 2;
        }
        notifyPropertyChanged(75);
        super.requestRebind();
    }

    @Override // gs.gb
    public void z(@Nullable AccountBindingMgr.BindInfo Wechat) {
        this.H = Wechat;
        synchronized (this) {
            this.Y |= 32;
        }
        notifyPropertyChanged(91);
        super.requestRebind();
    }

    public hb(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[8], (TextView) bindings[7], (ImageView) bindings[30], (TextView) bindings[31], (TextView) bindings[16], (TextView) bindings[15], (ImageView) bindings[34], (TextView) bindings[35], (TextView) bindings[11], (TextView) bindings[12], (ImageView) bindings[32], (TextView) bindings[33], (TextView) bindings[5], (TextView) bindings[4], (TextView) bindings[29], (ImageView) bindings[27], (TextView) bindings[28], (LinearLayout) bindings[1], (TextView) bindings[19], (ImageView) bindings[36], (TextView) bindings[37], (TextView) bindings[25], (ImageView) bindings[40], (TextView) bindings[41], (TextView) bindings[17], (TextView) bindings[22], (ImageView) bindings[38], (TextView) bindings[39]);
        this.Y = -1L;
        this.Z = -1L;
        this.f55025a.setTag(null);
        this.f55026b.setTag(null);
        this.f55029e.setTag(null);
        this.f55030f.setTag(null);
        this.f55033i.setTag(null);
        this.f55034j.setTag(null);
        this.f55037m.setTag(null);
        this.f55038n.setTag(null);
        this.f55042r.setTag(null);
        FrameLayout frameLayout = (FrameLayout) bindings[0];
        this.K = frameLayout;
        frameLayout.setTag(null);
        o4 o4Var = (o4) bindings[26];
        this.L = o4Var;
        setContainedBinding(o4Var);
        RelativeLayout relativeLayout = (RelativeLayout) bindings[10];
        this.M = relativeLayout;
        relativeLayout.setTag(null);
        View view = (View) bindings[13];
        this.N = view;
        view.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) bindings[14];
        this.O = relativeLayout2;
        relativeLayout2.setTag(null);
        RelativeLayout relativeLayout3 = (RelativeLayout) bindings[18];
        this.P = relativeLayout3;
        relativeLayout3.setTag(null);
        TextView textView = (TextView) bindings[2];
        this.Q = textView;
        textView.setTag(null);
        View view2 = (View) bindings[20];
        this.R = view2;
        view2.setTag(null);
        RelativeLayout relativeLayout4 = (RelativeLayout) bindings[21];
        this.S = relativeLayout4;
        relativeLayout4.setTag(null);
        View view3 = (View) bindings[23];
        this.T = view3;
        view3.setTag(null);
        RelativeLayout relativeLayout5 = (RelativeLayout) bindings[24];
        this.U = relativeLayout5;
        relativeLayout5.setTag(null);
        RelativeLayout relativeLayout6 = (RelativeLayout) bindings[3];
        this.V = relativeLayout6;
        relativeLayout6.setTag(null);
        RelativeLayout relativeLayout7 = (RelativeLayout) bindings[6];
        this.W = relativeLayout7;
        relativeLayout7.setTag(null);
        View view4 = (View) bindings[9];
        this.X = view4;
        view4.setTag(null);
        this.f55043s.setTag(null);
        this.f55046v.setTag(null);
        this.f55049y.setTag(null);
        this.f55050z.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
