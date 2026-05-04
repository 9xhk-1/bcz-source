package a00;

import com.google.android.material.timepicker.RadialViewGroup;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "e", "bufferInitialCapacity", "gap", RadialViewGroup.f32580d, "$this$iterator", "buffer", "bufferInitialCapacity", "gap", RadialViewGroup.f32580d, "$this$iterator", "buffer", "e", "bufferInitialCapacity", "gap", "$this$iterator", "buffer", "bufferInitialCapacity", "gap", "$this$iterator", "buffer", "bufferInitialCapacity", "gap"}, nl = {35, 43, 50, 56, 61}, s = {"L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, v = 2)
    public static final class a<T> extends RestrictedSuspendLambda implements x00.p<q30.o<? super List<? extends T>>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f1160a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1161b;

        /* renamed from: c, reason: collision with root package name */
        public Object f1162c;

        /* renamed from: d, reason: collision with root package name */
        public int f1163d;

        /* renamed from: e, reason: collision with root package name */
        public int f1164e;

        /* renamed from: f, reason: collision with root package name */
        public int f1165f;

        /* renamed from: g, reason: collision with root package name */
        public int f1166g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f1167h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f1168i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f1169j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Iterator<T> f1170k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f1171l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f1172m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i11, int i12, Iterator<? extends T> it, boolean z11, boolean z12, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f1168i = i11;
            this.f1169j = i12;
            this.f1170k = it;
            this.f1171l = z11;
            this.f1172m = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f1168i, this.f1169j, this.f1170k, this.f1171l, this.f1172m, cVar);
            aVar.f1167h = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x00c7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00bd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0177 -> B:16:0x017a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0143 -> B:31:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00b1 -> B:50:0x005f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a00.z1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(q30.o<? super List<? extends T>> oVar, j00.c<? super g2> cVar) {
            return ((a) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,731:1\n19#2:732\n*E\n"})
    public static final class b<T> implements q30.m<List<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q30.m f1173a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1174b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1175c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1176d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f1177e;

        public b(q30.m mVar, int i11, int i12, boolean z11, boolean z12) {
            this.f1173a = mVar;
            this.f1174b = i11;
            this.f1175c = i12;
            this.f1176d = z11;
            this.f1177e = z12;
        }

        @Override // q30.m
        public Iterator<List<? extends T>> iterator() {
            return z1.b(this.f1173a.iterator(), this.f1174b, this.f1175c, this.f1176d, this.f1177e);
        }
    }

    public static final void a(int i11, int i12) {
        String str;
        if (i11 <= 0 || i12 <= 0) {
            if (i11 != i12) {
                str = "Both size " + i11 + " and step " + i12 + " must be greater than zero.";
            } else {
                str = "size " + i11 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @m80.k
    public static final <T> Iterator<List<T>> b(@m80.k Iterator<? extends T> iterator, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        return !iterator.hasNext() ? t0.f1145a : q30.q.a(new a(i11, i12, iterator, z12, z11, null));
    }

    @m80.k
    public static final <T> q30.m<List<T>> c(@m80.k q30.m<? extends T> mVar, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        a(i11, i12);
        return new b(mVar, i11, i12, z11, z12);
    }
}
