package k40;

import c40.y1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,29:1\n54#2,5:30\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n27#1:30,5\n*E\n"})
/* loaded from: classes8.dex */
public final class u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {34}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f65865a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f65866b;

        /* renamed from: c, reason: collision with root package name */
        public int f65867c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f65866b = obj;
            this.f65867c |= Integer.MIN_VALUE;
            return u.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    @m80.l
    @c40.y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k x00.l<? super k40.d<? super java.lang.Boolean>, yz.g2> r4, @m80.k j00.c<? super yz.g2> r5) {
        /*
            boolean r0 = r5 instanceof k40.u.a
            if (r0 == 0) goto L13
            r0 = r5
            k40.u$a r0 = (k40.u.a) r0
            int r1 = r0.f65867c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f65867c = r1
            goto L18
        L13:
            k40.u$a r0 = new k40.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f65866b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f65867c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f65865a
            x00.l r4 = (x00.l) r4
            kotlin.e.n(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
        L38:
            k40.m r5 = new k40.m
            kotlin.coroutines.d r2 = r0.getContext()
            r5.<init>(r2)
            r4.invoke(r5)
            r0.f65865a = r4
            r0.f65867c = r3
            java.lang.Object r5 = r5.w(r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L38
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k40.u.a(x00.l, j00.c):java.lang.Object");
    }

    @y1
    public static final Object b(x00.l<? super d<? super Boolean>, g2> lVar, j00.c<? super g2> cVar) {
        d0.e(3);
        throw null;
    }
}
