package l60;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
/* loaded from: classes8.dex */
public final class a1 implements l {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final e1 f70362a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final k f70363b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public boolean f70364c;

    public a1(@m80.k e1 sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        this.f70362a = sink;
        this.f70363b = new k();
    }

    @Override // l60.l
    @m80.k
    public l A() {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        long size = this.f70363b.size();
        if (size > 0) {
            this.f70362a.y8(this.f70363b, size);
        }
        return this;
    }

    @Override // l60.e1
    @m80.k
    public i1 D() {
        return this.f70362a.D();
    }

    @Override // l60.l
    @m80.k
    public l M0(@m80.k String string, int i11, int i12) {
        kotlin.jvm.internal.g0.p(string, "string");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.M0(string, i11, i12);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l N1(@m80.k String string, int i11, int i12, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(string, "string");
        kotlin.jvm.internal.g0.p(charset, "charset");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.N1(string, i11, i12, charset);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public OutputStream O8() {
        return new a();
    }

    @Override // l60.l
    @m80.k
    public l Q1(long j11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.Q1(j11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l R7(@m80.k String string, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(string, "string");
        kotlin.jvm.internal.g0.p(charset, "charset");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.R7(string, charset);
        return X4();
    }

    @Override // l60.l
    public long V2(@m80.k g1 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        long j11 = 0;
        while (true) {
            long L3 = source.L3(this.f70363b, 8192L);
            if (L3 == -1) {
                return j11;
            }
            j11 += L3;
            X4();
        }
    }

    @Override // l60.l
    @m80.k
    public l W(long j11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.W(j11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l W2(int i11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.W2(i11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l X3(@m80.k ByteString byteString) {
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.X3(byteString);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l X4() {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        long j11 = this.f70363b.j();
        if (j11 > 0) {
            this.f70362a.y8(this.f70363b, j11);
        }
        return this;
    }

    @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f70364c) {
            return;
        }
        try {
            if (this.f70363b.size() > 0) {
                e1 e1Var = this.f70362a;
                k kVar = this.f70363b;
                e1Var.y8(kVar, kVar.size());
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f70362a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f70364c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // l60.l
    @m80.k
    public l d8(@m80.k g1 source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        while (j11 > 0) {
            long L3 = source.L3(this.f70363b, j11);
            if (L3 == -1) {
                throw new EOFException();
            }
            j11 -= L3;
            X4();
        }
        return this;
    }

    @Override // l60.l, l60.e1, java.io.Flushable
    public void flush() {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        if (this.f70363b.size() > 0) {
            e1 e1Var = this.f70362a;
            k kVar = this.f70363b;
            e1Var.y8(kVar, kVar.size());
        }
        this.f70362a.flush();
    }

    @Override // l60.l
    @m80.k
    public k getBuffer() {
        return this.f70363b;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f70364c;
    }

    @Override // l60.l
    @m80.k
    public l n5(@m80.k String string) {
        kotlin.jvm.internal.g0.p(string, "string");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.n5(string);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l o2(@m80.k ByteString byteString, int i11, int i12) {
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.o2(byteString, i11, i12);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l p3(long j11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.p3(j11);
        return X4();
    }

    @m80.k
    public String toString() {
        return "buffer(" + this.f70362a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@m80.k ByteBuffer source) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        int write = this.f70363b.write(source);
        X4();
        return write;
    }

    @Override // l60.l
    @m80.k
    public l writeByte(int i11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.writeByte(i11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l writeInt(int i11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.writeInt(i11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l writeLong(long j11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.writeLong(j11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l writeShort(int i11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.writeShort(i11);
        return X4();
    }

    @Override // l60.l
    @m80.k
    public l x4(int i11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.x4(i11);
        return X4();
    }

    @Override // l60.e1
    public void y8(@m80.k k source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.y8(source, j11);
        X4();
    }

    @Override // l60.l
    @m80.k
    public k z() {
        return this.f70363b;
    }

    @Override // l60.l
    @m80.k
    public l z2(int i11) {
        if (this.f70364c) {
            throw new IllegalStateException("closed");
        }
        this.f70363b.z2(i11);
        return X4();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a1.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            a1 a1Var = a1.this;
            if (a1Var.f70364c) {
                return;
            }
            a1Var.flush();
        }

        public String toString() {
            return a1.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i11) {
            a1 a1Var = a1.this;
            if (a1Var.f70364c) {
                throw new IOException("closed");
            }
            a1Var.f70363b.writeByte((byte) i11);
            a1.this.X4();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i11, int i12) {
            kotlin.jvm.internal.g0.p(data, "data");
            a1 a1Var = a1.this;
            if (!a1Var.f70364c) {
                a1Var.f70363b.write(data, i11, i12);
                a1.this.X4();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // l60.l
    @m80.k
    public l write(@m80.k byte[] source) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (!this.f70364c) {
            this.f70363b.write(source);
            return X4();
        }
        throw new IllegalStateException("closed");
    }

    @Override // l60.l
    @m80.k
    public l write(@m80.k byte[] source, int i11, int i12) {
        kotlin.jvm.internal.g0.p(source, "source");
        if (!this.f70364c) {
            this.f70363b.write(source, i11, i12);
            return X4();
        }
        throw new IllegalStateException("closed");
    }

    public static /* synthetic */ void N() {
    }
}
