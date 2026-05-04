package s3;

import c40.r0;
import com.baicizhan.app.api.service.BizException;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.net.exception.NetworkException;
import com.baicizhan.biz.online.thrift.basic.LogicException;
import com.baicizhan.biz.online.thrift.basic.SystemException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import u30.e0;
import u30.k0;
import u30.m;
import u30.o;
import x00.p;
import yz.g2;
import yz.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBizCatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n1#1,98:1\n12#1,12:99\n*S KotlinDebug\n*F\n+ 1 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n*L\n44#1:99,12\n*E\n"})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f87469a = "api";

    /* renamed from: b, reason: collision with root package name */
    public static final int f87470b = 100000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f87471c = 200000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f87472d = 300000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f87473e = 8800000;

    /* renamed from: f, reason: collision with root package name */
    public static final int f87474f = 9900000;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.BizCatchKt", f = "BizCatch.kt", i = {0}, l = {29}, m = "bizCatchSuspend", n = {"block"}, s = {"L$0"}, v = 1)
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f87475a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f87476b;

        /* renamed from: c, reason: collision with root package name */
        public int f87477c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f87476b = obj;
            this.f87477c |= Integer.MIN_VALUE;
            return c.b(null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.base.BizCatchKt$bizResult$2", f = "BizCatch.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b<T> extends SuspendLambda implements p<r0, j00.c<? super p.a<? extends T>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f87478a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super T>, Object> f87479b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super j00.c<? super T>, ? extends Object> lVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f87479b = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f87479b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super p.a<? extends T>> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f87478a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    x00.l<j00.c<? super T>, Object> lVar = this.f87479b;
                    this.f87478a = 1;
                    obj = c.b(lVar, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return p.a.f78545b.b(obj);
            } catch (BizException e11) {
                return p.a.f78545b.a(e11);
            } catch (Throwable th2) {
                return p.a.f78545b.a(new BizException("未知错误，请稍后重试~", th2, c.f87474f));
            }
        }
    }

    public static final <T> T a(@k x00.a<? extends T> block) {
        g0.p(block, "block");
        try {
            return block.invoke();
        } catch (Throwable th2) {
            if (th2 instanceof BizException) {
                BizException bizException = (BizException) th2;
                throw new BizException(bizException.getMsg(), th2, bizException.getCode() + 100000);
            }
            if (th2 instanceof BizInternalException) {
                BizInternalException bizInternalException = (BizInternalException) th2;
                throw new BizException(bizInternalException.getMsg(), th2, bizInternalException.getCode() + 100000);
            }
            if (th2 instanceof SystemException) {
                SystemException systemException = (SystemException) th2;
                throw new BizException(systemException.message_, th2, systemException.code + 300000);
            }
            if (th2 instanceof LogicException) {
                LogicException logicException = (LogicException) th2;
                throw new BizException(logicException.message_, th2, logicException.code + f87471c);
            }
            if (th2 instanceof NetworkException) {
                throw new BizException("网络异常，请稍候重试", th2, 100000);
            }
            throw new BizException("未知错误，请稍后重试~", th2, f87474f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@m80.k x00.l<? super j00.c<? super T>, ? extends java.lang.Object> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof s3.c.a
            if (r0 == 0) goto L13
            r0 = r5
            s3.c$a r0 = (s3.c.a) r0
            int r1 = r0.f87477c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87477c = r1
            goto L18
        L13:
            s3.c$a r0 = new s3.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f87476b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f87477c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f87475a
            x00.l r4 = (x00.l) r4
            kotlin.e.n(r5)     // Catch: java.lang.Throwable -> L48
            return r5
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            java.lang.Object r5 = l00.k.a(r4)     // Catch: java.lang.Throwable -> L48
            r0.f87475a = r5     // Catch: java.lang.Throwable -> L48
            r0.f87477c = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r4.invoke(r0)     // Catch: java.lang.Throwable -> L48
            if (r4 != r1) goto L47
            return r1
        L47:
            return r4
        L48:
            r4 = move-exception
            boolean r5 = r4 instanceof com.baicizhan.app.api.service.BizException
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r5 != 0) goto La7
            boolean r5 = r4 instanceof com.baicizhan.app.biz.base.BizInternalException
            if (r5 != 0) goto L95
            boolean r5 = r4 instanceof com.baicizhan.biz.online.thrift.basic.SystemException
            if (r5 != 0) goto L84
            boolean r5 = r4 instanceof com.baicizhan.biz.online.thrift.basic.LogicException
            if (r5 != 0) goto L73
            boolean r5 = r4 instanceof com.baicizhan.app.net.exception.NetworkException
            if (r5 == 0) goto L68
            com.baicizhan.app.api.service.BizException r5 = new com.baicizhan.app.api.service.BizException
            java.lang.String r1 = "网络异常，请稍候重试"
            r5.<init>(r1, r4, r0)
            goto Lb8
        L68:
            com.baicizhan.app.api.service.BizException r5 = new com.baicizhan.app.api.service.BizException
            java.lang.String r0 = "未知错误，请稍后重试~"
            r1 = 9900000(0x970fe0, float:1.3872855E-38)
            r5.<init>(r0, r4, r1)
            goto Lb8
        L73:
            com.baicizhan.app.api.service.BizException r5 = new com.baicizhan.app.api.service.BizException
            r0 = r4
            com.baicizhan.biz.online.thrift.basic.LogicException r0 = (com.baicizhan.biz.online.thrift.basic.LogicException) r0
            java.lang.String r1 = r0.message_
            r2 = 200000(0x30d40, float:2.8026E-40)
            int r0 = r0.code
            int r0 = r0 + r2
            r5.<init>(r1, r4, r0)
            goto Lb8
        L84:
            com.baicizhan.app.api.service.BizException r5 = new com.baicizhan.app.api.service.BizException
            r0 = r4
            com.baicizhan.biz.online.thrift.basic.SystemException r0 = (com.baicizhan.biz.online.thrift.basic.SystemException) r0
            java.lang.String r1 = r0.message_
            r2 = 300000(0x493e0, float:4.2039E-40)
            int r0 = r0.code
            int r0 = r0 + r2
            r5.<init>(r1, r4, r0)
            goto Lb8
        L95:
            com.baicizhan.app.api.service.BizException r5 = new com.baicizhan.app.api.service.BizException
            r1 = r4
            com.baicizhan.app.biz.base.BizInternalException r1 = (com.baicizhan.app.biz.base.BizInternalException) r1
            java.lang.String r2 = r1.getMsg()
            int r1 = r1.getCode()
            int r1 = r1 + r0
            r5.<init>(r2, r4, r1)
            goto Lb8
        La7:
            com.baicizhan.app.api.service.BizException r5 = new com.baicizhan.app.api.service.BizException
            r1 = r4
            com.baicizhan.app.api.service.BizException r1 = (com.baicizhan.app.api.service.BizException) r1
            java.lang.String r2 = r1.getMsg()
            int r1 = r1.getCode()
            int r1 = r1 + r0
            r5.<init>(r2, r4, r1)
        Lb8:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.c.b(x00.l, j00.c):java.lang.Object");
    }

    @l
    public static final <T> Object c(@k x00.l<? super j00.c<? super T>, ? extends Object> lVar, @k j00.c<? super p.a<? extends T>> cVar) {
        return e.a(new b(lVar, null), cVar);
    }

    @l
    public static final Integer d(@k String log) {
        m c11;
        u30.l lVar;
        String f11;
        g0.p(log, "log");
        o find$default = Regex.find$default(new Regex("\\(([^:]+):(\\d+):\\d+\\)"), log, 0, 2, null);
        if (find$default == null || (c11 = find$default.c()) == null || (lVar = c11.get(2)) == null || (f11 = lVar.f()) == null) {
            return null;
        }
        return e0.p1(f11);
    }

    public static final int j(@k Throwable th2) {
        Integer d11;
        g0.p(th2, "<this>");
        String str = (String) a00.r0.b3(k0.o5(r.i(th2), new String[]{"\n"}, false, 0, 6, null), 1);
        if (str == null || (d11 = d(str)) == null) {
            return 0;
        }
        return d11.intValue() + 3;
    }

    @k
    public static final <T> p.a<T> k(@k x00.a<? extends T> block) {
        g0.p(block, "block");
        try {
            try {
                return p.a.f78545b.b(block.invoke());
            } catch (Throwable th2) {
                if (th2 instanceof BizException) {
                    throw new BizException(((BizException) th2).getMsg(), th2, ((BizException) th2).getCode() + 100000);
                }
                if (th2 instanceof BizInternalException) {
                    throw new BizException(((BizInternalException) th2).getMsg(), th2, ((BizInternalException) th2).getCode() + 100000);
                }
                if (th2 instanceof SystemException) {
                    throw new BizException(((SystemException) th2).message_, th2, ((SystemException) th2).code + 300000);
                }
                if (th2 instanceof LogicException) {
                    throw new BizException(((LogicException) th2).message_, th2, ((LogicException) th2).code + f87471c);
                }
                if (th2 instanceof NetworkException) {
                    throw new BizException("网络异常，请稍候重试", th2, 100000);
                }
                throw new BizException("未知错误，请稍后重试~", th2, f87474f);
            }
        } catch (BizException e11) {
            return p.a.f78545b.a(e11);
        } catch (Throwable th3) {
            return p.a.f78545b.a(new BizException("未知错误，请稍后重试~", th3, f87474f));
        }
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g() {
    }

    public static /* synthetic */ void h() {
    }

    public static /* synthetic */ void i() {
    }
}
