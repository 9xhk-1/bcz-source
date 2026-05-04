package l7;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nThriftByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftByteArray.kt\ncom/baicizhan/app/biz/thrift/ThriftByteArrayKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1869#2,2:72\n*S KotlinDebug\n*F\n+ 1 ThriftByteArray.kt\ncom/baicizhan/app/biz/thrift/ThriftByteArrayKt\n*L\n55#1:72,2\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f70543a = "Thrift-ByteArray";

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TADAPTER; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.thrift.ThriftByteArrayKt$asThriftList$1", f = "ThriftByteArray.kt", i = {0, 0}, l = {42}, m = "invokeSuspend", n = {"$this$sequence", "i"}, s = {"L$0", "I$0"}, v = 1)
    public static final class a<T> extends RestrictedSuspendLambda implements x00.p<q30.o<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f70544a;

        /* renamed from: b, reason: collision with root package name */
        public int f70545b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f70546c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f70547d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ts.a f70548e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ws.b f70549f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (ITADAPTER;Lws/b;Lj00/c<-Ll7/d$a;>;)V */
        public a(int i11, ts.a aVar, ws.b bVar, j00.c cVar) {
            super(2, cVar);
            this.f70547d = i11;
            this.f70548e = aVar;
            this.f70549f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f70547d, this.f70548e, this.f70549f, cVar);
            aVar.f70546c = obj;
            return aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0038 -> B:5:0x003b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f70546c
                q30.o r0 = (q30.o) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r5.f70545b
                r3 = 1
                if (r2 == 0) goto L1d
                if (r2 != r3) goto L15
                int r2 = r5.f70544a
                kotlin.e.n(r6)
                goto L3b
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.e.n(r6)
                r6 = 0
                r2 = r6
            L22:
                int r6 = r5.f70547d
                if (r2 >= r6) goto L3d
                ts.a r6 = r5.f70548e
                ws.b r4 = r5.f70549f
                java.lang.Object r6 = r6.read(r4)
                r5.f70546c = r0
                r5.f70544a = r2
                r5.f70545b = r3
                java.lang.Object r6 = r0.b(r6, r5)
                if (r6 != r1) goto L3b
                return r1
            L3b:
                int r2 = r2 + r3
                goto L22
            L3d:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super T> oVar, j00.c<? super g2> cVar) {
            return ((a) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @m80.k
    public static final <T, A extends ts.a<T, ? extends ts.f<T>>> byte[] a(T t11, @m80.k A builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        try {
            l60.k kVar = new l60.k();
            builder.write(new ws.c(new zs.a(kVar)), t11);
            return kVar.w2();
        } catch (Exception e11) {
            z6.b.f101032b.i(f70543a, "", e11);
            return new byte[0];
        }
    }

    @m80.k
    public static final <T, A extends ts.a<T, ? extends ts.f<T>>> byte[] b(@m80.k List<? extends T> list, @m80.k A builder) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(builder, "builder");
        try {
            l60.k kVar = new l60.k();
            ws.i bVar = new ws.b(new zs.a(kVar), 0L, 0L, false, false, 30, null);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                builder.write(bVar, it.next());
            }
            return kVar.w2();
        } catch (Exception e11) {
            z6.b.f101032b.i(f70543a, "", e11);
            return new byte[0];
        }
    }

    @m80.l
    public static final <T, ADAPTER extends ts.a<T, ? extends ts.f<T>>> T c(@m80.k byte[] bArr, @m80.k ADAPTER builder) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(builder, "builder");
        try {
            l60.k kVar = new l60.k();
            kVar.write(bArr);
            return (T) builder.read(new ws.c(new zs.a(kVar)));
        } catch (Exception e11) {
            z6.b.f101032b.i(f70543a, "", e11);
            return null;
        }
    }

    @m80.l
    public static final <T, ADAPTER extends ts.a<T, ? extends ts.f<T>>> List<T> d(@m80.k byte[] bArr, @m80.k ADAPTER builder, int i11) {
        kotlin.jvm.internal.g0.p(bArr, "<this>");
        kotlin.jvm.internal.g0.p(builder, "builder");
        try {
            l60.k kVar = new l60.k();
            kVar.write(bArr);
            return q30.k0.I3(q30.q.b(new a(i11, builder, new ws.b(new zs.a(kVar), 0L, 0L, false, false, 30, null), null)));
        } catch (Exception e11) {
            z6.b.f101032b.i(f70543a, "", e11);
            return null;
        }
    }
}
