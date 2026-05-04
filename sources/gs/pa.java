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
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.util.SingleLiveEvent;
import hs.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class pa extends oa implements a.InterfaceC0684a {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56349i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56350j = null;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56351d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f56352e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56353f;

    /* renamed from: g, reason: collision with root package name */
    public InverseBindingListener f56354g;

    /* renamed from: h, reason: collision with root package name */
    public long f56355h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InverseBindingListener {
        public a() {
        }

        @Override // androidx.databinding.InverseBindingListener
        public void onChange() {
            MutableLiveData<String> mutableLiveData;
            String textString = TextViewBindingAdapter.getTextString(pa.this.f56206b);
            pf.i iVar = pa.this.f56207c;
            if (iVar == null || (mutableLiveData = iVar.f80422a) == null) {
                return;
            }
            mutableLiveData.setValue(textString);
        }
    }

    public pa(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f56349i, f56350j));
    }

    private boolean l(MutableLiveData<String> ViewmodelSearch, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56355h |= 1;
        }
        return true;
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        pf.i iVar = this.f56207c;
        if (iVar != null) {
            iVar.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.f56355h     // Catch: java.lang.Throwable -> L7c
            r2 = 0
            r13.f56355h = r2     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7c
            pf.i r4 = r13.f56207c
            r5 = 15
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 14
            r8 = 13
            r10 = 0
            if (r5 == 0) goto L4b
            long r11 = r0 & r8
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r4 == 0) goto L21
            androidx.lifecycle.MutableLiveData<java.lang.String> r5 = r4.f80422a
            goto L22
        L21:
            r5 = r10
        L22:
            r11 = 0
            r13.updateLiveDataRegistration(r11, r5)
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            goto L30
        L2f:
            r5 = r10
        L30:
            long r11 = r0 & r6
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L49
            if (r4 == 0) goto L3b
            com.baicizhan.client.business.util.SingleLiveEvent<java.util.List<gf.d>> r4 = r4.f80423b
            goto L3c
        L3b:
            r4 = r10
        L3c:
            r11 = 1
            r13.updateLiveDataRegistration(r11, r4)
            if (r4 == 0) goto L49
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            goto L4d
        L49:
            r4 = r10
            goto L4d
        L4b:
            r4 = r10
            r5 = r4
        L4d:
            r11 = 8
            long r11 = r11 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L62
            android.widget.ImageView r11 = r13.f56352e
            android.view.View$OnClickListener r12 = r13.f56353f
            r11.setOnClickListener(r12)
            android.widget.EditText r11 = r13.f56206b
            androidx.databinding.InverseBindingListener r12 = r13.f56354g
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(r11, r10, r10, r10, r12)
        L62:
            long r6 = r6 & r0
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L6c
            androidx.recyclerview.widget.RecyclerView r6 = r13.f56205a
            pf.d.a(r6, r4)
        L6c:
            long r0 = r0 & r8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L7b
            androidx.recyclerview.widget.RecyclerView r0 = r13.f56205a
            pf.d.b(r0, r5)
            android.widget.EditText r0 = r13.f56206b
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r5)
        L7b:
            return
        L7c:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.pa.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56355h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56355h = 8L;
        }
        requestRebind();
    }

    @Override // gs.oa
    public void j(@Nullable pf.i Viewmodel) {
        this.f56207c = Viewmodel;
        synchronized (this) {
            this.f56355h |= 4;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(SingleLiveEvent<List<gf.d>> ViewmodelSchools, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56355h |= 2;
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
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((pf.i) variable);
        return true;
    }

    public pa(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2, (RecyclerView) bindings[3], (EditText) bindings[1]);
        this.f56354g = new a();
        this.f56355h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56351d = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[2];
        this.f56352e = imageView;
        imageView.setTag(null);
        this.f56205a.setTag(null);
        this.f56206b.setTag(null);
        setRootTag(root);
        this.f56353f = new hs.a(this, 1);
        invalidateAll();
    }
}
