package u40;

import a00.i0;
import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/ConcatenatedFormatStructure\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1563#2:272\n1634#2,3:273\n1563#2:276\n1634#2,3:277\n*S KotlinDebug\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/ConcatenatedFormatStructure\n*L\n233#1:272\n233#1:273,3\n236#1:276\n236#1:277,3\n*E\n"})
/* loaded from: classes8.dex */
public class h<T> implements o<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<t<T>> f91792a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@m80.k List<? extends t<? super T>> formats) {
        g0.p(formats, "formats");
        this.f91792a = formats;
    }

    @Override // u40.o
    @m80.k
    public v40.e<T> a() {
        List<t<T>> list = this.f91792a;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((t) it.next()).a());
        }
        return arrayList.size() == 1 ? (v40.e) r0.m5(arrayList) : new v40.a(arrayList);
    }

    @Override // u40.o
    @m80.k
    public w40.t<T> b() {
        List<t<T>> list = this.f91792a;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((t) it.next()).b());
        }
        return w40.p.c(arrayList);
    }

    @m80.k
    public final List<t<T>> c() {
        return this.f91792a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof h) && g0.g(this.f91792a, ((h) obj).f91792a);
    }

    public int hashCode() {
        return this.f91792a.hashCode();
    }

    @m80.k
    public String toString() {
        return "ConcatenatedFormatStructure(" + r0.r3(this.f91792a, j2.O, null, null, 0, null, null, 62, null) + ')';
    }
}
