package androidx.collection;

import j00.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q30.o;
import q30.q;
import x00.p;
import y00.d;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class MutableEntries$iterator$1<K, V> implements Iterator<Map.Entry<K, V>>, d {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableEntries<K, V> this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.collection.MutableEntries$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1538}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    @u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1787:1\n329#2,6:1788\n339#2,3:1795\n342#2,9:1799\n1399#3:1794\n1270#3:1798\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableEntries$iterator$1$1\n*L\n1536#1:1788,6\n1536#1:1795,3\n1536#1:1799,9\n1536#1:1794\n1536#1:1798\n*E\n"})
    /* renamed from: androidx.collection.MutableEntries$iterator$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<o<? super Map.Entry<K, V>>, c<? super g2>, Object> {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ MutableEntries<K, V> this$0;
        final /* synthetic */ MutableEntries$iterator$1 this$1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableEntries<K, V> mutableEntries, MutableEntries$iterator$1 mutableEntries$iterator$1, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = mutableEntries;
            this.this$1 = mutableEntries$iterator$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.this$1, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00b4 -> B:6:0x00ba). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005f -> B:7:0x0073). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00cc -> B:17:0x00cd). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x007c -> B:5:0x00b7). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 215
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableEntries$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public final Object invoke(o<? super Map.Entry<K, V>> oVar, c<? super g2> cVar) {
            return ((AnonymousClass1) create(oVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    public MutableEntries$iterator$1(MutableEntries<K, V> mutableEntries) {
        this.this$0 = mutableEntries;
        this.iterator = q.a(new AnonymousClass1(mutableEntries, this, null));
    }

    public final int getCurrent() {
        return this.current;
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        MutableScatterMap mutableScatterMap;
        if (this.current != -1) {
            mutableScatterMap = ((MutableEntries) this.this$0).parent;
            mutableScatterMap.removeValueAt(this.current);
            this.current = -1;
        }
    }

    public final void setCurrent(int i11) {
        this.current = i11;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        g0.p(it, "<set-?>");
        this.iterator = it;
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        return this.iterator.next();
    }
}
