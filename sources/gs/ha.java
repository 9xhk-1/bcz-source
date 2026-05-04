package gs;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ha extends ga implements a.InterfaceC0684a {

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55166i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55167j;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55168d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public final o4 f55169e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55170f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55171g;

    /* renamed from: h, reason: collision with root package name */
    public long f55172h;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        f55166i = includedLayouts;
        includedLayouts.setIncludes(0, new String[]{"mytab_setting_basic_item", "mytab_setting_basic_item", "bcz_loading_view"}, new int[]{1, 2, 3}, new int[]{R.layout.mytab_setting_basic_item, R.layout.mytab_setting_basic_item, R.layout.bcz_loading_view});
        f55167j = null;
    }

    public ha(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 4, f55166i, f55167j));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        bf.c cVar;
        if (sourceId != 1) {
            if (sourceId == 2 && (cVar = this.f55024c) != null) {
                cVar.c();
                return;
            }
            return;
        }
        bf.c cVar2 = this.f55024c;
        if (cVar2 != null) {
            cVar2.b();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        long j12;
        long j13;
        String str;
        String str2;
        int i11;
        ta.b bVar;
        synchronized (this) {
            j11 = this.f55172h;
            this.f55172h = 0L;
        }
        bf.c cVar = this.f55024c;
        int i12 = 0;
        ta.b bVar2 = null;
        String str3 = null;
        if ((109 & j11) != 0) {
            long j14 = j11 & 104;
            if (j14 != 0) {
                bVar = cVar != null ? cVar.f6804e : null;
                j12 = 0;
                MutableLiveData<Boolean> mutableLiveData = bVar != null ? bVar.f90402d : null;
                updateLiveDataRegistration(3, mutableLiveData);
                boolean safeUnbox = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
                if (j14 != 0) {
                    j11 |= safeUnbox ? 4096L : 2048L;
                }
                i11 = safeUnbox ? 0 : 8;
            } else {
                j12 = 0;
                i11 = 0;
                bVar = null;
            }
            long j15 = j11 & 97;
            j13 = 100;
            if (j15 != j12) {
                SingleLiveEvent<Boolean> singleLiveEvent = cVar != null ? cVar.f6801b : null;
                updateLiveDataRegistration(0, singleLiveEvent);
                boolean safeUnbox2 = ViewDataBinding.safeUnbox(singleLiveEvent != null ? singleLiveEvent.getValue() : null);
                if (j15 != j12) {
                    j11 |= safeUnbox2 ? 1024L : 512L;
                }
                Resources resources = getRoot().getResources();
                str2 = safeUnbox2 ? resources.getString(R.string.setting_remind_open) : resources.getString(R.string.setting_remind_close);
            } else {
                str2 = null;
            }
            long j16 = j11 & 100;
            if (j16 != j12) {
                SingleLiveEvent<Boolean> singleLiveEvent2 = cVar != null ? cVar.f6800a : null;
                updateLiveDataRegistration(2, singleLiveEvent2);
                boolean safeUnbox3 = ViewDataBinding.safeUnbox(singleLiveEvent2 != null ? singleLiveEvent2.getValue() : null);
                if (j16 != j12) {
                    j11 |= safeUnbox3 ? 256L : 128L;
                }
                str3 = safeUnbox3 ? getRoot().getResources().getString(R.string.setting_remind_open) : getRoot().getResources().getString(R.string.setting_remind_close);
            }
            i12 = i11;
            str = str3;
            bVar2 = bVar;
        } else {
            j12 = 0;
            j13 = 100;
            str = null;
            str2 = null;
        }
        if ((96 & j11) != j12) {
            this.f55169e.j(bVar2);
        }
        if ((j11 & 104) != j12) {
            this.f55022a.getRoot().setVisibility(i12);
            this.f55023b.getRoot().setVisibility(i12);
        }
        if ((64 & j11) != j12) {
            this.f55022a.s(this.f55171g);
            this.f55022a.x(getRoot().getResources().getString(R.string.setting_remind_system));
            this.f55023b.s(this.f55170f);
            this.f55023b.x(getRoot().getResources().getString(R.string.setting_remind_wechart));
        }
        if ((j11 & j13) != j12) {
            this.f55022a.v(str);
        }
        if ((j11 & 97) != j12) {
            this.f55023b.v(str2);
        }
        ViewDataBinding.executeBindingsOn(this.f55022a);
        ViewDataBinding.executeBindingsOn(this.f55023b);
        ViewDataBinding.executeBindingsOn(this.f55169e);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                if (this.f55172h != 0) {
                    return true;
                }
                return this.f55022a.hasPendingBindings() || this.f55023b.hasPendingBindings() || this.f55169e.hasPendingBindings();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55172h = 64L;
        }
        this.f55022a.invalidateAll();
        this.f55023b.invalidateAll();
        this.f55169e.invalidateAll();
        requestRebind();
    }

    @Override // gs.ga
    public void j(@Nullable bf.c Viewmodel) {
        this.f55024c = Viewmodel;
        synchronized (this) {
            this.f55172h |= 32;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(ck ReminderSystem, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55172h |= 16;
        }
        return true;
    }

    public final boolean l(ck ReminderWechart, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55172h |= 2;
        }
        return true;
    }

    public final boolean m(MutableLiveData<Boolean> ViewmodelLoadingVMShowContent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55172h |= 8;
        }
        return true;
    }

    public final boolean n(SingleLiveEvent<Boolean> ViewmodelSystemOpen, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55172h |= 4;
        }
        return true;
    }

    public final boolean o(SingleLiveEvent<Boolean> ViewmodelWechatOpen, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55172h |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId == 0) {
            return o((SingleLiveEvent) object, fieldId);
        }
        if (localFieldId == 1) {
            return l((ck) object, fieldId);
        }
        if (localFieldId == 2) {
            return n((SingleLiveEvent) object, fieldId);
        }
        if (localFieldId == 3) {
            return m((MutableLiveData) object, fieldId);
        }
        if (localFieldId != 4) {
            return false;
        }
        return k((ck) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.f55022a.setLifecycleOwner(lifecycleOwner);
        this.f55023b.setLifecycleOwner(lifecycleOwner);
        this.f55169e.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((bf.c) variable);
        return true;
    }

    public ha(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5, (ck) bindings[1], (ck) bindings[2]);
        this.f55172h = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55168d = constraintLayout;
        constraintLayout.setTag(null);
        o4 o4Var = (o4) bindings[3];
        this.f55169e = o4Var;
        setContainedBinding(o4Var);
        setContainedBinding(this.f55022a);
        setContainedBinding(this.f55023b);
        setRootTag(root);
        this.f55170f = new hs.a(this, 2);
        this.f55171g = new hs.a(this, 1);
        invalidateAll();
    }
}
