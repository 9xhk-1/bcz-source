package oy;

import io.ktor.utils.io.c0;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
@u0({"SMAP\nPartialContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartialContent.kt\nio/ktor/server/plugins/partialcontent/PartialContentConfig\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,82:1\n51#2,3:83\n*S KotlinDebug\n*F\n+ 1 PartialContent.kt\nio/ktor/server/plugins/partialcontent/PartialContentConfig\n*L\n29#1:83,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f78510b = {o0.k(new MutablePropertyReference1Impl(d.class, "maxRangeCount", "getMaxRangeCount()I", 0))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d10.f f78511a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n+ 2 PartialContent.kt\nio/ktor/server/plugins/partialcontent/PartialContentConfig\n*L\n1#1,52:1\n30#2:53\n*E\n"})
    public static final class a extends d10.c<Integer> {
        public a(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public boolean beforeChange(h10.n<?> property, Integer num, Integer num2) {
            g0.p(property, "property");
            int intValue = num2.intValue();
            num.intValue();
            if (intValue > 0) {
                return true;
            }
            throw new IllegalArgumentException("Bad maxRangeCount value " + intValue);
        }
    }

    public d() {
        d10.a aVar = d10.a.f47010a;
        this.f78511a = new a(10);
    }

    public final int a() {
        return ((Number) this.f78511a.getValue(this, f78510b[0])).intValue();
    }

    public final void b(int i11) {
        this.f78511a.setValue(this, f78510b[0], Integer.valueOf(i11));
    }
}
