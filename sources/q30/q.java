package q30;

import java.util.Iterator;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import yz.g2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final int f81611a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f81612b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f81613c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f81614d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f81615e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f81616f = 5;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SequenceBuilder.kt\nkotlin/sequences/SequencesKt__SequenceBuilderKt\n*L\n1#1,731:1\n26#2:732\n*E\n"})
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p f81617a;

        public a(x00.p pVar) {
            this.f81617a = pVar;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            return q.a(this.f81617a);
        }
    }

    @y0(version = "1.3")
    @m80.k
    public static <T> Iterator<T> a(@yz.b @m80.k x00.p<? super o<? super T>, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        n nVar = new n();
        nVar.k(IntrinsicsKt__IntrinsicsJvmKt.c(block, nVar, nVar));
        return nVar;
    }

    @y0(version = "1.3")
    @m80.k
    public static <T> m<T> b(@yz.b @m80.k x00.p<? super o<? super T>, ? super j00.c<? super g2>, ? extends Object> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        return new a(block);
    }
}
