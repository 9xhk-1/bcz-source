package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.InverseBindingListener;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import hs.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class na extends ma implements a.InterfaceC0684a {

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56024k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56025l;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56026e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final o4 f56027f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f56028g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56029h;

    /* renamed from: i, reason: collision with root package name */
    public InverseBindingListener f56030i;

    /* renamed from: j, reason: collision with root package name */
    public long f56031j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData<String> mutableLiveData;
            String textString = TextViewBindingAdapter.getTextString(na.this.f55879b);
            lf.k kVar = na.this.f55881d;
            if (kVar == null || (mutableLiveData = kVar.f71200a) == null) {
                return;
            }
            mutableLiveData.setValue(textString);
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        f56024k = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{5}, new int[]{R.layout.bcz_loading_view});
        f56025l = null;
    }

    public na(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 6, f56024k, f56025l));
    }

    private boolean k(MutableLiveData<Boolean> ViewmodelLoadingVMShowContent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56031j |= 8;
        }
        return true;
    }

    private boolean n(MutableLiveData<String> ViewmodelSearch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56031j |= 4;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        lf.k kVar = this.f55881d;
        if (kVar != null) {
            kVar.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0085  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.na.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56031j != 0) {
                    return true;
                }
                return this.f56027f.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56031j = 32L;
        }
        this.f56027f.invalidateAll();
        requestRebind();
    }

    @Override // gs.ma
    public void j(@Nullable lf.k Viewmodel) {
        this.f55881d = Viewmodel;
        synchronized (this) {
            this.f56031j |= 16;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean l(SingleLiveEvent<List<gf.b>> ViewmodelLocations, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56031j |= 2;
        }
        return true;
    }

    public final boolean m(MutableLiveData<Boolean> ViewmodelNoResult, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56031j |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return m((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((SingleLiveEvent) object, fieldId);
        }
        if (localFieldId == 2) {
            return n((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 3) {
            return false;
        }
        return k((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56027f.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((lf.k) variable);
        return true;
    }

    public na(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4, (RecyclerView) bindings[3], (EditText) bindings[1], (TextView) bindings[4]);
        this.f56030i = new a();
        this.f56031j = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56026e = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[5];
        this.f56027f = o4Var;
        setContainedBinding(o4Var);
        ImageView imageView = (ImageView) bindings[2];
        this.f56028g = imageView;
        imageView.setTag(null);
        this.f55878a.setTag(null);
        this.f55879b.setTag(null);
        this.f55880c.setTag(null);
        setRootTag(root);
        this.f56029h = new hs.a(this, 1);
        invalidateAll();
    }
}
