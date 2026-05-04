package qg;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.online.user_study_api.MainPageJS;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.jiongji.andriod.card.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlinx.coroutines.channels.BufferOverflow;
import ub.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nExamJsMgr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExamJsMgr.kt\ncom/baicizhan/main/home/plan/module/exam/ExamJsMgr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
/* loaded from: classes4.dex */
public final class l0 {

    /* renamed from: g, reason: collision with root package name */
    public static final int f82128g = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.baicizhan.main.home.plan.module.exam.a f82129a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f82130b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f82131c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f82132d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.x<Boolean> f82133e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<Boolean> f82134f;

    public l0(@m80.k com.baicizhan.main.home.plan.module.exam.a bridge) {
        kotlin.jvm.internal.g0.p(bridge, "bridge");
        this.f82129a = bridge;
        this.f82130b = "ExamJsMgr";
        this.f82131c = "exam_mode.dat";
        this.f82132d = "exam_mode.dat.tmp";
        kotlinx.coroutines.flow.x<Boolean> b11 = kotlinx.coroutines.flow.e0.b(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        this.f82133e = b11;
        this.f82134f = b11;
    }

    public static final MainPageJS F(UserStudyApiService.Client client) {
        return client.get_main_page_js();
    }

    public static final MainPageJS G(x00.l lVar, Object obj) {
        return (MainPageJS) lVar.invoke(obj);
    }

    public static final MainPageJS H(l0 l0Var, MainPageJS mainPageJS, Long l11) {
        qb.c.i(l0Var.f82130b, "remote %d, local %d, url %s", Long.valueOf(mainPageJS.version), l11, mainPageJS.jsUrl);
        if (l11.longValue() < mainPageJS.version) {
            return mainPageJS;
        }
        return null;
    }

    public static final MainPageJS I(x00.p pVar, Object obj, Object obj2) {
        return (MainPageJS) pVar.invoke(obj, obj2);
    }

    public static final rx.c J(l0 l0Var, MainPageJS mainPageJS) {
        if (mainPageJS != null) {
            qb.c.i(l0Var.f82130b, "update js, version " + mainPageJS.version + ", url " + mainPageJS.jsUrl, new Object[0]);
            String jsUrl = mainPageJS.jsUrl;
            kotlin.jvm.internal.g0.o(jsUrl, "jsUrl");
            rx.c<Boolean> P = l0Var.P(jsUrl);
            if (P != null) {
                return P;
            }
        }
        return rx.c.M2(Boolean.FALSE);
    }

    public static final rx.c K(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final rx.c L(final l0 l0Var, Boolean bool) {
        kotlin.jvm.internal.g0.m(bool);
        if (!bool.booleanValue()) {
            bool = null;
        }
        if (bool != null) {
            qb.c.i(l0Var.f82130b, "HOT UPDATE JS", new Object[0]);
            rx.c<Boolean> e02 = l0Var.e0();
            final x00.l lVar = new x00.l() { // from class: qg.k0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 M;
                    M = l0.M(l0.this, (Boolean) obj);
                    return M;
                }
            };
            rx.c<Boolean> L1 = e02.L1(new wb0.b() { // from class: qg.i
                @Override // wb0.b
                public final void call(Object obj) {
                    l0.N(x00.l.this, obj);
                }
            });
            if (L1 != null) {
                return L1;
            }
        }
        return rx.c.M2(Boolean.FALSE);
    }

    public static final g2 M(l0 l0Var, Boolean bool) {
        kotlinx.coroutines.flow.x<Boolean> xVar = l0Var.f82133e;
        kotlin.jvm.internal.g0.m(bool);
        xVar.d(bool);
        return g2.f100423a;
    }

    public static final void N(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final rx.c O(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final Boolean Q(l0 l0Var, String str) {
        File file = new File(pb.a.a().getFilesDir(), l0Var.f82132d);
        boolean z11 = false;
        if (file.exists()) {
            file.delete();
            qb.c.i(l0Var.f82130b, "delete old file " + file.getAbsolutePath(), new Object[0]);
        }
        try {
            boolean I = new a.b().j(str).f(1000).i(3000).h(1).g(file.getAbsolutePath()).a().I();
            Boolean valueOf = Boolean.valueOf(I);
            if (!I) {
                valueOf = null;
            }
            if (valueOf != null) {
                File file2 = new File(pb.a.a().getFilesDir(), l0Var.f82131c);
                if (file2.exists()) {
                    file2.delete();
                }
                file.renameTo(file2);
                qb.c.i(l0Var.f82130b, "download success " + str, new Object[0]);
                z11 = valueOf.booleanValue();
            }
        } catch (Exception e11) {
            qb.c.c(l0Var.f82130b, "", e11);
        }
        return Boolean.valueOf(z11);
    }

    public static final Boolean R(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final String T(l0 l0Var) {
        String readAll = FileUtils.readAll(new FileInputStream(new File(pb.a.a().getFilesDir(), l0Var.f82131c)));
        if (TextUtils.isEmpty(readAll)) {
            throw new IllegalArgumentException("file is empty");
        }
        return readAll;
    }

    public static final String V() {
        return FileUtils.readTextStringFromRaw(pb.a.a().getResources(), R.raw.exam_mode);
    }

    public static final Long a0(File file) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.exists() ? new FileInputStream(file) : pb.a.a().getResources().openRawResource(R.raw.exam_mode)));
        try {
            String readLine = bufferedReader.readLine();
            kotlin.jvm.internal.g0.o(readLine, "readLine(...)");
            String z22 = u30.f0.z2(readLine, r60.e.f83301a, "", false, 4, null);
            r00.b.a(bufferedReader, null);
            return Long.valueOf(Long.parseLong(z22));
        } finally {
        }
    }

    public static final Long b0(x00.l lVar, Object obj) {
        return (Long) lVar.invoke(obj);
    }

    public static final Long c0(l0 l0Var, Throwable th2) {
        qb.c.c(l0Var.f82130b, "", th2);
        return 0L;
    }

    public static final Long d0(x00.l lVar, Object obj) {
        return (Long) lVar.invoke(obj);
    }

    public static final Boolean f0(l0 l0Var, String str) {
        com.baicizhan.main.home.plan.module.exam.a aVar = l0Var.f82129a;
        kotlin.jvm.internal.g0.m(str);
        aVar.d(str);
        return Boolean.TRUE;
    }

    public static final Boolean g0(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final rx.c h0(final l0 l0Var, Throwable th2) {
        qb.c.c(l0Var.f82130b, "", th2);
        rx.c<String> U = l0Var.U();
        final x00.l lVar = new x00.l() { // from class: qg.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean i02;
                i02 = l0.i0(l0.this, (String) obj);
                return i02;
            }
        };
        return U.c3(new wb0.p() { // from class: qg.c0
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean j02;
                j02 = l0.j0(x00.l.this, obj);
                return j02;
            }
        });
    }

    public static final Boolean i0(l0 l0Var, String str) {
        com.baicizhan.main.home.plan.module.exam.a aVar = l0Var.f82129a;
        kotlin.jvm.internal.g0.m(str);
        aVar.d(str);
        return Boolean.TRUE;
    }

    public static final Boolean j0(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final rx.c k0(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final String m0(l0 l0Var, Throwable th2) {
        qb.c.c(l0Var.f82130b, "", th2);
        return "";
    }

    public static final String n0(x00.l lVar, Object obj) {
        return (String) lVar.invoke(obj);
    }

    public static final String o0(l0 l0Var, String str, String str2) {
        kotlin.jvm.internal.g0.m(str2);
        if (str2.length() == 0) {
            return str;
        }
        kotlin.jvm.internal.g0.m(str);
        Pair pair = new Pair(Long.valueOf(l0Var.X(str)), Long.valueOf(l0Var.X(str2)));
        qb.c.i(l0Var.f82130b, "raw: " + pair.getFirst() + " local: " + pair.getSecond(), new Object[0]);
        return ((Number) pair.getFirst()).longValue() >= ((Number) pair.getSecond()).longValue() ? str : str2;
    }

    public static final String p0(x00.p pVar, Object obj, Object obj2) {
        return (String) pVar.invoke(obj, obj2);
    }

    public static final Boolean q0(l0 l0Var, String str) {
        com.baicizhan.main.home.plan.module.exam.a aVar = l0Var.f82129a;
        kotlin.jvm.internal.g0.m(str);
        aVar.d(str);
        return Boolean.TRUE;
    }

    public static final Boolean r0(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    @m80.k
    public final rx.c<Boolean> E() {
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/user_study"));
        final x00.l lVar = new x00.l() { // from class: qg.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                MainPageJS F;
                F = l0.F((UserStudyApiService.Client) obj);
                return F;
            }
        };
        rx.c c32 = a11.c3(new wb0.p() { // from class: qg.m
            @Override // wb0.p
            public final Object call(Object obj) {
                MainPageJS G;
                G = l0.G(x00.l.this, obj);
                return G;
            }
        });
        rx.c<Long> Z = Z();
        final x00.p pVar = new x00.p() { // from class: qg.n
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                MainPageJS H;
                H = l0.H(l0.this, (MainPageJS) obj, (Long) obj2);
                return H;
            }
        };
        rx.c v72 = c32.v7(Z, new wb0.q() { // from class: qg.o
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                MainPageJS I;
                I = l0.I(x00.p.this, obj, obj2);
                return I;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: qg.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c J;
                J = l0.J(l0.this, (MainPageJS) obj);
                return J;
            }
        };
        rx.c b22 = v72.b2(new wb0.p() { // from class: qg.q
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c K;
                K = l0.K(x00.l.this, obj);
                return K;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: qg.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c L;
                L = l0.L(l0.this, (Boolean) obj);
                return L;
            }
        };
        rx.c<Boolean> w52 = b22.b2(new wb0.p() { // from class: qg.t
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c O;
                O = l0.O(x00.l.this, obj);
                return O;
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final rx.c<Boolean> P(String str) {
        rx.c M2 = rx.c.M2(str);
        final x00.l lVar = new x00.l() { // from class: qg.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean Q;
                Q = l0.Q(l0.this, (String) obj);
                return Q;
            }
        };
        rx.c<Boolean> c32 = M2.c3(new wb0.p() { // from class: qg.k
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean R;
                R = l0.R(x00.l.this, obj);
                return R;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }

    public final rx.c<String> S() {
        rx.c<String> w52 = rx.c.z2(new Callable() { // from class: qg.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String T;
                T = l0.T(l0.this);
                return T;
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    public final rx.c<String> U() {
        rx.c<String> w52 = rx.c.z2(new Callable() { // from class: qg.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String V;
                V = l0.V();
                return V;
            }
        }).w5(bc0.c.e());
        kotlin.jvm.internal.g0.o(w52, "subscribeOn(...)");
        return w52;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<Boolean> W() {
        return this.f82134f;
    }

    public final long X(String str) {
        try {
            return Long.parseLong(u30.f0.z2((String) u30.k0.o5(str, new String[]{"\n"}, false, 0, 6, null).get(0), r60.e.f83301a, "", false, 4, null));
        } catch (Exception e11) {
            qb.c.c(this.f82130b, "", e11);
            return 0L;
        }
    }

    @m80.k
    public final rx.c<Boolean> Y() {
        return l0();
    }

    public final rx.c<Long> Z() {
        rx.c M2 = rx.c.M2(new File(pb.a.a().getFilesDir(), this.f82131c));
        final x00.l lVar = new x00.l() { // from class: qg.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                Long a02;
                a02 = l0.a0((File) obj);
                return a02;
            }
        };
        rx.c c32 = M2.c3(new wb0.p() { // from class: qg.d0
            @Override // wb0.p
            public final Object call(Object obj) {
                Long b02;
                b02 = l0.b0(x00.l.this, obj);
                return b02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: qg.e0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Long c02;
                c02 = l0.c0(l0.this, (Throwable) obj);
                return c02;
            }
        };
        rx.c<Long> W3 = c32.W3(new wb0.p() { // from class: qg.f0
            @Override // wb0.p
            public final Object call(Object obj) {
                Long d02;
                d02 = l0.d0(x00.l.this, obj);
                return d02;
            }
        });
        kotlin.jvm.internal.g0.o(W3, "onErrorReturn(...)");
        return W3;
    }

    public final rx.c<Boolean> e0() {
        rx.c<String> S = S();
        final x00.l lVar = new x00.l() { // from class: qg.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean f02;
                f02 = l0.f0(l0.this, (String) obj);
                return f02;
            }
        };
        rx.c<R> c32 = S.c3(new wb0.p() { // from class: qg.h0
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean g02;
                g02 = l0.g0(x00.l.this, obj);
                return g02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: qg.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c h02;
                h02 = l0.h0(l0.this, (Throwable) obj);
                return h02;
            }
        };
        rx.c<Boolean> V3 = c32.V3(new wb0.p() { // from class: qg.j0
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c k02;
                k02 = l0.k0(x00.l.this, obj);
                return k02;
            }
        });
        kotlin.jvm.internal.g0.o(V3, "onErrorResumeNext(...)");
        return V3;
    }

    public final rx.c<Boolean> l0() {
        rx.c<String> U = U();
        rx.c<String> S = S();
        final x00.l lVar = new x00.l() { // from class: qg.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                String m02;
                m02 = l0.m0(l0.this, (Throwable) obj);
                return m02;
            }
        };
        rx.c<String> W3 = S.W3(new wb0.p() { // from class: qg.v
            @Override // wb0.p
            public final Object call(Object obj) {
                String n02;
                n02 = l0.n0(x00.l.this, obj);
                return n02;
            }
        });
        final x00.p pVar = new x00.p() { // from class: qg.w
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                String o02;
                o02 = l0.o0(l0.this, (String) obj, (String) obj2);
                return o02;
            }
        };
        rx.c r72 = rx.c.r7(U, W3, new wb0.q() { // from class: qg.x
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                String p02;
                p02 = l0.p0(x00.p.this, obj, obj2);
                return p02;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: qg.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean q02;
                q02 = l0.q0(l0.this, (String) obj);
                return q02;
            }
        };
        rx.c<Boolean> c32 = r72.c3(new wb0.p() { // from class: qg.z
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean r02;
                r02 = l0.r0(x00.l.this, obj);
                return r02;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }
}
