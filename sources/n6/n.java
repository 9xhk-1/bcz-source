package n6;

import com.baicizhan.app.biz.game.model.WordAccent;
import h5.o;
import ix.l1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e f74526a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k f74527b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.settings.WordAccentUC", f = "WordAccentUC.kt", i = {1, 1}, l = {30, 32}, m = "toggleAccent", n = {"current", l1.b.f62938h}, s = {"L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f74528a;

        /* renamed from: b, reason: collision with root package name */
        public Object f74529b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f74530c;

        /* renamed from: e, reason: collision with root package name */
        public int f74532e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f74530c = obj;
            this.f74532e |= Integer.MIN_VALUE;
            return n.this.b(this);
        }
    }

    public n(@m80.k e getTypedSettingUC, @m80.k k setTypedSettingUC) {
        g0.p(getTypedSettingUC, "getTypedSettingUC");
        g0.p(setTypedSettingUC, "setTypedSettingUC");
        this.f74526a = getTypedSettingUC;
        this.f74527b = setTypedSettingUC;
    }

    @m80.l
    public final Object a(@m80.k j00.c<? super WordAccent> cVar) {
        return this.f74526a.a(o.f58391a.a(), cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k j00.c<? super com.baicizhan.app.biz.game.model.WordAccent> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n6.n.a
            if (r0 == 0) goto L13
            r0 = r7
            n6.n$a r0 = (n6.n.a) r0
            int r1 = r0.f74532e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f74532e = r1
            goto L18
        L13:
            n6.n$a r0 = new n6.n$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f74530c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f74532e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f74529b
            com.baicizhan.app.biz.game.model.WordAccent r1 = (com.baicizhan.app.biz.game.model.WordAccent) r1
            java.lang.Object r0 = r0.f74528a
            com.baicizhan.app.biz.game.model.WordAccent r0 = (com.baicizhan.app.biz.game.model.WordAccent) r0
            kotlin.e.n(r7)
            return r1
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3c:
            kotlin.e.n(r7)
            goto L4c
        L40:
            kotlin.e.n(r7)
            r0.f74532e = r4
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L4c
            goto L6c
        L4c:
            com.baicizhan.app.biz.game.model.WordAccent r7 = (com.baicizhan.app.biz.game.model.WordAccent) r7
            com.baicizhan.app.biz.game.model.WordAccent r2 = com.baicizhan.app.biz.game.model.WordAccent.UK
            if (r7 != r2) goto L54
            com.baicizhan.app.biz.game.model.WordAccent r2 = com.baicizhan.app.biz.game.model.WordAccent.US
        L54:
            n6.k r4 = r6.f74527b
            h5.o r5 = h5.o.f58391a
            h5.m0 r5 = r5.a()
            java.lang.Object r7 = l00.k.a(r7)
            r0.f74528a = r7
            r0.f74529b = r2
            r0.f74532e = r3
            java.lang.Object r7 = r4.a(r5, r2, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.n.b(j00.c):java.lang.Object");
    }
}
