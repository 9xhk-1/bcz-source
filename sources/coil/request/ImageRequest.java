package coil.request;

import a00.a0;
import a00.h0;
import a00.l1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import c40.m0;
import coil.memory.MemoryCache;
import coil.request.b;
import coil.size.Precision;
import coil.size.Scale;
import f0.h;
import i0.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import o0.e;
import o0.f;
import o0.m;
import okhttp3.h;
import q0.g;
import q0.h;
import q0.j;
import s0.d;
import t0.a;
import t0.c;
import x00.p;
import yz.g2;
import yz.h1;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ImageRequest {

    @k
    public final Lifecycle A;

    @k
    public final h B;

    @k
    public final Scale C;

    @k
    public final b D;

    @l
    public final MemoryCache.Key E;

    @l
    public final Integer F;

    @l
    public final Drawable G;

    @l
    public final Integer H;

    @l
    public final Drawable I;

    @l
    public final Integer J;

    @l
    public final Drawable K;

    @k
    public final o0.c L;

    @k
    public final o0.b M;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f9738a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f9739b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final r0.c f9740c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final a f9741d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final MemoryCache.Key f9742e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f9743f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Bitmap.Config f9744g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ColorSpace f9745h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Precision f9746i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Pair<i.a<?>, Class<?>> f9747j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final h.a f9748k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<d> f9749l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final c.a f9750m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final okhttp3.h f9751n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final c f9752o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9753p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f9754q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f9755r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f9756s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final CachePolicy f9757t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final CachePolicy f9758u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final CachePolicy f9759v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final m0 f9760w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final m0 f9761x;

    /* renamed from: y, reason: collision with root package name */
    @k
    public final m0 f9762y;

    /* renamed from: z, reason: collision with root package name */
    @k
    public final m0 f9763z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    public static final class Builder {

        @l
        public m0 A;

        @l
        public b.a B;

        @l
        public MemoryCache.Key C;

        @l
        @DrawableRes
        public Integer D;

        @l
        public Drawable E;

        @l
        @DrawableRes
        public Integer F;

        @l
        public Drawable G;

        @l
        @DrawableRes
        public Integer H;

        @l
        public Drawable I;

        @l
        public Lifecycle J;

        @l
        public q0.h K;

        @l
        public Scale L;

        @l
        public Lifecycle M;

        @l
        public q0.h N;

        @l
        public Scale O;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Context f9764a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public o0.b f9765b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Object f9766c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public r0.c f9767d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public a f9768e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public MemoryCache.Key f9769f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public String f9770g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public Bitmap.Config f9771h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public ColorSpace f9772i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public Precision f9773j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public Pair<? extends i.a<?>, ? extends Class<?>> f9774k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public h.a f9775l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public List<? extends d> f9776m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public c.a f9777n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public h.a f9778o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public Map<Class<?>, Object> f9779p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f9780q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public Boolean f9781r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public Boolean f9782s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f9783t;

        /* renamed from: u, reason: collision with root package name */
        @l
        public CachePolicy f9784u;

        /* renamed from: v, reason: collision with root package name */
        @l
        public CachePolicy f9785v;

        /* renamed from: w, reason: collision with root package name */
        @l
        public CachePolicy f9786w;

        /* renamed from: x, reason: collision with root package name */
        @l
        public m0 f9787x;

        /* renamed from: y, reason: collision with root package name */
        @l
        public m0 f9788y;

        /* renamed from: z, reason: collision with root package name */
        @l
        public m0 f9789z;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n*L\n1#1,1057:1\n*E\n"})
        public static final class a implements a {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.l<ImageRequest, g2> f9790c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x00.l<ImageRequest, g2> f9791d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p<ImageRequest, e, g2> f9792e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p<ImageRequest, m, g2> f9793f;

            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.l<? super ImageRequest, g2> lVar, x00.l<? super ImageRequest, g2> lVar2, p<? super ImageRequest, ? super e, g2> pVar, p<? super ImageRequest, ? super m, g2> pVar2) {
                this.f9790c = lVar;
                this.f9791d = lVar2;
                this.f9792e = pVar;
                this.f9793f = pVar2;
            }

            @Override // coil.request.ImageRequest.a
            public void a(@k ImageRequest imageRequest) {
                this.f9791d.invoke(imageRequest);
            }

            @Override // coil.request.ImageRequest.a
            public void b(@k ImageRequest imageRequest, @k e eVar) {
                this.f9792e.invoke(imageRequest, eVar);
            }

            @Override // coil.request.ImageRequest.a
            public void c(@k ImageRequest imageRequest, @k m mVar) {
                this.f9793f.invoke(imageRequest, mVar);
            }

            @Override // coil.request.ImageRequest.a
            public void d(@k ImageRequest imageRequest) {
                this.f9790c.invoke(imageRequest);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$target$4\n*L\n1#1,1057:1\n*E\n"})
        public static final class b implements r0.c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x00.l<Drawable, g2> f9794a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x00.l<Drawable, g2> f9795b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.l<Drawable, g2> f9796c;

            /* JADX WARN: Multi-variable type inference failed */
            public b(x00.l<? super Drawable, g2> lVar, x00.l<? super Drawable, g2> lVar2, x00.l<? super Drawable, g2> lVar3) {
                this.f9794a = lVar;
                this.f9795b = lVar2;
                this.f9796c = lVar3;
            }

            @Override // r0.c
            public void a(@k Drawable drawable) {
                this.f9796c.invoke(drawable);
            }

            @Override // r0.c
            public void b(@l Drawable drawable) {
                this.f9794a.invoke(drawable);
            }

            @Override // r0.c
            public void g(@l Drawable drawable) {
                this.f9795b.invoke(drawable);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @w00.k
        public Builder(@k ImageRequest imageRequest) {
            this(imageRequest, null, 2, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Builder F(Builder builder, x00.l lVar, x00.l lVar2, p pVar, p pVar2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = new x00.l<ImageRequest, g2>() { // from class: coil.request.ImageRequest$Builder$listener$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@k ImageRequest imageRequest) {
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(ImageRequest imageRequest) {
                        invoke2(imageRequest);
                        return g2.f100423a;
                    }
                };
            }
            if ((i11 & 2) != 0) {
                lVar2 = new x00.l<ImageRequest, g2>() { // from class: coil.request.ImageRequest$Builder$listener$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@k ImageRequest imageRequest) {
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(ImageRequest imageRequest) {
                        invoke2(imageRequest);
                        return g2.f100423a;
                    }
                };
            }
            if ((i11 & 4) != 0) {
                pVar = new p<ImageRequest, e, g2>() { // from class: coil.request.ImageRequest$Builder$listener$3
                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(ImageRequest imageRequest, e eVar) {
                        invoke2(imageRequest, eVar);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@k ImageRequest imageRequest, @k e eVar) {
                    }
                };
            }
            if ((i11 & 8) != 0) {
                pVar2 = new p<ImageRequest, m, g2>() { // from class: coil.request.ImageRequest$Builder$listener$4
                    @Override // x00.p
                    public /* bridge */ /* synthetic */ g2 invoke(ImageRequest imageRequest, m mVar) {
                        invoke2(imageRequest, mVar);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@k ImageRequest imageRequest, @k m mVar) {
                    }
                };
            }
            return builder.D(new a(lVar, lVar2, pVar, pVar2));
        }

        public static /* synthetic */ Builder c0(Builder builder, String str, Object obj, String str2, int i11, Object obj2) {
            if ((i11 & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return builder.b0(str, obj, str2);
        }

        public static /* synthetic */ Builder o0(Builder builder, x00.l lVar, x00.l lVar2, x00.l lVar3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = new x00.l<Drawable, g2>() { // from class: coil.request.ImageRequest$Builder$target$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@l Drawable drawable) {
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Drawable drawable) {
                        invoke2(drawable);
                        return g2.f100423a;
                    }
                };
            }
            if ((i11 & 2) != 0) {
                lVar2 = new x00.l<Drawable, g2>() { // from class: coil.request.ImageRequest$Builder$target$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@l Drawable drawable) {
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Drawable drawable) {
                        invoke2(drawable);
                        return g2.f100423a;
                    }
                };
            }
            if ((i11 & 4) != 0) {
                lVar3 = new x00.l<Drawable, g2>() { // from class: coil.request.ImageRequest$Builder$target$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@k Drawable drawable) {
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(Drawable drawable) {
                        invoke2(drawable);
                        return g2.f100423a;
                    }
                };
            }
            return builder.m0(new b(lVar, lVar2, lVar3));
        }

        @k
        public final Builder A(@k m0 m0Var) {
            this.f9787x = m0Var;
            return this;
        }

        @k
        public final Builder B(@l Lifecycle lifecycle) {
            this.J = lifecycle;
            return this;
        }

        @k
        public final Builder C(@l LifecycleOwner lifecycleOwner) {
            return B(lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
        }

        @k
        public final Builder D(@l a aVar) {
            this.f9768e = aVar;
            return this;
        }

        @k
        public final Builder E(@k x00.l<? super ImageRequest, g2> lVar, @k x00.l<? super ImageRequest, g2> lVar2, @k p<? super ImageRequest, ? super e, g2> pVar, @k p<? super ImageRequest, ? super m, g2> pVar2) {
            return D(new a(lVar, lVar2, pVar, pVar2));
        }

        @k
        public final Builder G(@l MemoryCache.Key key) {
            this.f9769f = key;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public final Builder H(@l String str) {
            MemoryCache.Key key = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (str != null) {
                key = new MemoryCache.Key(str, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            }
            return G(key);
        }

        @k
        public final Builder I(@k CachePolicy cachePolicy) {
            this.f9784u = cachePolicy;
            return this;
        }

        @k
        public final Builder J(@k CachePolicy cachePolicy) {
            this.f9786w = cachePolicy;
            return this;
        }

        @k
        public final Builder K(@k coil.request.b bVar) {
            this.B = bVar.g();
            return this;
        }

        @k
        public final Builder L(@DrawableRes int i11) {
            this.D = Integer.valueOf(i11);
            this.E = null;
            return this;
        }

        @k
        public final Builder M(@l Drawable drawable) {
            this.E = drawable;
            this.D = 0;
            return this;
        }

        @k
        public final Builder N(@l MemoryCache.Key key) {
            this.C = key;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public final Builder O(@l String str) {
            MemoryCache.Key key = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (str != null) {
                key = new MemoryCache.Key(str, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
            }
            return N(key);
        }

        @k
        public final Builder P(@k Precision precision) {
            this.f9773j = precision;
            return this;
        }

        @k
        public final Builder Q(boolean z11) {
            this.f9783t = z11;
            return this;
        }

        @k
        public final Builder R(@k String str) {
            h.a aVar = this.f9778o;
            if (aVar != null) {
                aVar.l(str);
            }
            return this;
        }

        @k
        public final Builder S(@k String str) {
            b.a aVar = this.B;
            if (aVar != null) {
                aVar.b(str);
            }
            return this;
        }

        public final void T() {
            this.O = null;
        }

        public final void U() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final Lifecycle V() {
            r0.c cVar = this.f9767d;
            Lifecycle c11 = u0.d.c(cVar instanceof r0.d ? ((r0.d) cVar).getView().getContext() : this.f9764a);
            return c11 == null ? f.f75459a : c11;
        }

        public final Scale W() {
            View view;
            q0.h hVar = this.K;
            View view2 = null;
            j jVar = hVar instanceof j ? (j) hVar : null;
            if (jVar == null || (view = jVar.getView()) == null) {
                r0.c cVar = this.f9767d;
                r0.d dVar = cVar instanceof r0.d ? (r0.d) cVar : null;
                if (dVar != null) {
                    view2 = dVar.getView();
                }
            } else {
                view2 = view;
            }
            return view2 instanceof ImageView ? u0.l.v((ImageView) view2) : Scale.FIT;
        }

        public final q0.h X() {
            ImageView.ScaleType scaleType;
            r0.c cVar = this.f9767d;
            if (!(cVar instanceof r0.d)) {
                return new q0.d(this.f9764a);
            }
            View view = ((r0.d) cVar).getView();
            return ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) ? q0.i.a(g.f81365d) : q0.k.c(view, false, 2, null);
        }

        @k
        public final Builder Y(@k Scale scale) {
            this.L = scale;
            return this;
        }

        @k
        public final Builder Z(@k String str, @k String str2) {
            h.a aVar = this.f9778o;
            if (aVar == null) {
                aVar = new h.a();
                this.f9778o = aVar;
            }
            aVar.m(str, str2);
            return this;
        }

        @k
        public final Builder a(@k String str, @k String str2) {
            h.a aVar = this.f9778o;
            if (aVar == null) {
                aVar = new h.a();
                this.f9778o = aVar;
            }
            aVar.b(str, str2);
            return this;
        }

        @w00.k
        @k
        public final Builder a0(@k String str, @l Object obj) {
            return c0(this, str, obj, null, 4, null);
        }

        @k
        public final Builder b(boolean z11) {
            this.f9780q = z11;
            return this;
        }

        @w00.k
        @k
        public final Builder b0(@k String str, @l Object obj, @l String str2) {
            b.a aVar = this.B;
            if (aVar == null) {
                aVar = new b.a();
                this.B = aVar;
            }
            aVar.d(str, obj, str2);
            return this;
        }

        @k
        public final Builder c(boolean z11) {
            this.f9781r = Boolean.valueOf(z11);
            return this;
        }

        @k
        public final Builder d(boolean z11) {
            this.f9782s = Boolean.valueOf(z11);
            return this;
        }

        @k
        public final Builder d0(@Px int i11) {
            return e0(i11, i11);
        }

        @k
        public final Builder e(@k Bitmap.Config config) {
            this.f9771h = config;
            return this;
        }

        @k
        public final Builder e0(@Px int i11, @Px int i12) {
            return g0(q0.b.a(i11, i12));
        }

        @k
        public final ImageRequest f() {
            Context context = this.f9764a;
            Object obj = this.f9766c;
            if (obj == null) {
                obj = o0.h.f75461a;
            }
            Object obj2 = obj;
            r0.c cVar = this.f9767d;
            a aVar = this.f9768e;
            MemoryCache.Key key = this.f9769f;
            String str = this.f9770g;
            Bitmap.Config config = this.f9771h;
            if (config == null) {
                config = this.f9765b.e();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f9772i;
            Precision precision = this.f9773j;
            if (precision == null) {
                precision = this.f9765b.o();
            }
            Precision precision2 = precision;
            Pair<? extends i.a<?>, ? extends Class<?>> pair = this.f9774k;
            h.a aVar2 = this.f9775l;
            List<? extends d> list = this.f9776m;
            c.a aVar3 = this.f9777n;
            if (aVar3 == null) {
                aVar3 = this.f9765b.q();
            }
            c.a aVar4 = aVar3;
            h.a aVar5 = this.f9778o;
            okhttp3.h G = u0.l.G(aVar5 != null ? aVar5.i() : null);
            Map<Class<?>, ? extends Object> map = this.f9779p;
            c F = u0.l.F(map != null ? c.f9803b.a(map) : null);
            boolean z11 = this.f9780q;
            Boolean bool = this.f9781r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f9765b.c();
            Boolean bool2 = this.f9782s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f9765b.d();
            boolean z12 = this.f9783t;
            CachePolicy cachePolicy = this.f9784u;
            if (cachePolicy == null) {
                cachePolicy = this.f9765b.l();
            }
            CachePolicy cachePolicy2 = cachePolicy;
            CachePolicy cachePolicy3 = this.f9785v;
            if (cachePolicy3 == null) {
                cachePolicy3 = this.f9765b.g();
            }
            CachePolicy cachePolicy4 = cachePolicy3;
            CachePolicy cachePolicy5 = this.f9786w;
            if (cachePolicy5 == null) {
                cachePolicy5 = this.f9765b.m();
            }
            CachePolicy cachePolicy6 = cachePolicy5;
            m0 m0Var = this.f9787x;
            if (m0Var == null) {
                m0Var = this.f9765b.k();
            }
            m0 m0Var2 = m0Var;
            m0 m0Var3 = this.f9788y;
            if (m0Var3 == null) {
                m0Var3 = this.f9765b.j();
            }
            m0 m0Var4 = m0Var3;
            m0 m0Var5 = this.f9789z;
            if (m0Var5 == null) {
                m0Var5 = this.f9765b.f();
            }
            m0 m0Var6 = m0Var5;
            m0 m0Var7 = this.A;
            if (m0Var7 == null) {
                m0Var7 = this.f9765b.p();
            }
            m0 m0Var8 = m0Var7;
            Lifecycle lifecycle = this.J;
            if (lifecycle == null && (lifecycle = this.M) == null) {
                lifecycle = V();
            }
            Lifecycle lifecycle2 = lifecycle;
            q0.h hVar = this.K;
            if (hVar == null && (hVar = this.N) == null) {
                hVar = X();
            }
            q0.h hVar2 = hVar;
            Scale scale = this.L;
            if (scale == null && (scale = this.O) == null) {
                scale = W();
            }
            Scale scale2 = scale;
            b.a aVar6 = this.B;
            return new ImageRequest(context, obj2, cVar, aVar, key, str, config2, colorSpace, precision2, pair, aVar2, list, aVar4, G, F, z11, booleanValue, booleanValue2, z12, cachePolicy2, cachePolicy4, cachePolicy6, m0Var2, m0Var4, m0Var6, m0Var8, lifecycle2, hVar2, scale2, u0.l.E(aVar6 != null ? aVar6.a() : null), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new o0.c(this.J, this.K, this.L, this.f9787x, this.f9788y, this.f9789z, this.A, this.f9777n, this.f9773j, this.f9771h, this.f9781r, this.f9782s, this.f9784u, this.f9785v, this.f9786w), this.f9765b, null);
        }

        @k
        public final Builder f0(@k q0.c cVar, @k q0.c cVar2) {
            return g0(new g(cVar, cVar2));
        }

        @RequiresApi(26)
        @k
        public final Builder g(@k ColorSpace colorSpace) {
            this.f9772i = colorSpace;
            return this;
        }

        @k
        public final Builder g0(@k g gVar) {
            return h0(q0.i.a(gVar));
        }

        @k
        public final Builder h(int i11) {
            c.a aVar;
            if (i11 > 0) {
                aVar = new a.C1169a(i11, false, 2, null);
            } else {
                aVar = c.a.f89103b;
            }
            t0(aVar);
            return this;
        }

        @k
        public final Builder h0(@k q0.h hVar) {
            this.K = hVar;
            U();
            return this;
        }

        @k
        public final Builder i(boolean z11) {
            return h(z11 ? 100 : 0);
        }

        @k
        public final <T> Builder i0(@k Class<? super T> cls, @l T t11) {
            if (t11 == null) {
                Map<Class<?>, Object> map = this.f9779p;
                if (map != null) {
                    map.remove(cls);
                }
                return this;
            }
            Map map2 = this.f9779p;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f9779p = map2;
            }
            T cast = cls.cast(t11);
            g0.m(cast);
            map2.put(cls, cast);
            return this;
        }

        @k
        public final Builder j(@l Object obj) {
            this.f9766c = obj;
            return this;
        }

        public final /* synthetic */ <T> Builder j0(T t11) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return i0(Object.class, t11);
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'decoderFactory'.", replaceWith = @w0(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        @k
        public final Builder k(@k f0.h hVar) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final Builder k0(@k c cVar) {
            this.f9779p = l1.J0(cVar.a());
            return this;
        }

        @k
        public final Builder l(@k m0 m0Var) {
            this.f9789z = m0Var;
            return this;
        }

        @k
        public final Builder l0(@k ImageView imageView) {
            return m0(new r0.b(imageView));
        }

        @k
        public final Builder m(@k h.a aVar) {
            this.f9775l = aVar;
            return this;
        }

        @k
        public final Builder m0(@l r0.c cVar) {
            this.f9767d = cVar;
            U();
            return this;
        }

        @k
        public final Builder n(@k o0.b bVar) {
            this.f9765b = bVar;
            T();
            return this;
        }

        @k
        public final Builder n0(@k x00.l<? super Drawable, g2> lVar, @k x00.l<? super Drawable, g2> lVar2, @k x00.l<? super Drawable, g2> lVar3) {
            return m0(new b(lVar, lVar2, lVar3));
        }

        @k
        public final Builder o(@l String str) {
            this.f9770g = str;
            return this;
        }

        @k
        public final Builder p(@k CachePolicy cachePolicy) {
            this.f9785v = cachePolicy;
            return this;
        }

        @k
        public final Builder p0(@k m0 m0Var) {
            this.A = m0Var;
            return this;
        }

        @k
        public final Builder q(@k m0 m0Var) {
            this.f9788y = m0Var;
            this.f9789z = m0Var;
            this.A = m0Var;
            return this;
        }

        @k
        public final Builder q0(@k List<? extends d> list) {
            this.f9776m = u0.c.g(list);
            return this;
        }

        @k
        public final Builder r(@DrawableRes int i11) {
            this.F = Integer.valueOf(i11);
            this.G = null;
            return this;
        }

        @k
        public final Builder r0(@k d... dVarArr) {
            return q0(a0.dz(dVarArr));
        }

        @k
        public final Builder s(@l Drawable drawable) {
            this.G = drawable;
            this.F = 0;
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @w0(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @k
        public final Builder s0(@k t0.c cVar) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final Builder t(@DrawableRes int i11) {
            this.H = Integer.valueOf(i11);
            this.I = null;
            return this;
        }

        @k
        public final Builder t0(@k c.a aVar) {
            this.f9777n = aVar;
            return this;
        }

        @k
        public final Builder u(@l Drawable drawable) {
            this.I = drawable;
            this.H = 0;
            return this;
        }

        @n(level = DeprecationLevel.ERROR, message = "Migrate to 'fetcherFactory'.", replaceWith = @w0(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        @k
        public final Builder v(@k i iVar) {
            u0.l.K();
            throw new KotlinNothingValueException();
        }

        @k
        public final Builder w(@k m0 m0Var) {
            this.f9788y = m0Var;
            return this;
        }

        public final /* synthetic */ <T> Builder x(i.a<T> aVar) {
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return y(aVar, Object.class);
        }

        @k
        public final <T> Builder y(@k i.a<T> aVar, @k Class<T> cls) {
            this.f9774k = h1.a(aVar, cls);
            return this;
        }

        @k
        public final Builder z(@k okhttp3.h hVar) {
            this.f9778o = hVar.k();
            return this;
        }

        public Builder(@k Context context) {
            this.f9764a = context;
            this.f9765b = u0.k.b();
            this.f9766c = null;
            this.f9767d = null;
            this.f9768e = null;
            this.f9769f = null;
            this.f9770g = null;
            this.f9771h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f9772i = null;
            }
            this.f9773j = null;
            this.f9774k = null;
            this.f9775l = null;
            this.f9776m = h0.J();
            this.f9777n = null;
            this.f9778o = null;
            this.f9779p = null;
            this.f9780q = true;
            this.f9781r = null;
            this.f9782s = null;
            this.f9783t = true;
            this.f9784u = null;
            this.f9785v = null;
            this.f9786w = null;
            this.f9787x = null;
            this.f9788y = null;
            this.f9789z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        @w00.k
        public Builder(@k ImageRequest imageRequest, @k Context context) {
            this.f9764a = context;
            this.f9765b = imageRequest.p();
            this.f9766c = imageRequest.m();
            this.f9767d = imageRequest.M();
            this.f9768e = imageRequest.A();
            this.f9769f = imageRequest.B();
            this.f9770g = imageRequest.r();
            this.f9771h = imageRequest.q().e();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f9772i = imageRequest.k();
            }
            this.f9773j = imageRequest.q().m();
            this.f9774k = imageRequest.w();
            this.f9775l = imageRequest.o();
            this.f9776m = imageRequest.O();
            this.f9777n = imageRequest.q().q();
            this.f9778o = imageRequest.x().k();
            this.f9779p = l1.J0(imageRequest.L().a());
            this.f9780q = imageRequest.g();
            this.f9781r = imageRequest.q().c();
            this.f9782s = imageRequest.q().d();
            this.f9783t = imageRequest.I();
            this.f9784u = imageRequest.q().k();
            this.f9785v = imageRequest.q().g();
            this.f9786w = imageRequest.q().l();
            this.f9787x = imageRequest.q().i();
            this.f9788y = imageRequest.q().h();
            this.f9789z = imageRequest.q().f();
            this.A = imageRequest.q().p();
            this.B = imageRequest.E().g();
            this.C = imageRequest.G();
            this.D = imageRequest.F;
            this.E = imageRequest.G;
            this.F = imageRequest.H;
            this.G = imageRequest.I;
            this.H = imageRequest.J;
            this.I = imageRequest.K;
            this.J = imageRequest.q().j();
            this.K = imageRequest.q().o();
            this.L = imageRequest.q().n();
            if (imageRequest.l() == context) {
                this.M = imageRequest.z();
                this.N = imageRequest.K();
                this.O = imageRequest.J();
            } else {
                this.M = null;
                this.N = null;
                this.O = null;
            }
        }

        public /* synthetic */ Builder(ImageRequest imageRequest, Context context, int i11, v vVar) {
            this(imageRequest, (i11 & 2) != 0 ? imageRequest.l() : context);
        }
    }

    public /* synthetic */ ImageRequest(Context context, Object obj, r0.c cVar, a aVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, h.a aVar2, List list, c.a aVar3, okhttp3.h hVar, c cVar2, boolean z11, boolean z12, boolean z13, boolean z14, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, m0 m0Var, m0 m0Var2, m0 m0Var3, m0 m0Var4, Lifecycle lifecycle, q0.h hVar2, Scale scale, b bVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, o0.c cVar3, o0.b bVar2, v vVar) {
        this(context, obj, cVar, aVar, key, str, config, colorSpace, precision, pair, aVar2, list, aVar3, hVar, cVar2, z11, z12, z13, z14, cachePolicy, cachePolicy2, cachePolicy3, m0Var, m0Var2, m0Var3, m0Var4, lifecycle, hVar2, scale, bVar, key2, num, drawable, num2, drawable2, num3, drawable3, cVar3, bVar2);
    }

    public static /* synthetic */ Builder S(ImageRequest imageRequest, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = imageRequest.f9738a;
        }
        return imageRequest.R(context);
    }

    @l
    public final a A() {
        return this.f9741d;
    }

    @l
    public final MemoryCache.Key B() {
        return this.f9742e;
    }

    @k
    public final CachePolicy C() {
        return this.f9757t;
    }

    @k
    public final CachePolicy D() {
        return this.f9759v;
    }

    @k
    public final b E() {
        return this.D;
    }

    @l
    public final Drawable F() {
        return u0.k.c(this, this.G, this.F, this.M.n());
    }

    @l
    public final MemoryCache.Key G() {
        return this.E;
    }

    @k
    public final Precision H() {
        return this.f9746i;
    }

    public final boolean I() {
        return this.f9756s;
    }

    @k
    public final Scale J() {
        return this.C;
    }

    @k
    public final q0.h K() {
        return this.B;
    }

    @k
    public final c L() {
        return this.f9752o;
    }

    @l
    public final r0.c M() {
        return this.f9740c;
    }

    @k
    public final m0 N() {
        return this.f9763z;
    }

    @k
    public final List<d> O() {
        return this.f9749l;
    }

    @k
    public final c.a P() {
        return this.f9750m;
    }

    @w00.k
    @k
    public final Builder Q() {
        return S(this, null, 1, null);
    }

    @w00.k
    @k
    public final Builder R(@k Context context) {
        return new Builder(this, context);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageRequest)) {
            return false;
        }
        ImageRequest imageRequest = (ImageRequest) obj;
        if (g0.g(this.f9738a, imageRequest.f9738a) && g0.g(this.f9739b, imageRequest.f9739b) && g0.g(this.f9740c, imageRequest.f9740c) && g0.g(this.f9741d, imageRequest.f9741d) && g0.g(this.f9742e, imageRequest.f9742e) && g0.g(this.f9743f, imageRequest.f9743f) && this.f9744g == imageRequest.f9744g) {
            return (Build.VERSION.SDK_INT < 26 || g0.g(this.f9745h, imageRequest.f9745h)) && this.f9746i == imageRequest.f9746i && g0.g(this.f9747j, imageRequest.f9747j) && g0.g(this.f9748k, imageRequest.f9748k) && g0.g(this.f9749l, imageRequest.f9749l) && g0.g(this.f9750m, imageRequest.f9750m) && g0.g(this.f9751n, imageRequest.f9751n) && g0.g(this.f9752o, imageRequest.f9752o) && this.f9753p == imageRequest.f9753p && this.f9754q == imageRequest.f9754q && this.f9755r == imageRequest.f9755r && this.f9756s == imageRequest.f9756s && this.f9757t == imageRequest.f9757t && this.f9758u == imageRequest.f9758u && this.f9759v == imageRequest.f9759v && g0.g(this.f9760w, imageRequest.f9760w) && g0.g(this.f9761x, imageRequest.f9761x) && g0.g(this.f9762y, imageRequest.f9762y) && g0.g(this.f9763z, imageRequest.f9763z) && g0.g(this.E, imageRequest.E) && g0.g(this.F, imageRequest.F) && g0.g(this.G, imageRequest.G) && g0.g(this.H, imageRequest.H) && g0.g(this.I, imageRequest.I) && g0.g(this.J, imageRequest.J) && g0.g(this.K, imageRequest.K) && g0.g(this.A, imageRequest.A) && g0.g(this.B, imageRequest.B) && this.C == imageRequest.C && g0.g(this.D, imageRequest.D) && g0.g(this.L, imageRequest.L) && g0.g(this.M, imageRequest.M);
        }
        return false;
    }

    public final boolean g() {
        return this.f9753p;
    }

    public final boolean h() {
        return this.f9754q;
    }

    public int hashCode() {
        int hashCode = ((this.f9738a.hashCode() * 31) + this.f9739b.hashCode()) * 31;
        r0.c cVar = this.f9740c;
        int hashCode2 = (hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        a aVar = this.f9741d;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f9742e;
        int hashCode4 = (hashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f9743f;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.f9744g.hashCode()) * 31;
        ColorSpace colorSpace = this.f9745h;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f9746i.hashCode()) * 31;
        Pair<i.a<?>, Class<?>> pair = this.f9747j;
        int hashCode7 = (hashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        h.a aVar2 = this.f9748k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.f9749l.hashCode()) * 31) + this.f9750m.hashCode()) * 31) + this.f9751n.hashCode()) * 31) + this.f9752o.hashCode()) * 31) + Boolean.hashCode(this.f9753p)) * 31) + Boolean.hashCode(this.f9754q)) * 31) + Boolean.hashCode(this.f9755r)) * 31) + Boolean.hashCode(this.f9756s)) * 31) + this.f9757t.hashCode()) * 31) + this.f9758u.hashCode()) * 31) + this.f9759v.hashCode()) * 31) + this.f9760w.hashCode()) * 31) + this.f9761x.hashCode()) * 31) + this.f9762y.hashCode()) * 31) + this.f9763z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        MemoryCache.Key key2 = this.E;
        int hashCode9 = (hashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.f9755r;
    }

    @k
    public final Bitmap.Config j() {
        return this.f9744g;
    }

    @l
    public final ColorSpace k() {
        return this.f9745h;
    }

    @k
    public final Context l() {
        return this.f9738a;
    }

    @k
    public final Object m() {
        return this.f9739b;
    }

    @k
    public final m0 n() {
        return this.f9762y;
    }

    @l
    public final h.a o() {
        return this.f9748k;
    }

    @k
    public final o0.b p() {
        return this.M;
    }

    @k
    public final o0.c q() {
        return this.L;
    }

    @l
    public final String r() {
        return this.f9743f;
    }

    @k
    public final CachePolicy s() {
        return this.f9758u;
    }

    @l
    public final Drawable t() {
        return u0.k.c(this, this.I, this.H, this.M.h());
    }

    @l
    public final Drawable u() {
        return u0.k.c(this, this.K, this.J, this.M.i());
    }

    @k
    public final m0 v() {
        return this.f9761x;
    }

    @l
    public final Pair<i.a<?>, Class<?>> w() {
        return this.f9747j;
    }

    @k
    public final okhttp3.h x() {
        return this.f9751n;
    }

    @k
    public final m0 y() {
        return this.f9760w;
    }

    @k
    public final Lifecycle z() {
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest(Context context, Object obj, r0.c cVar, a aVar, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends i.a<?>, ? extends Class<?>> pair, h.a aVar2, List<? extends d> list, c.a aVar3, okhttp3.h hVar, c cVar2, boolean z11, boolean z12, boolean z13, boolean z14, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, m0 m0Var, m0 m0Var2, m0 m0Var3, m0 m0Var4, Lifecycle lifecycle, q0.h hVar2, Scale scale, b bVar, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, o0.c cVar3, o0.b bVar2) {
        this.f9738a = context;
        this.f9739b = obj;
        this.f9740c = cVar;
        this.f9741d = aVar;
        this.f9742e = key;
        this.f9743f = str;
        this.f9744g = config;
        this.f9745h = colorSpace;
        this.f9746i = precision;
        this.f9747j = pair;
        this.f9748k = aVar2;
        this.f9749l = list;
        this.f9750m = aVar3;
        this.f9751n = hVar;
        this.f9752o = cVar2;
        this.f9753p = z11;
        this.f9754q = z12;
        this.f9755r = z13;
        this.f9756s = z14;
        this.f9757t = cachePolicy;
        this.f9758u = cachePolicy2;
        this.f9759v = cachePolicy3;
        this.f9760w = m0Var;
        this.f9761x = m0Var2;
        this.f9762y = m0Var3;
        this.f9763z = m0Var4;
        this.A = lifecycle;
        this.B = hVar2;
        this.C = scale;
        this.D = bVar;
        this.E = key2;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = cVar3;
        this.M = bVar2;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: coil.request.ImageRequest$a$a, reason: collision with other inner class name */
        public static final class C0155a {
            @MainThread
            @Deprecated
            public static void a(@k a aVar, @k ImageRequest imageRequest) {
                a.super.a(imageRequest);
            }

            @MainThread
            @Deprecated
            public static void b(@k a aVar, @k ImageRequest imageRequest, @k e eVar) {
                a.super.b(imageRequest, eVar);
            }

            @MainThread
            @Deprecated
            public static void c(@k a aVar, @k ImageRequest imageRequest) {
                a.super.d(imageRequest);
            }

            @MainThread
            @Deprecated
            public static void d(@k a aVar, @k ImageRequest imageRequest, @k m mVar) {
                a.super.c(imageRequest, mVar);
            }
        }

        @MainThread
        default void a(@k ImageRequest imageRequest) {
        }

        @MainThread
        default void d(@k ImageRequest imageRequest) {
        }

        @MainThread
        default void b(@k ImageRequest imageRequest, @k e eVar) {
        }

        @MainThread
        default void c(@k ImageRequest imageRequest, @k m mVar) {
        }
    }
}
