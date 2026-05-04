package a40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTraceFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraceFormat.kt\nkotlinx/atomicfu/TraceFormatKt$TraceFormat$1\n*L\n1#1,31:1\n*E\n"})
    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.p<Integer, Object, String> f1933a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.p<? super Integer, Object, String> pVar) {
            this.f1933a = pVar;
        }

        @Override // a40.n
        @m80.k
        public String a(int i11, @m80.k Object event) {
            g0.p(event, "event");
            return this.f1933a.invoke(Integer.valueOf(i11), event);
        }
    }

    @o00.f
    public static final n a(x00.p<? super Integer, Object, String> format) {
        g0.p(format, "format");
        return new a(format);
    }
}
