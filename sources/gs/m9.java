package gs;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.jiongji.andriod.card.R;
import hs.a;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class m9 extends l9 implements a.InterfaceC0684a {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55871i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55872j;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ScrollView f55873d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f55874e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55875f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55876g;

    /* renamed from: h, reason: collision with root package name */
    public long f55877h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f55871i = includedLayouts;
        includedLayouts.setIncludes(1, new String[]{"fragment_my_evaluation_item", "fragment_my_evaluation_item"}, new int[]{2, 3}, new int[]{R.layout.fragment_my_evaluation_item, R.layout.fragment_my_evaluation_item});
        f55872j = null;
    }

    public m9(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55871i, f55872j));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ge.d dVar;
        if (sourceId != 1) {
            if (sourceId == 2 && (dVar = this.f55734c) != null) {
                dVar.a();
                return;
            }
            return;
        }
        ge.d dVar2 = this.f55734c;
        if (dVar2 != null) {
            dVar2.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0058  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void executeBindings() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gs.m9.executeBindings():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55877h != 0) {
                    return true;
                }
                return this.f55733b.hasPendingBindings() || this.f55732a.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55877h = 512L;
        }
        this.f55733b.invalidateAll();
        this.f55732a.invalidateAll();
        requestRebind();
    }

    @Override // gs.l9
    public void j(@Nullable ge.d Viewmodel) {
        this.f55734c = Viewmodel;
        synchronized (this) {
            this.f55877h |= 256;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(n9 Listener, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 32;
        }
        return true;
    }

    public final boolean l(n9 Read, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 1;
        }
        return true;
    }

    public final boolean m(MutableLiveData<List<Integer>> ViewmodelListening, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 4;
        }
        return true;
    }

    public final boolean n(MutableLiveData<Integer> ViewmodelListeningStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 64;
        }
        return true;
    }

    public final boolean o(MutableLiveData<String> ViewmodelListeningingvocabulary, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0:
                return l((n9) object, fieldId);
            case 1:
                return p((MutableLiveData) object, fieldId);
            case 2:
                return m((MutableLiveData) object, fieldId);
            case 3:
                return s((MutableLiveData) object, fieldId);
            case 4:
                return o((MutableLiveData) object, fieldId);
            case 5:
                return k((n9) object, fieldId);
            case 6:
                return n((MutableLiveData) object, fieldId);
            case 7:
                return r((MutableLiveData) object, fieldId);
            default:
                return false;
        }
    }

    public final boolean p(MutableLiveData<List<Integer>> ViewmodelReading, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 2;
        }
        return true;
    }

    public final boolean r(MutableLiveData<Integer> ViewmodelReadingStatus, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 128;
        }
        return true;
    }

    public final boolean s(MutableLiveData<String> ViewmodelReadingvocabulary, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55877h |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55733b.setLifecycleOwner(lifecycleOwner);
        this.f55732a.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ge.d) variable);
        return true;
    }

    public m9(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8, (n9) bindings[3], (n9) bindings[2]);
        this.f55877h = -1L;
        setContainedBinding(this.f55732a);
        ScrollView scrollView = (ScrollView) bindings[0];
        this.f55873d = scrollView;
        scrollView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) bindings[1];
        this.f55874e = linearLayout;
        linearLayout.setTag(null);
        setContainedBinding(this.f55733b);
        setRootTag(root);
        this.f55875f = new hs.a(this, 1);
        this.f55876g = new hs.a(this, 2);
        invalidateAll();
    }
}
