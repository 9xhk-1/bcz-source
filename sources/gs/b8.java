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
public class b8 extends a8 implements a.InterfaceC0684a {

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f54253m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f54254n;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f54255f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final o4 f54256g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f54257h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54258i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f54259j;

    /* renamed from: k, reason: collision with root package name */
    public InverseBindingListener f54260k;

    /* renamed from: l, reason: collision with root package name */
    public long f54261l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData<String> mutableLiveData;
            String textString = TextViewBindingAdapter.getTextString(b8.this.f54154d);
            kf.p pVar = b8.this.f54155e;
            if (pVar == null || (mutableLiveData = pVar.f66494a) == null) {
                return;
            }
            mutableLiveData.setValue(textString);
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(7);
        f54253m = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{6}, new int[]{R.layout.bcz_loading_view});
        f54254n = null;
    }

    public b8(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f54253m, f54254n));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        kf.p pVar;
        if (sourceId != 1) {
            if (sourceId == 2 && (pVar = this.f54155e) != null) {
                pVar.k();
                return;
            }
            return;
        }
        kf.p pVar2 = this.f54155e;
        if (pVar2 != null) {
            pVar2.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e4, code lost:
    
        if (r10 != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.b8.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f54261l != 0) {
                    return true;
                }
                return this.f54256g.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f54261l = 128L;
        }
        this.f54256g.invalidateAll();
        requestRebind();
    }

    @Override // gs.a8
    public void j(@Nullable kf.p Viewmodel) {
        this.f54155e = Viewmodel;
        synchronized (this) {
            this.f54261l |= 64;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<List> ViewmodelCurrentItems, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54261l |= 8;
        }
        return true;
    }

    public final boolean l(MutableLiveData<Boolean> ViewmodelEnableSearch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54261l |= 2;
        }
        return true;
    }

    public final boolean m(MutableLiveData<Boolean> ViewmodelLoadingViewModelShowContent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54261l |= 32;
        }
        return true;
    }

    public final boolean n(SingleLiveEvent<String> ViewmodelRoute, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54261l |= 1;
        }
        return true;
    }

    public final boolean o(MutableLiveData<String> ViewmodelSearch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54261l |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return n((SingleLiveEvent) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 2) {
            return p((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 3) {
            return k((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 4) {
            return o((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 5) {
            return false;
        }
        return m((MutableLiveData) object, fieldId);
    }

    public final boolean p(MutableLiveData<Boolean> ViewmodelShowBack, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f54261l |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f54256g.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((kf.p) variable);
        return true;
    }

    public b8(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6, (View) bindings[4], (RecyclerView) bindings[5], (TextView) bindings[1], (EditText) bindings[2]);
        this.f54260k = new a();
        this.f54261l = -1L;
        this.f54151a.setTag(null);
        this.f54152b.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f54255f = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[6];
        this.f54256g = o4Var;
        setContainedBinding(o4Var);
        ImageView imageView = (ImageView) bindings[3];
        this.f54257h = imageView;
        imageView.setTag(null);
        this.f54153c.setTag(null);
        this.f54154d.setTag(null);
        setRootTag(root);
        this.f54258i = new hs.a(this, 2);
        this.f54259j = new hs.a(this, 1);
        invalidateAll();
    }
}
