package com.baicizhan.main.activity.mytab.device;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface v {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f18657a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f18658b = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class b implements v {

        /* renamed from: b, reason: collision with root package name */
        public static final int f18659b = 8;

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<ie.b> f18660a;

        public b(@m80.k List<ie.b> devices) {
            g0.p(devices, "devices");
            this.f18660a = devices;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b c(b bVar, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = bVar.f18660a;
            }
            return bVar.b(list);
        }

        @m80.k
        public final List<ie.b> a() {
            return this.f18660a;
        }

        @m80.k
        public final b b(@m80.k List<ie.b> devices) {
            g0.p(devices, "devices");
            return new b(devices);
        }

        @m80.k
        public final List<ie.b> d() {
            return this.f18660a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && g0.g(this.f18660a, ((b) obj).f18660a);
        }

        public int hashCode() {
            return this.f18660a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Success(devices=" + this.f18660a + pn.j.f81007d;
        }
    }
}
