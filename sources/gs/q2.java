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
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class q2 extends p2 implements a.InterfaceC0684a {

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56433l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56434m;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56435e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f56436f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56437g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56438h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56439i;

    /* renamed from: j, reason: collision with root package name */
    public InverseBindingListener f56440j;

    /* renamed from: k, reason: collision with root package name */
    public long f56441k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData<String> mutableLiveData;
            String textString = TextViewBindingAdapter.getTextString(q2.this.f56286c);
            hf.d dVar = q2.this.f56287d;
            if (dVar == null || (mutableLiveData = dVar.f59240a) == null) {
                return;
            }
            mutableLiveData.setValue(textString);
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f56433l = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"action_bar_basic"}, new int[]{3}, new int[]{R.layout.action_bar_basic});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56434m = sparseIntArray;
        sparseIntArray.put(R.id.desc, 4);
    }

    public q2(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f56433l, f56434m));
    }

    private boolean k(gs.a ActionBar, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56441k |= 1;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        hf.d dVar;
        if (sourceId == 1) {
            hf.d dVar2 = this.f56287d;
            if (dVar2 != null) {
                dVar2.b();
                return;
            }
            return;
        }
        if (sourceId != 2) {
            if (sourceId == 3 && (dVar = this.f56287d) != null) {
                dVar.c();
                return;
            }
            return;
        }
        hf.d dVar3 = this.f56287d;
        if (dVar3 != null) {
            dVar3.f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.q2.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f56441k != 0) {
                    return true;
                }
                return this.f56284a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56441k = 16L;
        }
        this.f56284a.invalidateAll();
        requestRebind();
    }

    @Override // gs.p2
    public void j(@Nullable hf.d ViewModel) {
        this.f56287d = ViewModel;
        synchronized (this) {
            this.f56441k |= 8;
        }
        notifyPropertyChanged(88);
        super.requestRebind();
    }

    public final boolean l(MutableLiveData<Boolean> ViewModelEnableSave, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56441k |= 2;
        }
        return true;
    }

    public final boolean m(MutableLiveData<String> ViewModelName, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56441k |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((gs.a) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return m((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f56284a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (88 != variableId) {
            return false;
        }
        j((hf.d) variable);
        return true;
    }

    public q2(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (gs.a) bindings[3], (TextView) bindings[4], (EditText) bindings[1]);
        this.f56440j = new a();
        this.f56441k = -1L;
        setContainedBinding(this.f56284a);
        this.f56286c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56435e = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[2];
        this.f56436f = imageView;
        imageView.setTag(null);
        setRootTag(root);
        this.f56437g = new hs.a(this, 1);
        this.f56438h = new hs.a(this, 2);
        this.f56439i = new hs.a(this, 3);
        invalidateAll();
    }
}
