package m60;

import java.io.EOFException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.a1;
import l60.e1;
import l60.g1;
import l60.i1;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-RealBufferedSink")
@u0({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,219:1\n1#2:220\n51#3:221\n51#3:222\n51#3:223\n51#3:224\n51#3:225\n51#3:226\n51#3:227\n51#3:228\n51#3:229\n51#3:230\n51#3:231\n51#3:232\n51#3:233\n51#3:234\n51#3:235\n51#3:236\n51#3:237\n51#3:238\n51#3:239\n51#3:240\n51#3:241\n51#3:242\n51#3:243\n51#3:244\n51#3:245\n51#3:246\n51#3:247\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n*L\n35#1:221\n41#1:222\n51#1:223\n57#1:224\n67#1:225\n73#1:226\n79#1:227\n89#1:228\n96#1:229\n107#1:230\n117#1:231\n123#1:232\n129#1:233\n135#1:234\n141#1:235\n147#1:236\n153#1:237\n159#1:238\n165#1:239\n171#1:240\n172#1:241\n178#1:242\n179#1:243\n185#1:244\n186#1:245\n198#1:246\n199#1:247\n*E\n"})
/* loaded from: classes8.dex */
public final class g {
    public static final void a(@m80.k a1 a1Var) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            return;
        }
        try {
            if (a1Var.f70363b.size() > 0) {
                e1 e1Var = a1Var.f70362a;
                l60.k kVar = a1Var.f70363b;
                e1Var.y8(kVar, kVar.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            a1Var.f70362a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        a1Var.f70364c = true;
        if (th != null) {
            throw th;
        }
    }

    @m80.k
    public static final l60.l b(@m80.k a1 a1Var) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        long size = a1Var.f70363b.size();
        if (size > 0) {
            a1Var.f70362a.y8(a1Var.f70363b, size);
        }
        return a1Var;
    }

    @m80.k
    public static final l60.l c(@m80.k a1 a1Var) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        long j11 = a1Var.f70363b.j();
        if (j11 > 0) {
            a1Var.f70362a.y8(a1Var.f70363b, j11);
        }
        return a1Var;
    }

    public static final void d(@m80.k a1 a1Var) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        if (a1Var.f70363b.size() > 0) {
            e1 e1Var = a1Var.f70362a;
            l60.k kVar = a1Var.f70363b;
            e1Var.y8(kVar, kVar.size());
        }
        a1Var.f70362a.flush();
    }

    @m80.k
    public static final i1 e(@m80.k a1 a1Var) {
        g0.p(a1Var, "<this>");
        return a1Var.f70362a.D();
    }

    @m80.k
    public static final String f(@m80.k a1 a1Var) {
        g0.p(a1Var, "<this>");
        return "buffer(" + a1Var.f70362a + ')';
    }

    @m80.k
    public static final l60.l g(@m80.k a1 a1Var, @m80.k g1 source, long j11) {
        g0.p(a1Var, "<this>");
        g0.p(source, "source");
        while (j11 > 0) {
            long L3 = source.L3(a1Var.f70363b, j11);
            if (L3 == -1) {
                throw new EOFException();
            }
            j11 -= L3;
            a1Var.X4();
        }
        return a1Var;
    }

    @m80.k
    public static final l60.l h(@m80.k a1 a1Var, @m80.k ByteString byteString) {
        g0.p(a1Var, "<this>");
        g0.p(byteString, "byteString");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.X3(byteString);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l i(@m80.k a1 a1Var, @m80.k ByteString byteString, int i11, int i12) {
        g0.p(a1Var, "<this>");
        g0.p(byteString, "byteString");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.o2(byteString, i11, i12);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l j(@m80.k a1 a1Var, @m80.k byte[] source) {
        g0.p(a1Var, "<this>");
        g0.p(source, "source");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.write(source);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l k(@m80.k a1 a1Var, @m80.k byte[] source, int i11, int i12) {
        g0.p(a1Var, "<this>");
        g0.p(source, "source");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.write(source, i11, i12);
        return a1Var.X4();
    }

    public static final void l(@m80.k a1 a1Var, @m80.k l60.k source, long j11) {
        g0.p(a1Var, "<this>");
        g0.p(source, "source");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.y8(source, j11);
        a1Var.X4();
    }

    public static final long m(@m80.k a1 a1Var, @m80.k g1 source) {
        g0.p(a1Var, "<this>");
        g0.p(source, "source");
        long j11 = 0;
        while (true) {
            long L3 = source.L3(a1Var.f70363b, 8192L);
            if (L3 == -1) {
                return j11;
            }
            j11 += L3;
            a1Var.X4();
        }
    }

    @m80.k
    public static final l60.l n(@m80.k a1 a1Var, int i11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.writeByte(i11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l o(@m80.k a1 a1Var, long j11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.Q1(j11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l p(@m80.k a1 a1Var, long j11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.p3(j11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l q(@m80.k a1 a1Var, int i11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.writeInt(i11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l r(@m80.k a1 a1Var, int i11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.z2(i11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l s(@m80.k a1 a1Var, long j11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.writeLong(j11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l t(@m80.k a1 a1Var, long j11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.W(j11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l u(@m80.k a1 a1Var, int i11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.writeShort(i11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l v(@m80.k a1 a1Var, int i11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.W2(i11);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l w(@m80.k a1 a1Var, @m80.k String string) {
        g0.p(a1Var, "<this>");
        g0.p(string, "string");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.n5(string);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l x(@m80.k a1 a1Var, @m80.k String string, int i11, int i12) {
        g0.p(a1Var, "<this>");
        g0.p(string, "string");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.M0(string, i11, i12);
        return a1Var.X4();
    }

    @m80.k
    public static final l60.l y(@m80.k a1 a1Var, int i11) {
        g0.p(a1Var, "<this>");
        if (a1Var.f70364c) {
            throw new IllegalStateException("closed");
        }
        a1Var.f70363b.x4(i11);
        return a1Var.X4();
    }
}
