package c5;

import b5.c1;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.net.exception.NetworkException;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.impl.unity.command.base.CommandBaseKt", f = "CommandBase.kt", i = {0, 0}, l = {44}, m = "safeExecute", n = {"action", "$i$f$safeExecute"}, s = {"L$0", "I$0"}, v = 1)
    @u0({"SMAP\nCommandBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandBase.kt\ncom/baicizhan/app/biz/game/impl/unity/command/base/CommandBaseKt$safeExecute$1\n*L\n1#1,186:1\n*E\n"})
    /* renamed from: c5.a$a, reason: collision with other inner class name */
    public static final class C0131a<T extends c1> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f8016a;

        /* renamed from: b, reason: collision with root package name */
        public int f8017b;

        /* renamed from: c, reason: collision with root package name */
        public int f8018c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f8019d;

        /* renamed from: e, reason: collision with root package name */
        public int f8020e;

        public C0131a(c<? super C0131a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f8019d = obj;
            this.f8020e |= Integer.MIN_VALUE;
            return a.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends b5.c1> java.lang.Object a(@m80.k x00.l<? super j00.c<? super T>, ? extends java.lang.Object> r8, @m80.k j00.c<? super b5.c> r9) {
        /*
            boolean r0 = r9 instanceof c5.a.C0131a
            if (r0 == 0) goto L13
            r0 = r9
            c5.a$a r0 = (c5.a.C0131a) r0
            int r1 = r0.f8020e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8020e = r1
            goto L18
        L13:
            c5.a$a r0 = new c5.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8019d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f8020e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.f8018c
            java.lang.Object r0 = r0.f8016a
            x00.l r0 = (x00.l) r0
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L5d
            r3 = r8
            goto L51
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            kotlin.e.n(r9)
            java.lang.Object r9 = l00.k.a(r8)     // Catch: java.lang.Throwable -> L5d
            r0.f8016a = r9     // Catch: java.lang.Throwable -> L5d
            r9 = 0
            r0.f8017b = r9     // Catch: java.lang.Throwable -> L5d
            r0.f8018c = r9     // Catch: java.lang.Throwable -> L5d
            r0.f8020e = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L5d
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r3 = r9
            r9 = r8
        L51:
            r5 = r9
            b5.c1 r5 = (b5.c1) r5     // Catch: java.lang.Throwable -> L5d
            b5.c r2 = new b5.c     // Catch: java.lang.Throwable -> L5d
            r4 = 0
            r6 = 2
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L5d
            return r2
        L5d:
            r0 = move-exception
            r8 = r0
            z6.b r9 = z6.b.f101032b
            java.lang.String r0 = "safeExecute"
            java.lang.String r1 = ""
            r9.i(r0, r1, r8)
            boolean r9 = r8 instanceof com.baicizhan.app.biz.base.BizInternalException
            java.lang.String r0 = "Unknown error"
            if (r9 == 0) goto L8b
            b5.c r1 = new b5.c
            r9 = r8
            com.baicizhan.app.biz.base.BizInternalException r9 = (com.baicizhan.app.biz.base.BizInternalException) r9
            int r9 = r9.getCode()
            r2 = 100000(0x186a0, float:1.4013E-40)
            int r2 = r2 + r9
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L83
            r3 = r0
            goto L84
        L83:
            r3 = r8
        L84:
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            goto La3
        L8b:
            boolean r9 = r8 instanceof com.baicizhan.app.net.exception.NetworkException
            if (r9 == 0) goto La4
            b5.c r1 = new b5.c
            java.lang.String r8 = r8.getMessage()
            if (r8 != 0) goto L99
            r3 = r0
            goto L9a
        L99:
            r3 = r8
        L9a:
            r5 = 4
            r6 = 0
            r2 = 8800000(0x864700, float:1.2331426E-38)
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        La3:
            return r1
        La4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.a.a(x00.l, j00.c):java.lang.Object");
    }

    public static final <T extends c1> Object b(x00.l<? super c<? super T>, ? extends Object> lVar, c<? super b5.c> cVar) {
        b5.c cVar2;
        try {
            return new b5.c(0, (String) null, (c1) lVar.invoke(cVar), 2, (v) null);
        } catch (Throwable th2) {
            z6.b.f101032b.i("safeExecute", "", th2);
            if (th2 instanceof BizInternalException) {
                int code = 100000 + th2.getCode();
                String message = th2.getMessage();
                cVar2 = new b5.c(code, message != null ? message : "Unknown error", (c1) null, 4, (v) null);
            } else {
                if (!(th2 instanceof NetworkException)) {
                    throw th2;
                }
                String message2 = th2.getMessage();
                cVar2 = new b5.c(s3.c.f87473e, message2 != null ? message2 : "Unknown error", (c1) null, 4, (v) null);
            }
            return cVar2;
        }
    }
}
