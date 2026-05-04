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
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import hs.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class nb extends mb implements a.InterfaceC0684a {

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f56033p = null;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f56034q;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f56035g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ImageView f56036h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f56037i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f56038j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56039k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56040l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56041m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f56042n;

    /* renamed from: o, reason: collision with root package name */
    public long f56043o;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56034q = sparseIntArray;
        sparseIntArray.put(R.id.divider, 8);
    }

    public nb(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 9, f56033p, f56034q));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        ef.a aVar;
        if (sourceId == 1) {
            ef.a aVar2 = this.f55887f;
            if (aVar2 != null) {
                aVar2.b(1);
                return;
            }
            return;
        }
        if (sourceId == 2) {
            ef.a aVar3 = this.f55887f;
            if (aVar3 != null) {
                aVar3.b(2);
                return;
            }
            return;
        }
        if (sourceId != 3) {
            if (sourceId == 4 && (aVar = this.f55887f) != null) {
                aVar.a();
                return;
            }
            return;
        }
        ef.a aVar4 = this.f55887f;
        if (aVar4 != null) {
            aVar4.b(3);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        int i11;
        int i12;
        synchronized (this) {
            j11 = this.f56043o;
            this.f56043o = 0L;
        }
        ef.a aVar = this.f55887f;
        long j12 = j11 & 7;
        int i13 = 0;
        if (j12 != 0) {
            SingleLiveEvent<Integer> singleLiveEvent = aVar != null ? aVar.f49743a : null;
            updateLiveDataRegistration(0, singleLiveEvent);
            int safeUnbox = ViewDataBinding.safeUnbox(singleLiveEvent != null ? singleLiveEvent.getValue() : null);
            boolean z11 = safeUnbox == 3;
            boolean z12 = safeUnbox == 2;
            boolean z13 = safeUnbox == 1;
            if (j12 != 0) {
                j11 |= z11 ? 16L : 8L;
            }
            if ((j11 & 7) != 0) {
                j11 |= z12 ? 256L : 128L;
            }
            if ((j11 & 7) != 0) {
                j11 |= z13 ? 64L : 32L;
            }
            i11 = z11 ? 0 : 8;
            i12 = z12 ? 0 : 8;
            if (!z13) {
                i13 = 8;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        if ((4 & j11) != 0) {
            this.f55882a.setOnClickListener(this.f56039k);
            this.f55884c.setOnClickListener(this.f56042n);
            this.f55885d.setOnClickListener(this.f56041m);
            this.f55886e.setOnClickListener(this.f56040l);
        }
        if ((j11 & 7) != 0) {
            this.f56036h.setVisibility(i13);
            this.f56037i.setVisibility(i12);
            this.f56038j.setVisibility(i11);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f56043o != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f56043o = 4L;
        }
        requestRebind();
    }

    @Override // gs.mb
    public void j(@Nullable ef.a Viewmodel) {
        this.f55887f = Viewmodel;
        synchronized (this) {
            this.f56043o |= 2;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(SingleLiveEvent<Integer> ViewmodelCurrentSex, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f56043o |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        if (localFieldId != 0) {
            return false;
        }
        return k((SingleLiveEvent) object, fieldId);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int variableId, @Nullable Object variable) {
        if (89 != variableId) {
            return false;
        }
        j((ef.a) variable);
        return true;
    }

    public nb(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[7], (View) bindings[8], (TextView) bindings[1], (TextView) bindings[3], (TextView) bindings[2]);
        this.f56043o = -1L;
        this.f55882a.setTag(null);
        this.f55884c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f56035g = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[4];
        this.f56036h = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) bindings[5];
        this.f56037i = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) bindings[6];
        this.f56038j = imageView3;
        imageView3.setTag(null);
        this.f55885d.setTag(null);
        this.f55886e.setTag(null);
        setRootTag(root);
        this.f56039k = new hs.a(this, 4);
        this.f56040l = new hs.a(this, 2);
        this.f56041m = new hs.a(this, 3);
        this.f56042n = new hs.a(this, 1);
        invalidateAll();
    }
}
