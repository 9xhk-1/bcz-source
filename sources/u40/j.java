package u40;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/ConstantFormatStructure\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,271:1\n648#2,5:272\n413#2,4:277\n389#2,4:281\n621#2,6:285\n*S KotlinDebug\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/ConstantFormatStructure\n*L\n42#1:272,5\n45#1:277,4\n51#1:281,4\n52#1:285,6\n*E\n"})
/* loaded from: classes8.dex */
public final class j<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f91794a;

    public j(@m80.k String string) {
        g0.p(string, "string");
        this.f91794a = string;
    }

    @Override // u40.o
    @m80.k
    public v40.e<T> a() {
        return new v40.c(this.f91794a);
    }

    @Override // u40.o
    @m80.k
    public w40.t<T> b() {
        String str;
        List b11;
        if (this.f91794a.length() == 0) {
            b11 = h0.J();
        } else {
            List j11 = a00.g0.j();
            String str2 = "";
            if (t40.h.b(this.f91794a.charAt(0))) {
                String str3 = this.f91794a;
                int length = str3.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (!t40.h.b(str3.charAt(i11))) {
                        str3 = str3.substring(0, i11);
                        g0.o(str3, "substring(...)");
                        break;
                    }
                    i11++;
                }
                j11.add(new w40.k(a00.g0.l(new w40.b(str3))));
                String str4 = this.f91794a;
                int length2 = str4.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        str = "";
                        break;
                    }
                    if (!t40.h.b(str4.charAt(i12))) {
                        str = str4.substring(i12);
                        g0.o(str, "substring(...)");
                        break;
                    }
                    i12++;
                }
            } else {
                str = this.f91794a;
            }
            if (str.length() > 0) {
                if (t40.h.b(str.charAt(str.length() - 1))) {
                    int A3 = k0.A3(str);
                    while (true) {
                        if (-1 >= A3) {
                            break;
                        }
                        if (!t40.h.b(str.charAt(A3))) {
                            str2 = str.substring(0, A3 + 1);
                            g0.o(str2, "substring(...)");
                            break;
                        }
                        A3--;
                    }
                    j11.add(new w40.w(str2));
                    int A32 = k0.A3(str);
                    while (true) {
                        if (-1 >= A32) {
                            break;
                        }
                        if (!t40.h.b(str.charAt(A32))) {
                            str = str.substring(A32 + 1);
                            g0.o(str, "substring(...)");
                            break;
                        }
                        A32--;
                    }
                    j11.add(new w40.k(a00.g0.l(new w40.b(str))));
                } else {
                    j11.add(new w40.w(str));
                }
            }
            b11 = a00.g0.b(j11);
        }
        return new w40.t<>(b11, h0.J());
    }

    @m80.k
    public final String c() {
        return this.f91794a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof j) && g0.g(this.f91794a, ((j) obj).f91794a);
    }

    public int hashCode() {
        return this.f91794a.hashCode();
    }

    @m80.k
    public String toString() {
        return "ConstantFormatStructure(" + this.f91794a + ')';
    }
}
