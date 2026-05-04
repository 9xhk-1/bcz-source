package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.wordlistv2.sidebar.IndexSideBar;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class xb extends wb {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f57448j = null;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f57449k;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57450h;

    /* renamed from: i, reason: collision with root package name */
    public long f57451i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57449k = sparseIntArray;
        sparseIntArray.put(R.id.rv_list, 4);
        sparseIntArray.put(R.id.side_bar, 5);
        sparseIntArray.put(R.id.empty_img, 6);
    }

    public xb(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 7, f57448j, f57449k));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            long r2 = r1.f57451i     // Catch: java.lang.Throwable -> Lb1
            r4 = 0
            r1.f57451i = r4     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb1
            com.baicizhan.main.wordlistv2.t r0 = r1.f57314g
            r6 = 31
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 28
            r9 = 26
            r11 = 25
            r13 = 0
            r14 = 0
            if (r6 == 0) goto L8d
            long r15 = r2 & r11
            int r6 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            if (r0 == 0) goto L28
            androidx.lifecycle.MutableLiveData r6 = r0.q()
            goto L29
        L28:
            r6 = r14
        L29:
            r1.updateLiveDataRegistration(r13, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            goto L36
        L35:
            r6 = r14
        L36:
            long r15 = r2 & r9
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            r16 = r4
            r4 = 1
            if (r15 == 0) goto L53
            if (r0 == 0) goto L46
            androidx.lifecycle.MutableLiveData r5 = r0.r()
            goto L47
        L46:
            r5 = r14
        L47:
            r1.updateLiveDataRegistration(r4, r5)
            if (r5 == 0) goto L53
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            goto L54
        L53:
            r5 = r14
        L54:
            long r18 = r2 & r7
            int r15 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r15 == 0) goto L8b
            if (r0 == 0) goto L61
            androidx.lifecycle.MutableLiveData r0 = r0.v()
            goto L62
        L61:
            r0 = r14
        L62:
            r4 = 2
            r1.updateLiveDataRegistration(r4, r0)
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r0.getValue()
            r14 = r0
            java.util.List r14 = (java.util.List) r14
        L6f:
            if (r14 == 0) goto L76
            int r0 = r14.size()
            goto L77
        L76:
            r0 = r13
        L77:
            if (r0 <= 0) goto L7b
            r4 = 1
            goto L7c
        L7b:
            r4 = r13
        L7c:
            if (r15 == 0) goto L87
            if (r4 == 0) goto L84
            r14 = 64
        L82:
            long r2 = r2 | r14
            goto L87
        L84:
            r14 = 32
            goto L82
        L87:
            if (r4 == 0) goto L8b
            r13 = 8
        L8b:
            r14 = r6
            goto L90
        L8d:
            r16 = r4
            r5 = r14
        L90:
            long r6 = r2 & r7
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 == 0) goto L9b
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f57308a
            r0.setVisibility(r13)
        L9b:
            long r6 = r2 & r11
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 == 0) goto La6
            android.widget.TextView r0 = r1.f57312e
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
        La6:
            long r2 = r2 & r9
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 == 0) goto Lb0
            android.widget.TextView r0 = r1.f57313f
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r5)
        Lb0:
            return
        Lb1:
            r0 = move-exception
            monitor-exit(r20)     // Catch: java.lang.Throwable -> Lb1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.xb.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f57451i != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f57451i = 16L;
        }
        requestRebind();
    }

    @Override // gs.wb
    public void j(@Nullable com.baicizhan.main.wordlistv2.t Vm) {
        this.f57314g = Vm;
        synchronized (this) {
            this.f57451i |= 8;
        }
        notifyPropertyChanged(90);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<String> VmEmptyDesc, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57451i |= 1;
        }
        return true;
    }

    public final boolean l(MutableLiveData<String> VmEmptyTips, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57451i |= 2;
        }
        return true;
    }

    public final boolean m(MutableLiveData<List<Object>> VmShowList, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f57451i |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return k((MutableLiveData) object, fieldId);
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
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (90 != variableId) {
            return false;
        }
        j((com.baicizhan.main.wordlistv2.t) variable);
        return true;
    }

    public xb(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (ConstraintLayout) bindings[1], (ImageView) bindings[6], (RecyclerView) bindings[4], (IndexSideBar) bindings[5], (TextView) bindings[2], (TextView) bindings[3]);
        this.f57451i = -1L;
        this.f57308a.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f57450h = constraintLayout;
        constraintLayout.setTag(null);
        this.f57312e.setTag(null);
        this.f57313f.setTag(null);
        setRootTag(root);
        invalidateAll();
    }
}
