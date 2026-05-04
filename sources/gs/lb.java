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
public class lb extends kb implements a.InterfaceC0684a {

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public static final ViewDataBinding.IncludedLayouts f55744s = null;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public static final SparseIntArray f55745t;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f55746h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final ImageView f55747i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final ImageView f55748j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final ImageView f55749k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final ImageView f55750l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55751m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55752n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55753o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55754p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public final View.OnClickListener f55755q;

    /* renamed from: r, reason: collision with root package name */
    public long f55756r;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f55745t = sparseIntArray;
        sparseIntArray.put(R.id.divider, 10);
    }

    public lb(@Nullable DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, ViewDataBinding.mapBindings(bindingComponent, root, 11, f55744s, f55745t));
    }

    @Override // hs.a.InterfaceC0684a
    public final void a(int sourceId, View callbackArg_0) {
        mf.m mVar;
        if (sourceId == 1) {
            mf.m mVar2 = this.f55597g;
            if (mVar2 != null) {
                mVar2.b(1);
                return;
            }
            return;
        }
        if (sourceId == 2) {
            mf.m mVar3 = this.f55597g;
            if (mVar3 != null) {
                mVar3.b(2);
                return;
            }
            return;
        }
        if (sourceId == 3) {
            mf.m mVar4 = this.f55597g;
            if (mVar4 != null) {
                mVar4.b(3);
                return;
            }
            return;
        }
        if (sourceId != 4) {
            if (sourceId == 5 && (mVar = this.f55597g) != null) {
                mVar.a();
                return;
            }
            return;
        }
        mf.m mVar5 = this.f55597g;
        if (mVar5 != null) {
            mVar5.b(4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j11;
        int i11;
        int i12;
        int i13;
        synchronized (this) {
            j11 = this.f55756r;
            this.f55756r = 0L;
        }
        mf.m mVar = this.f55597g;
        long j12 = j11 & 7;
        int i14 = 0;
        if (j12 != 0) {
            MutableLiveData<Integer> mutableLiveData = mVar != null ? mVar.f73237a : null;
            updateLiveDataRegistration(0, mutableLiveData);
            int safeUnbox = ViewDataBinding.safeUnbox(mutableLiveData != null ? mutableLiveData.getValue() : null);
            boolean z11 = safeUnbox == 2;
            boolean z12 = safeUnbox == 3;
            boolean z13 = safeUnbox == 4;
            boolean z14 = safeUnbox == 1;
            if (j12 != 0) {
                j11 |= z11 ? 64L : 32L;
            }
            if ((j11 & 7) != 0) {
                j11 |= z12 ? 16L : 8L;
            }
            if ((j11 & 7) != 0) {
                j11 |= z13 ? 256L : 128L;
            }
            if ((j11 & 7) != 0) {
                j11 |= z14 ? 1024L : 512L;
            }
            i11 = z11 ? 0 : 8;
            i12 = z12 ? 0 : 8;
            i13 = z13 ? 0 : 8;
            if (!z14) {
                i14 = 8;
            }
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if ((4 & j11) != 0) {
            this.f55591a.setOnClickListener(this.f55754p);
            this.f55592b.setOnClickListener(this.f55755q);
            this.f55593c.setOnClickListener(this.f55751m);
            this.f55595e.setOnClickListener(this.f55753o);
            this.f55596f.setOnClickListener(this.f55752n);
        }
        if ((j11 & 7) != 0) {
            this.f55747i.setVisibility(i14);
            this.f55748j.setVisibility(i11);
            this.f55749k.setVisibility(i12);
            this.f55750l.setVisibility(i13);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            try {
                return this.f55756r != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.f55756r = 4L;
        }
        requestRebind();
    }

    @Override // gs.kb
    public void j(@Nullable mf.m Viewmodel) {
        this.f55597g = Viewmodel;
        synchronized (this) {
            this.f55756r |= 2;
        }
        notifyPropertyChanged(89);
        super.requestRebind();
    }

    public final boolean k(MutableLiveData<Integer> ViewmodelCurrent, int fieldId) {
        if (fieldId != 0) {
            return false;
        }
        synchronized (this) {
            this.f55756r |= 1;
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
        j((mf.m) variable);
        return true;
    }

    public lb(DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1, (TextView) bindings[2], (TextView) bindings[9], (TextView) bindings[1], (View) bindings[10], (TextView) bindings[4], (TextView) bindings[3]);
        this.f55756r = -1L;
        this.f55591a.setTag(null);
        this.f55592b.setTag(null);
        this.f55593c.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) bindings[0];
        this.f55746h = constraintLayout;
        constraintLayout.setTag(null);
        ImageView imageView = (ImageView) bindings[5];
        this.f55747i = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) bindings[6];
        this.f55748j = imageView2;
        imageView2.setTag(null);
        ImageView imageView3 = (ImageView) bindings[7];
        this.f55749k = imageView3;
        imageView3.setTag(null);
        ImageView imageView4 = (ImageView) bindings[8];
        this.f55750l = imageView4;
        imageView4.setTag(null);
        this.f55595e.setTag(null);
        this.f55596f.setTag(null);
        setRootTag(root);
        this.f55751m = new hs.a(this, 1);
        this.f55752n = new hs.a(this, 3);
        this.f55753o = new hs.a(this, 4);
        this.f55754p = new hs.a(this, 2);
        this.f55755q = new hs.a(this, 5);
        invalidateAll();
    }
}
