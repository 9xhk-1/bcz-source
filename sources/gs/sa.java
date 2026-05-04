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
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class sa extends ra implements a.InterfaceC0684a {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56731p = null;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56732q;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56733j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f56734k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f56735l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56736m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56737n;

    /* renamed from: o, reason: collision with root package name */
    public long f56738o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56732q = sparseIntArray;
        sparseIntArray.put(R.id.image_daka_title_1, 5);
        sparseIntArray.put(R.id.image_daka_title, 6);
        sparseIntArray.put(R.id.divider, 7);
        sparseIntArray.put(R.id.classic_daka_title_1, 8);
        sparseIntArray.put(R.id.classic_daka_title, 9);
        sparseIntArray.put(R.id.divider_2, 10);
    }

    public sa(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 11, f56731p, f56732q));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        we.d dVar;
        if (sourceId != 1) {
            if (sourceId == 2 && (dVar = this.f56628i) != null) {
                dVar.a();
                return;
            }
            return;
        }
        we.d dVar2 = this.f56628i;
        if (dVar2 != null) {
            dVar2.b();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        int i11;
        synchronized (this) {
            j11 = this.f56738o;
            this.f56738o = 0L;
        }
        we.d dVar = this.f56628i;
        long j12 = j11 & 7;
        if (j12 != 0) {
            MutableLiveData<Boolean> mutableLiveData = dVar != null ? dVar.f96192a : null;
            updateLiveDataRegistration(0, mutableLiveData);
            boolean safeUnbox = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
            if (j12 != 0) {
                j11 |= safeUnbox ? 16L : 8L;
            }
            int i12 = safeUnbox ? 0 : 8;
            if ((j11 & 7) != 0) {
                j11 |= !safeUnbox ? 64L : 32L;
            }
            i11 = safeUnbox ? 8 : 0;
            r8 = i12;
        } else {
            i11 = 0;
        }
        if ((4 & j11) != 0) {
            this.f56620a.setOnClickListener(this.f56736m);
            this.f56625f.setOnClickListener(this.f56737n);
        }
        if ((j11 & 7) != 0) {
            this.f56734k.setVisibility(r8);
            this.f56735l.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56738o != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56738o = 4L;
        }
        requestRebind();
    }

    @Override // gs.ra
    public void j(@Nullable we.d Viewmodel) {
        this.f56628i = Viewmodel;
        synchronized (this) {
            this.f56738o |= 2;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<Boolean> ViewmodelIsPost, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56738o |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((MutableLiveData) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((we.d) variable);
        return true;
    }

    public sa(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (View) bindings[3], (TextView) bindings[9], (TextView) bindings[8], (View) bindings[7], (View) bindings[10], (View) bindings[1], (TextView) bindings[6], (TextView) bindings[5]);
        this.f56738o = -1L;
        this.f56620a.setTag(null);
        this.f56625f.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56733j = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[2];
        this.f56734k = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) bindings[4];
        this.f56735l = imageView2;
        imageView2.setTag(null);
        setRootTag(root);
        this.f56736m = new hs.a(this, 2);
        this.f56737n = new hs.a(this, 1);
        invalidateAll();
    }
}
