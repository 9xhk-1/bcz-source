package dx;

import a00.i0;
import a00.r0;
import com.baicizhan.client.framework.network.http.HttpRequest;
import dx.u;
import ix.q0;
import ix.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.b0;
import mx.v;
import y40.c0;
import y40.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormDataContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/MultiPartFormDataContent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,165:1\n1557#2:166\n1628#2,2:167\n1630#2:172\n15#3,3:169\n15#3,3:173\n*S KotlinDebug\n*F\n+ 1 FormDataContent.kt\nio/ktor/client/request/forms/MultiPartFormDataContent\n*L\n54#1:166\n54#1:167,2\n54#1:172\n74#1:169,3\n75#1:173,3\n*E\n"})
/* loaded from: classes8.dex */
public final class t extends v.f {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f48226b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ix.k f48227c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final byte[] f48228d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final byte[] f48229e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48230f;

    /* renamed from: g, reason: collision with root package name */
    public final int f48231g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final List<u> f48232h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public Long f48233i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6}, l = {119, 120, 121, 126, 130, 134, 137, 141, 141, 141}, m = "writeTo", n = {"this", "channel", "part", "this", "channel", "part", "this", "channel", "part", "this", "channel", "this", "channel", "this", "channel", "channel"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f48234a;

        /* renamed from: b, reason: collision with root package name */
        public Object f48235b;

        /* renamed from: c, reason: collision with root package name */
        public Object f48236c;

        /* renamed from: d, reason: collision with root package name */
        public Object f48237d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f48238e;

        /* renamed from: g, reason: collision with root package name */
        public int f48240g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f48238e = obj;
            this.f48240g |= Integer.MIN_VALUE;
            return t.this.m(null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ t(java.util.List r1, java.lang.String r2, ix.k r3, int r4, kotlin.jvm.internal.v r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            java.lang.String r2 = dx.g.b()
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto L18
            ix.k$g r3 = ix.k.g.f62893a
            ix.k r3 = r3.e()
            java.lang.String r4 = "boundary"
            ix.k r3 = r3.j(r4, r2)
        L18:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dx.t.<init>(java.util.List, java.lang.String, ix.k, int, kotlin.jvm.internal.v):void");
    }

    public static final c0 p(byte[] bArr) {
        y40.b bVar = new y40.b();
        jz.h.i(bVar, bArr, 0, 0, 6, null);
        return bVar;
    }

    @Override // mx.v
    @m80.l
    public Long a() {
        return this.f48233i;
    }

    @Override // mx.v
    @m80.k
    public ix.k b() {
        return this.f48227c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|133|6|7|8|(3:(1:84)|(1:79)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x005f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0060, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0211, code lost:
    
        if (r4.j(r2) != r3) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x022a, code lost:
    
        if (r7.j(r2) != r3) goto L115;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0060: MOVE (r7 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:97), block:B:132:0x0060 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ef A[Catch: all -> 0x01eb, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x01eb, blocks: (B:41:0x00df, B:43:0x00e5, B:105:0x01ef), top: B:40:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e5 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #11 {all -> 0x01eb, blocks: (B:41:0x00df, B:43:0x00e5, B:105:0x01ef), top: B:40:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0152 A[Catch: all -> 0x00a4, TRY_LEAVE, TryCatch #5 {all -> 0x00a4, blocks: (B:57:0x014e, B:59:0x0152, B:64:0x0177, B:87:0x018a, B:89:0x018e, B:93:0x01d5, B:94:0x01da, B:117:0x009f, B:119:0x00b7, B:121:0x00cc), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018a A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #5 {all -> 0x00a4, blocks: (B:57:0x014e, B:59:0x0152, B:64:0x0177, B:87:0x018a, B:89:0x018e, B:93:0x01d5, B:94:0x01da, B:117:0x009f, B:119:0x00b7, B:121:0x00cc), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x01cd -> B:38:0x005b). Please report as a decompilation issue!!! */
    @Override // mx.v.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(@m80.k io.ktor.utils.io.m r24, @m80.k j00.c<? super yz.g2> r25) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dx.t.m(io.ktor.utils.io.m, j00.c):java.lang.Object");
    }

    @m80.k
    public final String o() {
        return this.f48226b;
    }

    public t(@m80.k List<? extends b0> parts, @m80.k String boundary, @m80.k ix.k contentType) {
        byte[] bArr;
        u aVar;
        byte[] bArr2;
        byte[] bArr3;
        g0.p(parts, "parts");
        g0.p(boundary, "boundary");
        g0.p(contentType, "contentType");
        this.f48226b = boundary;
        this.f48227c = contentType;
        Long l11 = null;
        byte[] m11 = jz.s.m(HttpRequest.f17578o + boundary + "\r\n", null, 1, null);
        this.f48228d = m11;
        byte[] m12 = jz.s.m(HttpRequest.f17578o + boundary + "--\r\n", null, 1, null);
        this.f48229e = m12;
        this.f48230f = m12.length;
        bArr = g.f48215a;
        this.f48231g = (bArr.length * 2) + m11.length;
        List<? extends b0> list = parts;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (b0 b0Var : list) {
            x a11 = jz.h.a();
            for (Map.Entry<String, List<String>> entry : b0Var.h().entries()) {
                jz.s.p(a11, entry.getKey() + ": " + r0.r3(entry.getValue(), "; ", null, null, 0, null, null, 62, null), 0, 0, null, 14, null);
                bArr3 = g.f48215a;
                jz.h.i(a11, bArr3, 0, 0, 6, null);
            }
            q0 h11 = b0Var.h();
            y0 y0Var = y0.f63006a;
            String str = h11.get(y0Var.z());
            Long valueOf = str != null ? Long.valueOf(Long.parseLong(str)) : null;
            if (b0Var instanceof b0.c) {
                aVar = new u.a(y40.g0.c(jz.h.e(a11)), ((b0.c) b0Var).k(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.f48231g + r6.length) : null);
            } else if (b0Var instanceof b0.b) {
                aVar = new u.b(y40.g0.c(jz.h.e(a11)), ((b0.b) b0Var).j(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.f48231g + r6.length) : null);
            } else if (b0Var instanceof b0.d) {
                y40.b bVar = new y40.b();
                jz.s.p(bVar, ((b0.d) b0Var).j(), 0, 0, null, 14, null);
                final byte[] c11 = y40.g0.c(bVar);
                x00.a aVar2 = new x00.a() { // from class: dx.s
                    @Override // x00.a
                    public final Object invoke() {
                        c0 p11;
                        p11 = t.p(c11);
                        return p11;
                    }
                };
                if (valueOf == null) {
                    jz.s.p(a11, y0Var.z() + ": " + c11.length, 0, 0, null, 14, null);
                    bArr2 = g.f48215a;
                    jz.h.i(a11, bArr2, 0, 0, 6, null);
                }
                aVar = new u.b(y40.g0.c(jz.h.e(a11)), aVar2, Long.valueOf(c11.length + this.f48231g + r4.length));
            } else if (b0Var instanceof b0.a) {
                aVar = new u.a(y40.g0.c(jz.h.e(a11)), ((b0.a) b0Var).l(), valueOf != null ? Long.valueOf(valueOf.longValue() + this.f48231g + r6.length) : null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(aVar);
        }
        this.f48232h = arrayList;
        Long l12 = 0L;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l11 = l12;
                break;
            }
            Long b11 = ((u) it.next()).b();
            if (b11 == null) {
                break;
            } else {
                l12 = l12 != null ? Long.valueOf(l12.longValue() + b11.longValue()) : null;
            }
        }
        this.f48233i = l11 != null ? Long.valueOf(l11.longValue() + this.f48230f) : l11;
    }
}
