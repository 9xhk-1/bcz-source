package c4;

import a00.h0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import com.baicizhan.app.api.AppType;
import com.baicizhan.app.api.LogLevel;
import k3.x2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.koin.core.definition.Kind;
import org.koin.core.logger.Level;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSdkContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 2 Koin.kt\norg/koin/core/Koin\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Module.kt\norg/koin/core/module/Module\n+ 6 Module.kt\norg/koin/core/module/ModuleKt\n+ 7 BeanDefinition.kt\norg/koin/core/definition/BeanDefinitionKt\n*L\n1#1,115:1\n124#2,4:116\n124#2,4:121\n142#3:120\n142#3:125\n1#4:126\n149#5,14:127\n163#5,2:157\n212#6:141\n213#6:156\n115#7,14:142\n*S KotlinDebug\n*F\n+ 1 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n*L\n43#1:116,4\n45#1:121,4\n43#1:120\n45#1:125\n96#1:127,14\n96#1:157,2\n96#1:141\n96#1:156\n96#1:142,14\n*E\n"})
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f7809a = false;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f7810b = "koin";

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final na0.b f7811c = eb0.b.e(false, null, 3, null);

    /* renamed from: d, reason: collision with root package name */
    public static k f7812d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ua0.b {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: c4.n$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0130a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7813a;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.DEBUG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f7813a = iArr;
            }
        }

        public a() {
            super(null, 1, null);
        }

        @Override // ua0.b
        public void b(Level level, String msg) {
            g0.p(level, "level");
            g0.p(msg, "msg");
            int i11 = C0130a.f7813a[level.ordinal()];
            if (i11 == 1) {
                z6.b.d(z6.b.f101032b, n.f7810b, msg, null, 4, null);
                return;
            }
            if (i11 == 2) {
                z6.b.d(z6.b.f101032b, n.f7810b, msg, null, 4, null);
            } else if (i11 != 3) {
                z6.b.j(z6.b.f101032b, n.f7810b, msg, null, 4, null);
            } else {
                z6.b.d(z6.b.f101032b, n.f7810b, msg, null, 4, null);
            }
        }
    }

    public static final /* synthetic */ <T extends x2> T d() {
        cb0.b h11 = j.f7801a.a().P().h();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) h11.i(o0.d(Object.class), null, null);
    }

    @m80.k
    public static final n3.e e(@m80.k i3.a config) {
        g0.p(config, "config");
        if (f7809a) {
            throw new RuntimeException("sdk has been created once");
        }
        f7809a = true;
        LogLevel d11 = config.d();
        AppType b11 = config.b();
        i3.b e11 = config.e();
        if (e11 == null) {
            e11 = i.f7800a;
        }
        i3.b bVar = e11;
        String a11 = config.a();
        String f11 = config.f();
        if (f11.length() == 0) {
            f11 = o.a();
        }
        i(new k(d11, bVar, b11, a11, f11, config.c()));
        na0.b bVar2 = f7811c;
        bVar2.f(new a());
        bVar2.g(r0.I4(c4.a.a(), g.f()));
        bVar2.h(eb0.e.b(false, new x00.l() { // from class: c4.m
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = n.f((va0.c) obj);
                return f12;
            }
        }, 1, null));
        h hVar = new h();
        z6.b.j(z6.b.f101032b, "SDK init", "sdk init success", null, 4, null);
        s3.g.f87544a.e();
        return hVar;
    }

    public static final g2 f(va0.c module) {
        g0.p(module, "$this$module");
        p pVar = new p() { // from class: c4.l
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                k g11;
                g11 = n.g((cb0.b) obj, (ya0.a) obj2);
                return g11;
            }
        };
        ta0.a aVar = new ta0.a(new ra0.b(ab0.e.f2509e.a(), o0.d(k.class), null, pVar, Kind.Factory, h0.J()));
        module.q(aVar);
        new ra0.f(module, aVar);
        return g2.f100423a;
    }

    public static final k g(cb0.b factory, ya0.a it) {
        g0.p(factory, "$this$factory");
        g0.p(it, "it");
        return h();
    }

    @m80.k
    public static final k h() {
        k kVar = f7812d;
        if (kVar != null) {
            return kVar;
        }
        g0.S("sdkContext");
        return null;
    }

    public static final void i(@m80.k k kVar) {
        g0.p(kVar, "<set-?>");
        f7812d = kVar;
    }

    @m80.k
    public static final l7.p j() {
        return (l7.p) j.f7801a.a().P().h().i(o0.d(l7.p.class), null, null);
    }
}
