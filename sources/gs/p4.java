package gs;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class p4 extends o4 implements a.InterfaceC0684a {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56294i = null;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56295j = null;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final LinearLayout f56296f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56297g;

    /* renamed from: h, reason: collision with root package name */
    public long f56298h;

    public p4(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 5, f56294i, f56295j));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ta.b bVar = this.f56180e;
        if (bVar != null) {
            bVar.p();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ac  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.p4.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56298h != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56298h = 16L;
        }
        requestRebind();
    }

    @Override // gs.o4
    public void j(@Nullable ta.b Viewmodel) {
        this.f56180e = Viewmodel;
        synchronized (this) {
            this.f56298h |= 8;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<Drawable> ViewmodelImage, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56298h |= 4;
        }
        return true;
    }

    public final boolean l(MutableLiveData<Integer> ViewmodelStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56298h |= 1;
        }
        return true;
    }

    public final boolean m(MutableLiveData<String> ViewmodelText, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56298h |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return l((MutableLiveData) object, fieldId);
        }
        if (localFieldId == 1) {
            return m((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 2) {
            return false;
        }
        return k((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ta.b) variable);
        return true;
    }

    public p4(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3, (ImageView) bindings[1], (ProgressBar) bindings[2], (TextView) bindings[4], (TextView) bindings[3]);
        this.f56298h = -1L;
        this.f56176a.setTag(null);
        LinearLayout linearLayout = (LinearLayout) bindings[0];
        this.f56296f = linearLayout;
        linearLayout.setTag(null);
        this.f56177b.setTag(null);
        this.f56178c.setTag(null);
        this.f56179d.setTag(null);
        setRootTag(root);
        this.f56297g = new hs.a(this, 1);
        invalidateAll();
    }
}
