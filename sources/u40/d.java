package u40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builder.kt\nkotlinx/datetime/internal/format/AppendableFormatStructure\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1869#2,2:23\n*S KotlinDebug\n*F\n+ 1 Builder.kt\nkotlinx/datetime/internal/format/AppendableFormatStructure\n*L\n18#1:23,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<t<T>> f91775a = new ArrayList();

    public final void a(@m80.k o<? super T> format) {
        g0.p(format, "format");
        if (format instanceof t) {
            this.f91775a.add(format);
        } else {
            if (!(format instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            Iterator<T> it = ((h) format).c().iterator();
            while (it.hasNext()) {
                this.f91775a.add((t) it.next());
            }
        }
    }

    @m80.k
    public final h<T> b() {
        return new h<>(this.f91775a);
    }
}
