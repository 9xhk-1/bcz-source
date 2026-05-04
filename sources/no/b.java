package no;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@i
@uo.j
/* loaded from: classes7.dex */
public abstract class b extends c {

    /* renamed from: b, reason: collision with root package name */
    public static final long f75221b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final n[] f75222a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements o {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o[] f75223a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f75224b;

        public a(final b this$0, final o[] val$hashers) {
            this.f75223a = val$hashers;
            this.f75224b = this$0;
        }

        @Override // no.o
        public m h() {
            return this.f75224b.m(this.f75223a);
        }

        @Override // no.o
        public <T> o i(@e0 T instance, Funnel<? super T> funnel) {
            for (o oVar : this.f75223a) {
                oVar.i(instance, funnel);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o a(byte b11) {
            for (o oVar : this.f75223a) {
                oVar.a(b11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o b(byte[] bytes) {
            for (o oVar : this.f75223a) {
                oVar.b(bytes);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o c(char c11) {
            for (o oVar : this.f75223a) {
                oVar.c(c11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o d(CharSequence chars) {
            for (o oVar : this.f75223a) {
                oVar.d(chars);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o e(byte[] bytes, int off, int len) {
            for (o oVar : this.f75223a) {
                oVar.e(bytes, off, len);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o f(ByteBuffer bytes) {
            int position = bytes.position();
            for (o oVar : this.f75223a) {
                u.d(bytes, position);
                oVar.f(bytes);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o g(CharSequence chars, Charset charset) {
            for (o oVar : this.f75223a) {
                oVar.g(chars, charset);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o putBoolean(boolean b11) {
            for (o oVar : this.f75223a) {
                oVar.putBoolean(b11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o putDouble(double d11) {
            for (o oVar : this.f75223a) {
                oVar.putDouble(d11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o putFloat(float f11) {
            for (o oVar : this.f75223a) {
                oVar.putFloat(f11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o putInt(int i11) {
            for (o oVar : this.f75223a) {
                oVar.putInt(i11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o putLong(long l11) {
            for (o oVar : this.f75223a) {
                oVar.putLong(l11);
            }
            return this;
        }

        @Override // no.o, no.f0
        public o putShort(short s11) {
            for (o oVar : this.f75223a) {
                oVar.putShort(s11);
            }
            return this;
        }
    }

    public b(n... functions) {
        for (n nVar : functions) {
            Preconditions.checkNotNull(nVar);
        }
        this.f75222a = functions;
    }

    @Override // no.c, no.n
    public o a(int expectedInputSize) {
        Preconditions.checkArgument(expectedInputSize >= 0);
        int length = this.f75222a.length;
        o[] oVarArr = new o[length];
        for (int i11 = 0; i11 < length; i11++) {
            oVarArr[i11] = this.f75222a[i11].a(expectedInputSize);
        }
        return l(oVarArr);
    }

    @Override // no.n
    public o i() {
        int length = this.f75222a.length;
        o[] oVarArr = new o[length];
        for (int i11 = 0; i11 < length; i11++) {
            oVarArr[i11] = this.f75222a[i11].i();
        }
        return l(oVarArr);
    }

    public final o l(o[] hashers) {
        return new a(this, hashers);
    }

    public abstract m m(o[] hashers);
}
