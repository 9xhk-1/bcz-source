package h80;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiColors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d extends b {
    public final AnsiColors D;

    public d(OutputStream outputStream, AnsiColors ansiColors) {
        super(outputStream);
        this.D = ansiColors;
    }

    @Override // h80.b
    public boolean i(ArrayList<Object> arrayList) {
        return false;
    }

    @Override // h80.b
    public boolean w(ArrayList<Object> arrayList, int i11) throws IOException {
        AnsiColors ansiColors;
        boolean z11;
        boolean z12 = false;
        if (i11 != 109 || ((ansiColors = this.D) != AnsiColors.Colors256 && ansiColors != AnsiColors.Colors16)) {
            return false;
        }
        Iterator<Object> it = arrayList.iterator();
        boolean z13 = false;
        while (true) {
            int i12 = 48;
            if (!it.hasNext()) {
                if (!z13) {
                    return false;
                }
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append(Ansi.f77778c);
                sb2.append('[');
                Iterator<Object> it2 = arrayList.iterator();
                boolean z14 = true;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next != null) {
                        int intValue = ((Integer) next).intValue();
                        if (intValue == 38 || intValue == i12) {
                            int a11 = a(it2);
                            if (a11 == 2) {
                                int a12 = a(it2);
                                int a13 = a(it2);
                                z11 = z12;
                                int a14 = a(it2);
                                if (this.D == AnsiColors.Colors256) {
                                    int j11 = c.j(a12, a13, a14, 256);
                                    if (!z14) {
                                        sb2.append(l70.f.f70689d);
                                    }
                                    sb2.append(intValue);
                                    sb2.append(l70.f.f70689d);
                                    sb2.append(5);
                                    sb2.append(l70.f.f70689d);
                                    sb2.append(j11);
                                } else {
                                    int j12 = c.j(a12, a13, a14, 16);
                                    if (!z14) {
                                        sb2.append(l70.f.f70689d);
                                    }
                                    sb2.append(intValue == 38 ? j12 >= 8 ? j12 + 82 : j12 + 30 : j12 >= 8 ? j12 + 92 : j12 + 40);
                                }
                            } else {
                                z11 = z12;
                                if (a11 != 5) {
                                    throw new IllegalArgumentException();
                                }
                                int a15 = a(it2);
                                if (this.D == AnsiColors.Colors256) {
                                    if (!z14) {
                                        sb2.append(l70.f.f70689d);
                                    }
                                    sb2.append(intValue);
                                    sb2.append(l70.f.f70689d);
                                    sb2.append(5);
                                    sb2.append(l70.f.f70689d);
                                    sb2.append(a15);
                                } else {
                                    int h11 = c.h(a15, 16);
                                    if (!z14) {
                                        sb2.append(l70.f.f70689d);
                                    }
                                    sb2.append(intValue == 38 ? h11 >= 8 ? h11 + 82 : h11 + 30 : h11 >= 8 ? h11 + 92 : h11 + 40);
                                }
                            }
                            z14 = z11;
                            z12 = z11;
                            i12 = 48;
                        } else {
                            if (!z14) {
                                sb2.append(l70.f.f70689d);
                            }
                            sb2.append(intValue);
                            z14 = z12;
                            z11 = z14;
                        }
                    } else {
                        z11 = z12;
                    }
                    z12 = z11;
                    i12 = 48;
                }
                sb2.append(io.ktor.util.date.b.f61998d);
                this.f59038a.write(sb2.toString().getBytes());
                return true;
            }
            Object next2 = it.next();
            if (next2 != null && next2.getClass() != Integer.class) {
                throw new IllegalArgumentException();
            }
            Integer num = (Integer) next2;
            z13 |= num.intValue() == 38 || num.intValue() == 48;
        }
    }

    @Override // h80.b
    public boolean y(ArrayList<Object> arrayList) {
        return false;
    }
}
