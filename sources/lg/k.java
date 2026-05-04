package lg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.main.home.plan.a3;
import com.baicizhan.main.home.plan.data.LearnCardStatus;
import com.baicizhan.main.home.plan.golden.GoldenView;
import com.baicizhan.main.model.data.GoldenNavigation;
import lg.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class k extends lg.a<GoldenNavigation, b> {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f71274h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f71275i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final String f71276j = k.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends zf.d {

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final GoldenView f71277e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public LearnCardStatus f71278f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k f71279g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f71280a;

            static {
                int[] iArr = new int[LearnCardStatus.values().length];
                try {
                    iArr[LearnCardStatus.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LearnCardStatus.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f71280a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k k kVar, GoldenView v11) {
            super(v11);
            LiveData<LearnCardStatus> z02;
            kotlin.jvm.internal.g0.p(v11, "v");
            this.f71279g = kVar;
            this.f71277e = v11;
            this.f71278f = LearnCardStatus.ERROR;
            a3 C = kVar.C();
            if (C == null || (z02 = C.z0()) == null) {
                return;
            }
            z02.observe(kVar.q(), new c(new x00.l() { // from class: lg.l
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 m11;
                    m11 = k.b.m(k.b.this, (LearnCardStatus) obj);
                    return m11;
                }
            }));
        }

        public static final g2 m(b bVar, LearnCardStatus learnCardStatus) {
            kotlin.jvm.internal.g0.m(learnCardStatus);
            bVar.f71278f = learnCardStatus;
            bVar.f71277e.getAvailability().setValue(bVar.n());
            return g2.f100423a;
        }

        @m80.l
        public final Boolean n() {
            int i11 = a.f71280a[this.f71278f.ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }

        @m80.k
        public final GoldenView o() {
            return this.f71277e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f71281a;

        public c(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f71281a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f71281a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f71281a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k LifecycleOwner owner) {
        super(owner);
        kotlin.jvm.internal.g0.p(owner, "owner");
    }

    @Override // zf.b
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void s(@m80.k b holder, @m80.k GoldenNavigation item) {
        kotlin.jvm.internal.g0.p(holder, "holder");
        kotlin.jvm.internal.g0.p(item, "item");
        holder.o().getGoldenNavigation().setValue(item);
    }

    @Override // zf.b
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b u(@m80.k LayoutInflater inflater, @m80.k ViewGroup parent) {
        kotlin.jvm.internal.g0.p(inflater, "inflater");
        kotlin.jvm.internal.g0.p(parent, "parent");
        Context context = inflater.getContext();
        kotlin.jvm.internal.g0.o(context, "getContext(...)");
        return new b(this, new GoldenView(context, q(), null, 0, 12, null));
    }
}
