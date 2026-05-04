package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
public class la extends ka implements a.InterfaceC0684a {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55735j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55736k;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55737d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final o4 f55738e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImageView f55739f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55740g;

    /* renamed from: h, reason: collision with root package name */
    public InverseBindingListener f55741h;

    /* renamed from: i, reason: collision with root package name */
    public long f55742i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData<String> mutableLiveData;
            String textString = TextViewBindingAdapter.getTextString(la.this.f55589b);
            nf.k kVar = la.this.f55590c;
            if (kVar == null || (mutableLiveData = kVar.f75081a) == null) {
                return;
            }
            mutableLiveData.setValue(textString);
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(5);
        f55735j = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"bcz_loading_view"}, new int[]{4}, new int[]{R.layout.bcz_loading_view});
        f55736k = null;
    }

    public la(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f55735j, f55736k));
    }

    private boolean l(MutableLiveData<String> ViewmodelSearch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55742i |= 1;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        nf.k kVar = this.f55590c;
        if (kVar != null) {
            kVar.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.f55742i     // Catch: java.lang.Throwable -> L97
            r4 = 0
            r1.f55742i = r4     // Catch: java.lang.Throwable -> L97
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L97
            nf.k r0 = r1.f55590c
            r6 = 15
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 14
            r9 = 12
            r11 = 13
            r13 = 0
            if (r6 == 0) goto L5b
            long r14 = r2 & r11
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L33
            if (r0 == 0) goto L25
            androidx.lifecycle.MutableLiveData<java.lang.String> r6 = r0.f75081a
            goto L26
        L25:
            r6 = r13
        L26:
            r14 = 0
            r1.updateLiveDataRegistration(r14, r6)
            if (r6 == 0) goto L33
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L34
        L33:
            r6 = r13
        L34:
            long r14 = r2 & r9
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L3f
            if (r0 == 0) goto L3f
            ta.b r14 = r0.f75085e
            goto L40
        L3f:
            r14 = r13
        L40:
            long r15 = r2 & r7
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L59
            if (r0 == 0) goto L4b
            com.baicizhan.client.business.util.SingleLiveEvent<java.util.List<gf.c>> r0 = r0.f75082b
            goto L4c
        L4b:
            r0 = r13
        L4c:
            r15 = 1
            r1.updateLiveDataRegistration(r15, r0)
            if (r0 == 0) goto L59
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            goto L5e
        L59:
            r0 = r13
            goto L5e
        L5b:
            r0 = r13
            r6 = r0
            r14 = r6
        L5e:
            long r9 = r9 & r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L68
            gs.o4 r9 = r1.f55738e
            r9.j(r14)
        L68:
            r9 = 8
            long r9 = r9 & r2
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 == 0) goto L7d
            android.widget.ImageView r9 = r1.f55739f
            android.view.View$OnClickListener r10 = r1.f55740g
            r9.setOnClickListener(r10)
            android.widget.EditText r9 = r1.f55589b
            androidx.databinding.InverseBindingListener r10 = r1.f55741h
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r9, r13, r13, r13, r10)
        L7d:
            long r7 = r7 & r2
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 == 0) goto L87
            androidx.recyclerview.widget.RecyclerView r7 = r1.f55588a
            nf.c.a(r7, r0)
        L87:
            long r2 = r2 & r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L91
            android.widget.EditText r0 = r1.f55589b
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r6)
        L91:
            gs.o4 r0 = r1.f55738e
            androidx.databinding.ViewDataBinding.executeBindingsOn(r0)
            return
        L97:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L97
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.la.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55742i != 0) {
                    return true;
                }
                return this.f55738e.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55742i = 8L;
        }
        this.f55738e.invalidateAll();
        requestRebind();
    }

    @Override // gs.ka
    public void j(@Nullable nf.k Viewmodel) {
        this.f55590c = Viewmodel;
        synchronized (this) {
            this.f55742i |= 4;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(SingleLiveEvent<List<gf.c>> ViewmodelMajors, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55742i |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return l((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 1) {
            return false;
        }
        return k((SingleLiveEvent) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55738e.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((nf.k) variable);
        return true;
    }

    public la(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (RecyclerView) bindings[3], (EditText) bindings[1]);
        this.f55741h = new a();
        this.f55742i = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55737d = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[4];
        this.f55738e = o4Var;
        setContainedBinding(o4Var);
        ImageView imageView = (ImageView) bindings[2];
        this.f55739f = imageView;
        imageView.setTag(null);
        this.f55588a.setTag(null);
        this.f55589b.setTag(null);
        setRootTag(root);
        this.f55740g = new hs.a(this, 1);
        invalidateAll();
    }
}
