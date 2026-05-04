package l50;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.WriteMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJsonIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorArrayWrapped\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,103:1\n226#2,10:104\n229#3:114\n*S KotlinDebug\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorArrayWrapped\n*L\n99#1:104,10\n99#1:114\n*E\n"})
/* loaded from: classes8.dex */
public final class k0<T> implements Iterator<T>, y00.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k50.a f70013a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f1 f70014b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f50.e<T> f70015c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f70016d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70017e;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@m80.k k50.a json, @m80.k f1 lexer, @m80.k f50.e<? extends T> deserializer) {
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(lexer, "lexer");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        this.f70013a = json;
        this.f70014b = lexer;
        this.f70015c = deserializer;
        this.f70016d = true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f70017e) {
            return false;
        }
        if (this.f70014b.O() == 9) {
            this.f70017e = true;
            this.f70014b.m((byte) 9);
            if (this.f70014b.K()) {
                if (this.f70014b.O() == 8) {
                    a.B(this.f70014b, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                this.f70014b.z();
            }
            return false;
        }
        if (this.f70014b.K() || this.f70017e) {
            return true;
        }
        f1 f1Var = this.f70014b;
        String c11 = b.c((byte) 9);
        int i11 = f1Var.f69912a;
        int i12 = i11 - 1;
        a.B(f1Var, "Expected " + c11 + ", but had '" + ((i11 == f1Var.H().length() || i12 < 0) ? "EOF" : String.valueOf(f1Var.H().charAt(i12))) + "' instead", i12, null, 4, null);
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public T next() {
        if (this.f70016d) {
            this.f70016d = false;
        } else {
            this.f70014b.n(',');
        }
        return (T) new j1(this.f70013a, WriteMode.OBJ, this.f70014b, this.f70015c.a(), null).decodeSerializableValue(this.f70015c);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
